package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class ctrl_motor_54 extends Record {
protected boolean valid = false;

protected short horiz_motor_status = (short)0;
protected short horiz_motor_cmd_id = (short)0;
protected short horiz_motor_feedback_id = (short)0;
protected int thrust_1 = (int)0;
protected int thrust_2 = (int)0;
protected int thrust_3 = (int)0;
protected int thrust_4 = (int)0;
protected int thrust_5 = (int)0;
protected int thrust_6 = (int)0;
protected int thrust_7 = (int)0;
protected int thrust_8 = (int)0;
protected int pwm_1 = (int)0;
protected int pwm_2 = (int)0;
protected int pwm_3 = (int)0;
protected int pwm_4 = (int)0;
protected int pwm_5 = (int)0;
protected int pwm_6 = (int)0;
protected int pwm_7 = (int)0;
protected int pwm_8 = (int)0;

      public ctrl_motor_54(ConvertDat convertDat) {
           super(convertDat, 54, 35);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

horiz_motor_status = record.getUnsignedByte(0);
horiz_motor_cmd_id = record.getUnsignedByte(1);
horiz_motor_feedback_id = record.getUnsignedByte(2);
 thrust_1 = record.getUnsignedShort(3);
 thrust_2 = record.getUnsignedShort(5);
 thrust_3 = record.getUnsignedShort(7);
 thrust_4 = record.getUnsignedShort(9);
 thrust_5 = record.getUnsignedShort(11);
 thrust_6 = record.getUnsignedShort(13);
 thrust_7 = record.getUnsignedShort(15);
 thrust_8 = record.getUnsignedShort(17);
 pwm_1 = record.getUnsignedShort(19);
 pwm_2 = record.getUnsignedShort(21);
 pwm_3 = record.getUnsignedShort(23);
 pwm_4 = record.getUnsignedShort(25);
 pwm_5 = record.getUnsignedShort(27);
 pwm_6 = record.getUnsignedShort(29);
 pwm_7 = record.getUnsignedShort(31);
 pwm_8 = record.getUnsignedShort(33);
} catch (Exception e) {RecordException(e);}}


    protected static Signal ctrl_motorIntSig = Signal
.SeriesInt("ctrl_motor", "", null, Units.noUnits);
    protected static Signal ctrl_motorFloatSig = Signal
.SeriesFloat("ctrl_motor", "", null, Units.noUnits);
    protected static Signal ctrl_motorDoubleSig = Signal
.SeriesDouble("ctrl_motor", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(horiz_motor_status, ctrl_motorIntSig, "horiz_motor_status",lineT, valid);
 printCSVValue(horiz_motor_cmd_id, ctrl_motorIntSig, "horiz_motor_cmd_id",lineT, valid);
 printCSVValue(horiz_motor_feedback_id, ctrl_motorIntSig, "horiz_motor_feedback_id",lineT, valid);
 printCSVValue(thrust_1, ctrl_motorIntSig, "thrust_1",lineT, valid);
 printCSVValue(thrust_2, ctrl_motorIntSig, "thrust_2",lineT, valid);
 printCSVValue(thrust_3, ctrl_motorIntSig, "thrust_3",lineT, valid);
 printCSVValue(thrust_4, ctrl_motorIntSig, "thrust_4",lineT, valid);
 printCSVValue(thrust_5, ctrl_motorIntSig, "thrust_5",lineT, valid);
 printCSVValue(thrust_6, ctrl_motorIntSig, "thrust_6",lineT, valid);
 printCSVValue(thrust_7, ctrl_motorIntSig, "thrust_7",lineT, valid);
 printCSVValue(thrust_8, ctrl_motorIntSig, "thrust_8",lineT, valid);
 printCSVValue(pwm_1, ctrl_motorIntSig, "pwm_1",lineT, valid);
 printCSVValue(pwm_2, ctrl_motorIntSig, "pwm_2",lineT, valid);
 printCSVValue(pwm_3, ctrl_motorIntSig, "pwm_3",lineT, valid);
 printCSVValue(pwm_4, ctrl_motorIntSig, "pwm_4",lineT, valid);
 printCSVValue(pwm_5, ctrl_motorIntSig, "pwm_5",lineT, valid);
 printCSVValue(pwm_6, ctrl_motorIntSig, "pwm_6",lineT, valid);
 printCSVValue(pwm_7, ctrl_motorIntSig, "pwm_7",lineT, valid);
 printCSVValue(pwm_8, ctrl_motorIntSig, "pwm_8",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
