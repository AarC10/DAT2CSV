
package DatConRecs.Created4V3;

import DatConRecs.GPSGroup;
import DatConRecs.Payload;
import files.ConvertDat;

public class GPS_2098 extends GPSGroup {

    public GPS_2098(ConvertDat convertDat) {
        super(convertDat, 2, 2098, 66);
    }

    //    public RecSpec.RecType getRecType() {
    //        return RecSpec.RecType.BINARY;
    //    }

    public void process(Payload _payload) {
        super.process(_payload);
    }
}
