package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class IMU_ATTI_01_2049 extends Record {
protected boolean valid = false;

protected double longti_01 = (double)0;
protected double lati_01 = (double)0;
protected float alti_01 = (float)0;
protected float acc_x_01 = (float)0;
protected float acc_y_01 = (float)0;
protected float acc_z_01 = (float)0;
protected float gyro_x_01 = (float)0;
protected float gyro_y_01 = (float)0;
protected float gyro_z_01 = (float)0;
protected float press_01 = (float)0;
protected float q0_01 = (float)0;
protected float q1_01 = (float)0;
protected float q2_01 = (float)0;
protected float q3_01 = (float)0;
protected float ag_x_01 = (float)0;
protected float ag_y_01 = (float)0;
protected float ag_z_01 = (float)0;
protected float vg_x_01 = (float)0;
protected float vg_y_01 = (float)0;
protected float vg_z_01 = (float)0;
protected float gb_x_01 = (float)0;
protected float gb_y_01 = (float)0;
protected float gb_z_01 = (float)0;
protected short m_x_01 = (short)0;
protected short m_y_01 = (short)0;
protected short m_z_01 = (short)0;
protected short temp_x_01 = (short)0;
protected short temp_y_01 = (short)0;
protected short temp_z_01 = (short)0;
protected int sensor_monitor_01 = (int)0;
protected int filter_status_01 = (int)0;
protected int svn_01 = (int)0;
protected int cnt_atti_01 = (int)0;

      public IMU_ATTI_01_2049(ConvertDat convertDat) {
           super(convertDat, 2049, 120);
       }

@Override
  public void process(Payload _payload) {
      super.process(_payload);
        try {
      valid = true;

 longti_01 = _payload.getDouble(0);
 lati_01 = _payload.getDouble(8);
 alti_01 = _payload.getFloat(16);
 acc_x_01 = _payload.getFloat(20);
 acc_y_01 = _payload.getFloat(24);
 acc_z_01 = _payload.getFloat(28);
 gyro_x_01 = _payload.getFloat(32);
 gyro_y_01 = _payload.getFloat(36);
 gyro_z_01 = _payload.getFloat(40);
 press_01 = _payload.getFloat(44);
 q0_01 = _payload.getFloat(48);
 q1_01 = _payload.getFloat(52);
 q2_01 = _payload.getFloat(56);
 q3_01 = _payload.getFloat(60);
 ag_x_01 = _payload.getFloat(64);
 ag_y_01 = _payload.getFloat(68);
 ag_z_01 = _payload.getFloat(72);
 vg_x_01 = _payload.getFloat(76);
 vg_y_01 = _payload.getFloat(80);
 vg_z_01 = _payload.getFloat(84);
 gb_x_01 = _payload.getFloat(88);
 gb_y_01 = _payload.getFloat(92);
 gb_z_01 = _payload.getFloat(96);
 m_x_01 = _payload.getShort(100);
 m_y_01 = _payload.getShort(102);
 m_z_01 = _payload.getShort(104);
 temp_x_01 = _payload.getShort(106);
 temp_y_01 = _payload.getShort(108);
 temp_z_01 = _payload.getShort(110);
 sensor_monitor_01 = _payload.getUnsignedShort(112);
 filter_status_01 = _payload.getUnsignedShort(114);
 svn_01 = _payload.getUnsignedShort(116);
 cnt_atti_01 = _payload.getUnsignedShort(118);
} catch (Exception e) {RecordException(e);}}


    protected static Signal IMU_ATTI_01IntSig = Signal
.SeriesInt("IMU_ATTI_01", "", null, Units.noUnits);
    protected static Signal IMU_ATTI_01FloatSig = Signal
.SeriesFloat("IMU_ATTI_01", "", null, Units.noUnits);
    protected static Signal IMU_ATTI_01DoubleSig = Signal
.SeriesDouble("IMU_ATTI_01", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(longti_01, IMU_ATTI_01DoubleSig, "longti_01",lineT, valid);
 printCSVValue(lati_01, IMU_ATTI_01DoubleSig, "lati_01",lineT, valid);
 printCSVValue(alti_01, IMU_ATTI_01FloatSig, "alti_01",lineT, valid);
 printCSVValue(acc_x_01, IMU_ATTI_01FloatSig, "acc_x_01",lineT, valid);
 printCSVValue(acc_y_01, IMU_ATTI_01FloatSig, "acc_y_01",lineT, valid);
 printCSVValue(acc_z_01, IMU_ATTI_01FloatSig, "acc_z_01",lineT, valid);
 printCSVValue(gyro_x_01, IMU_ATTI_01FloatSig, "gyro_x_01",lineT, valid);
 printCSVValue(gyro_y_01, IMU_ATTI_01FloatSig, "gyro_y_01",lineT, valid);
 printCSVValue(gyro_z_01, IMU_ATTI_01FloatSig, "gyro_z_01",lineT, valid);
 printCSVValue(press_01, IMU_ATTI_01FloatSig, "press_01",lineT, valid);
 printCSVValue(q0_01, IMU_ATTI_01FloatSig, "q0_01",lineT, valid);
 printCSVValue(q1_01, IMU_ATTI_01FloatSig, "q1_01",lineT, valid);
 printCSVValue(q2_01, IMU_ATTI_01FloatSig, "q2_01",lineT, valid);
 printCSVValue(q3_01, IMU_ATTI_01FloatSig, "q3_01",lineT, valid);
 printCSVValue(ag_x_01, IMU_ATTI_01FloatSig, "ag_x_01",lineT, valid);
 printCSVValue(ag_y_01, IMU_ATTI_01FloatSig, "ag_y_01",lineT, valid);
 printCSVValue(ag_z_01, IMU_ATTI_01FloatSig, "ag_z_01",lineT, valid);
 printCSVValue(vg_x_01, IMU_ATTI_01FloatSig, "vg_x_01",lineT, valid);
 printCSVValue(vg_y_01, IMU_ATTI_01FloatSig, "vg_y_01",lineT, valid);
 printCSVValue(vg_z_01, IMU_ATTI_01FloatSig, "vg_z_01",lineT, valid);
 printCSVValue(gb_x_01, IMU_ATTI_01FloatSig, "gb_x_01",lineT, valid);
 printCSVValue(gb_y_01, IMU_ATTI_01FloatSig, "gb_y_01",lineT, valid);
 printCSVValue(gb_z_01, IMU_ATTI_01FloatSig, "gb_z_01",lineT, valid);
 printCSVValue(m_x_01, IMU_ATTI_01IntSig, "m_x_01",lineT, valid);
 printCSVValue(m_y_01, IMU_ATTI_01IntSig, "m_y_01",lineT, valid);
 printCSVValue(m_z_01, IMU_ATTI_01IntSig, "m_z_01",lineT, valid);
 printCSVValue(temp_x_01, IMU_ATTI_01IntSig, "temp_x_01",lineT, valid);
 printCSVValue(temp_y_01, IMU_ATTI_01IntSig, "temp_y_01",lineT, valid);
 printCSVValue(temp_z_01, IMU_ATTI_01IntSig, "temp_z_01",lineT, valid);
 printCSVValue(sensor_monitor_01, IMU_ATTI_01IntSig, "sensor_monitor_01",lineT, valid);
 printCSVValue(filter_status_01, IMU_ATTI_01IntSig, "filter_status_01",lineT, valid);
 printCSVValue(svn_01, IMU_ATTI_01IntSig, "svn_01",lineT, valid);
 printCSVValue(cnt_atti_01, IMU_ATTI_01IntSig, "cnt_atti_01",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
