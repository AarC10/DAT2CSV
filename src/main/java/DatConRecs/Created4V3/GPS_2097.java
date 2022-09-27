
package DatConRecs.Created4V3;

import DatConRecs.GPSGroup;
import DatConRecs.Payload;
import files.ConvertDat;

public class GPS_2097 extends GPSGroup {

    public GPS_2097(ConvertDat convertDat) {
        super(convertDat, 1, 2097, 66);
    }

//    public RecSpec.RecType getRecType() {
//        return RecSpec.RecType.BINARY;
//    }

    public void process(Payload record) {
        super.process(record);
    }
}
