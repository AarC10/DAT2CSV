package DatConRecs.RecDef;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.ParseException;
import java.util.*;

import DatConRecs.RecDef.Field.FieldType;
import files.DatConLog;
import files.Persist;
import files.RecSpec;

public class OpConfig {

    enum State {
        BACKUP, CONFIG_SEEN, SPIN, NAME_SEEN, TYPE_SEEN, F_TYPE_SEEN, STRING_SEEN, STRING_NAME_SEEN, STRING_TYPE_SEEN
    }

    enum RecType {
        NORMAL, STRING, NONE
    }

    private final List<RecordDef> records = new ArrayList<>();
    private final Set<String> varNames = new HashSet<>(200);

    int varNameExtension = 0;


    public static class Line {
        List<String> tokens = new ArrayList<>();

        public Line(String opLine) {
            String[] lineTokens = opLine.split("\\s+");
            for (String token : lineTokens) {
                addToken(token);
            }
        }

        public void addToken(String token) {
            tokens.add(token);
        }

        public List<String> getTokens() {
            return tokens;
        }

        public String toString() {
            StringBuilder str = new StringBuilder();
            for (String token : tokens) {
                str.append(token).append(" ");
            }
            return str.toString();
        }
    }


    public OpConfig(List<Line> lines) {
        State state = State.BACKUP;
        String recName = "";
        FieldType fieldType;
        String varName;
        RecordDef recordDef = null;
        Field field;
        Line line;
        List<String> tokens;
        String firstToken;
        int defaultValue = 0;
        int lineNum = 1;
        int numTokens;
        try {
            while (lineNum < lines.size()) {
                line = lines.get(lineNum);
                tokens = line.getTokens();
                numTokens = tokens.size();
                if (numTokens > 0) {
                    firstToken = tokens.get(0);
                } else {
                    throw new ParseException(line.toString(), lineNum);
                }

                int recId;
                switch (state) {
                    case BACKUP:
                        lineNum--;
                        line = lines.get(lineNum);
                        tokens = line.getTokens();
                        numTokens = tokens.size();
                        if (numTokens > 0) {
                            firstToken = tokens.get(0);
                            if (firstToken.equalsIgnoreCase("Op.[config]")) {
                                state = State.CONFIG_SEEN;
                            } else if (firstToken.equalsIgnoreCase("Op.[string]")) {
                                state = State.STRING_SEEN;
                            } else {
                                state = State.SPIN;
                            }
                        } else {
                            throw new ParseException(line.toString(), lineNum);
                        }
                        break;
                    case SPIN:
                        if (firstToken.equalsIgnoreCase("Op.[config]")) {
                            state = State.CONFIG_SEEN;
                        } else if (firstToken.equalsIgnoreCase("Op.[string]")) {
                            state = State.STRING_SEEN;
                        }
                        break;
                    case CONFIG_SEEN:
                        if (firstToken.equalsIgnoreCase("name") && numTokens > 1) {
                            state = State.NAME_SEEN;
                            recName = conCatTokens(tokens);
                        } else {
                            throw new ParseException(line.toString(), lineNum);
                        }
                        break;
                    case NAME_SEEN:
                        if (firstToken.equalsIgnoreCase("type")) {
                            if (isNumber(tokens.get(1))) {
                                recId = Integer.parseInt(tokens.get(1));
                                recordDef = new RecordDef(recName, recId, RecSpec.RecType.BINARY);
                                varNames.clear();
                                varNameExtension = 0;
                                state = State.TYPE_SEEN;
                                break;
                            } else {
                                state = State.SPIN;
                            }
                        } else {
                            throw new ParseException(line.toString(), lineNum);
                        }
                        break;

                    case TYPE_SEEN:
                        fieldType = Field.getFieldType(firstToken);
                        if (fieldType == null) {
                            records.add(recordDef);
                            state = State.BACKUP;
                            break;
                        }
                        if (numTokens > 1) {
                            varName = normalizeVarName(getVarName(tokens));
                        } else {
                            throw new ParseException(line.toString(), lineNum);
                        }
                        if (fieldType == FieldType.expr) {
                            break;
                        }
                        if (numTokens > 2 && isNumber(tokens.get(tokens.size() - 1))) {
                            defaultValue = Integer.parseInt(tokens.get(tokens.size() - 1));
                        }
                        field = new Field(fieldType, varName, defaultValue);
                        recordDef.addField(field);
                        break;
                    case F_TYPE_SEEN:
                        fieldType = Field.getFieldType(firstToken);
                        if (fieldType == null) {
                            state = State.BACKUP;
                            break;
                        }
                        if (numTokens > 1) {
                            normalizeVarName(tokens.get(1));
                        } else {
                            throw new ParseException(line.toString(), lineNum);
                        }
                        if (numTokens > 2 && isNumber(tokens.get(2))) {
                            defaultValue = Integer.parseInt(tokens.get(2));
                        }
                        break;
                    case STRING_SEEN:
                        if (firstToken.equalsIgnoreCase("name") && numTokens > 1) {
                            state = State.STRING_NAME_SEEN;
                            recName = tokens.get(1);
                        } else {
                            throw new ParseException(line.toString(), lineNum);
                        }
                        break;
                    case STRING_NAME_SEEN:
                        if (firstToken.equalsIgnoreCase("type")) {
                            if (isNumber(tokens.get(1))) {
                                recId = Integer.parseInt(tokens.get(1));
                                recordDef = new RecordDef(recName, recId, RecSpec.RecType.STRING);
                                state = State.STRING_TYPE_SEEN;
                                break;
                            }
                        } else {
                            throw new ParseException(line.toString(), lineNum);
                        }
                        break;
                    case STRING_TYPE_SEEN:
                        records.add(recordDef);
                        state = State.BACKUP;
                        break;
                    default:
                        break;
                }
                lineNum++;
            }
            if (recordDef != null && recordDef.getNumFields() > 0) {
                records.add(recordDef);
            }
        } catch (ParseException pe) {
            if (Persist.EXPERIMENTAL_DEV) {
                System.out.println("ParseException " + pe);
                pe.printStackTrace();
            } else {
                DatConLog.Exception(pe, "ParseException " + pe);
            }
        }
    }

