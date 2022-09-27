package DatConRecs.Created4V3;

import DatConRecs.AirCraftCondition;
import DatConRecs.Payload;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;

public class AirCraftCondition16_1001 extends AirCraftCondition {

    protected double UP_acc_t = (float) 0;

    protected double UP_TF_t = (float) 0;

    public AirCraftCondition16_1001(ConvertDat convertDat) {
        super(convertDat, 1001, 16);
    }

    @Override
    public void process(Payload record) {
        super.process(record);
        try {
            valid = true;

            intFlightState = record.getUnsignedByte(0);
            flightState = record.getUnsignedByte(1);
            lastFlightState = record.getUnsignedByte(2);
            nearGndState = record.getUnsignedByte(3);
            UP_state = record.getUnsignedByte(4);
            UP_acc_t = record.getFloat(5);
            UP_TF_t = record.getFloat(9);
            landState = record.getUnsignedByte(13);
            safe_fltr = record.getShort(14);
            nearGrnd = (nearGndState != 0) ? "True" : "False";
        } catch (Exception e) {
            RecordException(e);
        }
    }

    @Override
    public void printCols(lineType lineT) {
        super.printCols(lineT);
        try {
            printCSVValue(UP_acc_t, aircraft_conditionFloatSig, "UP_acc_t",
                    lineT, valid);
            printCSVValue(UP_TF_t, aircraft_conditionFloatSig, "UP_TF_t", lineT,
                    valid);
        } catch (Exception e) {
            DatConLog.Exception(e);
        }
    }

}
