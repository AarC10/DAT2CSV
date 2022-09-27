package DatConRecs.Created4V3;

import DatConRecs.Payload;
import DatConRecs.RecIMU;
import files.ConvertDat;

public class IMU120_2050 extends RecIMU {
    public IMU120_2050(ConvertDat convertDat) {
        super(convertDat, 2050, 120, 2);
        current = this;
    }

    public void process(Payload record) {
        super.process(record);
    }
}
