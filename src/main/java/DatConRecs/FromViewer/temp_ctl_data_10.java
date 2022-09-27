package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class temp_ctl_data_10 extends Record {
protected boolean valid = false;

protected int p = (int)0;
protected int i = (int)0;
protected int i_small = (int)0;
protected int d = (int)0;
protected short dl_err = (short)0;
protected short err_last = (short)0;
protected int out = (int)0;
protected float kp = (float)0;
protected float ki = (float)0;
protected float kd = (float)0;
protected long ctl_out_value = (long)0;
protected long real_ctl_out_value = (long)0;
protected short dst_value = (short)0;
protected short cur_dst_temp = (short)0;
protected long cnt = (long)0;
protected short real_ctl_out_per = (short)0;
protected short slope_type = (short)0;
protected short temp_ctl_slope = (short)0;
protected short t_finish = (short)0;

      public temp_ctl_data_10(ConvertDat convertDat) {
           super(convertDat, 10, 56);
       }

@Override
  public void process(Payload _payload) {
      super.process(_payload);
        try {
      valid = true;

 p = _payload.getInt(0);
 i = _payload.getInt(4);
 i_small = _payload.getInt(8);
 d = _payload.getInt(12);
 dl_err = _payload.getShort(16);
 err_last = _payload.getShort(18);
 out = _payload.getInt(20);
 kp = _payload.getFloat(24);
 ki = _payload.getFloat(28);
 kd = _payload.getFloat(32);
 ctl_out_value = _payload.getUnsignedInt(36);
 real_ctl_out_value = _payload.getUnsignedInt(40);
 dst_value = _payload.getShort(44);
 cur_dst_temp = _payload.getShort(46);
 cnt = _payload.getUnsignedInt(48);
real_ctl_out_per = _payload.getUnsignedByte(52);
slope_type = _payload.getUnsignedByte(53);
temp_ctl_slope = _payload.getUnsignedByte(54);
t_finish = _payload.getUnsignedByte(55);
} catch (Exception e) {RecordException(e);}}


    protected static Signal temp_ctl_dataIntSig = Signal
.SeriesInt("temp_ctl_data", "", null, Units.noUnits);
    protected static Signal temp_ctl_dataFloatSig = Signal
.SeriesFloat("temp_ctl_data", "", null, Units.noUnits);
    protected static Signal temp_ctl_dataDoubleSig = Signal
.SeriesDouble("temp_ctl_data", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(p, temp_ctl_dataIntSig, "p",lineT, valid);
 printCSVValue(i, temp_ctl_dataIntSig, "i",lineT, valid);
 printCSVValue(i_small, temp_ctl_dataIntSig, "i_small",lineT, valid);
 printCSVValue(d, temp_ctl_dataIntSig, "d",lineT, valid);
 printCSVValue(dl_err, temp_ctl_dataIntSig, "dl_err",lineT, valid);
 printCSVValue(err_last, temp_ctl_dataIntSig, "err_last",lineT, valid);
 printCSVValue(out, temp_ctl_dataIntSig, "out",lineT, valid);
 printCSVValue(kp, temp_ctl_dataFloatSig, "kp",lineT, valid);
 printCSVValue(ki, temp_ctl_dataFloatSig, "ki",lineT, valid);
 printCSVValue(kd, temp_ctl_dataFloatSig, "kd",lineT, valid);
 printCSVValue(ctl_out_value, temp_ctl_dataIntSig, "ctl_out_value",lineT, valid);
 printCSVValue(real_ctl_out_value, temp_ctl_dataIntSig, "real_ctl_out_value",lineT, valid);
 printCSVValue(dst_value, temp_ctl_dataIntSig, "dst_value",lineT, valid);
 printCSVValue(cur_dst_temp, temp_ctl_dataIntSig, "cur_dst_temp",lineT, valid);
 printCSVValue(cnt, temp_ctl_dataIntSig, "cnt",lineT, valid);
 printCSVValue(real_ctl_out_per, temp_ctl_dataIntSig, "real_ctl_out_per",lineT, valid);
 printCSVValue(slope_type, temp_ctl_dataIntSig, "slope_type",lineT, valid);
 printCSVValue(temp_ctl_slope, temp_ctl_dataIntSig, "temp_ctl_slope",lineT, valid);
 printCSVValue(t_finish, temp_ctl_dataIntSig, "t_finish",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
