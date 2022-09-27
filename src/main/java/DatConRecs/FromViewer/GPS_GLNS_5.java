package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class GPS_GLNS_5 extends Record {
protected boolean valid = false;

protected long gps_date = (long)0;
protected long gps_time = (long)0;
protected int gps_lon = (int)0;
protected int gps_lat = (int)0;
protected int hmsl = (int)0;
protected float Vel_N = (float)0;
protected float Vel_E = (float)0;
protected float Vel_D = (float)0;
protected float hdop = (float)0;
protected float pdop = (float)0;
protected float gps_fix = (float)0;
protected float gnss_flag = (float)0;
protected float hacc = (float)0;
protected float sacc = (float)0;
protected long gps_used = (long)0;
protected long gln_used = (long)0;
protected int numsv = (int)0;
protected int gpsstate = (int)0;

      public GPS_GLNS_5(ConvertDat convertDat) {
           super(convertDat, 5, 68);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

 gps_date = record.getUnsignedInt(0);
 gps_time = record.getUnsignedInt(4);
 gps_lon = record.getInt(8);
 gps_lat = record.getInt(12);
 hmsl = record.getInt(16);
 Vel_N = record.getFloat(20);
 Vel_E = record.getFloat(24);
 Vel_D = record.getFloat(28);
 hdop = record.getFloat(32);
 pdop = record.getFloat(36);
 gps_fix = record.getFloat(40);
 gnss_flag = record.getFloat(44);
 hacc = record.getFloat(48);
 sacc = record.getFloat(52);
 gps_used = record.getUnsignedInt(56);
 gln_used = record.getUnsignedInt(60);
 numsv = record.getUnsignedShort(64);
 gpsstate = record.getUnsignedShort(66);
} catch (Exception e) {RecordException(e);}}


    protected static Signal GPS_GLNSIntSig = Signal
.SeriesInt("GPS_GLNS", "", null, Units.noUnits);
    protected static Signal GPS_GLNSFloatSig = Signal
.SeriesFloat("GPS_GLNS", "", null, Units.noUnits);
    protected static Signal GPS_GLNSDoubleSig = Signal
.SeriesDouble("GPS_GLNS", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(gps_date, GPS_GLNSIntSig, "gps_date",lineT, valid);
 printCSVValue(gps_time, GPS_GLNSIntSig, "gps_time",lineT, valid);
 printCSVValue(gps_lon, GPS_GLNSIntSig, "gps_lon",lineT, valid);
 printCSVValue(gps_lat, GPS_GLNSIntSig, "gps_lat",lineT, valid);
 printCSVValue(hmsl, GPS_GLNSIntSig, "hmsl",lineT, valid);
 printCSVValue(Vel_N, GPS_GLNSFloatSig, "Vel_N",lineT, valid);
 printCSVValue(Vel_E, GPS_GLNSFloatSig, "Vel_E",lineT, valid);
 printCSVValue(Vel_D, GPS_GLNSFloatSig, "Vel_D",lineT, valid);
 printCSVValue(hdop, GPS_GLNSFloatSig, "hdop",lineT, valid);
 printCSVValue(pdop, GPS_GLNSFloatSig, "pdop",lineT, valid);
 printCSVValue(gps_fix, GPS_GLNSFloatSig, "gps_fix",lineT, valid);
 printCSVValue(gnss_flag, GPS_GLNSFloatSig, "gnss_flag",lineT, valid);
 printCSVValue(hacc, GPS_GLNSFloatSig, "hacc",lineT, valid);
 printCSVValue(sacc, GPS_GLNSFloatSig, "sacc",lineT, valid);
 printCSVValue(gps_used, GPS_GLNSIntSig, "gps_used",lineT, valid);
 printCSVValue(gln_used, GPS_GLNSIntSig, "gln_used",lineT, valid);
 printCSVValue(numsv, GPS_GLNSIntSig, "numsv",lineT, valid);
 printCSVValue(gpsstate, GPS_GLNSIntSig, "gpsstate",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
