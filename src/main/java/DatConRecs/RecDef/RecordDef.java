package DatConRecs.RecDef;

import java.util.Vector;

import DatConRecs.Payload;
import DatConRecs.Record;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;
import files.ConvertDatV3;

public class RecordDef extends Record {

    Vector<Field> fields = new Vector<Field>();

    public void addField(Field field) {
        setLength(getLength() + field.getSize());
        fields.add(field);
    }

    public RecordDef(String name, int id, RecType recType) {
        super(name, id, recType);
    }

    public String getNameWithId() {
        return getName() + "_" + getId();
    }

    public String getNameWithLengthAndId() {
        return getName() + "_" + getLength() + "_" + getId();
    }

    public int getNumFields() {
        return fields.size();
    }

    public Vector<Field> getFields() {
        return fields;
    }

    public String toString() {
        String retv = "";
        retv = "RecordDef " + getName() + " " + getId();
        //        for (int i = 0; i < fields.size(); i++) {
        //            retv += fields.get(i) + "\n";
        //        }
        return retv;
    }

    public String getClassDescription() {
        return "RecordDef " + getNameWithId() + " /" + getLength();
    }

    private boolean valid = false;

    private Signal IntSignal = null;

    private Signal FloatSignal = null;

    private Signal DoubleSignal = null;

    private Number[] values = null;

    public void init(ConvertDatV3 convertDatV3) {
        this.convertDat = convertDatV3;
        datFile = this.convertDat.getDatFile();
        this.csvWriter = convertDat.csvWriter;
        IntSignal = Signal.SeriesInt(getName(), "", null, Units.noUnits);
        FloatSignal = Signal.SeriesFloat(getName(), "", null, Units.noUnits);
        DoubleSignal = Signal.SeriesDouble(getName(), "", null, Units.noUnits);
        values = new Number[getNumFields()];
        valid = false;
    }

    @Override
    public void process(Payload record) {
        super.process(record);
        try {
            valid = true;
            int offset = 0;
            for (int fieldNum = 0; fieldNum < fields.size(); fieldNum++) {
                Field field = fields.get(fieldNum);
                switch (field.getType()) {
                case duble:
                    values[fieldNum] = record.getDouble(offset);
                    break;
                case expr:
                    break;
                case fp32:
                    values[fieldNum] = record.getFloat(offset);
                    break;
                case int16_t:
                    values[fieldNum] = record.getShort(offset);
                    break;
                case int32_t:
                    values[fieldNum] = record.getInt(offset);
                    break;
                case int8_t:
                    values[fieldNum] = record.getByte(offset);
                    break;
                case uint16_t:
                    values[fieldNum] = record.getUnsignedShort(offset);
                    break;
                case uint32_t:
                    values[fieldNum] = record.getUnsignedInt(offset);
                    break;
                case uint8_t:
                    values[fieldNum] = record.getUnsignedByte(offset);
                    break;
                default:
                    throw new RuntimeException("process(Payload _payload) ");

                }
                offset += field.getSize();
            }
        } catch (Exception e) {
            RecordException(e);
            //DatConLog.Exception(e);
        }
    }

    @Override
    public void printCols(lineType lineT) {
        try {
            for (int fieldNum = 0; fieldNum < fields.size(); fieldNum++) {
                Field field = fields.get(fieldNum);
                switch (field.getType()) {
                case duble:
                    printCSVValue(values[fieldNum], DoubleSignal,
                            field.getName(), lineT, valid);
                    break;
                case expr:
                    break;
                case fp32:
                    printCSVValue(values[fieldNum], FloatSignal,
                            field.getName(), lineT, valid);
                    break;
                case int16_t:
                    printCSVValue(values[fieldNum], IntSignal, field.getName(),
                            lineT, valid);
                    break;
                case int32_t:
                    printCSVValue(values[fieldNum], IntSignal, field.getName(),
                            lineT, valid);
                    break;
                case int8_t:
                    printCSVValue(values[fieldNum], IntSignal, field.getName(),
                            lineT, valid);
                    break;
                case uint16_t:
                    printCSVValue(values[fieldNum], IntSignal, field.getName(),
                            lineT, valid);
                    break;
                case uint32_t:
                    printCSVValue(values[fieldNum], IntSignal, field.getName(),
                            lineT, valid);
                    break;
                case uint8_t:
                    printCSVValue(values[fieldNum], IntSignal, field.getName(),
                            lineT, valid);
                    break;
                default:
                    throw new RuntimeException("printCols(lineType lineT) ");

                }
            }
        } catch (Exception e) {
            DatConLog.Exception(e);
        }
    }

}
