package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class app_temp_cali_data_25 extends Record {
protected boolean valid = false;

protected short start_flag = (short)0;
protected short state = (short)0;
protected short cali_cnt = (short)0;
protected short temp_ready = (short)0;
protected short step = (short)0;
protected short cali_type = (short)0;
protected int tick = (int)0;
protected short grav_acc_x = (short)0;
protected short grav_acc_y = (short)0;
protected short grav_acc_z = (short)0;
protected short dst_cali_temp = (short)0;
protected float dst_cali_temp_1 = (float)0;
protected float temp_min = (float)0;
protected float temp_max = (float)0;
protected short temp_cali_status = (short)0;
protected short base_cali_status = (short)0;
protected short cfg_temp_cali_fw_version = (short)0;
protected short cur_temp_cali_fw_version = (short)0;
protected float temp_bw_x = (float)0;
protected float temp_bw_y = (float)0;
protected float temp_bw_z = (float)0;
protected float temp_ba_x = (float)0;
protected float temp_ba_y = (float)0;
protected float temp_ba_z = (float)0;
protected float temp_temp = (float)0;
protected float base_bw_x = (float)0;
protected float base_bw_y = (float)0;
protected float base_bw_z = (float)0;
protected float base_ba_x = (float)0;
protected float base_ba_y = (float)0;
protected float base_ba_z = (float)0;
protected float base_temp = (float)0;

      public app_temp_cali_data_25(ConvertDat convertDat) {
           super(convertDat, 25, 84);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

start_flag = record.getUnsignedByte(0);
 state = record.getByte(1);;
cali_cnt = record.getUnsignedByte(2);
temp_ready = record.getUnsignedByte(3);
step = record.getUnsignedByte(4);
cali_type = record.getUnsignedByte(5);
 tick = record.getUnsignedShort(6);
 grav_acc_x = record.getByte(8);;
 grav_acc_y = record.getByte(9);;
 grav_acc_z = record.getByte(10);;
 dst_cali_temp = record.getByte(11);;
 dst_cali_temp_1 = record.getFloat(12);
 temp_min = record.getFloat(16);
 temp_max = record.getFloat(20);
temp_cali_status = record.getUnsignedByte(24);
base_cali_status = record.getUnsignedByte(25);
cfg_temp_cali_fw_version = record.getUnsignedByte(26);
cur_temp_cali_fw_version = record.getUnsignedByte(27);
 temp_bw_x = record.getFloat(28);
 temp_bw_y = record.getFloat(32);
 temp_bw_z = record.getFloat(36);
 temp_ba_x = record.getFloat(40);
 temp_ba_y = record.getFloat(44);
 temp_ba_z = record.getFloat(48);
 temp_temp = record.getFloat(52);
 base_bw_x = record.getFloat(56);
 base_bw_y = record.getFloat(60);
 base_bw_z = record.getFloat(64);
 base_ba_x = record.getFloat(68);
 base_ba_y = record.getFloat(72);
 base_ba_z = record.getFloat(76);
 base_temp = record.getFloat(80);
} catch (Exception e) {RecordException(e);}}


    protected static Signal app_temp_cali_dataIntSig = Signal
.SeriesInt("app_temp_cali_data", "", null, Units.noUnits);
    protected static Signal app_temp_cali_dataFloatSig = Signal
.SeriesFloat("app_temp_cali_data", "", null, Units.noUnits);
    protected static Signal app_temp_cali_dataDoubleSig = Signal
.SeriesDouble("app_temp_cali_data", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(start_flag, app_temp_cali_dataIntSig, "start_flag",lineT, valid);
 printCSVValue(state, app_temp_cali_dataIntSig, "state",lineT, valid);
 printCSVValue(cali_cnt, app_temp_cali_dataIntSig, "cali_cnt",lineT, valid);
 printCSVValue(temp_ready, app_temp_cali_dataIntSig, "temp_ready",lineT, valid);
 printCSVValue(step, app_temp_cali_dataIntSig, "step",lineT, valid);
 printCSVValue(cali_type, app_temp_cali_dataIntSig, "cali_type",lineT, valid);
 printCSVValue(tick, app_temp_cali_dataIntSig, "tick",lineT, valid);
 printCSVValue(grav_acc_x, app_temp_cali_dataIntSig, "grav_acc_x",lineT, valid);
 printCSVValue(grav_acc_y, app_temp_cali_dataIntSig, "grav_acc_y",lineT, valid);
 printCSVValue(grav_acc_z, app_temp_cali_dataIntSig, "grav_acc_z",lineT, valid);
 printCSVValue(dst_cali_temp, app_temp_cali_dataIntSig, "dst_cali_temp",lineT, valid);
 printCSVValue(dst_cali_temp_1, app_temp_cali_dataFloatSig, "dst_cali_temp_1",lineT, valid);
 printCSVValue(temp_min, app_temp_cali_dataFloatSig, "temp_min",lineT, valid);
 printCSVValue(temp_max, app_temp_cali_dataFloatSig, "temp_max",lineT, valid);
 printCSVValue(temp_cali_status, app_temp_cali_dataIntSig, "temp_cali_status",lineT, valid);
 printCSVValue(base_cali_status, app_temp_cali_dataIntSig, "base_cali_status",lineT, valid);
 printCSVValue(cfg_temp_cali_fw_version, app_temp_cali_dataIntSig, "cfg_temp_cali_fw_version",lineT, valid);
 printCSVValue(cur_temp_cali_fw_version, app_temp_cali_dataIntSig, "cur_temp_cali_fw_version",lineT, valid);
 printCSVValue(temp_bw_x, app_temp_cali_dataFloatSig, "temp_bw_x",lineT, valid);
 printCSVValue(temp_bw_y, app_temp_cali_dataFloatSig, "temp_bw_y",lineT, valid);
 printCSVValue(temp_bw_z, app_temp_cali_dataFloatSig, "temp_bw_z",lineT, valid);
 printCSVValue(temp_ba_x, app_temp_cali_dataFloatSig, "temp_ba_x",lineT, valid);
 printCSVValue(temp_ba_y, app_temp_cali_dataFloatSig, "temp_ba_y",lineT, valid);
 printCSVValue(temp_ba_z, app_temp_cali_dataFloatSig, "temp_ba_z",lineT, valid);
 printCSVValue(temp_temp, app_temp_cali_dataFloatSig, "temp_temp",lineT, valid);
 printCSVValue(base_bw_x, app_temp_cali_dataFloatSig, "base_bw_x",lineT, valid);
 printCSVValue(base_bw_y, app_temp_cali_dataFloatSig, "base_bw_y",lineT, valid);
 printCSVValue(base_bw_z, app_temp_cali_dataFloatSig, "base_bw_z",lineT, valid);
 printCSVValue(base_ba_x, app_temp_cali_dataFloatSig, "base_ba_x",lineT, valid);
 printCSVValue(base_ba_y, app_temp_cali_dataFloatSig, "base_ba_y",lineT, valid);
 printCSVValue(base_ba_z, app_temp_cali_dataFloatSig, "base_ba_z",lineT, valid);
 printCSVValue(base_temp, app_temp_cali_dataFloatSig, "base_temp",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
