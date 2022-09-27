package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class taskc_info_52744 extends Record {
protected boolean valid = false;

protected int period_jitter2 = (int)0;
protected int exec_time2 = (int)0;
protected int pending2 = (int)0;

      public taskc_info_52744(ConvertDat convertDat) {
           super(convertDat, 52744, 8);
       }

@Override
  public void process(Payload _payload) {
      super.process(_payload);
        try {
      valid = true;

 period_jitter2 = _payload.getInt(0);
 exec_time2 = _payload.getUnsignedShort(4);
 pending2 = _payload.getUnsignedShort(6);
} catch (Exception e) {RecordException(e);}}


    protected static Signal taskc_infoIntSig = Signal
.SeriesInt("taskc_info", "", null, Units.noUnits);
    protected static Signal taskc_infoFloatSig = Signal
.SeriesFloat("taskc_info", "", null, Units.noUnits);
    protected static Signal taskc_infoDoubleSig = Signal
.SeriesDouble("taskc_info", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(period_jitter2, taskc_infoIntSig, "period_jitter2",lineT, valid);
 printCSVValue(exec_time2, taskc_infoIntSig, "exec_time2",lineT, valid);
 printCSVValue(pending2, taskc_infoIntSig, "pending2",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
