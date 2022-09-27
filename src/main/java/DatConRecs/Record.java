package DatConRecs;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import files.Axis;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.CsvWriter;
import files.DatConLog;
import files.DatFile;
import files.Persist;
import files.RecSpec;
import files.Signal;

public abstract class Record extends RecSpec {

    protected ByteBuffer payloadBB = null;

    protected CsvWriter csvWriter = null;

    protected ConvertDat convertDat = null;

    protected DatFile datFile;

    public void setDatFile(DatFile datFile) {
        this.datFile = datFile;
    }

    protected int numRecExceptions = 0;

    public static int totalNumRecExceptions = 0;

    static DecimalFormat df = new DecimalFormat("000.#############", new DecimalFormatSymbols(Locale.US));

    public Record() {
        super();
    }

    @Override
    public String getDescription() {
        return this.getClass().toString();
    }

    public Record(ConvertDat convertDat, int id, int length) {
        super(id, length);
        this.convertDat = convertDat;
        datFile = this.convertDat.getDatFile();
        this.csvWriter = convertDat.csvWriter;
    }

    public Record(DatFile datFile) {
        this.datFile = datFile;
    }

    public Record(String name, int id, RecType recType) {
        super(name, id, recType);
    }

    public void process(Payload record) {
        payloadBB = record.getBB();
    }

    public void printCols(lineType lineT) {
        throw new RuntimeException("printCols called in Record");
    }

    public void printCSVValue(Number value, Signal signal, String suffix, lineType lineT, boolean valid) throws IOException {
        if (lineT == lineType.XML) {
            printXmlSig(signal.getName(), suffix, signal);
            return;
        }
        if (Persist.EXPERIMENTAL_FIELDS || !signal.isExperimental()) {
            if (lineT == lineType.HEADER) {
                csvWriter.print("," + signal.getName());
                if (suffix != null && !suffix.isEmpty()) {
                    csvWriter.print(":" + suffix);
                }
                if (Persist.showUnits && signal.hasUnits()) {
                    csvWriter.print("[" + signal.getUnitsNoComma() + "]");
                }
            } else if (lineT == lineType.LINE) {
                csvWriter.print(",");
                if (valid) csvWriter.print("" + value);
            }
        }
    }

    protected void printCSVValue(String value, Signal signal, String suffix, lineType lineT, boolean valid) throws IOException {
        if (lineT == lineType.XML) {
            printXmlSig(signal.getName(), suffix, signal);
            return;
        }
        if (Persist.EXPERIMENTAL_FIELDS || !signal.isExperimental()) {
            if (lineT == lineType.HEADER) {
                csvWriter.print("," + signal.getName());
                if (suffix != "") {
                    csvWriter.print(":" + suffix);
                }
                if (Persist.showUnits && signal.hasUnits()) {
                    csvWriter.print("[" + signal.getUnitsNoComma() + "]");
                }
            } else if (lineT == lineType.LINE) {
                csvWriter.print(",");
                if (valid) csvWriter.print("" + value);
            }
        }
    }

    protected void RecordException(Exception e) {
        if (numRecExceptions == 0) {
            String errMsg = "RecException filePos()=" + datFile.getPos() + " tickNo " + datFile._tickNo + " type =" + datFile._type;
            if (Persist.EXPERIMENTAL_DEV) {
                System.out.println(errMsg);
                e.printStackTrace();
            } else {
                DatConLog.Exception(e, errMsg);
            }
        }
        numRecExceptions++;
        totalNumRecExceptions++;
    }

    protected void printCSVValue(double value, String header, lineType lineT, boolean valid) throws IOException {
        if (lineT == lineType.XML) return;
        if (lineT == lineType.HEADER) {
            csvWriter.print("," + header);
        } else {
            csvWriter.print(",");
            if (valid) csvWriter.print("" + value);
        }
    }

    protected void printCSVValue(String value, String header, lineType lineT, boolean valid) throws IOException {
        if (lineT == lineType.HEADER) {
            csvWriter.print("," + header);
        } else {
            csvWriter.print(",");
            if (valid) csvWriter.print("" + value);
        }
    }

    private void printXmlSig(String name, String suffix, Signal signal) throws IOException {
        String colName = name;
        String description;
        if (suffix != null && !suffix.equalsIgnoreCase("")) {
            colName = name + ":" + suffix;
        }
        switch (signal.getType()) {
            case SERIES:
                csvWriter.println("<series>");
                csvWriter.println("  <sigName>" + colName + "</sigName>");
                csvWriter.println("  <colName>" + colName + "</colName>");
                Axis axis = signal.getAxis();
                if (axis != null) {
                    csvWriter.println("  <axis>" + axis.getName() + "</axis>");
                    convertDat.axes.add(axis);
                }
                switch (signal.getNumType()) {
                    case DOUBLE:
                        csvWriter.println("  <numType>double</numType>");
                        break;
                    case FLOAT4:
                        csvWriter.println("  <numType>float</numType>");
                        break;
                    case INT:
                        csvWriter.println("  <numType>int</numType>");
                        break;
                    case UNDEFINED:
                        break;
                    default:
                        break;
                }
                description = signal.getDescription();
                if (description != null) {
                    csvWriter.println("  <description>" + description + "</description>");
                }
                if (signal.isExperimental()) {
                    csvWriter.println("  <experimental>true</experimental>");
                }
                if (signal.hasUnits()) {
                    csvWriter.println("  <units>" + signal.getUnits() + "</units>");
                }
                csvWriter.println("</series>");
                break;
            case STATE:
                csvWriter.println("<state>");
                csvWriter.println("  <sigName>" + colName + "</sigName>");
                csvWriter.println("  <colName>" + colName + "</colName>");
                csvWriter.println("  <inverse></inverse>");
                description = signal.getDescription();
                if (description != null) {
                    csvWriter.println("  <description>" + description + "</description>");
                }
                csvWriter.println("  <stateSpec>");
                csvWriter.println("     <stateName>" + signal.getDefaultState() + "</stateName>");
                csvWriter.println("     <color>white</color>");
                csvWriter.println("  </stateSpec>");
                csvWriter.println("</state>");
                break;
            default:
                break;
        }
    }

    public void setCsvWriter(CsvWriter writer) {
        csvWriter = writer;
    }

    public String getClassDescription() {
        return getClass().toString() + " /" + getLength();
    }

}
