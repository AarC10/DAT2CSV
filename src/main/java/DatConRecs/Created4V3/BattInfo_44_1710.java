package DatConRecs.Created4V3;

import DatConRecs.BattInfo;
import DatConRecs.Payload;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;

public class BattInfo_44_1710 extends BattInfo {
    protected boolean valid = false;

    protected float ad_v = (float) 0;

    protected int r_time = (int) 0;

    protected float ave_I = (float) 0;

    protected float vol_t = (float) 0;

    protected float pack_ve = 0.0f;;

    protected float I = 0.0f;

    protected int r_cap = (int) 0;

    protected short cap_per = (short) 0;

    protected float temp = 0.0f;

    protected short right = (short) 0;

    protected int l_cell = (int) 0;

    protected long dyna_cnt = (long) 0;

    protected long FullCap = (long) 0;

    protected float out_ctl = (float) 0;

    protected float out_ctl_f = (float) 0;

    public BattInfo_44_1710(ConvertDat convertDat) {
        super(convertDat, 1710, 44);
    }

    @Override
    public void process(Payload _payload) {
        super.process(_payload);
        try {
            valid = true;

            ad_v = (float) (((float) (_payload.getUnsignedShort(0))) / 1000.0);
            r_time = _payload.getUnsignedShort(2);
            ave_I = (float) (((float) (_payload.getFloat(4))) / 1000.0);
            vol_t = _payload.getFloat(8);
            pack_ve = (float) (((float) (_payload.getInt(12))) / 1000.0);
            I = -(float) (((float) (_payload.getInt(16))) / 1000.0);
            r_cap = _payload.getUnsignedShort(20);
            cap_per = _payload.getUnsignedByte(22);
            temp = (float) (((float) (_payload.getShort(23))) / 10.0);
            right = _payload.getUnsignedByte(25);
            l_cell = _payload.getUnsignedShort(26);
            dyna_cnt = _payload.getUnsignedInt(28);
            FullCap = _payload.getUnsignedInt(32);
            out_ctl = _payload.getFloat(36);
            out_ctl_f = _payload.getFloat(40);
        } catch (Exception e) {
            RecordException(e);
        }
    }

    public void printCols(lineType lineT) {
        try {
            printCSVValue(ad_v, BattVoltSig, "Ad_v", lineT, valid);
            printCSVValue(r_time, BattInfo.battInfoRemainTimeSig, "r_time",
                    lineT, valid);
            printCSVValue(ave_I, currentSig, "AvgCurrent", lineT, valid);
            printCSVValue(vol_t, battery_infoFloatSig, "vol_t", lineT, valid);
            printCSVValue(pack_ve, BattVoltSig, "Pack_ve", lineT, valid);
            printCSVValue(I, currentSig, "Current", lineT, valid);
            printCSVValue(r_cap, batteryCap, "RemainingCap", lineT, valid);
            printCSVValue(cap_per, batteryCapPrcnt, "Remaining%", lineT, valid);
            printCSVValue(temp, batteryTempSig, "Temp", lineT, valid);
            printCSVValue(right, battery_infoIntSig, "right", lineT, valid);
            printCSVValue(l_cell, battery_infoIntSig, "l_cell", lineT, valid);
            printCSVValue(dyna_cnt, battery_infoIntSig, "dyna_cnt", lineT,
                    valid);
            printCSVValue(FullCap, batteryCap, "FullCap", lineT, valid);
            printCSVValue(out_ctl, battery_infoFloatSig, "out_ctl", lineT,
                    valid);
            printCSVValue(out_ctl_f, battery_infoFloatSig, "out_ctl_f", lineT,
                    valid);
        } catch (Exception e) {
            DatConLog.Exception(e);
        }
    }
}
