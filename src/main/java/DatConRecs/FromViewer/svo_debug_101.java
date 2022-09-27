package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class svo_debug_101 extends Record {
protected boolean valid = false;

protected float VisionDebug1 = (float)0;
protected float VisionDebug2 = (float)0;
protected float VisionDebug3 = (float)0;
protected float VisionDebug4 = (float)0;
protected float VisionDebug5 = (float)0;
protected float VisionDebug6 = (float)0;
protected float VisionDebug7 = (float)0;
protected float VisionDebug8 = (float)0;

      public svo_debug_101(ConvertDat convertDat) {
           super(convertDat, 101, 32);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

 VisionDebug1 = record.getFloat(0);
 VisionDebug2 = record.getFloat(4);
 VisionDebug3 = record.getFloat(8);
 VisionDebug4 = record.getFloat(12);
 VisionDebug5 = record.getFloat(16);
 VisionDebug6 = record.getFloat(20);
 VisionDebug7 = record.getFloat(24);
 VisionDebug8 = record.getFloat(28);
} catch (Exception e) {RecordException(e);}}


    protected static Signal svo_debugIntSig = Signal
.SeriesInt("svo_debug", "", null, Units.noUnits);
    protected static Signal svo_debugFloatSig = Signal
.SeriesFloat("svo_debug", "", null, Units.noUnits);
    protected static Signal svo_debugDoubleSig = Signal
.SeriesDouble("svo_debug", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(VisionDebug1, svo_debugFloatSig, "VisionDebug1",lineT, valid);
 printCSVValue(VisionDebug2, svo_debugFloatSig, "VisionDebug2",lineT, valid);
 printCSVValue(VisionDebug3, svo_debugFloatSig, "VisionDebug3",lineT, valid);
 printCSVValue(VisionDebug4, svo_debugFloatSig, "VisionDebug4",lineT, valid);
 printCSVValue(VisionDebug5, svo_debugFloatSig, "VisionDebug5",lineT, valid);
 printCSVValue(VisionDebug6, svo_debugFloatSig, "VisionDebug6",lineT, valid);
 printCSVValue(VisionDebug7, svo_debugFloatSig, "VisionDebug7",lineT, valid);
 printCSVValue(VisionDebug8, svo_debugFloatSig, "VisionDebug8",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
