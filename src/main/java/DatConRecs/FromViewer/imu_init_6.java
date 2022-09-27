package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class imu_init_6 extends Record {
protected boolean valid = false;

protected float imu_offset_x = (float)0;
protected float imu_offset_y = (float)0;
protected float imu_offset_z = (float)0;
protected float gps_offset_x = (float)0;
protected float gps_offset_y = (float)0;
protected float gps_offset_z = (float)0;
protected int imu_dir = (int)0;
protected short imu_key = (short)0;
protected short o_sw = (short)0;
protected float mag_bias_x = (float)0;
protected float mag_bias_y = (float)0;
protected float mag_bias_z = (float)0;
protected float mag_scale_x = (float)0;
protected float mag_scale_y = (float)0;
protected float mag_scale_z = (float)0;
protected int init_counter = (int)0;

      public imu_init_6(ConvertDat convertDat) {
           super(convertDat, 6, 54);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

 imu_offset_x = record.getFloat(0);
 imu_offset_y = record.getFloat(4);
 imu_offset_z = record.getFloat(8);
 gps_offset_x = record.getFloat(12);
 gps_offset_y = record.getFloat(16);
 gps_offset_z = record.getFloat(20);
 imu_dir = record.getUnsignedShort(24);
imu_key = record.getUnsignedByte(26);
o_sw = record.getUnsignedByte(27);
 mag_bias_x = record.getFloat(28);
 mag_bias_y = record.getFloat(32);
 mag_bias_z = record.getFloat(36);
 mag_scale_x = record.getFloat(40);
 mag_scale_y = record.getFloat(44);
 mag_scale_z = record.getFloat(48);
 init_counter = record.getUnsignedShort(52);
} catch (Exception e) {RecordException(e);}}


    protected static Signal imu_initIntSig = Signal
.SeriesInt("imu_init", "", null, Units.noUnits);
    protected static Signal imu_initFloatSig = Signal
.SeriesFloat("imu_init", "", null, Units.noUnits);
    protected static Signal imu_initDoubleSig = Signal
.SeriesDouble("imu_init", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(imu_offset_x, imu_initFloatSig, "imu_offset_x",lineT, valid);
 printCSVValue(imu_offset_y, imu_initFloatSig, "imu_offset_y",lineT, valid);
 printCSVValue(imu_offset_z, imu_initFloatSig, "imu_offset_z",lineT, valid);
 printCSVValue(gps_offset_x, imu_initFloatSig, "gps_offset_x",lineT, valid);
 printCSVValue(gps_offset_y, imu_initFloatSig, "gps_offset_y",lineT, valid);
 printCSVValue(gps_offset_z, imu_initFloatSig, "gps_offset_z",lineT, valid);
 printCSVValue(imu_dir, imu_initIntSig, "imu_dir",lineT, valid);
 printCSVValue(imu_key, imu_initIntSig, "imu_key",lineT, valid);
 printCSVValue(o_sw, imu_initIntSig, "o_sw",lineT, valid);
 printCSVValue(mag_bias_x, imu_initFloatSig, "mag_bias_x",lineT, valid);
 printCSVValue(mag_bias_y, imu_initFloatSig, "mag_bias_y",lineT, valid);
 printCSVValue(mag_bias_z, imu_initFloatSig, "mag_bias_z",lineT, valid);
 printCSVValue(mag_scale_x, imu_initFloatSig, "mag_scale_x",lineT, valid);
 printCSVValue(mag_scale_y, imu_initFloatSig, "mag_scale_y",lineT, valid);
 printCSVValue(mag_scale_z, imu_initFloatSig, "mag_scale_z",lineT, valid);
 printCSVValue(init_counter, imu_initIntSig, "init_counter",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
