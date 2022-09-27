package DatConRecs.Created4V1;

import DatConRecs.Payload;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;

// 15 HZ
public class RecTabletLoc179_43 extends Record {

    public static RecTabletLoc179_43 current = null;

    public double longRad = 0.0;

    public double latRad = 0.0;

    public double longitudeTablet = 0.0;

    public double latitudeTablet = 0.0;

    public boolean valid = false;

    public RecTabletLoc179_43(ConvertDat convertDat) {
        super(convertDat, 43, 179);
    }

    public void process(Payload record) {
        super.process(record);
        try {
            latRad = payloadBB.getDouble(155);
            longRad = payloadBB.getDouble(163);
            longitudeTablet = Math.toDegrees(longRad);
            latitudeTablet = Math.toDegrees(latRad);
            if (!valid) {
                if (longitudeTablet != 0.0 && latitudeTablet != 0.0) {
                    valid = true;
                }
            }
        } catch (Exception e) {
            RecordException(e);
        }
    }

    public final static Signal tabletGPSSig = Signal.SeriesDouble("Tablet",
            "Tablet", null, Units.degrees180);

    @Override
    public void printCols(lineType lineT) {
        try {
            printCSVValue(longitudeTablet, tabletGPSSig, "Longitude", lineT,
                    valid);
            printCSVValue(latitudeTablet, tabletGPSSig, "Latitude", lineT,
                    valid);
        } catch (Exception e) {
            DatConLog.Exception(e);
        }
    }
}
