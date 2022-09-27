package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class PWM_OUTPUT_20 extends Record {
protected boolean valid = false;

protected int M1 = (int)0;
protected int M2 = (int)0;
protected int M3 = (int)0;
protected int M4 = (int)0;
protected int M5 = (int)0;
protected int M6 = (int)0;
protected int M7 = (int)0;
protected int M8 = (int)0;

      public PWM_OUTPUT_20(ConvertDat convertDat) {
           super(convertDat, 20, 16);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

 M1 = record.getUnsignedShort(0);
 M2 = record.getUnsignedShort(2);
 M3 = record.getUnsignedShort(4);
 M4 = record.getUnsignedShort(6);
 M5 = record.getUnsignedShort(8);
 M6 = record.getUnsignedShort(10);
 M7 = record.getUnsignedShort(12);
 M8 = record.getUnsignedShort(14);
} catch (Exception e) {RecordException(e);}}


    protected static Signal PWM_OUTPUTIntSig = Signal
.SeriesInt("PWM_OUTPUT", "", null, Units.noUnits);
    protected static Signal PWM_OUTPUTFloatSig = Signal
.SeriesFloat("PWM_OUTPUT", "", null, Units.noUnits);
    protected static Signal PWM_OUTPUTDoubleSig = Signal
.SeriesDouble("PWM_OUTPUT", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(M1, PWM_OUTPUTIntSig, "M1",lineT, valid);
 printCSVValue(M2, PWM_OUTPUTIntSig, "M2",lineT, valid);
 printCSVValue(M3, PWM_OUTPUTIntSig, "M3",lineT, valid);
 printCSVValue(M4, PWM_OUTPUTIntSig, "M4",lineT, valid);
 printCSVValue(M5, PWM_OUTPUTIntSig, "M5",lineT, valid);
 printCSVValue(M6, PWM_OUTPUTIntSig, "M6",lineT, valid);
 printCSVValue(M7, PWM_OUTPUTIntSig, "M7",lineT, valid);
 printCSVValue(M8, PWM_OUTPUTIntSig, "M8",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
