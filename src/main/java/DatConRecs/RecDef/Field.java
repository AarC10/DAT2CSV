package DatConRecs.RecDef;

public class Field {
    public enum FieldType {
        UINT_32_T, UINT_16_T, UINT_8_T, INT_32_T, INT_16_T, INT_8_T, FP_32, DOUBLE, EXPR;

        public static FieldType lookup(String ftype) {
            for (FieldType d : FieldType.values()) {
                if (d.name().equalsIgnoreCase(ftype)) {
                    return d;
                }
            }
            return null;
        }
    }

    FieldType fType;

    String name;

    int initValue = 0;

    public Field(FieldType fieldType, String name, int defaultValue) {
        this.fType = fieldType;
        this.name = name;
        try {
            this.initValue = defaultValue;
        } catch (NumberFormatException ignored) {
        }
    }

    public static FieldType getFieldType(String token) {
        if (token.equalsIgnoreCase("Op.uint16_t")) {
            return FieldType.UINT_16_T;
        } else if (token.equalsIgnoreCase("Op.uint8_t")) {
            return FieldType.UINT_8_T;
        } else if (token.equalsIgnoreCase("Op.uint32_t")) {
            return FieldType.UINT_32_T;
        } else if (token.equalsIgnoreCase("Op.int32_t")) {
            return FieldType.INT_32_T;
        } else if (token.equalsIgnoreCase("Op.int16_t")) {
            return FieldType.INT_16_T;
        } else if (token.equalsIgnoreCase("Op.int8_t")) {
            return FieldType.INT_8_T;
        } else if (token.equalsIgnoreCase("Op.fp32")) {
            return FieldType.FP_32;
        } else if (token.equalsIgnoreCase("Op.float")) {
            return FieldType.FP_32;
        } else if (token.equalsIgnoreCase("Op.double")) {
            return FieldType.DOUBLE;
        } else if (token.equalsIgnoreCase("Op.fp64")) {
            return FieldType.DOUBLE;
        } else if (token.equalsIgnoreCase("Op.expr")) {
            return FieldType.EXPR;
        }

        return null;
    }

    public int getSize() {
        return switch (fType) {
            case DOUBLE -> 8;
            case FP_32, UINT_32_T, INT_32_T -> 4;
            case INT_16_T, UINT_16_T -> 2;
            case INT_8_T, UINT_8_T -> 1;
            default -> 0;
        };
    }

    public String getJavaType() {
        return switch (fType) {
            case UINT_8_T -> "short";
            case UINT_16_T -> "int";
            case UINT_32_T -> "long";
            case INT_8_T -> "short";
            case INT_16_T -> "short";
            case INT_32_T -> "int";
            case FP_32 -> "float";
            case DOUBLE -> "double";
            default -> null;
        };
    }

    public String toString() {
        return fType + " " + name;
    }


    public String getJavaDeclaration() {
        String javaDec = "protected ";
        javaDec += getJavaType() + " ";
        javaDec += name + " = ";
        javaDec += "(" + getJavaType() + ")" + initValue + ";";
        return javaDec;
    }

    public String getJavaAssnFormat() {
        return switch (fType) {
            case DOUBLE -> " %s = _payload.getDouble(%d);";
            case FP_32 -> " %s = _payload.getFloat(%d);";
            case INT_16_T -> " %s = _payload.getShort(%d);";
            case INT_32_T -> " %s = _payload.getInt(%d);";
            case INT_8_T -> " %s = _payload.getByte(%d);;";
            case UINT_16_T -> " %s = _payload.getUnsignedShort(%d);";
            case UINT_32_T -> " %s = _payload.getUnsignedInt(%d);";
            case UINT_8_T -> "%s = _payload.getUnsignedByte(%d);";
            default -> "";
        };
    }

    public String getJavaPrintCsvLineFormat() {
        return switch (fType) {
            case DOUBLE -> " printCsvValue(%s, %sDoubleSig, \"%s\",lineT, valid);";
            case FP_32 -> " printCsvValue(%s, %sFloatSig, \"%s\",lineT, valid);";
            case INT_16_T -> " printCsvValue(%s, %sIntSig, \"%s\",lineT, valid);";
            case INT_32_T -> " printCsvValue(%s, %sIntSig, \"%s\",lineT, valid);";
            case INT_8_T -> " printCsvValue(%s, %sIntSig, \"%s\",lineT, valid);";
            case UINT_16_T -> " printCsvValue(%s, %sIntSig, \"%s\",lineT, valid);";
            case UINT_32_T -> " printCsvValue(%s, %sIntSig, \"%s\",lineT, valid);";
            case UINT_8_T -> " printCsvValue(%s, %sIntSig, \"%s\",lineT, valid);";
            default -> "";
        };
    }

    public String getPayloadType() {
        return switch (fType) {
            case DOUBLE -> "Double";
            case FP_32 -> "Float";
            case INT_16_T -> "Short";
            case INT_32_T -> "Int";
            case INT_8_T -> "Byte";
            case UINT_16_T -> "UnsignedShort";
            case UINT_32_T -> "UnsignedInt";
            case UINT_8_T -> "UnsignedByte";
            default -> "";
        };
    }

    public FieldType getType() {
        return fType;
    }

    public String getName() {
        return name;
    }

}
