package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class taska_info_52742 extends Record {
protected boolean valid = false;

protected int period_jitter1 = (int)0;
protected int exec_time1 = (int)0;
protected int pending1 = (int)0;

      public taska_info_52742(ConvertDat convertDat) {
           super(convertDat, 52742, 8);
       }

@Override
  public void process(Payload _payload) {
      super.process(_payload);
        try {
      valid = true;

 period_jitter1 = _payload.getInt(0);
 exec_time1 = _payload.getUnsignedShort(4);
 pending1 = _payload.getUnsignedShort(6);
} catch (Exception e) {RecordException(e);}}


    protected static Signal taska_infoIntSig = Signal
.SeriesInt("taska_info", "", null, Units.noUnits);
    protected static Signal taska_infoFloatSig = Signal
.SeriesFloat("taska_info", "", null, Units.noUnits);
    protected static Signal taska_infoDoubleSig = Signal
.SeriesDouble("taska_info", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(period_jitter1, taska_infoIntSig, "period_jitter1",lineT, valid);
 printCSVValue(exec_time1, taska_infoIntSig, "exec_time1",lineT, valid);
 printCSVValue(pending1, taska_infoIntSig, "pending1",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
