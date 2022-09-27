package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class app_temp_cali_data_01_2199 extends Record {
protected boolean valid = false;

protected short start_flag_01 = (short)0;
protected short state_01 = (short)0;
protected short cali_cnt_01 = (short)0;
protected short temp_ready_01 = (short)0;
protected short step_01 = (short)0;
protected short cali_type_01 = (short)0;
protected int tick_01 = (int)0;
protected short grav_acc_x_01 = (short)0;
protected short grav_acc_y_01 = (short)0;
protected short grav_acc_z_01 = (short)0;
protected short dst_cali_temp_01 = (short)0;
protected float dst_cali_temp_01_1 = (float)0;
protected float temp_min_01 = (float)0;
protected float temp_max_01 = (float)0;
protected short temp_cali_status_01 = (short)0;
protected short base_cali_status_01 = (short)0;
protected short cfg_temp_cali_fw_version_01 = (short)0;
protected short cur_temp_cali_fw_version_01 = (short)0;
protected float temp_bw_x_01 = (float)0;
protected float temp_bw_y_01 = (float)0;
protected float temp_bw_z_01 = (float)0;
protected float temp_ba_x_01 = (float)0;
protected float temp_ba_y_01 = (float)0;
protected float temp_ba_z_01 = (float)0;
protected float temp_temp_01 = (float)0;
protected float base_bw_x_01 = (float)0;
protected float base_bw_y_01 = (float)0;
protected float base_bw_z_01 = (float)0;
protected float base_ba_x_01 = (float)0;
protected float base_ba_y_01 = (float)0;
protected float base_ba_z_01 = (float)0;
protected float base_temp_01 = (float)0;

      public app_temp_cali_data_01_2199(ConvertDat convertDat) {
           super(convertDat, 2199, 84);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

start_flag_01 = record.getUnsignedByte(0);
 state_01 = record.getByte(1);;
cali_cnt_01 = record.getUnsignedByte(2);
temp_ready_01 = record.getUnsignedByte(3);
step_01 = record.getUnsignedByte(4);
cali_type_01 = record.getUnsignedByte(5);
 tick_01 = record.getUnsignedShort(6);
 grav_acc_x_01 = record.getByte(8);;
 grav_acc_y_01 = record.getByte(9);;
 grav_acc_z_01 = record.getByte(10);;
 dst_cali_temp_01 = record.getByte(11);;
 dst_cali_temp_01_1 = record.getFloat(12);
 temp_min_01 = record.getFloat(16);
 temp_max_01 = record.getFloat(20);
temp_cali_status_01 = record.getUnsignedByte(24);
base_cali_status_01 = record.getUnsignedByte(25);
cfg_temp_cali_fw_version_01 = record.getUnsignedByte(26);
cur_temp_cali_fw_version_01 = record.getUnsignedByte(27);
 temp_bw_x_01 = record.getFloat(28);
 temp_bw_y_01 = record.getFloat(32);
 temp_bw_z_01 = record.getFloat(36);
 temp_ba_x_01 = record.getFloat(40);
 temp_ba_y_01 = record.getFloat(44);
 temp_ba_z_01 = record.getFloat(48);
 temp_temp_01 = record.getFloat(52);
 base_bw_x_01 = record.getFloat(56);
 base_bw_y_01 = record.getFloat(60);
 base_bw_z_01 = record.getFloat(64);
 base_ba_x_01 = record.getFloat(68);
 base_ba_y_01 = record.getFloat(72);
 base_ba_z_01 = record.getFloat(76);
 base_temp_01 = record.getFloat(80);
} catch (Exception e) {RecordException(e);}}


    protected static Signal app_temp_cali_data_01IntSig = Signal
.SeriesInt("app_temp_cali_data_01", "", null, Units.noUnits);
    protected static Signal app_temp_cali_data_01FloatSig = Signal
.SeriesFloat("app_temp_cali_data_01", "", null, Units.noUnits);
    protected static Signal app_temp_cali_data_01DoubleSig = Signal
