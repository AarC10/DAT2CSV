package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class escm_52721 extends Record {
protected boolean valid = false;

protected short esc1_status = (short)0;
protected short esc1_current = (short)0;
protected short esc1_speed = (short)0;
protected short esc1_voltage = (short)0;
protected short esc1_temperature = (short)0;
protected short esc1_ppm_recv = (short)0;
protected short esc1_v_out = (short)0;
protected short esc1_debug0 = (short)0;
protected short esc1_debug1 = (short)0;
protected short esc1_debug2 = (short)0;

protected short esc2_status = (short)0;
protected short esc2_current = (short)0;
protected short esc2_speed = (short)0;
protected short esc2_voltage = (short)0;
protected short esc2_temperature = (short)0;
protected short esc2_ppm_recv = (short)0;
protected short esc2_v_out = (short)0;
protected short esc2_debug0 = (short)0;
protected short esc2_debug1 = (short)0;
protected short esc2_debug2 = (short)0;
protected short esc3_status = (short)0;
protected short esc3_current = (short)0;
protected short esc3_speed = (short)0;
protected short esc3_voltage = (short)0;
protected short esc3_temperature = (short)0;
protected short esc3_ppm_recv = (short)0;
protected short esc3_v_out = (short)0;
protected short esc3_debug0 = (short)0;
protected short esc3_debug1 = (short)0;
protected short esc3_debug2 = (short)0;
protected short esc4_status = (short)0;
protected short esc4_current = (short)0;
protected short esc4_speed = (short)0;
protected short esc4_voltage = (short)0;
protected short esc4_temperature = (short)0;
protected short esc4_ppm_recv = (short)0;
protected short esc4_v_out = (short)0;
protected short esc4_debug0 = (short)0;
protected short esc4_debug1 = (short)0;
protected short esc4_debug2 = (short)0;

      public escm_52721(ConvertDat convertDat) {
           super(convertDat, 52721, 76);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

esc1_status = record.getUnsignedByte(0);
 esc1_current = record.getShort(1);
 esc1_speed = record.getShort(3);
 esc1_voltage = record.getShort(5);
 esc1_temperature = record.getShort(7);
 esc1_ppm_recv = record.getShort(9);
 esc1_v_out = record.getShort(11);
 esc1_debug0 = record.getShort(13);
 esc1_debug1 = record.getShort(15);
 esc1_debug2 = record.getShort(17);
 
esc2_status = record.getUnsignedByte(19);
 esc2_current = record.getShort(20);
 esc2_speed = record.getShort(22);
 esc2_voltage = record.getShort(24);
 esc2_temperature = record.getShort(26);
 esc2_ppm_recv = record.getShort(28);
 esc2_v_out = record.getShort(30);
 esc2_debug0 = record.getShort(32);
 esc2_debug1 = record.getShort(34);
 esc2_debug2 = record.getShort(36);
esc3_status = record.getUnsignedByte(38);
 esc3_current = record.getShort(39);
 esc3_speed = record.getShort(41);
 esc3_voltage = record.getShort(43);
 esc3_temperature = record.getShort(45);
 esc3_ppm_recv = record.getShort(47);
 esc3_v_out = record.getShort(49);
 esc3_debug0 = record.getShort(51);
 esc3_debug1 = record.getShort(53);
 esc3_debug2 = record.getShort(55);
esc4_status = record.getUnsignedByte(57);
 esc4_current = record.getShort(58);
 esc4_speed = record.getShort(60);
 esc4_voltage = record.getShort(62);
 esc4_temperature = record.getShort(64);
 esc4_ppm_recv = record.getShort(66);
 esc4_v_out = record.getShort(68);
 esc4_debug0 = record.getShort(70);
 esc4_debug1 = record.getShort(72);
 esc4_debug2 = record.getShort(74);
} catch (Exception e) {RecordException(e);}}


    protected static Signal escmIntSig = Signal
.SeriesInt("escm", "", null, Units.noUnits);
    protected static Signal escmFloatSig = Signal
