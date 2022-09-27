package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class aircraft_model_80 extends Record {
protected boolean valid = false;

protected float m1_current = (float)0;
protected float m1_w = (float)0;
protected float m1_lift = (float)0;
protected float m1_torque = (float)0;
protected float m2_current = (float)0;
protected float m2_w = (float)0;
protected float m2_lift = (float)0;
protected float m2_torque = (float)0;
protected float m3_current = (float)0;
protected float m3_w = (float)0;
protected float m3_lift = (float)0;
protected float m3_torque = (float)0;
protected float m4_current = (float)0;
protected float m4_w = (float)0;
protected float m4_lift = (float)0;
protected float m4_torque = (float)0;
protected float m5_current = (float)0;
protected float m5_w = (float)0;
protected float m5_lift = (float)0;
protected float m5_torque = (float)0;
protected float m6_current = (float)0;
protected float m6_w = (float)0;
protected float m6_lift = (float)0;
protected float m6_torque = (float)0;
protected float m7_current = (float)0;
protected float m7_w = (float)0;
protected float m7_lift = (float)0;
protected float m7_torque = (float)0;
protected float m8_current = (float)0;
protected float m8_w = (float)0;
protected float m8_lift = (float)0;
protected float m8_torque = (float)0;

      public aircraft_model_80(ConvertDat convertDat) {
           super(convertDat, 80, 128);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

 m1_current = record.getFloat(0);
 m1_w = record.getFloat(4);
 m1_lift = record.getFloat(8);
 m1_torque = record.getFloat(12);
 m2_current = record.getFloat(16);
 m2_w = record.getFloat(20);
 m2_lift = record.getFloat(24);
 m2_torque = record.getFloat(28);
 m3_current = record.getFloat(32);
 m3_w = record.getFloat(36);
 m3_lift = record.getFloat(40);
 m3_torque = record.getFloat(44);
 m4_current = record.getFloat(48);
 m4_w = record.getFloat(52);
 m4_lift = record.getFloat(56);
 m4_torque = record.getFloat(60);
 m5_current = record.getFloat(64);
 m5_w = record.getFloat(68);
 m5_lift = record.getFloat(72);
 m5_torque = record.getFloat(76);
 m6_current = record.getFloat(80);
 m6_w = record.getFloat(84);
 m6_lift = record.getFloat(88);
 m6_torque = record.getFloat(92);
 m7_current = record.getFloat(96);
 m7_w = record.getFloat(100);
 m7_lift = record.getFloat(104);
 m7_torque = record.getFloat(108);
 m8_current = record.getFloat(112);
 m8_w = record.getFloat(116);
 m8_lift = record.getFloat(120);
 m8_torque = record.getFloat(124);
} catch (Exception e) {RecordException(e);}}


    protected static Signal aircraft_modelIntSig = Signal
.SeriesInt("aircraft_model", "", null, Units.noUnits);
    protected static Signal aircraft_modelFloatSig = Signal
.SeriesFloat("aircraft_model", "", null, Units.noUnits);
    protected static Signal aircraft_modelDoubleSig = Signal
.SeriesDouble("aircraft_model", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(m1_current, aircraft_modelFloatSig, "m1_current",lineT, valid);
 printCSVValue(m1_w, aircraft_modelFloatSig, "m1_w",lineT, valid);
 printCSVValue(m1_lift, aircraft_modelFloatSig, "m1_lift",lineT, valid);
 printCSVValue(m1_torque, aircraft_modelFloatSig, "m1_torque",lineT, valid);
 printCSVValue(m2_current, aircraft_modelFloatSig, "m2_current",lineT, valid);
 printCSVValue(m2_w, aircraft_modelFloatSig, "m2_w",lineT, valid);
 printCSVValue(m2_lift, aircraft_modelFloatSig, "m2_lift",lineT, valid);
 printCSVValue(m2_torque, aircraft_modelFloatSig, "m2_torque",lineT, valid);
 printCSVValue(m3_current, aircraft_modelFloatSig, "m3_current",lineT, valid);
 printCSVValue(m3_w, aircraft_modelFloatSig, "m3_w",lineT, valid);
 printCSVValue(m3_lift, aircraft_modelFloatSig, "m3_lift",lineT, valid);
 printCSVValue(m3_torque, aircraft_modelFloatSig, "m3_torque",lineT, valid);
 printCSVValue(m4_current, aircraft_modelFloatSig, "m4_current",lineT, valid);
 printCSVValue(m4_w, aircraft_modelFloatSig, "m4_w",lineT, valid);
 printCSVValue(m4_lift, aircraft_modelFloatSig, "m4_lift",lineT, valid);
 printCSVValue(m4_torque, aircraft_modelFloatSig, "m4_torque",lineT, valid);
 printCSVValue(m5_current, aircraft_modelFloatSig, "m5_current",lineT, valid);
 printCSVValue(m5_w, aircraft_modelFloatSig, "m5_w",lineT, valid);
 printCSVValue(m5_lift, aircraft_modelFloatSig, "m5_lift",lineT, valid);
 printCSVValue(m5_torque, aircraft_modelFloatSig, "m5_torque",lineT, valid);
 printCSVValue(m6_current, aircraft_modelFloatSig, "m6_current",lineT, valid);
 printCSVValue(m6_w, aircraft_modelFloatSig, "m6_w",lineT, valid);
 printCSVValue(m6_lift, aircraft_modelFloatSig, "m6_lift",lineT, valid);
 printCSVValue(m6_torque, aircraft_modelFloatSig, "m6_torque",lineT, valid);
 printCSVValue(m7_current, aircraft_modelFloatSig, "m7_current",lineT, valid);
 printCSVValue(m7_w, aircraft_modelFloatSig, "m7_w",lineT, valid);
 printCSVValue(m7_lift, aircraft_modelFloatSig, "m7_lift",lineT, valid);
 printCSVValue(m7_torque, aircraft_modelFloatSig, "m7_torque",lineT, valid);
 printCSVValue(m8_current, aircraft_modelFloatSig, "m8_current",lineT, valid);
 printCSVValue(m8_w, aircraft_modelFloatSig, "m8_w",lineT, valid);
 printCSVValue(m8_lift, aircraft_modelFloatSig, "m8_lift",lineT, valid);
 printCSVValue(m8_torque, aircraft_modelFloatSig, "m8_torque",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