    private String getVarName(List<String> tokens) {
        StringBuilder varName = new StringBuilder();
        int length = tokens.size();
        if (1 < length) {
            varName = new StringBuilder(tokens.get(1));
            for (int j = 1 + 1; j < length; j++) {
                if (!isNumber(tokens.get(j))) varName.append("_").append(tokens.get(j));
            }
        }
        return varName.toString();
    }

    private String conCatTokens(List<String> tokens) {
        StringBuilder tokenString = new StringBuilder();
        int length = tokens.size();
        if (1 < length) {
            tokenString = new StringBuilder(tokens.get(1));
            for (int j = 1 + 1; j < length; j++) {
                tokenString.append("_").append(tokens.get(j));
            }
        }
        return tokenString.toString();
    }

    private String normalizeVarName(String name) {
        String newName = name;
        newName = newName.replaceAll("\\(%\\)", "_pcnt");
        if (newName.contains("[")) {
            newName = newName.replaceAll("\\[", "_");
            newName = newName.replaceAll("]", "");
        }
        newName = newName.replaceAll("\\.", "_");
        newName = newName.replaceAll("^1", "One_");
        newName = newName.replaceAll("^2", "Two_");
        newName = newName.replaceAll("^3", "Three_");
        newName = newName.replaceAll("^4", "Four_");
        newName = newName.replaceAll("^5", "Five_");
        newName = newName.replaceAll("^6", "Six_");
        newName = newName.replaceAll("^7", "Seven_");
        newName = newName.replaceAll("^8", "Eight_");
        newName = newName.replaceAll("^9", "Nine_");
        newName = newName.replaceAll("^0", "Zero_");
        newName = newName.replaceAll("continue", "Continue");
        while (varNames.contains(newName)) {
            varNameExtension++;
            newName += "_" + varNameExtension;
        }
        varNames.add(newName);
        return newName;
    }

    private static void createJavaFile(String dirName, RecordDef record) throws FileNotFoundException {
        File file = new File(System.getProperty("user.dir") + "/DatConRecs/" + dirName + "/" + record.getNameWithLengthAndId() + ".java");
        try (PrintStream printStream = new PrintStream(file)) {
            if (record.getRecType() == RecSpec.RecType.BINARY) {
                createJavaFileBinary(printStream, dirName, record);
            } else if (record.getRecType() == RecSpec.RecType.STRING) {
                createJavaFileString(printStream, dirName, record);
            }
        }
    }

