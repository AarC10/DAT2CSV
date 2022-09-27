package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class IMU_ATTI_02_2050 extends Record {
protected boolean valid = false;

protected double longtiI_02 = (double)0;
protected double latiI_02 = (double)0;
protected float altiI_02 = (float)0;
protected float acc_x_02 = (float)0;
protected float acc_y_02 = (float)0;
protected float acc_z_02 = (float)0;
protected float gyro_x_02 = (float)0;
protected float gyro_y_02 = (float)0;
protected float gyro_z_02 = (float)0;
protected float press_02 = (float)0;
protected float q0_02 = (float)0;
protected float q1_02 = (float)0;
protected float q2_02 = (float)0;
protected float q3_02 = (float)0;
protected float ag_x_02 = (float)0;
protected float ag_y_02 = (float)0;
protected float ag_z_02 = (float)0;
protected float vg_x_02 = (float)0;
protected float vg_y_02 = (float)0;
protected float vg_z_02 = (float)0;
protected float gb_x_02 = (float)0;
protected float gb_y_02 = (float)0;
protected float gb_z_02 = (float)0;
protected short m_x_02 = (short)0;
protected short m_y_02 = (short)0;
protected short m_z_02 = (short)0;
protected short temp_x_02 = (short)0;
protected short temp_y_02 = (short)0;
protected short temp_z_02 = (short)0;
protected int sensor_monitor_02 = (int)0;
protected int filter_status_02 = (int)0;
protected int svn_02 = (int)0;
protected int cnt_atti_02 = (int)0;

      public IMU_ATTI_02_2050(ConvertDat convertDat) {
           super(convertDat, 2050, 120);
       }

@Override
  public void process(Payload _payload) {
      super.process(_payload);
        try {
      valid = true;

 longtiI_02 = _payload.getDouble(0);
 latiI_02 = _payload.getDouble(8);
 altiI_02 = _payload.getFloat(16);
 acc_x_02 = _payload.getFloat(20);
 acc_y_02 = _payload.getFloat(24);
 acc_z_02 = _payload.getFloat(28);
 gyro_x_02 = _payload.getFloat(32);
 gyro_y_02 = _payload.getFloat(36);
 gyro_z_02 = _payload.getFloat(40);
 press_02 = _payload.getFloat(44);
 q0_02 = _payload.getFloat(48);
 q1_02 = _payload.getFloat(52);
 q2_02 = _payload.getFloat(56);
 q3_02 = _payload.getFloat(60);
 ag_x_02 = _payload.getFloat(64);
 ag_y_02 = _payload.getFloat(68);
 ag_z_02 = _payload.getFloat(72);
 vg_x_02 = _payload.getFloat(76);
 vg_y_02 = _payload.getFloat(80);
 vg_z_02 = _payload.getFloat(84);
 gb_x_02 = _payload.getFloat(88);
 gb_y_02 = _payload.getFloat(92);
 gb_z_02 = _payload.getFloat(96);
 m_x_02 = _payload.getShort(100);
 m_y_02 = _payload.getShort(102);
 m_z_02 = _payload.getShort(104);
 temp_x_02 = _payload.getShort(106);
 temp_y_02 = _payload.getShort(108);
 temp_z_02 = _payload.getShort(110);
 sensor_monitor_02 = _payload.getUnsignedShort(112);
 filter_status_02 = _payload.getUnsignedShort(114);
 svn_02 = _payload.getUnsignedShort(116);
 cnt_atti_02 = _payload.getUnsignedShort(118);
} catch (Exception e) {RecordException(e);}}


    protected static Signal IMU_ATTI_02IntSig = Signal
.SeriesInt("IMU_ATTI_02", "", null, Units.noUnits);
    protected static Signal IMU_ATTI_02FloatSig = Signal
.SeriesFloat("IMU_ATTI_02", "", null, Units.noUnits);
    protected static Signal IMU_ATTI_02DoubleSig = Signal
.SeriesDouble("IMU_ATTI_02", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(longtiI_02, IMU_ATTI_02DoubleSig, "longtiI_02",lineT, valid);
 printCSVValue(latiI_02, IMU_ATTI_02DoubleSig, "latiI_02",lineT, valid);
 printCSVValue(altiI_02, IMU_ATTI_02FloatSig, "altiI_02",lineT, valid);
 printCSVValue(acc_x_02, IMU_ATTI_02FloatSig, "acc_x_02",lineT, valid);
 printCSVValue(acc_y_02, IMU_ATTI_02FloatSig, "acc_y_02",lineT, valid);
 printCSVValue(acc_z_02, IMU_ATTI_02FloatSig, "acc_z_02",lineT, valid);
 printCSVValue(gyro_x_02, IMU_ATTI_02FloatSig, "gyro_x_02",lineT, valid);
 printCSVValue(gyro_y_02, IMU_ATTI_02FloatSig, "gyro_y_02",lineT, valid);
 printCSVValue(gyro_z_02, IMU_ATTI_02FloatSig, "gyro_z_02",lineT, valid);
 printCSVValue(press_02, IMU_ATTI_02FloatSig, "press_02",lineT, valid);
 printCSVValue(q0_02, IMU_ATTI_02FloatSig, "q0_02",lineT, valid);
 printCSVValue(q1_02, IMU_ATTI_02FloatSig, "q1_02",lineT, valid);
 printCSVValue(q2_02, IMU_ATTI_02FloatSig, "q2_02",lineT, valid);
 printCSVValue(q3_02, IMU_ATTI_02FloatSig, "q3_02",lineT, valid);
 printCSVValue(ag_x_02, IMU_ATTI_02FloatSig, "ag_x_02",lineT, valid);
 printCSVValue(ag_y_02, IMU_ATTI_02FloatSig, "ag_y_02",lineT, valid);
 printCSVValue(ag_z_02, IMU_ATTI_02FloatSig, "ag_z_02",lineT, valid);
 printCSVValue(vg_x_02, IMU_ATTI_02FloatSig, "vg_x_02",lineT, valid);
 printCSVValue(vg_y_02, IMU_ATTI_02FloatSig, "vg_y_02",lineT, valid);
 printCSVValue(vg_z_02, IMU_ATTI_02FloatSig, "vg_z_02",lineT, valid);
 printCSVValue(gb_x_02, IMU_ATTI_02FloatSig, "gb_x_02",lineT, valid);
 printCSVValue(gb_y_02, IMU_ATTI_02FloatSig, "gb_y_02",lineT, valid);
 printCSVValue(gb_z_02, IMU_ATTI_02FloatSig, "gb_z_02",lineT, valid);
 printCSVValue(m_x_02, IMU_ATTI_02IntSig, "m_x_02",lineT, valid);
 printCSVValue(m_y_02, IMU_ATTI_02IntSig, "m_y_02",lineT, valid);
 printCSVValue(m_z_02, IMU_ATTI_02IntSig, "m_z_02",lineT, valid);
 printCSVValue(temp_x_02, IMU_ATTI_02IntSig, "temp_x_02",lineT, valid);
 printCSVValue(temp_y_02, IMU_ATTI_02IntSig, "temp_y_02",lineT, valid);
 printCSVValue(temp_z_02, IMU_ATTI_02IntSig, "temp_z_02",lineT, valid);
 printCSVValue(sensor_monitor_02, IMU_ATTI_02IntSig, "sensor_monitor_02",lineT, valid);
 printCSVValue(filter_status_02, IMU_ATTI_02IntSig, "filter_status_02",lineT, valid);
 printCSVValue(svn_02, IMU_ATTI_02IntSig, "svn_02",lineT, valid);
 printCSVValue(cnt_atti_02, IMU_ATTI_02IntSig, "cnt_atti_02",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
