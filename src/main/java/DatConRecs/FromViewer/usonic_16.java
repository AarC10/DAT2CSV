package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class usonic_16 extends Record {
protected boolean valid = false;

protected short usonic_h = (short)0;
protected short usonic_flag = (short)0;
protected short usonic_cnt = (short)0;

      public usonic_16(ConvertDat convertDat) {
           super(convertDat, 16, 4);
       }

@Override
  public void process(Payload _payload) {
      super.process(_payload);
        try {
      valid = true;

 usonic_h = _payload.getShort(0);
usonic_flag = _payload.getUnsignedByte(2);
usonic_cnt = _payload.getUnsignedByte(3);
} catch (Exception e) {RecordException(e);}}


    protected static Signal usonicIntSig = Signal
.SeriesInt("usonic", "", null, Units.noUnits);
    protected static Signal usonicFloatSig = Signal
.SeriesFloat("usonic", "", null, Units.noUnits);
    protected static Signal usonicDoubleSig = Signal
.SeriesDouble("usonic", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(usonic_h, usonicIntSig, "usonic_h",lineT, valid);
 printCSVValue(usonic_flag, usonicIntSig, "usonic_flag",lineT, valid);
 printCSVValue(usonic_cnt, usonicIntSig, "usonic_cnt",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
