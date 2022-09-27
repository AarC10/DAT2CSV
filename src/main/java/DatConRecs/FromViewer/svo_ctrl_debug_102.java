package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class svo_ctrl_debug_102 extends Record {
protected boolean valid = false;

protected short svo_avoid_debug0_limit_en = (short)0;
protected float svo_avoid_debug0_d_craft2edge = (float)0;
protected float svo_avoid_debug0_limit_direct_0 = (float)0;
protected float svo_avoid_debug0_limit_direct_1 = (float)0;
protected float svo_avoid_debug0_limit_norm = (float)0;
protected float svo_avoid_debug0_damping_scale = (float)0;
protected short svo_avoid_debug1_limit_en = (short)0;
protected float svo_avoid_debug1_d_craft2edge = (float)0;
protected float svo_avoid_debug1_limit_direct_0 = (float)0;
protected float svo_avoid_debug1_limit_direct_1 = (float)0;
protected float svo_avoid_debug1_limit_norm = (float)0;
protected float svo_avoid_debug1_damping_scale = (float)0;
protected short svo_avoid_debug2_limit_en = (short)0;
protected float svo_avoid_debug2_d_craft2edge = (float)0;
protected float svo_avoid_debug2_limit_direct_0 = (float)0;
protected float svo_avoid_debug2_limit_direct_1 = (float)0;
protected float svo_avoid_debug2_limit_norm = (float)0;
protected float svo_avoid_debug2_damping_scale = (float)0;
protected short svo_avoid_debug3_limit_en = (short)0;
protected float svo_avoid_debug3_d_craft2edge = (float)0;
protected float svo_avoid_debug3_limit_direct_0 = (float)0;
protected float svo_avoid_debug3_limit_direct_1 = (float)0;
protected float svo_avoid_debug3_limit_norm = (float)0;
protected float svo_avoid_debug3_damping_scale = (float)0;

      public svo_ctrl_debug_102(ConvertDat convertDat) {
           super(convertDat, 102, 84);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

svo_avoid_debug0_limit_en = record.getUnsignedByte(0);
 svo_avoid_debug0_d_craft2edge = record.getFloat(1);
 svo_avoid_debug0_limit_direct_0 = record.getFloat(5);
 svo_avoid_debug0_limit_direct_1 = record.getFloat(9);
 svo_avoid_debug0_limit_norm = record.getFloat(13);
 svo_avoid_debug0_damping_scale = record.getFloat(17);
svo_avoid_debug1_limit_en = record.getUnsignedByte(21);
 svo_avoid_debug1_d_craft2edge = record.getFloat(22);
 svo_avoid_debug1_limit_direct_0 = record.getFloat(26);
 svo_avoid_debug1_limit_direct_1 = record.getFloat(30);
 svo_avoid_debug1_limit_norm = record.getFloat(34);
 svo_avoid_debug1_damping_scale = record.getFloat(38);
svo_avoid_debug2_limit_en = record.getUnsignedByte(42);
 svo_avoid_debug2_d_craft2edge = record.getFloat(43);
 svo_avoid_debug2_limit_direct_0 = record.getFloat(47);
 svo_avoid_debug2_limit_direct_1 = record.getFloat(51);
 svo_avoid_debug2_limit_norm = record.getFloat(55);
 svo_avoid_debug2_damping_scale = record.getFloat(59);
svo_avoid_debug3_limit_en = record.getUnsignedByte(63);
 svo_avoid_debug3_d_craft2edge = record.getFloat(64);
 svo_avoid_debug3_limit_direct_0 = record.getFloat(68);
 svo_avoid_debug3_limit_direct_1 = record.getFloat(72);
 svo_avoid_debug3_limit_norm = record.getFloat(76);
 svo_avoid_debug3_damping_scale = record.getFloat(80);
} catch (Exception e) {RecordException(e);}}


    protected static Signal svo_ctrl_debugIntSig = Signal
.SeriesInt("svo_ctrl_debug", "", null, Units.noUnits);
    protected static Signal svo_ctrl_debugFloatSig = Signal
.SeriesFloat("svo_ctrl_debug", "", null, Units.noUnits);
    protected static Signal svo_ctrl_debugDoubleSig = Signal
