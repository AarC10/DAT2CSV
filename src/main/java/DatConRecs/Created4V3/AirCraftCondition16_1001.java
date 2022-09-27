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
    public void process(Payload payload) {
        super.process(payload);
        try {
            valid = true;

            intFlightState = payload.getUnsignedByte(0);
            flightState = payload.getUnsignedByte(1);
            lastFlightState = payload.getUnsignedByte(2);
            nearGndState = payload.getUnsignedByte(3);
            UP_state = payload.getUnsignedByte(4);
            UP_acc_t = payload.getFloat(5);
            UP_TF_t = payload.getFloat(9);
            landState = payload.getUnsignedByte(13);
            safe_fltr = payload.getShort(14);
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
