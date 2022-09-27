package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class IMU_TAIL_02_2082 extends Record {
protected boolean valid = false;

protected float wa_x_02 = (float)0;
protected float wa_y_02 = (float)0;
protected float wa_z_02 = (float)0;
protected float w_x_02 = (float)0;
protected float w_y_02 = (float)0;
protected float w_z_02 = (float)0;

      public IMU_TAIL_02_2082(ConvertDat convertDat) {
           super(convertDat, 2082, 24);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

 wa_x_02 = record.getFloat(0);
 wa_y_02 = record.getFloat(4);
 wa_z_02 = record.getFloat(8);
 w_x_02 = record.getFloat(12);
 w_y_02 = record.getFloat(16);
 w_z_02 = record.getFloat(20);
} catch (Exception e) {RecordException(e);}}


    protected static Signal IMU_TAIL_02IntSig = Signal
.SeriesInt("IMU_TAIL_02", "", null, Units.noUnits);
    protected static Signal IMU_TAIL_02FloatSig = Signal
.SeriesFloat("IMU_TAIL_02", "", null, Units.noUnits);
    protected static Signal IMU_TAIL_02DoubleSig = Signal
.SeriesDouble("IMU_TAIL_02", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(wa_x_02, IMU_TAIL_02FloatSig, "wa_x_02",lineT, valid);
 printCSVValue(wa_y_02, IMU_TAIL_02FloatSig, "wa_y_02",lineT, valid);
 printCSVValue(wa_z_02, IMU_TAIL_02FloatSig, "wa_z_02",lineT, valid);
 printCSVValue(w_x_02, IMU_TAIL_02FloatSig, "w_x_02",lineT, valid);
 printCSVValue(w_y_02, IMU_TAIL_02FloatSig, "w_y_02",lineT, valid);
 printCSVValue(w_z_02, IMU_TAIL_02FloatSig, "w_z_02",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
