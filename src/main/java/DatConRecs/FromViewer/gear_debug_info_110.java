package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class gear_debug_info_110 extends Record {
protected boolean valid = false;

protected short gear_mode = (short)0;
protected short gear_state = (short)0;
protected short gear_cmd = (short)0;
protected short gear_speed = (short)0;
protected long gear_counter = (long)0;
protected short gear_pack_flag = (short)0;
protected short gear_pack_req = (short)0;
protected short gear_pack_type = (short)0;
protected short gear_pack_state = (short)0;
protected short gear_pack_manual_cmd = (short)0;
protected short gear_rc_cmd = (short)0;
protected short gear_app_req = (short)0;
protected short gear_app_cmd = (short)0;
protected short gear_rc_raw_input = (short)0;

      public gear_debug_info_110(ConvertDat convertDat) {
           super(convertDat, 110, 18);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

gear_mode = record.getUnsignedByte(0);
gear_state = record.getUnsignedByte(1);
gear_cmd = record.getUnsignedByte(2);
gear_speed = record.getUnsignedByte(3);
 gear_counter = record.getUnsignedInt(4);
gear_pack_flag = record.getUnsignedByte(8);
gear_pack_req = record.getUnsignedByte(9);
gear_pack_type = record.getUnsignedByte(10);
gear_pack_state = record.getUnsignedByte(11);
gear_pack_manual_cmd = record.getUnsignedByte(12);
gear_rc_cmd = record.getUnsignedByte(13);
gear_app_req = record.getUnsignedByte(14);
gear_app_cmd = record.getUnsignedByte(15);
 gear_rc_raw_input = record.getShort(16);
} catch (Exception e) {RecordException(e);}}


    protected static Signal gear_debug_infoIntSig = Signal
.SeriesInt("gear_debug_info", "", null, Units.noUnits);
    protected static Signal gear_debug_infoFloatSig = Signal
.SeriesFloat("gear_debug_info", "", null, Units.noUnits);
    protected static Signal gear_debug_infoDoubleSig = Signal
.SeriesDouble("gear_debug_info", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(gear_mode, gear_debug_infoIntSig, "gear_mode",lineT, valid);
 printCSVValue(gear_state, gear_debug_infoIntSig, "gear_state",lineT, valid);
 printCSVValue(gear_cmd, gear_debug_infoIntSig, "gear_cmd",lineT, valid);
 printCSVValue(gear_speed, gear_debug_infoIntSig, "gear_speed",lineT, valid);
 printCSVValue(gear_counter, gear_debug_infoIntSig, "gear_counter",lineT, valid);
 printCSVValue(gear_pack_flag, gear_debug_infoIntSig, "gear_pack_flag",lineT, valid);
 printCSVValue(gear_pack_req, gear_debug_infoIntSig, "gear_pack_req",lineT, valid);
 printCSVValue(gear_pack_type, gear_debug_infoIntSig, "gear_pack_type",lineT, valid);
 printCSVValue(gear_pack_state, gear_debug_infoIntSig, "gear_pack_state",lineT, valid);
 printCSVValue(gear_pack_manual_cmd, gear_debug_infoIntSig, "gear_pack_manual_cmd",lineT, valid);
 printCSVValue(gear_rc_cmd, gear_debug_infoIntSig, "gear_rc_cmd",lineT, valid);
 printCSVValue(gear_app_req, gear_debug_infoIntSig, "gear_app_req",lineT, valid);
 printCSVValue(gear_app_cmd, gear_debug_infoIntSig, "gear_app_cmd",lineT, valid);
 printCSVValue(gear_rc_raw_input, gear_debug_infoIntSig, "gear_rc_raw_input",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
