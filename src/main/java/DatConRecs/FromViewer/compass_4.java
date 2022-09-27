package DatConRecs.FromViewer;

import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;

public class compass_4 extends Record {
    protected boolean valid = false;

    protected short magx = (short) 0;

    protected short magy = (short) 0;

    protected short magz = (short) 0;

    protected int mag_cnt = (int) 0;

    public compass_4(ConvertDat convertDat) {
        super(convertDat, 4, 8);
    }

    @Override
    public void process(Payload record) {
        super.process(record);
        try {
            valid = true;
            magx = record.getShort(0);
            magy = record.getShort(2);
            magz = record.getShort(4);
            mag_cnt = record.getUnsignedShort(6);
        } catch (Exception e) {
            RecordException(e);
        }
    }

    protected static Signal compassIntSig = Signal.SeriesInt("compass", "",
            null, Units.noUnits);

    protected static Signal compassFloatSig = Signal.SeriesFloat("compass", "",
            null, Units.noUnits);

    protected static Signal compassDoubleSig = Signal.SeriesDouble("compass",
            "", null, Units.noUnits);

    public void printCols(lineType lineT) {
        try {

            printCSVValue(magx, compassIntSig, "magx", lineT, valid);
            printCSVValue(magy, compassIntSig, "magy", lineT, valid);
            printCSVValue(magz, compassIntSig, "magz", lineT, valid);
            printCSVValue(mag_cnt, compassIntSig, "mag_cnt", lineT, valid);
        } catch (Exception e) {
            DatConLog.Exception(e);
        }
    }

}
