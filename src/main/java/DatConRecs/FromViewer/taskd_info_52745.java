package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class taskd_info_52745 extends Record {
protected boolean valid = false;

protected int period_jitter3 = (int)0;
protected int exec_time3 = (int)0;
protected int pending3 = (int)0;

      public taskd_info_52745(ConvertDat convertDat) {
           super(convertDat, 52745, 8);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

 period_jitter3 = record.getInt(0);
 exec_time3 = record.getUnsignedShort(4);
 pending3 = record.getUnsignedShort(6);
} catch (Exception e) {RecordException(e);}}


    protected static Signal taskd_infoIntSig = Signal
.SeriesInt("taskd_info", "", null, Units.noUnits);
    protected static Signal taskd_infoFloatSig = Signal
.SeriesFloat("taskd_info", "", null, Units.noUnits);
    protected static Signal taskd_infoDoubleSig = Signal
.SeriesDouble("taskd_info", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(period_jitter3, taskd_infoIntSig, "period_jitter3",lineT, valid);
 printCSVValue(exec_time3, taskd_infoIntSig, "exec_time3",lineT, valid);
 printCSVValue(pending3, taskd_infoIntSig, "pending3",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
