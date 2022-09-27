package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class taskb_info_52738 extends Record {
protected boolean valid = false;

protected int period_jitter0 = (int)0;
protected int exec_time0 = (int)0;
protected int pending0 = (int)0;

      public taskb_info_52738(ConvertDat convertDat) {
           super(convertDat, 52738, 8);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

 period_jitter0 = record.getInt(0);
 exec_time0 = record.getUnsignedShort(4);
 pending0 = record.getUnsignedShort(6);
} catch (Exception e) {RecordException(e);}}


    protected static Signal taskb_infoIntSig = Signal
.SeriesInt("taskb_info", "", null, Units.noUnits);
    protected static Signal taskb_infoFloatSig = Signal
.SeriesFloat("taskb_info", "", null, Units.noUnits);
    protected static Signal taskb_infoDoubleSig = Signal
.SeriesDouble("taskb_info", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(period_jitter0, taskb_infoIntSig, "period_jitter0",lineT, valid);
 printCSVValue(exec_time0, taskb_infoIntSig, "exec_time0",lineT, valid);
 printCSVValue(pending0, taskb_infoIntSig, "pending0",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
