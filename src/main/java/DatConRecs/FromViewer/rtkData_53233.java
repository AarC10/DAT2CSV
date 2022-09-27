package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class rtkData_53233 extends Record {
protected boolean valid = false;

protected int Lat = (int)0;
protected int Lon = (int)0;
protected int Height = (int)0;
protected int satNum = (int)0;
protected int posType = (int)0;
protected int reserve1 = (int)0;
protected int reserve2 = (int)0;
protected int reserve3 = (int)0;
protected int reserve4 = (int)0;
protected int reserve5 = (int)0;
protected int reserve6 = (int)0;
protected int reserve7 = (int)0;
protected int reserve8 = (int)0;
protected int reserve9 = (int)0;
protected int reserve10 = (int)0;
protected long cntRTK = (long)0;

      public rtkData_53233(ConvertDat convertDat) {
           super(convertDat, 53233, 60);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

 Lat = record.getInt(0);
 Lon = record.getInt(4);
 Height = record.getInt(8);
 satNum = record.getUnsignedShort(12);
 posType = record.getUnsignedShort(14);
 reserve1 = record.getInt(16);
 reserve2 = record.getInt(20);
 reserve3 = record.getInt(24);
 reserve4 = record.getInt(28);
 reserve5 = record.getInt(32);
 reserve6 = record.getInt(36);
 reserve7 = record.getInt(40);
 reserve8 = record.getInt(44);
 reserve9 = record.getInt(48);
 reserve10 = record.getInt(52);
 cntRTK = record.getUnsignedInt(56);
} catch (Exception e) {RecordException(e);}}


    protected static Signal rtkDataIntSig = Signal
.SeriesInt("rtkData", "", null, Units.noUnits);
    protected static Signal rtkDataFloatSig = Signal
.SeriesFloat("rtkData", "", null, Units.noUnits);
    protected static Signal rtkDataDoubleSig = Signal
.SeriesDouble("rtkData", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(Lat, rtkDataIntSig, "Lat",lineT, valid);
 printCSVValue(Lon, rtkDataIntSig, "Lon",lineT, valid);
 printCSVValue(Height, rtkDataIntSig, "Height",lineT, valid);
 printCSVValue(satNum, rtkDataIntSig, "satNum",lineT, valid);
 printCSVValue(posType, rtkDataIntSig, "posType",lineT, valid);
 printCSVValue(reserve1, rtkDataIntSig, "reserve1",lineT, valid);
 printCSVValue(reserve2, rtkDataIntSig, "reserve2",lineT, valid);
 printCSVValue(reserve3, rtkDataIntSig, "reserve3",lineT, valid);
 printCSVValue(reserve4, rtkDataIntSig, "reserve4",lineT, valid);
 printCSVValue(reserve5, rtkDataIntSig, "reserve5",lineT, valid);
 printCSVValue(reserve6, rtkDataIntSig, "reserve6",lineT, valid);
 printCSVValue(reserve7, rtkDataIntSig, "reserve7",lineT, valid);
 printCSVValue(reserve8, rtkDataIntSig, "reserve8",lineT, valid);
 printCSVValue(reserve9, rtkDataIntSig, "reserve9",lineT, valid);
 printCSVValue(reserve10, rtkDataIntSig, "reserve10",lineT, valid);
 printCSVValue(cntRTK, rtkDataIntSig, "cntRTK",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
