package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class app_temp_bias_data_24 extends Record {
protected boolean valid = false;

protected float bw_x = (float)0;
protected float bw_y = (float)0;
protected float bw_z = (float)0;
protected float ba_x = (float)0;
protected float ba_y = (float)0;
protected float ba_z = (float)0;
protected float temp = (float)0;
protected short flag = (short)0;

      public app_temp_bias_data_24(ConvertDat convertDat) {
           super(convertDat, 24, 29);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

 bw_x = record.getFloat(0);
 bw_y = record.getFloat(4);
 bw_z = record.getFloat(8);
 ba_x = record.getFloat(12);
 ba_y = record.getFloat(16);
 ba_z = record.getFloat(20);
 temp = record.getFloat(24);
flag = record.getUnsignedByte(28);
} catch (Exception e) {RecordException(e);}}


    protected static Signal app_temp_bias_dataIntSig = Signal
.SeriesInt("app_temp_bias_data", "", null, Units.noUnits);
    protected static Signal app_temp_bias_dataFloatSig = Signal
.SeriesFloat("app_temp_bias_data", "", null, Units.noUnits);
    protected static Signal app_temp_bias_dataDoubleSig = Signal
.SeriesDouble("app_temp_bias_data", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(bw_x, app_temp_bias_dataFloatSig, "bw_x",lineT, valid);
 printCSVValue(bw_y, app_temp_bias_dataFloatSig, "bw_y",lineT, valid);
 printCSVValue(bw_z, app_temp_bias_dataFloatSig, "bw_z",lineT, valid);
 printCSVValue(ba_x, app_temp_bias_dataFloatSig, "ba_x",lineT, valid);
 printCSVValue(ba_y, app_temp_bias_dataFloatSig, "ba_y",lineT, valid);
 printCSVValue(ba_z, app_temp_bias_dataFloatSig, "ba_z",lineT, valid);
 printCSVValue(temp, app_temp_bias_dataFloatSig, "temp",lineT, valid);
 printCSVValue(flag, app_temp_bias_dataIntSig, "flag",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
