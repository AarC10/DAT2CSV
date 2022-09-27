package DatConRecs.RecDef;

import java.util.ArrayList;
import java.util.List;

import DatConRecs.Payload;
import DatConRecs.Record;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;
import files.ConvertDatV3;

public class RecordDef extends Record {

    List<Field> fields = new ArrayList<>();

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

    public List<Field> getFields() {
        return fields;
    }

    @Override
    public String toString() {
        String retv = "";
        retv = "RecordDef " + getName() + " " + getId();
        return retv;
    }

    @Override
    public String getClassDescription() {
        return "RecordDef " + getNameWithId() + " /" + getLength();
    }

    private boolean valid = false;

    private Signal intSignal = null;

    private Signal floatSignal = null;

    private Signal doubleSignal = null;

    private Number[] values = null;

    public void init(ConvertDatV3 convertDatV3) {
        this.convertDat = convertDatV3;
        datFile = this.convertDat.getDatFile();
        this.csvWriter = convertDat.csvWriter;
        intSignal = Signal.SeriesInt(getName(), "", null, Units.noUnits);
        floatSignal = Signal.SeriesFloat(getName(), "", null, Units.noUnits);
        doubleSignal = Signal.SeriesDouble(getName(), "", null, Units.noUnits);
        values = new Number[getNumFields()];
        valid = false;
    }

    @Override
    public void process(Payload payload) {
        super.process(payload);
        try {
            valid = true;
            int offset = 0;
            for (int fieldNum = 0; fieldNum < fields.size(); fieldNum++) {
                Field field = fields.get(fieldNum);
                switch (field.getType()) {
                    case duble:
                        values[fieldNum] = payload.getDouble(offset);
                        break;
                    case expr:
                        break;
                    case fp32:
                        values[fieldNum] = payload.getFloat(offset);
                        break;
                    case int16_t:
                        values[fieldNum] = payload.getShort(offset);
                        break;
                    case int32_t:
                        values[fieldNum] = payload.getInt(offset);
                        break;
                    case int8_t:
                        values[fieldNum] = payload.getByte(offset);
                        break;
                    case uint16_t:
                        values[fieldNum] = payload.getUnsignedShort(offset);
                        break;
                    case uint32_t:
                        values[fieldNum] = payload.getUnsignedInt(offset);
                        break;
                    case uint8_t:
                        values[fieldNum] = payload.getUnsignedByte(offset);
                        break;
                    default:
                        throw new RuntimeException("process(Payload payload) ");

                }
                offset += field.getSize();
            }
        } catch (Exception e) {
            RecordException(e);
        }
    }

    @Override
    public void printCols(lineType lineT) {
        try {
            for (int fieldNum = 0; fieldNum < fields.size(); fieldNum++) {
                Field field = fields.get(fieldNum);
                switch (field.getType()) {
                    case duble:
                        printCSVValue(values[fieldNum], doubleSignal, field.getName(), lineT, valid);
                        break;
                    case expr:
                        break;
                    case fp32:
                        printCSVValue(values[fieldNum], floatSignal, field.getName(), lineT, valid);
                        break;
                    case uint8_t, uint32_t, uint16_t, int8_t, int16_t, int32_t:
                        printCSVValue(values[fieldNum], intSignal, field.getName(), lineT, valid);
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
