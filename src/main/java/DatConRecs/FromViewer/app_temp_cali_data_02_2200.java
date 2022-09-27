package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class app_temp_cali_data_02_2200 extends Record {
protected boolean valid = false;

protected short start_flag_02 = (short)0;
protected short state_02 = (short)0;
protected short cali_cnt_02 = (short)0;
protected short temp_ready_02 = (short)0;
protected short step_02 = (short)0;
protected short cali_type_02 = (short)0;
protected int tick_02 = (int)0;
protected short grav_acc_x_02 = (short)0;
protected short grav_acc_y_02 = (short)0;
protected short grav_acc_z_02 = (short)0;
protected short dst_cali_temp_02 = (short)0;
protected float temp_min_02 = (float)0;
protected float temp_max_02 = (float)0;
protected short temp_cali_status_02 = (short)0;
protected short base_cali_status_02 = (short)0;
protected short cfg_temp_cali_fw_version_02 = (short)0;
protected short cur_temp_cali_fw_version_02 = (short)0;
protected float temp_bw_x_02 = (float)0;
protected float temp_bw_y_02 = (float)0;
protected float temp_bw_z_02 = (float)0;
protected float temp_ba_x_02 = (float)0;
protected float temp_ba_y_02 = (float)0;
protected float temp_ba_z_02 = (float)0;
protected float temp_temp_02 = (float)0;
protected float base_bw_x_02 = (float)0;
protected float base_bw_y_02 = (float)0;
protected float base_bw_z_02 = (float)0;
protected float base_ba_x_02 = (float)0;
protected float base_ba_y_02 = (float)0;
protected float base_ba_z_02 = (float)0;
protected float base_temp_02 = (float)0;

      public app_temp_cali_data_02_2200(ConvertDat convertDat) {
           super(convertDat, 2200, 80);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

start_flag_02 = record.getUnsignedByte(0);
 state_02 = record.getByte(1);;
cali_cnt_02 = record.getUnsignedByte(2);
temp_ready_02 = record.getUnsignedByte(3);
step_02 = record.getUnsignedByte(4);
cali_type_02 = record.getUnsignedByte(5);
 tick_02 = record.getUnsignedShort(6);
 grav_acc_x_02 = record.getByte(8);;
 grav_acc_y_02 = record.getByte(9);;
 grav_acc_z_02 = record.getByte(10);;
 dst_cali_temp_02 = record.getByte(11);;
 temp_min_02 = record.getFloat(12);
 temp_max_02 = record.getFloat(16);
temp_cali_status_02 = record.getUnsignedByte(20);
base_cali_status_02 = record.getUnsignedByte(21);
cfg_temp_cali_fw_version_02 = record.getUnsignedByte(22);
cur_temp_cali_fw_version_02 = record.getUnsignedByte(23);
 temp_bw_x_02 = record.getFloat(24);
 temp_bw_y_02 = record.getFloat(28);
 temp_bw_z_02 = record.getFloat(32);
 temp_ba_x_02 = record.getFloat(36);
 temp_ba_y_02 = record.getFloat(40);
 temp_ba_z_02 = record.getFloat(44);
 temp_temp_02 = record.getFloat(48);
 base_bw_x_02 = record.getFloat(52);
 base_bw_y_02 = record.getFloat(56);
 base_bw_z_02 = record.getFloat(60);
 base_ba_x_02 = record.getFloat(64);
 base_ba_y_02 = record.getFloat(68);
 base_ba_z_02 = record.getFloat(72);
 base_temp_02 = record.getFloat(76);
} catch (Exception e) {RecordException(e);}}


    protected static Signal app_temp_cali_data_02IntSig = Signal
.SeriesInt("app_temp_cali_data_02", "", null, Units.noUnits);
    protected static Signal app_temp_cali_data_02FloatSig = Signal
.SeriesFloat("app_temp_cali_data_02", "", null, Units.noUnits);
    protected static Signal app_temp_cali_data_02DoubleSig = Signal
