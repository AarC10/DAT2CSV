package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class mpu6500_raw_data_35 extends Record {
protected boolean valid = false;

protected float mpu6500_ax = (float)0;
protected float mpu6500_ay = (float)0;
protected float mpu6500_az = (float)0;
protected float mpu6500_wx = (float)0;
protected float mpu6500_wy = (float)0;
protected float mpu6500_wz = (float)0;

      public mpu6500_raw_data_35(ConvertDat convertDat) {
           super(convertDat, 35, 24);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

 mpu6500_ax = record.getFloat(0);
 mpu6500_ay = record.getFloat(4);
 mpu6500_az = record.getFloat(8);
 mpu6500_wx = record.getFloat(12);
 mpu6500_wy = record.getFloat(16);
 mpu6500_wz = record.getFloat(20);
} catch (Exception e) {RecordException(e);}}


    protected static Signal mpu6500_raw_dataIntSig = Signal
.SeriesInt("mpu6500_raw_data", "", null, Units.noUnits);
    protected static Signal mpu6500_raw_dataFloatSig = Signal
.SeriesFloat("mpu6500_raw_data", "", null, Units.noUnits);
    protected static Signal mpu6500_raw_dataDoubleSig = Signal
.SeriesDouble("mpu6500_raw_data", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(mpu6500_ax, mpu6500_raw_dataFloatSig, "mpu6500_ax",lineT, valid);
 printCSVValue(mpu6500_ay, mpu6500_raw_dataFloatSig, "mpu6500_ay",lineT, valid);
 printCSVValue(mpu6500_az, mpu6500_raw_dataFloatSig, "mpu6500_az",lineT, valid);
 printCSVValue(mpu6500_wx, mpu6500_raw_dataFloatSig, "mpu6500_wx",lineT, valid);
 printCSVValue(mpu6500_wy, mpu6500_raw_dataFloatSig, "mpu6500_wy",lineT, valid);
 printCSVValue(mpu6500_wz, mpu6500_raw_dataFloatSig, "mpu6500_wz",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
