package DatConRecs.Created4V1;

import DatConRecs.Payload;
import DatConRecs.Created4V3.IMUEX40;
import files.ConvertDat;

public class IMUEX42_3 extends IMUEX40 {

    public IMUEX42_3(ConvertDat convertDat) {
        super(convertDat, 3, 42, 0);
    }

    @Override
    public void process(Payload _payload) {
        super.process(_payload);
    }

}