.SeriesDouble("app_temp_cali_data_02", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(start_flag_02, app_temp_cali_data_02IntSig, "start_flag_02",lineT, valid);
 printCSVValue(state_02, app_temp_cali_data_02IntSig, "state_02",lineT, valid);
 printCSVValue(cali_cnt_02, app_temp_cali_data_02IntSig, "cali_cnt_02",lineT, valid);
 printCSVValue(temp_ready_02, app_temp_cali_data_02IntSig, "temp_ready_02",lineT, valid);
 printCSVValue(step_02, app_temp_cali_data_02IntSig, "step_02",lineT, valid);
 printCSVValue(cali_type_02, app_temp_cali_data_02IntSig, "cali_type_02",lineT, valid);
 printCSVValue(tick_02, app_temp_cali_data_02IntSig, "tick_02",lineT, valid);
 printCSVValue(grav_acc_x_02, app_temp_cali_data_02IntSig, "grav_acc_x_02",lineT, valid);
 printCSVValue(grav_acc_y_02, app_temp_cali_data_02IntSig, "grav_acc_y_02",lineT, valid);
 printCSVValue(grav_acc_z_02, app_temp_cali_data_02IntSig, "grav_acc_z_02",lineT, valid);
 printCSVValue(dst_cali_temp_02, app_temp_cali_data_02IntSig, "dst_cali_temp_02",lineT, valid);
 printCSVValue(temp_min_02, app_temp_cali_data_02FloatSig, "temp_min_02",lineT, valid);
 printCSVValue(temp_max_02, app_temp_cali_data_02FloatSig, "temp_max_02",lineT, valid);
 printCSVValue(temp_cali_status_02, app_temp_cali_data_02IntSig, "temp_cali_status_02",lineT, valid);
 printCSVValue(base_cali_status_02, app_temp_cali_data_02IntSig, "base_cali_status_02",lineT, valid);
 printCSVValue(cfg_temp_cali_fw_version_02, app_temp_cali_data_02IntSig, "cfg_temp_cali_fw_version_02",lineT, valid);
 printCSVValue(cur_temp_cali_fw_version_02, app_temp_cali_data_02IntSig, "cur_temp_cali_fw_version_02",lineT, valid);
 printCSVValue(temp_bw_x_02, app_temp_cali_data_02FloatSig, "temp_bw_x_02",lineT, valid);
 printCSVValue(temp_bw_y_02, app_temp_cali_data_02FloatSig, "temp_bw_y_02",lineT, valid);
 printCSVValue(temp_bw_z_02, app_temp_cali_data_02FloatSig, "temp_bw_z_02",lineT, valid);
 printCSVValue(temp_ba_x_02, app_temp_cali_data_02FloatSig, "temp_ba_x_02",lineT, valid);
 printCSVValue(temp_ba_y_02, app_temp_cali_data_02FloatSig, "temp_ba_y_02",lineT, valid);
 printCSVValue(temp_ba_z_02, app_temp_cali_data_02FloatSig, "temp_ba_z_02",lineT, valid);
 printCSVValue(temp_temp_02, app_temp_cali_data_02FloatSig, "temp_temp_02",lineT, valid);
 printCSVValue(base_bw_x_02, app_temp_cali_data_02FloatSig, "base_bw_x_02",lineT, valid);
 printCSVValue(base_bw_y_02, app_temp_cali_data_02FloatSig, "base_bw_y_02",lineT, valid);
 printCSVValue(base_bw_z_02, app_temp_cali_data_02FloatSig, "base_bw_z_02",lineT, valid);
 printCSVValue(base_ba_x_02, app_temp_cali_data_02FloatSig, "base_ba_x_02",lineT, valid);
 printCSVValue(base_ba_y_02, app_temp_cali_data_02FloatSig, "base_ba_y_02",lineT, valid);
 printCSVValue(base_ba_z_02, app_temp_cali_data_02FloatSig, "base_ba_z_02",lineT, valid);
 printCSVValue(base_temp_02, app_temp_cali_data_02FloatSig, "base_temp_02",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
