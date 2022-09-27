package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class sensor_cfg_temp_9 extends Record {
protected boolean valid = false;

protected float bias_gyrox = (float)0;
protected float bias_gyroy = (float)0;
protected float bias_gyroz = (float)0;
protected float bias_accx = (float)0;
protected float bias_accy = (float)0;
protected float bias_accz = (float)0;
protected float tw = (float)0;
protected float ta = (float)0;
protected int fw = (int)0;
protected int fa = (int)0;

      public sensor_cfg_temp_9(ConvertDat convertDat) {
           super(convertDat, 9, 36);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

 bias_gyrox = record.getFloat(0);
 bias_gyroy = record.getFloat(4);
 bias_gyroz = record.getFloat(8);
 bias_accx = record.getFloat(12);
 bias_accy = record.getFloat(16);
 bias_accz = record.getFloat(20);
 tw = record.getFloat(24);
 ta = record.getFloat(28);
 fw = record.getUnsignedShort(32);
 fa = record.getUnsignedShort(34);
} catch (Exception e) {RecordException(e);}}


    protected static Signal sensor_cfg_tempIntSig = Signal
.SeriesInt("sensor_cfg_temp", "", null, Units.noUnits);
    protected static Signal sensor_cfg_tempFloatSig = Signal
.SeriesFloat("sensor_cfg_temp", "", null, Units.noUnits);
    protected static Signal sensor_cfg_tempDoubleSig = Signal
.SeriesDouble("sensor_cfg_temp", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(bias_gyrox, sensor_cfg_tempFloatSig, "bias_gyrox",lineT, valid);
 printCSVValue(bias_gyroy, sensor_cfg_tempFloatSig, "bias_gyroy",lineT, valid);
 printCSVValue(bias_gyroz, sensor_cfg_tempFloatSig, "bias_gyroz",lineT, valid);
 printCSVValue(bias_accx, sensor_cfg_tempFloatSig, "bias_accx",lineT, valid);
 printCSVValue(bias_accy, sensor_cfg_tempFloatSig, "bias_accy",lineT, valid);
 printCSVValue(bias_accz, sensor_cfg_tempFloatSig, "bias_accz",lineT, valid);
 printCSVValue(tw, sensor_cfg_tempFloatSig, "tw",lineT, valid);
 printCSVValue(ta, sensor_cfg_tempFloatSig, "ta",lineT, valid);
 printCSVValue(fw, sensor_cfg_tempIntSig, "fw",lineT, valid);
 printCSVValue(fa, sensor_cfg_tempIntSig, "fa",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
