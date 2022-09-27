package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class osd_home_13 extends Record {
protected boolean valid = false;

protected double osd_lon = (double)0;
protected double osd_lat = (double)0;
protected float osd_alt = (float)0;
protected int osd_home_state = (int)0;
protected int fixed_altitedue = (int)0;
protected short course_lock_torsion = (short)0;

      public osd_home_13(ConvertDat convertDat) {
           super(convertDat, 13, 26);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

 osd_lon = record.getDouble(0);
 osd_lat = record.getDouble(8);
 osd_alt = record.getFloat(16);
 osd_home_state = record.getUnsignedShort(20);
 fixed_altitedue = record.getUnsignedShort(22);
 course_lock_torsion = record.getShort(24);
} catch (Exception e) {RecordException(e);}}


    protected static Signal osd_homeIntSig = Signal
.SeriesInt("osd_home", "", null, Units.noUnits);
    protected static Signal osd_homeFloatSig = Signal
.SeriesFloat("osd_home", "", null, Units.noUnits);
    protected static Signal osd_homeDoubleSig = Signal
.SeriesDouble("osd_home", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(osd_lon, osd_homeDoubleSig, "osd_lon",lineT, valid);
 printCSVValue(osd_lat, osd_homeDoubleSig, "osd_lat",lineT, valid);
 printCSVValue(osd_alt, osd_homeFloatSig, "osd_alt",lineT, valid);
 printCSVValue(osd_home_state, osd_homeIntSig, "osd_home_state",lineT, valid);
 printCSVValue(fixed_altitedue, osd_homeIntSig, "fixed_altitedue",lineT, valid);
 printCSVValue(course_lock_torsion, osd_homeIntSig, "course_lock_torsion",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
