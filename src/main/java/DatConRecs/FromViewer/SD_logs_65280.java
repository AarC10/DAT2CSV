package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
public class SD_logs_65280 extends Record {
 String text = "";

 public SD_logs_65280(ConvertDat convertDat) {
  super(convertDat, 65280,-1);
}
@Override
  public void process(Payload record) {
      super.process(record);
        try {
} catch (Exception e) {RecordException(e);}}


   public void printCols(lineType lineT) {
try {

 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
