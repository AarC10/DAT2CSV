package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class IMU_TAIL_01_2081 extends Record {
protected boolean valid = false;

protected float wa_x_01 = (float)0;
protected float wa_y_01 = (float)0;
protected float wa_z_01 = (float)0;
protected float w_x_01 = (float)0;
protected float w_y_01 = (float)0;
protected float w_z_01 = (float)0;

      public IMU_TAIL_01_2081(ConvertDat convertDat) {
           super(convertDat, 2081, 24);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

 wa_x_01 = record.getFloat(0);
 wa_y_01 = record.getFloat(4);
 wa_z_01 = record.getFloat(8);
 w_x_01 = record.getFloat(12);
 w_y_01 = record.getFloat(16);
 w_z_01 = record.getFloat(20);
} catch (Exception e) {RecordException(e);}}


    protected static Signal IMU_TAIL_01IntSig = Signal
.SeriesInt("IMU_TAIL_01", "", null, Units.noUnits);
    protected static Signal IMU_TAIL_01FloatSig = Signal
.SeriesFloat("IMU_TAIL_01", "", null, Units.noUnits);
    protected static Signal IMU_TAIL_01DoubleSig = Signal
.SeriesDouble("IMU_TAIL_01", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(wa_x_01, IMU_TAIL_01FloatSig, "wa_x_01",lineT, valid);
 printCSVValue(wa_y_01, IMU_TAIL_01FloatSig, "wa_y_01",lineT, valid);
 printCSVValue(wa_z_01, IMU_TAIL_01FloatSig, "wa_z_01",lineT, valid);
 printCSVValue(w_x_01, IMU_TAIL_01FloatSig, "w_x_01",lineT, valid);
 printCSVValue(w_y_01, IMU_TAIL_01FloatSig, "w_y_01",lineT, valid);
 printCSVValue(w_z_01, IMU_TAIL_01FloatSig, "w_z_01",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
