package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class waypoint_debug_160 extends Record {
protected boolean valid = false;

protected short wp_mission_status = (short)0;
protected short wp_cur_num = (short)0;
protected int wp_tgt_vel = (int)0;

      public waypoint_debug_160(ConvertDat convertDat) {
           super(convertDat, 160, 4);
       }

@Override
  public void process(Payload _payload) {
      super.process(_payload);
        try {
      valid = true;

wp_mission_status = _payload.getUnsignedByte(0);
wp_cur_num = _payload.getUnsignedByte(1);
 wp_tgt_vel = _payload.getUnsignedShort(2);
} catch (Exception e) {RecordException(e);}}


    protected static Signal waypoint_debugIntSig = Signal
.SeriesInt("waypoint_debug", "", null, Units.noUnits);
    protected static Signal waypoint_debugFloatSig = Signal
.SeriesFloat("waypoint_debug", "", null, Units.noUnits);
    protected static Signal waypoint_debugDoubleSig = Signal
.SeriesDouble("waypoint_debug", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(wp_mission_status, waypoint_debugIntSig, "wp_mission_status",lineT, valid);
 printCSVValue(wp_cur_num, waypoint_debugIntSig, "wp_cur_num",lineT, valid);
 printCSVValue(wp_tgt_vel, waypoint_debugIntSig, "wp_tgt_vel",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