.SeriesDouble("app_temp_cali_data_01", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(start_flag_01, app_temp_cali_data_01IntSig, "start_flag_01",lineT, valid);
 printCSVValue(state_01, app_temp_cali_data_01IntSig, "state_01",lineT, valid);
 printCSVValue(cali_cnt_01, app_temp_cali_data_01IntSig, "cali_cnt_01",lineT, valid);
 printCSVValue(temp_ready_01, app_temp_cali_data_01IntSig, "temp_ready_01",lineT, valid);
 printCSVValue(step_01, app_temp_cali_data_01IntSig, "step_01",lineT, valid);
 printCSVValue(cali_type_01, app_temp_cali_data_01IntSig, "cali_type_01",lineT, valid);
 printCSVValue(tick_01, app_temp_cali_data_01IntSig, "tick_01",lineT, valid);
 printCSVValue(grav_acc_x_01, app_temp_cali_data_01IntSig, "grav_acc_x_01",lineT, valid);
 printCSVValue(grav_acc_y_01, app_temp_cali_data_01IntSig, "grav_acc_y_01",lineT, valid);
 printCSVValue(grav_acc_z_01, app_temp_cali_data_01IntSig, "grav_acc_z_01",lineT, valid);
 printCSVValue(dst_cali_temp_01, app_temp_cali_data_01IntSig, "dst_cali_temp_01",lineT, valid);
 printCSVValue(dst_cali_temp_01_1, app_temp_cali_data_01FloatSig, "dst_cali_temp_01_1",lineT, valid);
 printCSVValue(temp_min_01, app_temp_cali_data_01FloatSig, "temp_min_01",lineT, valid);
 printCSVValue(temp_max_01, app_temp_cali_data_01FloatSig, "temp_max_01",lineT, valid);
 printCSVValue(temp_cali_status_01, app_temp_cali_data_01IntSig, "temp_cali_status_01",lineT, valid);
 printCSVValue(base_cali_status_01, app_temp_cali_data_01IntSig, "base_cali_status_01",lineT, valid);
 printCSVValue(cfg_temp_cali_fw_version_01, app_temp_cali_data_01IntSig, "cfg_temp_cali_fw_version_01",lineT, valid);
 printCSVValue(cur_temp_cali_fw_version_01, app_temp_cali_data_01IntSig, "cur_temp_cali_fw_version_01",lineT, valid);
 printCSVValue(temp_bw_x_01, app_temp_cali_data_01FloatSig, "temp_bw_x_01",lineT, valid);
 printCSVValue(temp_bw_y_01, app_temp_cali_data_01FloatSig, "temp_bw_y_01",lineT, valid);
 printCSVValue(temp_bw_z_01, app_temp_cali_data_01FloatSig, "temp_bw_z_01",lineT, valid);
 printCSVValue(temp_ba_x_01, app_temp_cali_data_01FloatSig, "temp_ba_x_01",lineT, valid);
 printCSVValue(temp_ba_y_01, app_temp_cali_data_01FloatSig, "temp_ba_y_01",lineT, valid);
 printCSVValue(temp_ba_z_01, app_temp_cali_data_01FloatSig, "temp_ba_z_01",lineT, valid);
 printCSVValue(temp_temp_01, app_temp_cali_data_01FloatSig, "temp_temp_01",lineT, valid);
 printCSVValue(base_bw_x_01, app_temp_cali_data_01FloatSig, "base_bw_x_01",lineT, valid);
 printCSVValue(base_bw_y_01, app_temp_cali_data_01FloatSig, "base_bw_y_01",lineT, valid);
 printCSVValue(base_bw_z_01, app_temp_cali_data_01FloatSig, "base_bw_z_01",lineT, valid);
 printCSVValue(base_ba_x_01, app_temp_cali_data_01FloatSig, "base_ba_x_01",lineT, valid);
 printCSVValue(base_ba_y_01, app_temp_cali_data_01FloatSig, "base_ba_y_01",lineT, valid);
 printCSVValue(base_ba_z_01, app_temp_cali_data_01FloatSig, "base_ba_z_01",lineT, valid);
 printCSVValue(base_temp_01, app_temp_cali_data_01FloatSig, "base_temp_01",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
