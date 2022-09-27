package DatConRecs.Created4V1;

import DatConRecs.Payload;
import DatConRecs.Record;
import files.AxesAndSigs;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;

public class HomePoint34_13 extends Record {

    public short rthHeight = 0;

    public boolean valid = false;

    public double longitudeHP;

    public double latitudeHP;

    private float height = 0f;

    public HomePoint34_13(ConvertDat convertDat) {
        super(convertDat, 13, 34);
    }

    @Override
    public void process(Payload payload) {
        super.process(payload);
        try {
            double longRad = payloadBB.getDouble(0);
            double latRad = payloadBB.getDouble(8);
            height = payloadBB.getFloat(16);

            rthHeight = payloadBB.getShort(22);
            longitudeHP = Math.toDegrees(longRad);
            latitudeHP = Math.toDegrees(latRad);
            if (!valid) {
                if (longRad < 100.0 && latRad < 100.0) {
                    valid = true;
                }
            }
            if (valid) {
                convertDat.processHomePoint(latitudeHP, longitudeHP, height);
            }
        } catch (Exception e) {
            RecordException(e);
        }
    }

    @Override
    public void printCols(lineType lineT) {
        try {
            printCSVValue(convertDat.getHPLongDeg(), AxesAndSigs.hpLongitudeSig,
                    "", lineT, valid);
            printCSVValue(convertDat.getHPLatDeg(), AxesAndSigs.hpLatitudeSig,
                    "", lineT, valid);
            printCSVValue(rthHeight, AxesAndSigs.rthHeightSig, "", lineT,
                    valid);
        } catch (Exception e) {
            DatConLog.Exception(e);
        }
    }
}
