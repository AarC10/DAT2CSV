package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class temp_ctl_data_02_2178 extends Record {
protected boolean valid = false;

protected short dst_value_02 = (short)0;
protected short cur_dst_temp_02 = (short)0;
protected int p_02 = (int)0;
protected int i_02 = (int)0;
protected int d_02 = (int)0;
protected short dl_err_02 = (short)0;
protected short real_ctl_out_per_02 = (short)0;
protected short slope_type_02 = (short)0;
protected short temp_ctl_slope_02 = (short)0;
protected short t_finish_02 = (short)0;
protected short err_last_02 = (short)0;
protected long ctl_out_value_02 = (long)0;
protected long real_ctl_out_value_02 = (long)0;
protected int i_small_02 = (int)0;
protected int out_02 = (int)0;
protected long cnt_02 = (long)0;

      public temp_ctl_data_02_2178(ConvertDat convertDat) {
           super(convertDat, 2178, 44);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

 dst_value_02 = record.getShort(0);
 cur_dst_temp_02 = record.getShort(2);
 p_02 = record.getInt(4);
 i_02 = record.getInt(8);
 d_02 = record.getInt(12);
 dl_err_02 = record.getShort(16);
real_ctl_out_per_02 = record.getUnsignedByte(18);
slope_type_02 = record.getUnsignedByte(19);
temp_ctl_slope_02 = record.getUnsignedByte(20);
t_finish_02 = record.getUnsignedByte(21);
 err_last_02 = record.getShort(22);
 ctl_out_value_02 = record.getUnsignedInt(24);
 real_ctl_out_value_02 = record.getUnsignedInt(28);
 i_small_02 = record.getInt(32);
 out_02 = record.getInt(36);
 cnt_02 = record.getUnsignedInt(40);
} catch (Exception e) {RecordException(e);}}


    protected static Signal temp_ctl_data_02IntSig = Signal
.SeriesInt("temp_ctl_data_02", "", null, Units.noUnits);
    protected static Signal temp_ctl_data_02FloatSig = Signal
.SeriesFloat("temp_ctl_data_02", "", null, Units.noUnits);
    protected static Signal temp_ctl_data_02DoubleSig = Signal
.SeriesDouble("temp_ctl_data_02", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(dst_value_02, temp_ctl_data_02IntSig, "dst_value_02",lineT, valid);
 printCSVValue(cur_dst_temp_02, temp_ctl_data_02IntSig, "cur_dst_temp_02",lineT, valid);
 printCSVValue(p_02, temp_ctl_data_02IntSig, "p_02",lineT, valid);
 printCSVValue(i_02, temp_ctl_data_02IntSig, "i_02",lineT, valid);
 printCSVValue(d_02, temp_ctl_data_02IntSig, "d_02",lineT, valid);
 printCSVValue(dl_err_02, temp_ctl_data_02IntSig, "dl_err_02",lineT, valid);
 printCSVValue(real_ctl_out_per_02, temp_ctl_data_02IntSig, "real_ctl_out_per_02",lineT, valid);
 printCSVValue(slope_type_02, temp_ctl_data_02IntSig, "slope_type_02",lineT, valid);
 printCSVValue(temp_ctl_slope_02, temp_ctl_data_02IntSig, "temp_ctl_slope_02",lineT, valid);
 printCSVValue(t_finish_02, temp_ctl_data_02IntSig, "t_finish_02",lineT, valid);
 printCSVValue(err_last_02, temp_ctl_data_02IntSig, "err_last_02",lineT, valid);
 printCSVValue(ctl_out_value_02, temp_ctl_data_02IntSig, "ctl_out_value_02",lineT, valid);
 printCSVValue(real_ctl_out_value_02, temp_ctl_data_02IntSig, "real_ctl_out_value_02",lineT, valid);
 printCSVValue(i_small_02, temp_ctl_data_02IntSig, "i_small_02",lineT, valid);
 printCSVValue(out_02, temp_ctl_data_02IntSig, "out_02",lineT, valid);
 printCSVValue(cnt_02, temp_ctl_data_02IntSig, "cnt_02",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
