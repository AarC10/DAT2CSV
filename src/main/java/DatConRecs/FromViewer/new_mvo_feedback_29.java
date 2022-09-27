package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class new_mvo_feedback_29 extends Record {
protected boolean valid = false;

protected int visionObservationCount = (int)0;
protected short Vel_X = (short)0;
protected short Vel_Y = (short)0;
protected short Vel_Z = (short)0;
protected float Pos_X = (float)0;
protected float Pos_Y = (float)0;
protected float Pos_Z = (float)0;
protected float hoverPointUncertainty1 = (float)0;
protected float hoverPointUncertainty2 = (float)0;
protected float hoverPointUncertainty3 = (float)0;
protected float hoverPointUncertainty4 = (float)0;
protected float hoverPointUncertainty5 = (float)0;
protected float hoverPointUncertainty6 = (float)0;
protected float velocityUncertainty1 = (float)0;
protected float velocityUncertainty2 = (float)0;
protected float velocityUncertainty3 = (float)0;
protected float velocityUncertainty4 = (float)0;
protected float velocityUncertainty5 = (float)0;
protected float velocityUncertainty6 = (float)0;
protected float height = (float)0;
protected float heightUncertainty = (float)0;
protected short reserved1 = (short)0;
protected short reserved2 = (short)0;
protected short reserved3 = (short)0;
protected short reserved4 = (short)0;

      public new_mvo_feedback_29(ConvertDat convertDat) {
           super(convertDat, 29, 80);
       }

@Override
  public void process(Payload _payload) {
      super.process(_payload);
        try {
      valid = true;

 visionObservationCount = _payload.getUnsignedShort(0);
 Vel_X = _payload.getShort(2);
 Vel_Y = _payload.getShort(4);
 Vel_Z = _payload.getShort(6);
 Pos_X = _payload.getFloat(8);
 Pos_Y = _payload.getFloat(12);
 Pos_Z = _payload.getFloat(16);
 hoverPointUncertainty1 = _payload.getFloat(20);
 hoverPointUncertainty2 = _payload.getFloat(24);
 hoverPointUncertainty3 = _payload.getFloat(28);
 hoverPointUncertainty4 = _payload.getFloat(32);
 hoverPointUncertainty5 = _payload.getFloat(36);
 hoverPointUncertainty6 = _payload.getFloat(40);
 velocityUncertainty1 = _payload.getFloat(44);
 velocityUncertainty2 = _payload.getFloat(48);
 velocityUncertainty3 = _payload.getFloat(52);
 velocityUncertainty4 = _payload.getFloat(56);
 velocityUncertainty5 = _payload.getFloat(60);
 velocityUncertainty6 = _payload.getFloat(64);
 height = _payload.getFloat(68);
 heightUncertainty = _payload.getFloat(72);
reserved1 = _payload.getUnsignedByte(76);
reserved2 = _payload.getUnsignedByte(77);
reserved3 = _payload.getUnsignedByte(78);
reserved4 = _payload.getUnsignedByte(79);
} catch (Exception e) {RecordException(e);}}


    protected static Signal new_mvo_feedbackIntSig = Signal
.SeriesInt("new_mvo_feedback", "", null, Units.noUnits);
    protected static Signal new_mvo_feedbackFloatSig = Signal
.SeriesFloat("new_mvo_feedback", "", null, Units.noUnits);
    protected static Signal new_mvo_feedbackDoubleSig = Signal
.SeriesDouble("new_mvo_feedback", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(visionObservationCount, new_mvo_feedbackIntSig, "visionObservationCount",lineT, valid);
 printCSVValue(Vel_X, new_mvo_feedbackIntSig, "Vel_X",lineT, valid);
 printCSVValue(Vel_Y, new_mvo_feedbackIntSig, "Vel_Y",lineT, valid);
 printCSVValue(Vel_Z, new_mvo_feedbackIntSig, "Vel_Z",lineT, valid);
 printCSVValue(Pos_X, new_mvo_feedbackFloatSig, "Pos_X",lineT, valid);
 printCSVValue(Pos_Y, new_mvo_feedbackFloatSig, "Pos_Y",lineT, valid);
 printCSVValue(Pos_Z, new_mvo_feedbackFloatSig, "Pos_Z",lineT, valid);
 printCSVValue(hoverPointUncertainty1, new_mvo_feedbackFloatSig, "hoverPointUncertainty1",lineT, valid);
 printCSVValue(hoverPointUncertainty2, new_mvo_feedbackFloatSig, "hoverPointUncertainty2",lineT, valid);
 printCSVValue(hoverPointUncertainty3, new_mvo_feedbackFloatSig, "hoverPointUncertainty3",lineT, valid);
 printCSVValue(hoverPointUncertainty4, new_mvo_feedbackFloatSig, "hoverPointUncertainty4",lineT, valid);
 printCSVValue(hoverPointUncertainty5, new_mvo_feedbackFloatSig, "hoverPointUncertainty5",lineT, valid);
 printCSVValue(hoverPointUncertainty6, new_mvo_feedbackFloatSig, "hoverPointUncertainty6",lineT, valid);
 printCSVValue(velocityUncertainty1, new_mvo_feedbackFloatSig, "velocityUncertainty1",lineT, valid);
 printCSVValue(velocityUncertainty2, new_mvo_feedbackFloatSig, "velocityUncertainty2",lineT, valid);
 printCSVValue(velocityUncertainty3, new_mvo_feedbackFloatSig, "velocityUncertainty3",lineT, valid);
 printCSVValue(velocityUncertainty4, new_mvo_feedbackFloatSig, "velocityUncertainty4",lineT, valid);
 printCSVValue(velocityUncertainty5, new_mvo_feedbackFloatSig, "velocityUncertainty5",lineT, valid);
 printCSVValue(velocityUncertainty6, new_mvo_feedbackFloatSig, "velocityUncertainty6",lineT, valid);
 printCSVValue(height, new_mvo_feedbackFloatSig, "height",lineT, valid);
 printCSVValue(heightUncertainty, new_mvo_feedbackFloatSig, "heightUncertainty",lineT, valid);
 printCSVValue(reserved1, new_mvo_feedbackIntSig, "reserved1",lineT, valid);
 printCSVValue(reserved2, new_mvo_feedbackIntSig, "reserved2",lineT, valid);
 printCSVValue(reserved3, new_mvo_feedbackIntSig, "reserved3",lineT, valid);
 printCSVValue(reserved4, new_mvo_feedbackIntSig, "reserved4",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
