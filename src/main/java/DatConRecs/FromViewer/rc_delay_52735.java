package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class rc_delay_52735 extends Record {
protected boolean valid = false;

protected long dly_ns = (long)0;

      public rc_delay_52735(ConvertDat convertDat) {
           super(convertDat, 52735, 4);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

 dly_ns = record.getUnsignedInt(0);
} catch (Exception e) {RecordException(e);}}


    protected static Signal rc_delayIntSig = Signal
.SeriesInt("rc_delay", "", null, Units.noUnits);
    protected static Signal rc_delayFloatSig = Signal
.SeriesFloat("rc_delay", "", null, Units.noUnits);
    protected static Signal rc_delayDoubleSig = Signal
.SeriesDouble("rc_delay", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(dly_ns, rc_delayIntSig, "dly_ns",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
