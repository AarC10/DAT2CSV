package DatConRecs.FromOtherV3Dats;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class battery_info_1710 extends Record {
protected boolean valid = false;

protected int ad_v = (int)0;
protected int r_time = (int)0;
protected float ave_I = (float)0;
protected float vol_t = (float)0;
protected int pack_ve = (int)0;
protected int I = (int)0;
protected int r_cap = (int)0;
protected short cap_per = (short)0;
protected short temp = (short)0;
protected short right = (short)0;
protected int l_cell = (int)0;
protected long dyna_cnt = (long)0;
protected long f_cap = (long)0;
protected float out_ctl = (float)0;
protected float out_ctl_f = (float)0;

      public battery_info_1710(ConvertDat convertDat) {
           super(convertDat, 1710, 44);
       }

@Override
  public void process(Payload _payload) {
      super.process(_payload);
        try {
      valid = true;

 ad_v = _payload.getUnsignedShort(0);
 r_time = _payload.getUnsignedShort(2);
 ave_I = _payload.getFloat(4);
 vol_t = _payload.getFloat(8);
 pack_ve = _payload.getInt(12);
 I = _payload.getInt(16);
 r_cap = _payload.getUnsignedShort(20);
cap_per = _payload.getUnsignedByte(22);
 temp = _payload.getShort(23);
right = _payload.getUnsignedByte(25);
 l_cell = _payload.getUnsignedShort(26);
 dyna_cnt = _payload.getUnsignedInt(28);
 f_cap = _payload.getUnsignedInt(32);
 out_ctl = _payload.getFloat(36);
 out_ctl_f = _payload.getFloat(40);
} catch (Exception e) {RecordException(e);}}


    protected static Signal battery_infoIntSig = Signal
.SeriesInt("battery_info", "", null, Units.noUnits);
    protected static Signal battery_infoFloatSig = Signal
.SeriesFloat("battery_info", "", null, Units.noUnits);
    protected static Signal battery_infoDoubleSig = Signal
.SeriesDouble("battery_info", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(ad_v, battery_infoIntSig, "ad_v",lineT, valid);
 printCSVValue(r_time, battery_infoIntSig, "r_time",lineT, valid);
 printCSVValue(ave_I, battery_infoFloatSig, "ave_I",lineT, valid);
 printCSVValue(vol_t, battery_infoFloatSig, "vol_t",lineT, valid);
 printCSVValue(pack_ve, battery_infoIntSig, "pack_ve",lineT, valid);
 printCSVValue(I, battery_infoIntSig, "I",lineT, valid);
 printCSVValue(r_cap, battery_infoIntSig, "r_cap",lineT, valid);
 printCSVValue(cap_per, battery_infoIntSig, "cap_per",lineT, valid);
 printCSVValue(temp, battery_infoIntSig, "temp",lineT, valid);
 printCSVValue(right, battery_infoIntSig, "right",lineT, valid);
 printCSVValue(l_cell, battery_infoIntSig, "l_cell",lineT, valid);
 printCSVValue(dyna_cnt, battery_infoIntSig, "dyna_cnt",lineT, valid);
 printCSVValue(f_cap, battery_infoIntSig, "f_cap",lineT, valid);
 printCSVValue(out_ctl, battery_infoFloatSig, "out_ctl",lineT, valid);
 printCSVValue(out_ctl_f, battery_infoFloatSig, "out_ctl_f",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
