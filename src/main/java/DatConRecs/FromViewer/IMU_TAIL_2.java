package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class IMU_TAIL_2 extends Record {
protected boolean valid = false;

protected short raw_w_x = (short)0;
protected short raw_w_y = (short)0;
protected short raw_w_z = (short)0;
protected short raw_a_x = (short)0;
protected short raw_a_y = (short)0;
protected short raw_a_z = (short)0;
protected short raw_wa_x = (short)0;
protected short raw_wa_y = (short)0;
protected short raw_wa_z = (short)0;
protected short iir_w_x = (short)0;
protected short iir_w_y = (short)0;
protected short iir_w_z = (short)0;
protected short iir_a_x = (short)0;
protected short iir_a_y = (short)0;
protected short iir_a_z = (short)0;
protected short iir_wa_x = (short)0;
protected short iir_wa_y = (short)0;
protected short iir_wa_z = (short)0;
protected long gyro_hf_cnt = (long)0;

      public IMU_TAIL_2(ConvertDat convertDat) {
           super(convertDat, 2, 40);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

 raw_w_x = record.getShort(0);
 raw_w_y = record.getShort(2);
 raw_w_z = record.getShort(4);
 raw_a_x = record.getShort(6);
 raw_a_y = record.getShort(8);
 raw_a_z = record.getShort(10);
 raw_wa_x = record.getShort(12);
 raw_wa_y = record.getShort(14);
 raw_wa_z = record.getShort(16);
 iir_w_x = record.getShort(18);
 iir_w_y = record.getShort(20);
 iir_w_z = record.getShort(22);
 iir_a_x = record.getShort(24);
 iir_a_y = record.getShort(26);
 iir_a_z = record.getShort(28);
 iir_wa_x = record.getShort(30);
 iir_wa_y = record.getShort(32);
 iir_wa_z = record.getShort(34);
 gyro_hf_cnt = record.getUnsignedInt(36);
} catch (Exception e) {RecordException(e);}}


    protected static Signal IMU_TAILIntSig = Signal
.SeriesInt("IMU_TAIL", "", null, Units.noUnits);
    protected static Signal IMU_TAILFloatSig = Signal
.SeriesFloat("IMU_TAIL", "", null, Units.noUnits);
    protected static Signal IMU_TAILDoubleSig = Signal
.SeriesDouble("IMU_TAIL", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(raw_w_x, IMU_TAILIntSig, "raw_w_x",lineT, valid);
 printCSVValue(raw_w_y, IMU_TAILIntSig, "raw_w_y",lineT, valid);
 printCSVValue(raw_w_z, IMU_TAILIntSig, "raw_w_z",lineT, valid);
 printCSVValue(raw_a_x, IMU_TAILIntSig, "raw_a_x",lineT, valid);
 printCSVValue(raw_a_y, IMU_TAILIntSig, "raw_a_y",lineT, valid);
 printCSVValue(raw_a_z, IMU_TAILIntSig, "raw_a_z",lineT, valid);
 printCSVValue(raw_wa_x, IMU_TAILIntSig, "raw_wa_x",lineT, valid);
 printCSVValue(raw_wa_y, IMU_TAILIntSig, "raw_wa_y",lineT, valid);
 printCSVValue(raw_wa_z, IMU_TAILIntSig, "raw_wa_z",lineT, valid);
 printCSVValue(iir_w_x, IMU_TAILIntSig, "iir_w_x",lineT, valid);
 printCSVValue(iir_w_y, IMU_TAILIntSig, "iir_w_y",lineT, valid);
 printCSVValue(iir_w_z, IMU_TAILIntSig, "iir_w_z",lineT, valid);
 printCSVValue(iir_a_x, IMU_TAILIntSig, "iir_a_x",lineT, valid);
 printCSVValue(iir_a_y, IMU_TAILIntSig, "iir_a_y",lineT, valid);
 printCSVValue(iir_a_z, IMU_TAILIntSig, "iir_a_z",lineT, valid);
 printCSVValue(iir_wa_x, IMU_TAILIntSig, "iir_wa_x",lineT, valid);
 printCSVValue(iir_wa_y, IMU_TAILIntSig, "iir_wa_y",lineT, valid);
 printCSVValue(iir_wa_z, IMU_TAILIntSig, "iir_wa_z",lineT, valid);
 printCSVValue(gyro_hf_cnt, IMU_TAILIntSig, "gyro_hf_cnt",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
