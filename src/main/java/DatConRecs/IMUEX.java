package DatConRecs;

import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;

public class IMUEX extends Record {
    protected boolean valid = false;

    protected float vo_vx = (float) 0;

    protected float vo_vy = (float) 0;

    protected float vo_vz = (float) 0;

    protected float vo_px = (float) 0;

    protected float vo_py = (float) 0;

    protected float vo_pz = (float) 0;

    protected float us_v = (float) 0;

    protected float us_p = (float) 0;

    protected int vo_flag_navi = (int) 0;

    protected int flag_err = (int) 0;

    protected int vo_flag_rsv = (int) 0;

    protected int ex_cnt = (int) 0;

    protected int index = 0;

    protected String errString = "";

    public IMUEX(ConvertDat convertDat, int id, int length, int index) {
        super(convertDat, id, length);
        this.index = index;
        intSig = Signal.SeriesIntExperimental("IMUEX" + "(" + index + ")", "",
                null, Units.noUnits);
        vovSig = Signal.SeriesFloatExperimental("IMUEX" + "(" + index + ")",
                "vo", null, Units.noUnits);
        vopSig = Signal.SeriesFloatExperimental("IMUEX" + "(" + index + ")",
                "vo", null, Units.noUnits);
        usSig = Signal.SeriesFloatExperimental("IMUEX" + "(" + index + ")",
                "us", null, Units.noUnits);
        errSig = Signal.State("IMUEX" + "(" + index + ")", "err", "NONE");
    }

    protected String getErrString(int err) {
        String retv = "NONE";
        if ((err & 0x01) != 0) {
            retv = "SPEED_LARGE_ERROR";
        } else if ((err & 0x02) != 0) {
            retv = "GPS_YAW_ERROR";
        } else if ((err & 0x04) != 0) {
            retv = "MAG_YAW_ERROR";
        } else if ((err & 0x08) != 0) {
            retv = "GPS_CONSIST_ERROR";
        } else if ((err & 0x10) != 0) {
            retv = "US_FAIL_ERROR";
        } else if ((err & 0x20) != 0) {
            retv = "NONE";
        }
        return retv;
    }

    @Override
    public void process(Payload record) {
        super.process(record);

    }

    protected Signal intSig = null;

    protected Signal vovSig = null;

    protected Signal vopSig = null;

    protected Signal usSig = null;

    private Signal errSig = null;

    public void printCols(lineType lineT) {
        try {
            printCSVValue(vo_vx, vovSig, "vo_vx", lineT, valid);
            printCSVValue(vo_vy, vovSig, "vo_vy", lineT, valid);
            printCSVValue(vo_vz, vovSig, "vo_vz", lineT, valid);
            printCSVValue(vo_px, vopSig, "vo_px", lineT, valid);
            printCSVValue(vo_py, vopSig, "vo_py", lineT, valid);
            printCSVValue(vo_pz, vopSig, "vo_pz", lineT, valid);
            printCSVValue(us_v, usSig, "us_v", lineT, valid);
            printCSVValue(us_p, usSig, "us_p", lineT, valid);
            printCSVValue(vo_flag_navi, intSig, "vo_flag_Navi", lineT, valid);
            printCSVValue(errString, errSig, "err", lineT, valid);
            printCSVValue(ex_cnt, intSig, "cnt", lineT, valid);

        } catch (Exception e) {
            DatConLog.Exception(e);
        }
    }

}
