package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class sweep_52722 extends Record {
protected boolean valid = false;

protected int ppm = (int)0;

      public sweep_52722(ConvertDat convertDat) {
           super(convertDat, 52722, 2);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

 ppm = record.getUnsignedShort(0);
} catch (Exception e) {RecordException(e);}}


    protected static Signal sweepIntSig = Signal
.SeriesInt("sweep", "", null, Units.noUnits);
    protected static Signal sweepFloatSig = Signal
.SeriesFloat("sweep", "", null, Units.noUnits);
    protected static Signal sweepDoubleSig = Signal
.SeriesDouble("sweep", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(ppm, sweepIntSig, "ppm",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
