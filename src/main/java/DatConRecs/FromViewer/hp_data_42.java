package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class hp_data_42 extends Record {
protected boolean valid = false;

protected float tgt_hp_alti = (float)0;
protected float tgt_ang_rate = (float)0;
protected float tgt_radius = (float)0;
protected float distance_to_hp = (float)0;
protected float cosine_angle = (float)0;
protected float angle_rate = (float)0;
protected float radius = (float)0;
protected float pos_error_x = (float)0;
protected float pos_error_y = (float)0;
protected float pos_error_z = (float)0;
protected float vel_error_x = (float)0;
protected float vel_error_y = (float)0;
protected float vel_error_z = (float)0;
protected float head_error = (float)0;

      public hp_data_42(ConvertDat convertDat) {
           super(convertDat, 42, 56);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

 tgt_hp_alti = record.getFloat(0);
 tgt_ang_rate = record.getFloat(4);
 tgt_radius = record.getFloat(8);
 distance_to_hp = record.getFloat(12);
 cosine_angle = record.getFloat(16);
 angle_rate = record.getFloat(20);
 radius = record.getFloat(24);
 pos_error_x = record.getFloat(28);
 pos_error_y = record.getFloat(32);
 pos_error_z = record.getFloat(36);
 vel_error_x = record.getFloat(40);
 vel_error_y = record.getFloat(44);
 vel_error_z = record.getFloat(48);
 head_error = record.getFloat(52);
} catch (Exception e) {RecordException(e);}}


    protected static Signal hp_dataIntSig = Signal
.SeriesInt("hp_data", "", null, Units.noUnits);
    protected static Signal hp_dataFloatSig = Signal
.SeriesFloat("hp_data", "", null, Units.noUnits);
    protected static Signal hp_dataDoubleSig = Signal
.SeriesDouble("hp_data", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(tgt_hp_alti, hp_dataFloatSig, "tgt_hp_alti",lineT, valid);
 printCSVValue(tgt_ang_rate, hp_dataFloatSig, "tgt_ang_rate",lineT, valid);
 printCSVValue(tgt_radius, hp_dataFloatSig, "tgt_radius",lineT, valid);
 printCSVValue(distance_to_hp, hp_dataFloatSig, "distance_to_hp",lineT, valid);
 printCSVValue(cosine_angle, hp_dataFloatSig, "cosine_angle",lineT, valid);
 printCSVValue(angle_rate, hp_dataFloatSig, "angle_rate",lineT, valid);
 printCSVValue(radius, hp_dataFloatSig, "radius",lineT, valid);
 printCSVValue(pos_error_x, hp_dataFloatSig, "pos_error_x",lineT, valid);
 printCSVValue(pos_error_y, hp_dataFloatSig, "pos_error_y",lineT, valid);
 printCSVValue(pos_error_z, hp_dataFloatSig, "pos_error_z",lineT, valid);
 printCSVValue(vel_error_x, hp_dataFloatSig, "vel_error_x",lineT, valid);
 printCSVValue(vel_error_y, hp_dataFloatSig, "vel_error_y",lineT, valid);
 printCSVValue(vel_error_z, hp_dataFloatSig, "vel_error_z",lineT, valid);
 printCSVValue(head_error, hp_dataFloatSig, "head_error",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
