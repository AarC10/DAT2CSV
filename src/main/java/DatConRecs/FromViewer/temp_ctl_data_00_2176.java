package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class temp_ctl_data_00_2176 extends Record {
protected boolean valid = false;

protected short dst_value_00 = (short)0;
protected short cur_dst_temp_00 = (short)0;
protected int p_00 = (int)0;
protected int i_00 = (int)0;
protected int d_00 = (int)0;
protected short dl_err_00 = (short)0;
protected short real_ctl_out_per_00 = (short)0;
protected short slope_type_00 = (short)0;
protected short temp_ctl_slope_00 = (short)0;
protected short t_finish_00 = (short)0;
protected short err_last_00 = (short)0;
protected long ctl_out_value_00 = (long)0;
protected long real_ctl_out_value_00 = (long)0;
protected int i_small_00 = (int)0;
protected int out_00 = (int)0;
protected long cnt_00 = (long)0;

      public temp_ctl_data_00_2176(ConvertDat convertDat) {
           super(convertDat, 2176, 44);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

 dst_value_00 = record.getShort(0);
 cur_dst_temp_00 = record.getShort(2);
 p_00 = record.getInt(4);
 i_00 = record.getInt(8);
 d_00 = record.getInt(12);
 dl_err_00 = record.getShort(16);
real_ctl_out_per_00 = record.getUnsignedByte(18);
slope_type_00 = record.getUnsignedByte(19);
temp_ctl_slope_00 = record.getUnsignedByte(20);
t_finish_00 = record.getUnsignedByte(21);
 err_last_00 = record.getShort(22);
 ctl_out_value_00 = record.getUnsignedInt(24);
 real_ctl_out_value_00 = record.getUnsignedInt(28);
 i_small_00 = record.getInt(32);
 out_00 = record.getInt(36);
 cnt_00 = record.getUnsignedInt(40);
} catch (Exception e) {RecordException(e);}}


    protected static Signal temp_ctl_data_00IntSig = Signal
.SeriesInt("temp_ctl_data_00", "", null, Units.noUnits);
    protected static Signal temp_ctl_data_00FloatSig = Signal
.SeriesFloat("temp_ctl_data_00", "", null, Units.noUnits);
    protected static Signal temp_ctl_data_00DoubleSig = Signal
.SeriesDouble("temp_ctl_data_00", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(dst_value_00, temp_ctl_data_00IntSig, "dst_value_00",lineT, valid);
 printCSVValue(cur_dst_temp_00, temp_ctl_data_00IntSig, "cur_dst_temp_00",lineT, valid);
 printCSVValue(p_00, temp_ctl_data_00IntSig, "p_00",lineT, valid);
 printCSVValue(i_00, temp_ctl_data_00IntSig, "i_00",lineT, valid);
 printCSVValue(d_00, temp_ctl_data_00IntSig, "d_00",lineT, valid);
 printCSVValue(dl_err_00, temp_ctl_data_00IntSig, "dl_err_00",lineT, valid);
 printCSVValue(real_ctl_out_per_00, temp_ctl_data_00IntSig, "real_ctl_out_per_00",lineT, valid);
 printCSVValue(slope_type_00, temp_ctl_data_00IntSig, "slope_type_00",lineT, valid);
 printCSVValue(temp_ctl_slope_00, temp_ctl_data_00IntSig, "temp_ctl_slope_00",lineT, valid);
 printCSVValue(t_finish_00, temp_ctl_data_00IntSig, "t_finish_00",lineT, valid);
 printCSVValue(err_last_00, temp_ctl_data_00IntSig, "err_last_00",lineT, valid);
 printCSVValue(ctl_out_value_00, temp_ctl_data_00IntSig, "ctl_out_value_00",lineT, valid);
 printCSVValue(real_ctl_out_value_00, temp_ctl_data_00IntSig, "real_ctl_out_value_00",lineT, valid);
 printCSVValue(i_small_00, temp_ctl_data_00IntSig, "i_small_00",lineT, valid);
 printCSVValue(out_00, temp_ctl_data_00IntSig, "out_00",lineT, valid);
 printCSVValue(cnt_00, temp_ctl_data_00IntSig, "cnt_00",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
