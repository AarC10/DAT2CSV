package DatConRecs.Created4V3;

import DatConRecs.BattInfo;
import DatConRecs.Payload;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;

public class BattInfo_44_1710 extends BattInfo {
    protected boolean valid = false;

    protected double ad_v = 0;

    protected int r_time = 0;

    protected double ave_I = 0;

    protected double vol_t = 0;

    protected double pack_ve = 0.0f;
    ;

    protected double I = 0.0f;

    protected int r_cap = 0;

    protected short cap_per = (short) 0;

    protected double temp = 0.0f;

    protected short right = (short) 0;

    protected int l_cell = 0;

    protected double dyna_cnt = 0;

    protected long FullCap = 0;

    protected double out_ctl = 0;

    protected double out_ctl_f = 0;

    public BattInfo_44_1710(ConvertDat convertDat) {
        super(convertDat, 1710, 44);
    }

    @Override
    public void process(Payload record) {
        super.process(record);
        try {
            this.valid = true;

            ad_v = (float) (((float) (record.getUnsignedShort(0))) / 1000.0);
            r_time = record.getUnsignedShort(2);
            ave_I = (float) (((float) (record.getFloat(4))) / 1000.0);
            vol_t = record.getFloat(8);
            pack_ve = (float) (((float) (record.getInt(12))) / 1000.0);
            I = -(float) (((float) (record.getInt(16))) / 1000.0);
            r_cap = record.getUnsignedShort(20);
            cap_per = record.getUnsignedByte(22);
            temp = (float) (((float) (record.getShort(23))) / 10.0);
            right = record.getUnsignedByte(25);
            l_cell = record.getUnsignedShort(26);
            dyna_cnt = record.getUnsignedInt(28);
            FullCap = record.getUnsignedInt(32);
            out_ctl = record.getFloat(36);
            out_ctl_f = record.getFloat(40);
        } catch (Exception e) {
            RecordException(e);
        }
    }

    public void printCols(lineType lineT) {
        try {
            printCSVValue(ad_v, battVoltSig, "Ad_v", lineT, valid);
            printCSVValue(r_time, BattInfo.battInfoRemainTimeSig, "r_time", lineT, valid);
            printCSVValue(ave_I, currentSig, "AvgCurrent", lineT, valid);
            printCSVValue(vol_t, batteryInfoFloatSig, "vol_t", lineT, valid);
            printCSVValue(pack_ve, battVoltSig, "Pack_ve", lineT, valid);
            printCSVValue(I, currentSig, "Current", lineT, valid);
            printCSVValue(r_cap, batteryCap, "RemainingCap", lineT, valid);
            printCSVValue(cap_per, batteryCapPercent, "Remaining%", lineT, valid);
            printCSVValue(temp, batteryTempSig, "Temp", lineT, valid);
            printCSVValue(right, batteryInfoIntSig, "right", lineT, valid);
            printCSVValue(l_cell, batteryInfoIntSig, "l_cell", lineT, valid);
            printCSVValue(dyna_cnt, batteryInfoIntSig, "dyna_cnt", lineT, valid);
            printCSVValue(FullCap, batteryCap, "FullCap", lineT, valid);
            printCSVValue(out_ctl, batteryInfoFloatSig, "out_ctl", lineT, valid);
            printCSVValue(out_ctl_f, batteryInfoFloatSig, "out_ctl_f", lineT, valid);
        } catch (Exception e) {
            DatConLog.Exception(e);
        }
    }
}
