package DatConRecs.Created4V3;

import DatConRecs.AirCraftCondition;
import DatConRecs.Payload;
import files.ConvertDat;

public class AirCraftCondition8_1001 extends AirCraftCondition {

    public AirCraftCondition8_1001(ConvertDat convertDat) {
        super(convertDat, 1001, 8);
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
            landState = payload.getUnsignedByte(5);
            safe_fltr = payload.getShort(6);
            nearGrnd = (nearGndState != 0) ? "True" : "False";
        } catch (Exception e) {
            RecordException(e);
        }
    }

}