.SeriesFloat("escm", "", null, Units.noUnits);
    protected static Signal escmDoubleSig = Signal
.SeriesDouble("escm", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(esc1_status, escmIntSig, "esc1_status",lineT, valid);
 printCSVValue(esc1_current, escmIntSig, "esc1_current",lineT, valid);
 printCSVValue(esc1_speed, escmIntSig, "esc1_speed",lineT, valid);
 printCSVValue(esc1_voltage, escmIntSig, "esc1_voltage",lineT, valid);
 printCSVValue(esc1_temperature, escmIntSig, "esc1_temperature",lineT, valid);
 printCSVValue(esc1_ppm_recv, escmIntSig, "esc1_ppm_recv",lineT, valid);
 printCSVValue(esc1_v_out, escmIntSig, "esc1_v_out",lineT, valid);
 printCSVValue(esc1_debug0, escmIntSig, "esc1_debug0",lineT, valid);
 printCSVValue(esc1_debug1, escmIntSig, "esc1_debug1",lineT, valid);
 printCSVValue(esc1_debug2, escmIntSig, "esc1_debug2",lineT, valid);
 printCSVValue(esc2_status, escmIntSig, "esc2_status",lineT, valid);
 printCSVValue(esc2_current, escmIntSig, "esc2_current",lineT, valid);
 printCSVValue(esc2_speed, escmIntSig, "esc2_speed",lineT, valid);
 printCSVValue(esc2_voltage, escmIntSig, "esc2_voltage",lineT, valid);
 printCSVValue(esc2_temperature, escmIntSig, "esc2_temperature",lineT, valid);
 printCSVValue(esc2_ppm_recv, escmIntSig, "esc2_ppm_recv",lineT, valid);
 printCSVValue(esc2_v_out, escmIntSig, "esc2_v_out",lineT, valid);
 printCSVValue(esc2_debug0, escmIntSig, "esc2_debug0",lineT, valid);
 printCSVValue(esc2_debug1, escmIntSig, "esc2_debug1",lineT, valid);
 printCSVValue(esc2_debug2, escmIntSig, "esc2_debug2",lineT, valid);
 printCSVValue(esc3_status, escmIntSig, "esc3_status",lineT, valid);
 printCSVValue(esc3_current, escmIntSig, "esc3_current",lineT, valid);
 printCSVValue(esc3_speed, escmIntSig, "esc3_speed",lineT, valid);
 printCSVValue(esc3_voltage, escmIntSig, "esc3_voltage",lineT, valid);
 printCSVValue(esc3_temperature, escmIntSig, "esc3_temperature",lineT, valid);
 printCSVValue(esc3_ppm_recv, escmIntSig, "esc3_ppm_recv",lineT, valid);
 printCSVValue(esc3_v_out, escmIntSig, "esc3_v_out",lineT, valid);
 printCSVValue(esc3_debug0, escmIntSig, "esc3_debug0",lineT, valid);
 printCSVValue(esc3_debug1, escmIntSig, "esc3_debug1",lineT, valid);
 printCSVValue(esc3_debug2, escmIntSig, "esc3_debug2",lineT, valid);
 printCSVValue(esc4_status, escmIntSig, "esc4_status",lineT, valid);
 printCSVValue(esc4_current, escmIntSig, "esc4_current",lineT, valid);
 printCSVValue(esc4_speed, escmIntSig, "esc4_speed",lineT, valid);
 printCSVValue(esc4_voltage, escmIntSig, "esc4_voltage",lineT, valid);
 printCSVValue(esc4_temperature, escmIntSig, "esc4_temperature",lineT, valid);
 printCSVValue(esc4_ppm_recv, escmIntSig, "esc4_ppm_recv",lineT, valid);
 printCSVValue(esc4_v_out, escmIntSig, "esc4_v_out",lineT, valid);
 printCSVValue(esc4_debug0, escmIntSig, "esc4_debug0",lineT, valid);
 printCSVValue(esc4_debug1, escmIntSig, "esc4_debug1",lineT, valid);
 printCSVValue(esc4_debug2, escmIntSig, "esc4_debug2",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
