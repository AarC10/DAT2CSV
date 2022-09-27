package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class osd_general_12 extends Record {
protected boolean valid = false;

protected double longtitude = (double)0;
protected double latitude = (double)0;
protected short relative_height = (short)0;
protected short vgx = (short)0;
protected short vgy = (short)0;
protected short vgz = (short)0;
protected short pitch = (short)0;
protected short roll = (short)0;
protected short yaw = (short)0;
protected short mode1 = (short)0;
protected short latest_cmd = (short)0;
protected long controller_state = (long)0;
protected short gps_nums = (short)0;
protected short gohome_landing_reason = (short)0;
protected short start_fail_reason = (short)0;
protected short controller_state_ext = (short)0;
protected short rsvd2 = (short)0;
protected short ultrasonic_height = (short)0;
protected int motor_startup_time = (int)0;
protected short motor_startup_times = (short)0;
protected short bat_alarm1 = (short)0;
protected short bat_alarm2 = (short)0;
protected short version_match = (short)0;
protected short product_type = (short)0;

      public osd_general_12(ConvertDat convertDat) {
           super(convertDat, 12, 49);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

 longtitude = record.getDouble(0);
 latitude = record.getDouble(8);
 relative_height = record.getShort(16);
 vgx = record.getShort(18);
 vgy = record.getShort(20);
 vgz = record.getShort(22);
 pitch = record.getShort(24);
 roll = record.getShort(26);
 yaw = record.getShort(28);
mode1 = record.getUnsignedByte(30);
latest_cmd = record.getUnsignedByte(31);
 controller_state = record.getUnsignedInt(32);
gps_nums = record.getUnsignedByte(36);
gohome_landing_reason = record.getUnsignedByte(37);
start_fail_reason = record.getUnsignedByte(38);
controller_state_ext = record.getUnsignedByte(39);
rsvd2 = record.getUnsignedByte(40);
ultrasonic_height = record.getUnsignedByte(41);
 motor_startup_time = record.getUnsignedShort(42);
motor_startup_times = record.getUnsignedByte(44);
bat_alarm1 = record.getUnsignedByte(45);
bat_alarm2 = record.getUnsignedByte(46);
version_match = record.getUnsignedByte(47);
product_type = record.getUnsignedByte(48);
} catch (Exception e) {RecordException(e);}}


    protected static Signal osd_generalIntSig = Signal
.SeriesInt("osd_general", "", null, Units.noUnits);
    protected static Signal osd_generalFloatSig = Signal
.SeriesFloat("osd_general", "", null, Units.noUnits);
    protected static Signal osd_generalDoubleSig = Signal
.SeriesDouble("osd_general", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(longtitude, osd_generalDoubleSig, "longtitude",lineT, valid);
 printCSVValue(latitude, osd_generalDoubleSig, "latitude",lineT, valid);
 printCSVValue(relative_height, osd_generalIntSig, "relative_height",lineT, valid);
 printCSVValue(vgx, osd_generalIntSig, "vgx",lineT, valid);
 printCSVValue(vgy, osd_generalIntSig, "vgy",lineT, valid);
 printCSVValue(vgz, osd_generalIntSig, "vgz",lineT, valid);
 printCSVValue(pitch, osd_generalIntSig, "pitch",lineT, valid);
 printCSVValue(roll, osd_generalIntSig, "roll",lineT, valid);
 printCSVValue(yaw, osd_generalIntSig, "yaw",lineT, valid);
 printCSVValue(mode1, osd_generalIntSig, "mode1",lineT, valid);
 printCSVValue(latest_cmd, osd_generalIntSig, "latest_cmd",lineT, valid);
 printCSVValue(controller_state, osd_generalIntSig, "controller_state",lineT, valid);
 printCSVValue(gps_nums, osd_generalIntSig, "gps_nums",lineT, valid);
 printCSVValue(gohome_landing_reason, osd_generalIntSig, "gohome_landing_reason",lineT, valid);
 printCSVValue(start_fail_reason, osd_generalIntSig, "start_fail_reason",lineT, valid);
 printCSVValue(controller_state_ext, osd_generalIntSig, "controller_state_ext",lineT, valid);
 printCSVValue(rsvd2, osd_generalIntSig, "rsvd2",lineT, valid);
 printCSVValue(ultrasonic_height, osd_generalIntSig, "ultrasonic_height",lineT, valid);
 printCSVValue(motor_startup_time, osd_generalIntSig, "motor_startup_time",lineT, valid);
 printCSVValue(motor_startup_times, osd_generalIntSig, "motor_startup_times",lineT, valid);
 printCSVValue(bat_alarm1, osd_generalIntSig, "bat_alarm1",lineT, valid);
 printCSVValue(bat_alarm2, osd_generalIntSig, "bat_alarm2",lineT, valid);
 printCSVValue(version_match, osd_generalIntSig, "version_match",lineT, valid);
 printCSVValue(product_type, osd_generalIntSig, "product_type",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
