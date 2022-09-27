package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class temp_ctl_data_01_2177 extends Record {
protected boolean valid = false;

protected short dst_value_01 = (short)0;
protected short cur_dst_temp_01 = (short)0;
protected int p_01 = (int)0;
protected int i_01 = (int)0;
protected int d_01 = (int)0;
protected short dl_err_01 = (short)0;
protected short real_ctl_out_per_01 = (short)0;
protected short slope_type_01 = (short)0;
protected short temp_ctl_slope_01 = (short)0;
protected short t_finish_01 = (short)0;
protected short err_last_01 = (short)0;
protected long ctl_out_value_01 = (long)0;
protected long real_ctl_out_value_01 = (long)0;
protected int i_small_01 = (int)0;
protected int out_01 = (int)0;
protected long cnt_01 = (long)0;

      public temp_ctl_data_01_2177(ConvertDat convertDat) {
           super(convertDat, 2177, 44);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

 dst_value_01 = record.getShort(0);
 cur_dst_temp_01 = record.getShort(2);
 p_01 = record.getInt(4);
 i_01 = record.getInt(8);
 d_01 = record.getInt(12);
 dl_err_01 = record.getShort(16);
real_ctl_out_per_01 = record.getUnsignedByte(18);
slope_type_01 = record.getUnsignedByte(19);
temp_ctl_slope_01 = record.getUnsignedByte(20);
t_finish_01 = record.getUnsignedByte(21);
 err_last_01 = record.getShort(22);
 ctl_out_value_01 = record.getUnsignedInt(24);
 real_ctl_out_value_01 = record.getUnsignedInt(28);
 i_small_01 = record.getInt(32);
 out_01 = record.getInt(36);
 cnt_01 = record.getUnsignedInt(40);
} catch (Exception e) {RecordException(e);}}


    protected static Signal temp_ctl_data_01IntSig = Signal
.SeriesInt("temp_ctl_data_01", "", null, Units.noUnits);
    protected static Signal temp_ctl_data_01FloatSig = Signal
.SeriesFloat("temp_ctl_data_01", "", null, Units.noUnits);
    protected static Signal temp_ctl_data_01DoubleSig = Signal
.SeriesDouble("temp_ctl_data_01", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(dst_value_01, temp_ctl_data_01IntSig, "dst_value_01",lineT, valid);
 printCSVValue(cur_dst_temp_01, temp_ctl_data_01IntSig, "cur_dst_temp_01",lineT, valid);
 printCSVValue(p_01, temp_ctl_data_01IntSig, "p_01",lineT, valid);
 printCSVValue(i_01, temp_ctl_data_01IntSig, "i_01",lineT, valid);
 printCSVValue(d_01, temp_ctl_data_01IntSig, "d_01",lineT, valid);
 printCSVValue(dl_err_01, temp_ctl_data_01IntSig, "dl_err_01",lineT, valid);
 printCSVValue(real_ctl_out_per_01, temp_ctl_data_01IntSig, "real_ctl_out_per_01",lineT, valid);
 printCSVValue(slope_type_01, temp_ctl_data_01IntSig, "slope_type_01",lineT, valid);
 printCSVValue(temp_ctl_slope_01, temp_ctl_data_01IntSig, "temp_ctl_slope_01",lineT, valid);
 printCSVValue(t_finish_01, temp_ctl_data_01IntSig, "t_finish_01",lineT, valid);
 printCSVValue(err_last_01, temp_ctl_data_01IntSig, "err_last_01",lineT, valid);
 printCSVValue(ctl_out_value_01, temp_ctl_data_01IntSig, "ctl_out_value_01",lineT, valid);
 printCSVValue(real_ctl_out_value_01, temp_ctl_data_01IntSig, "real_ctl_out_value_01",lineT, valid);
 printCSVValue(i_small_01, temp_ctl_data_01IntSig, "i_small_01",lineT, valid);
 printCSVValue(out_01, temp_ctl_data_01IntSig, "out_01",lineT, valid);
 printCSVValue(cnt_01, temp_ctl_data_01IntSig, "cnt_01",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
