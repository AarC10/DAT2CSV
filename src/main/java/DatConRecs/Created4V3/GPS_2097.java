
package DatConRecs.Created4V3;

import DatConRecs.GpsGroup;
import DatConRecs.Payload;
import Files.ConvertDat;
import Files.RecSpec;

public class GPS_2097 extends GpsGroup {

    public GPS_2097(ConvertDat convertDat) {
        super(convertDat, 1, 2097, 66);
    }

//    public RecSpec.RecType getRecType() {
//        return RecSpec.RecType.BINARY;
//    }

    public void process(Payload _payload) {
        super.process(_payload);
    }
}