    private static void createJavaFileString(PrintStream printStream, String dirName, RecordDef record) {
        printStream.println("package DatConRecs." + dirName + ";");
        printStream.println("import DatConRecs.*;");
        printStream.println("import Files.ConvertDat;");
        printStream.println("import Files.ConvertDat.lineType;");
        printStream.println("import Files.DatConLog;");

        printStream.println("public class " + record.getNameWithLengthAndId() + " extends Record {");
        printStream.println(" String text = \"\";");
        printStream.println();
        printStream.println(" public " + record.getNameWithLengthAndId() + "(ConvertDat convertDat) {");
        printStream.println("  super(convertDat, " + record.getId() + ",-1);");

        printStream.println("}");

        printStream.println("@Override\n  public void process(Payload _payload) {\n      super.process(_payload);\n        try {");

        printStream.println("} catch (Exception e) {RecordException(e);}}");
        printStream.println();
        printStream.println();
        printStream.println("   public void printCols(lineType lineT) {\ntry {\n");

        printStream.println(" } catch (Exception e) {\nDatConLog.Exception(e);\n}\n}\n");
        printStream.println("   }");
    }

    private static void createJavaFileBinary(PrintStream printStream, String dirName, RecordDef recordDef) {
        printStream.println("package DatConRecs." + dirName + ";");
        printStream.println("import DatConRecs.*;");
        printStream.println("import Files.ConvertDat;");
        printStream.println("import Files.ConvertDat.lineType;");
        printStream.println("import Files.DatConLog;");
        printStream.println("import Files.Signal;");
        printStream.println("import Files.Units;");
        printStream.println();
        printStream.println();
        printStream.println("public class " + recordDef.getNameWithLengthAndId() + " extends Record {");

        printStream.println("protected boolean valid = false;");
        printStream.println("");
        List<Field> fields = recordDef.getFields();
        for (Field field : fields) {
            printStream.println(field.getJavaDeclaration());
        }
        printStream.println();
        printStream.println("      public " + recordDef.getNameWithLengthAndId() + "(ConvertDat convertDat) {");
        printStream.println("           super(convertDat, " + recordDef.getId() + ", " + recordDef.getLength() + ");");
        printStream.println("       }");
        printStream.println();
        printStream.println("@Override\n  public void process(Payload _payload) {\n      super.process(_payload);\n        try {\n      valid = true;\n");
        int offset = 0;
        for (Field field : fields) {
            String assgnment = String.format(field.getJavaAssnFormat(), field.name, offset);
            printStream.println(assgnment);
            offset += field.getSize();
        }
        printStream.println("} catch (Exception e) {RecordException(e);}}");
        printStream.println();
        printStream.println();
        printStream.println("    protected static Signal " + recordDef.getName() + "IntSig = Signal\n" + ".SeriesInt(\"" + recordDef.getName() + "\", \"\", null, Units.noUnits);");
        printStream.println("    protected static Signal " + recordDef.getName() + "FloatSig = Signal\n" + ".SeriesFloat(\"" + recordDef.getName() + "\", \"\", null, Units.noUnits);");
        printStream.println("    protected static Signal " + recordDef.getName() + "DoubleSig = Signal\n" + ".SeriesDouble(\"" + recordDef.getName() + "\", \"\", null, Units.noUnits);");
        printStream.println();
        printStream.println("   public void printCols(lineType lineT) {\ntry {\n");
        for (Field field : fields) {
            String printCsvLine = String.format(field.getJavaPrintCsvLineFormat(), field.name, recordDef.getName(), field.name);
            printStream.println(printCsvLine);
            offset += field.getSize();
        }
        printStream.println(" } catch (Exception e) {\nDatConLog.Exception(e);\n}\n}\n");
        printStream.println("   }");

    }

    public List<RecordDef> getRecords() {
        return records;
    }

    private static boolean isNumber(String token) {
        return token.matches("-?\\d+(\\.\\d+)?");
    }
}
