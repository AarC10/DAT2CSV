package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class adxl278_raw_data_36 extends Record {
protected boolean valid = false;

protected float adxl278_ax = (float)0;
protected float adxl278_ay = (float)0;
protected float adxl278_az = (float)0;

      public adxl278_raw_data_36(ConvertDat convertDat) {
           super(convertDat, 36, 12);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

 adxl278_ax = record.getFloat(0);
 adxl278_ay = record.getFloat(4);
 adxl278_az = record.getFloat(8);
} catch (Exception e) {RecordException(e);}}


    protected static Signal adxl278_raw_dataIntSig = Signal
.SeriesInt("adxl278_raw_data", "", null, Units.noUnits);
    protected static Signal adxl278_raw_dataFloatSig = Signal
.SeriesFloat("adxl278_raw_data", "", null, Units.noUnits);
    protected static Signal adxl278_raw_dataDoubleSig = Signal
.SeriesDouble("adxl278_raw_data", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(adxl278_ax, adxl278_raw_dataFloatSig, "adxl278_ax",lineT, valid);
 printCSVValue(adxl278_ay, adxl278_raw_dataFloatSig, "adxl278_ay",lineT, valid);
 printCSVValue(adxl278_az, adxl278_raw_dataFloatSig, "adxl278_az",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
