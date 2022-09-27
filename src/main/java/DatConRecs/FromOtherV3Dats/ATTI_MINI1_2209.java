package DatConRecs.FromOtherV3Dats;

import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;

public class ATTI_MINI1_2209 extends Record {
    protected boolean valid = false;

    protected float s_qw1 = (float) 0;

    protected float s_qx1 = (float) 0;

    protected float s_qy1 = (float) 0;

    protected float s_qz1 = (float) 0;

    protected float s_pgz1 = (float) 0;

    protected float s_vgz1 = (float) 0;

    protected float s_agz1 = (float) 0;

    protected long s_rsv01 = (long) 0;

    protected long s_rsv11 = (long) 0;

    protected long s_cnt1 = (long) 0;

    public ATTI_MINI1_2209(ConvertDat convertDat) {
        super(convertDat, 2209, 40);
    }

    @Override
    public void process(Payload record) {
        super.process(record);
        try {
            valid = true;

            s_qw1 = record.getFloat(0);
            s_qx1 = record.getFloat(4);
            s_qy1 = record.getFloat(8);
            s_qz1 = record.getFloat(12);
            s_pgz1 = record.getFloat(16);
            s_vgz1 = record.getFloat(20);
            s_agz1 = record.getFloat(24);
            s_rsv01 = record.getUnsignedInt(28);
            s_rsv11 = record.getUnsignedInt(32);
            s_cnt1 = record.getUnsignedInt(36);
        } catch (Exception e) {
            RecordException(e);
        }
    }

    protected static Signal ATTI_MINI1IntSig = Signal.SeriesInt("ATTI_MINI1",
            "", null, Units.noUnits);

    protected static Signal ATTI_MINI1FloatSig = Signal
            .SeriesFloat("ATTI_MINI1", "", null, Units.noUnits);

    protected static Signal ATTI_MINI1DoubleSig = Signal
            .SeriesDouble("ATTI_MINI1", "", null, Units.noUnits);

    public void printCols(lineType lineT) {
        try {

            printCSVValue(s_qw1, ATTI_MINI1FloatSig, "s_qw1", lineT, valid);
            printCSVValue(s_qx1, ATTI_MINI1FloatSig, "s_qx1", lineT, valid);
            printCSVValue(s_qy1, ATTI_MINI1FloatSig, "s_qy1", lineT, valid);
            printCSVValue(s_qz1, ATTI_MINI1FloatSig, "s_qz1", lineT, valid);
            printCSVValue(s_pgz1, ATTI_MINI1FloatSig, "s_pgz1", lineT, valid);
            printCSVValue(s_vgz1, ATTI_MINI1FloatSig, "s_vgz1", lineT, valid);
            printCSVValue(s_agz1, ATTI_MINI1FloatSig, "s_agz1", lineT, valid);
            printCSVValue(s_rsv01, ATTI_MINI1IntSig, "s_rsv01", lineT, valid);
            printCSVValue(s_rsv11, ATTI_MINI1IntSig, "s_rsv11", lineT, valid);
            printCSVValue(s_cnt1, ATTI_MINI1IntSig, "s_cnt1", lineT, valid);
        } catch (Exception e) {
            DatConLog.Exception(e);
        }
    }

}