.SeriesDouble("svo_ctrl_debug", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(svo_avoid_debug0_limit_en, svo_ctrl_debugIntSig, "svo_avoid_debug0_limit_en",lineT, valid);
 printCSVValue(svo_avoid_debug0_d_craft2edge, svo_ctrl_debugFloatSig, "svo_avoid_debug0_d_craft2edge",lineT, valid);
 printCSVValue(svo_avoid_debug0_limit_direct_0, svo_ctrl_debugFloatSig, "svo_avoid_debug0_limit_direct_0",lineT, valid);
 printCSVValue(svo_avoid_debug0_limit_direct_1, svo_ctrl_debugFloatSig, "svo_avoid_debug0_limit_direct_1",lineT, valid);
 printCSVValue(svo_avoid_debug0_limit_norm, svo_ctrl_debugFloatSig, "svo_avoid_debug0_limit_norm",lineT, valid);
 printCSVValue(svo_avoid_debug0_damping_scale, svo_ctrl_debugFloatSig, "svo_avoid_debug0_damping_scale",lineT, valid);
 printCSVValue(svo_avoid_debug1_limit_en, svo_ctrl_debugIntSig, "svo_avoid_debug1_limit_en",lineT, valid);
 printCSVValue(svo_avoid_debug1_d_craft2edge, svo_ctrl_debugFloatSig, "svo_avoid_debug1_d_craft2edge",lineT, valid);
 printCSVValue(svo_avoid_debug1_limit_direct_0, svo_ctrl_debugFloatSig, "svo_avoid_debug1_limit_direct_0",lineT, valid);
 printCSVValue(svo_avoid_debug1_limit_direct_1, svo_ctrl_debugFloatSig, "svo_avoid_debug1_limit_direct_1",lineT, valid);
 printCSVValue(svo_avoid_debug1_limit_norm, svo_ctrl_debugFloatSig, "svo_avoid_debug1_limit_norm",lineT, valid);
 printCSVValue(svo_avoid_debug1_damping_scale, svo_ctrl_debugFloatSig, "svo_avoid_debug1_damping_scale",lineT, valid);
 printCSVValue(svo_avoid_debug2_limit_en, svo_ctrl_debugIntSig, "svo_avoid_debug2_limit_en",lineT, valid);
 printCSVValue(svo_avoid_debug2_d_craft2edge, svo_ctrl_debugFloatSig, "svo_avoid_debug2_d_craft2edge",lineT, valid);
 printCSVValue(svo_avoid_debug2_limit_direct_0, svo_ctrl_debugFloatSig, "svo_avoid_debug2_limit_direct_0",lineT, valid);
 printCSVValue(svo_avoid_debug2_limit_direct_1, svo_ctrl_debugFloatSig, "svo_avoid_debug2_limit_direct_1",lineT, valid);
 printCSVValue(svo_avoid_debug2_limit_norm, svo_ctrl_debugFloatSig, "svo_avoid_debug2_limit_norm",lineT, valid);
 printCSVValue(svo_avoid_debug2_damping_scale, svo_ctrl_debugFloatSig, "svo_avoid_debug2_damping_scale",lineT, valid);
 printCSVValue(svo_avoid_debug3_limit_en, svo_ctrl_debugIntSig, "svo_avoid_debug3_limit_en",lineT, valid);
 printCSVValue(svo_avoid_debug3_d_craft2edge, svo_ctrl_debugFloatSig, "svo_avoid_debug3_d_craft2edge",lineT, valid);
 printCSVValue(svo_avoid_debug3_limit_direct_0, svo_ctrl_debugFloatSig, "svo_avoid_debug3_limit_direct_0",lineT, valid);
 printCSVValue(svo_avoid_debug3_limit_direct_1, svo_ctrl_debugFloatSig, "svo_avoid_debug3_limit_direct_1",lineT, valid);
 printCSVValue(svo_avoid_debug3_limit_norm, svo_ctrl_debugFloatSig, "svo_avoid_debug3_limit_norm",lineT, valid);
 printCSVValue(svo_avoid_debug3_damping_scale, svo_ctrl_debugFloatSig, "svo_avoid_debug3_damping_scale",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
