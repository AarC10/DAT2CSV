package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class imu_data_7 extends Record {
protected boolean valid = false;

protected float imu_gyro_tempX = (float)0;
protected float imu_gyro_tempY = (float)0;
protected float imu_gyro_tempZ = (float)0;
protected float imu_gyro_x = (float)0;
protected float imu_gyro_y = (float)0;
protected float imu_gyro_z = (float)0;
protected float imu_acc_x = (float)0;
protected float imu_acc_y = (float)0;
protected float imu_acc_z = (float)0;
protected float imu_airpress = (float)0;
protected float imu_Vin = (float)0;
protected float imu_Ref = (float)0;

      public imu_data_7(ConvertDat convertDat) {
           super(convertDat, 7, 48);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

 imu_gyro_tempX = record.getFloat(0);
 imu_gyro_tempY = record.getFloat(4);
 imu_gyro_tempZ = record.getFloat(8);
 imu_gyro_x = record.getFloat(12);
 imu_gyro_y = record.getFloat(16);
 imu_gyro_z = record.getFloat(20);
 imu_acc_x = record.getFloat(24);
 imu_acc_y = record.getFloat(28);
 imu_acc_z = record.getFloat(32);
 imu_airpress = record.getFloat(36);
 imu_Vin = record.getFloat(40);
 imu_Ref = record.getFloat(44);
} catch (Exception e) {RecordException(e);}}


    protected static Signal imu_dataIntSig = Signal
.SeriesInt("imu_data", "", null, Units.noUnits);
    protected static Signal imu_dataFloatSig = Signal
.SeriesFloat("imu_data", "", null, Units.noUnits);
    protected static Signal imu_dataDoubleSig = Signal
.SeriesDouble("imu_data", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(imu_gyro_tempX, imu_dataFloatSig, "imu_gyro_tempX",lineT, valid);
 printCSVValue(imu_gyro_tempY, imu_dataFloatSig, "imu_gyro_tempY",lineT, valid);
 printCSVValue(imu_gyro_tempZ, imu_dataFloatSig, "imu_gyro_tempZ",lineT, valid);
 printCSVValue(imu_gyro_x, imu_dataFloatSig, "imu_gyro_x",lineT, valid);
 printCSVValue(imu_gyro_y, imu_dataFloatSig, "imu_gyro_y",lineT, valid);
 printCSVValue(imu_gyro_z, imu_dataFloatSig, "imu_gyro_z",lineT, valid);
 printCSVValue(imu_acc_x, imu_dataFloatSig, "imu_acc_x",lineT, valid);
 printCSVValue(imu_acc_y, imu_dataFloatSig, "imu_acc_y",lineT, valid);
 printCSVValue(imu_acc_z, imu_dataFloatSig, "imu_acc_z",lineT, valid);
 printCSVValue(imu_airpress, imu_dataFloatSig, "imu_airpress",lineT, valid);
 printCSVValue(imu_Vin, imu_dataFloatSig, "imu_Vin",lineT, valid);
 printCSVValue(imu_Ref, imu_dataFloatSig, "imu_Ref",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
