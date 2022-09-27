package DatConRecs.Created4V3;

import DatConRecs.AirCraftCondition;
import DatConRecs.Payload;
import files.ConvertDat;

public class AirCraftCondition8_1001 extends AirCraftCondition {

    public AirCraftCondition8_1001(ConvertDat convertDat) {
        super(convertDat, 1001, 8);
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
            landState = record.getUnsignedByte(5);
            safe_fltr = record.getShort(6);
            nearGrnd = (nearGndState != 0) ? "True" : "False";
        } catch (Exception e) {
            RecordException(e);
        }
    }

}
