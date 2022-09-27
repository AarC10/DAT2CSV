package DatConRecs.Created4V3;

import DatConRecs.*;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;

public class IMUEX60 extends IMUEX {

    protected double rtk_long = (double) 0;

    protected double rtk_lati = (double) 0;

    protected float rtk_alti = (float) 0;

    public IMUEX60(ConvertDat convertDat, int id, int length, int index) {
        super(convertDat, id, length, index);

        coordSig = Signal.SeriesDouble("IMUEX" + "(" + index + ")", "", null,
                Units.degrees180);
        altiSig = Signal.SeriesDouble("IMUEX" + "(" + index + ")", "", null,
                Units.meters);
    }

    @Override
    public void process(Payload record) {
        super.process(record);
        try {
            valid = true;

            vo_vx = record.getFloat(0);
            vo_vy = record.getFloat(4);
            vo_vz = record.getFloat(8);
            vo_px = record.getFloat(12);
            vo_py = record.getFloat(16);
            vo_pz = record.getFloat(20);
            us_v = record.getFloat(24);
            us_p = record.getFloat(28);
            rtk_long = record.getDouble(32);
            rtk_lati = record.getDouble(40);
            rtk_alti = record.getFloat(48);
            vo_flag_navi = record.getUnsignedShort(52);
            flag_err = record.getUnsignedShort(54);
            vo_flag_rsv = record.getUnsignedShort(56);
            ex_cnt = record.getUnsignedShort(58);
            errString = getErrString(flag_err);
        } catch (Exception e) {
            RecordException(e);
        }
    }

    public Signal coordSig = null;

    public Signal altiSig = null;

    public void printCols(lineType lineT) {
        try {
            super.printCols(lineT);
            printCSVValue(Math.toDegrees(rtk_long), coordSig, "rtk_Longitude",
                    lineT, valid);
            printCSVValue(Math.toDegrees(rtk_lati), coordSig, "rtk_Latitude",
                    lineT, valid);
            printCSVValue(rtk_alti, altiSig, "rtk_Alti", lineT, valid);

        } catch (Exception e) {
            DatConLog.Exception(e);
        }
    }

}
