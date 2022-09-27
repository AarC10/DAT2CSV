package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class imu_data_02_2162 extends Record {
protected boolean valid = false;

protected float imu_gyro_tempX_02 = (float)0;
protected float imu_gyro_tempY_02 = (float)0;
protected float imu_gyro_tempZ_02 = (float)0;
protected float imu_gyro_x_02 = (float)0;
protected float imu_gyro_y_02 = (float)0;
protected float imu_gyro_z_02 = (float)0;
protected float imu_acc_x_02 = (float)0;
protected float imu_acc_y_02 = (float)0;
protected float imu_acc_z_02 = (float)0;
protected float imu_airpress_02 = (float)0;
protected float imu_Vin_02 = (float)0;
protected float imu_Ref_02 = (float)0;

      public imu_data_02_2162(ConvertDat convertDat) {
           super(convertDat, 2162, 48);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

 imu_gyro_tempX_02 = record.getFloat(0);
 imu_gyro_tempY_02 = record.getFloat(4);
 imu_gyro_tempZ_02 = record.getFloat(8);
 imu_gyro_x_02 = record.getFloat(12);
 imu_gyro_y_02 = record.getFloat(16);
 imu_gyro_z_02 = record.getFloat(20);
 imu_acc_x_02 = record.getFloat(24);
 imu_acc_y_02 = record.getFloat(28);
 imu_acc_z_02 = record.getFloat(32);
 imu_airpress_02 = record.getFloat(36);
 imu_Vin_02 = record.getFloat(40);
 imu_Ref_02 = record.getFloat(44);
} catch (Exception e) {RecordException(e);}}


    protected static Signal imu_data_02IntSig = Signal
.SeriesInt("imu_data_02", "", null, Units.noUnits);
    protected static Signal imu_data_02FloatSig = Signal
.SeriesFloat("imu_data_02", "", null, Units.noUnits);
    protected static Signal imu_data_02DoubleSig = Signal
.SeriesDouble("imu_data_02", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(imu_gyro_tempX_02, imu_data_02FloatSig, "imu_gyro_tempX_02",lineT, valid);
 printCSVValue(imu_gyro_tempY_02, imu_data_02FloatSig, "imu_gyro_tempY_02",lineT, valid);
 printCSVValue(imu_gyro_tempZ_02, imu_data_02FloatSig, "imu_gyro_tempZ_02",lineT, valid);
 printCSVValue(imu_gyro_x_02, imu_data_02FloatSig, "imu_gyro_x_02",lineT, valid);
 printCSVValue(imu_gyro_y_02, imu_data_02FloatSig, "imu_gyro_y_02",lineT, valid);
 printCSVValue(imu_gyro_z_02, imu_data_02FloatSig, "imu_gyro_z_02",lineT, valid);
 printCSVValue(imu_acc_x_02, imu_data_02FloatSig, "imu_acc_x_02",lineT, valid);
 printCSVValue(imu_acc_y_02, imu_data_02FloatSig, "imu_acc_y_02",lineT, valid);
 printCSVValue(imu_acc_z_02, imu_data_02FloatSig, "imu_acc_z_02",lineT, valid);
 printCSVValue(imu_airpress_02, imu_data_02FloatSig, "imu_airpress_02",lineT, valid);
 printCSVValue(imu_Vin_02, imu_data_02FloatSig, "imu_Vin_02",lineT, valid);
 printCSVValue(imu_Ref_02, imu_data_02FloatSig, "imu_Ref_02",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
