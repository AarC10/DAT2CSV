package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class fdi_26 extends Record {
protected boolean valid = false;

protected long ns_abnormal_all = (long)0;
protected long history_ns_abnormal_all = (long)0;
protected short gyro_bias_raw_flag = (short)0;
protected float gyrox_bias_raw = (float)0;
protected float gyroy_bias_raw = (float)0;
protected float gyroz_bias_raw = (float)0;

      public fdi_26(ConvertDat convertDat) {
           super(convertDat, 26, 21);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

 ns_abnormal_all = record.getUnsignedInt(0);
 history_ns_abnormal_all = record.getUnsignedInt(4);
gyro_bias_raw_flag = record.getUnsignedByte(8);
 gyrox_bias_raw = record.getFloat(9);
 gyroy_bias_raw = record.getFloat(13);
 gyroz_bias_raw = record.getFloat(17);
} catch (Exception e) {RecordException(e);}}


    protected static Signal fdiIntSig = Signal
.SeriesInt("fdi", "", null, Units.noUnits);
    protected static Signal fdiFloatSig = Signal
.SeriesFloat("fdi", "", null, Units.noUnits);
    protected static Signal fdiDoubleSig = Signal
.SeriesDouble("fdi", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(ns_abnormal_all, fdiIntSig, "ns_abnormal_all",lineT, valid);
 printCSVValue(history_ns_abnormal_all, fdiIntSig, "history_ns_abnormal_all",lineT, valid);
 printCSVValue(gyro_bias_raw_flag, fdiIntSig, "gyro_bias_raw_flag",lineT, valid);
 printCSVValue(gyrox_bias_raw, fdiFloatSig, "gyrox_bias_raw",lineT, valid);
 printCSVValue(gyroy_bias_raw, fdiFloatSig, "gyroy_bias_raw",lineT, valid);
 printCSVValue(gyroz_bias_raw, fdiFloatSig, "gyroz_bias_raw",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
