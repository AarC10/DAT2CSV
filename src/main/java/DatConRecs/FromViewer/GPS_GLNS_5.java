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
  public void process(Payload _payload) {
      super.process(_payload);
        try {
      valid = true;

 gps_date = _payload.getUnsignedInt(0);
 gps_time = _payload.getUnsignedInt(4);
 gps_lon = _payload.getInt(8);
 gps_lat = _payload.getInt(12);
 hmsl = _payload.getInt(16);
 Vel_N = _payload.getFloat(20);
 Vel_E = _payload.getFloat(24);
 Vel_D = _payload.getFloat(28);
 hdop = _payload.getFloat(32);
 pdop = _payload.getFloat(36);
 gps_fix = _payload.getFloat(40);
 gnss_flag = _payload.getFloat(44);
 hacc = _payload.getFloat(48);
 sacc = _payload.getFloat(52);
 gps_used = _payload.getUnsignedInt(56);
 gln_used = _payload.getUnsignedInt(60);
 numsv = _payload.getUnsignedShort(64);
 gpsstate = _payload.getUnsignedShort(66);
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
