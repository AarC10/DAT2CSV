package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class imu_cali_data_8 extends Record {
protected boolean valid = false;

protected float gyrox_temp = (float)0;
protected float g_cfg_temper_bias_bias_bw_0 = (float)0;
protected float g_cfg_temper_bias_bias_bw_1 = (float)0;
protected float g_cfg_temper_bias_bias_bw_2 = (float)0;
protected float g_cfg_temper_bias_bias_ba_0 = (float)0;
protected float g_cfg_temper_bias_bias_ba_1 = (float)0;
protected float g_cfg_temper_bias_bias_ba_2 = (float)0;
protected int g_cfg_temper_bias_flag = (int)0;
protected int g_cfg_temper_bias_cali = (int)0;
protected int g_cfg_gyro_bias_flag = (int)0;
protected int g_cfg_gyro_bias_cali = (int)0;
protected short imu_cali_bias_sta_flag = (short)0;
protected short imu_cali_bias_sta_cnt = (short)0;
protected short g_cali_state = (short)0;
protected int clock = (int)0;
protected short time = (short)0;

      public imu_cali_data_8(ConvertDat convertDat) {
           super(convertDat, 8, 43);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

 gyrox_temp = record.getFloat(0);
 g_cfg_temper_bias_bias_bw_0 = record.getFloat(4);
 g_cfg_temper_bias_bias_bw_1 = record.getFloat(8);
 g_cfg_temper_bias_bias_bw_2 = record.getFloat(12);
 g_cfg_temper_bias_bias_ba_0 = record.getFloat(16);
 g_cfg_temper_bias_bias_ba_1 = record.getFloat(20);
 g_cfg_temper_bias_bias_ba_2 = record.getFloat(24);
 g_cfg_temper_bias_flag = record.getUnsignedShort(28);
 g_cfg_temper_bias_cali = record.getUnsignedShort(30);
 g_cfg_gyro_bias_flag = record.getUnsignedShort(32);
 g_cfg_gyro_bias_cali = record.getUnsignedShort(34);
imu_cali_bias_sta_flag = record.getUnsignedByte(36);
imu_cali_bias_sta_cnt = record.getUnsignedByte(37);
g_cali_state = record.getUnsignedByte(38);
 clock = record.getUnsignedShort(39);
 time = record.getShort(41);
} catch (Exception e) {RecordException(e);}}


    protected static Signal imu_cali_dataIntSig = Signal
.SeriesInt("imu_cali_data", "", null, Units.noUnits);
    protected static Signal imu_cali_dataFloatSig = Signal
.SeriesFloat("imu_cali_data", "", null, Units.noUnits);
    protected static Signal imu_cali_dataDoubleSig = Signal
.SeriesDouble("imu_cali_data", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(gyrox_temp, imu_cali_dataFloatSig, "gyrox_temp",lineT, valid);
 printCSVValue(g_cfg_temper_bias_bias_bw_0, imu_cali_dataFloatSig, "g_cfg_temper_bias_bias_bw_0",lineT, valid);
 printCSVValue(g_cfg_temper_bias_bias_bw_1, imu_cali_dataFloatSig, "g_cfg_temper_bias_bias_bw_1",lineT, valid);
 printCSVValue(g_cfg_temper_bias_bias_bw_2, imu_cali_dataFloatSig, "g_cfg_temper_bias_bias_bw_2",lineT, valid);
 printCSVValue(g_cfg_temper_bias_bias_ba_0, imu_cali_dataFloatSig, "g_cfg_temper_bias_bias_ba_0",lineT, valid);
 printCSVValue(g_cfg_temper_bias_bias_ba_1, imu_cali_dataFloatSig, "g_cfg_temper_bias_bias_ba_1",lineT, valid);
 printCSVValue(g_cfg_temper_bias_bias_ba_2, imu_cali_dataFloatSig, "g_cfg_temper_bias_bias_ba_2",lineT, valid);
 printCSVValue(g_cfg_temper_bias_flag, imu_cali_dataIntSig, "g_cfg_temper_bias_flag",lineT, valid);
 printCSVValue(g_cfg_temper_bias_cali, imu_cali_dataIntSig, "g_cfg_temper_bias_cali",lineT, valid);
 printCSVValue(g_cfg_gyro_bias_flag, imu_cali_dataIntSig, "g_cfg_gyro_bias_flag",lineT, valid);
 printCSVValue(g_cfg_gyro_bias_cali, imu_cali_dataIntSig, "g_cfg_gyro_bias_cali",lineT, valid);
 printCSVValue(imu_cali_bias_sta_flag, imu_cali_dataIntSig, "imu_cali_bias_sta_flag",lineT, valid);
 printCSVValue(imu_cali_bias_sta_cnt, imu_cali_dataIntSig, "imu_cali_bias_sta_cnt",lineT, valid);
 printCSVValue(g_cali_state, imu_cali_dataIntSig, "g_cali_state",lineT, valid);
 printCSVValue(clock, imu_cali_dataIntSig, "clock",lineT, valid);
 printCSVValue(time, imu_cali_dataIntSig, "time",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
