package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class wp_curve_150 extends Record {
protected boolean valid = false;

protected float px = (float)0;
protected float py = (float)0;
protected float pz = (float)0;
protected float vx = (float)0;
protected float vy = (float)0;
protected float vz = (float)0;
protected float v_norm = (float)0;
protected float T = (float)0;
protected short wp_state = (short)0;

      public wp_curve_150(ConvertDat convertDat) {
           super(convertDat, 150, 33);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

 px = record.getFloat(0);
 py = record.getFloat(4);
 pz = record.getFloat(8);
 vx = record.getFloat(12);
 vy = record.getFloat(16);
 vz = record.getFloat(20);
 v_norm = record.getFloat(24);
 T = record.getFloat(28);
wp_state = record.getUnsignedByte(32);
} catch (Exception e) {RecordException(e);}}


    protected static Signal wp_curveIntSig = Signal
.SeriesInt("wp_curve", "", null, Units.noUnits);
    protected static Signal wp_curveFloatSig = Signal
.SeriesFloat("wp_curve", "", null, Units.noUnits);
    protected static Signal wp_curveDoubleSig = Signal
.SeriesDouble("wp_curve", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(px, wp_curveFloatSig, "px",lineT, valid);
 printCSVValue(py, wp_curveFloatSig, "py",lineT, valid);
 printCSVValue(pz, wp_curveFloatSig, "pz",lineT, valid);
 printCSVValue(vx, wp_curveFloatSig, "vx",lineT, valid);
 printCSVValue(vy, wp_curveFloatSig, "vy",lineT, valid);
 printCSVValue(vz, wp_curveFloatSig, "vz",lineT, valid);
 printCSVValue(v_norm, wp_curveFloatSig, "v_norm",lineT, valid);
 printCSVValue(T, wp_curveFloatSig, "T",lineT, valid);
 printCSVValue(wp_state, wp_curveIntSig, "wp_state",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
