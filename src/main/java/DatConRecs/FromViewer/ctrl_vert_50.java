package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class ctrl_vert_50 extends Record {
protected boolean valid = false;

protected short vert_module_module_mode = (short)0;
protected short vert_module_vert_hover_state = (short)0;
protected short vert_module_vert_hover_enable = (short)0;
protected float vert_module_vert_hover_pos = (float)0;
protected float vert_module_vert_hover_brake_timer = (float)0;
protected float vert_module_take_off_thrust = (float)0;
protected short vert_module_auto_take_off_state = (short)0;
protected float vert_module_auto_take_off_height = (float)0;
protected short api_vert_ctrl_mode = (short)0;
protected short api_vert_ctrl_cmd_id = (short)0;
protected short vert_pos_status = (short)0;
protected short vert_pos_cmd_id = (short)0;
protected short vert_pos_feedback_id = (short)0;
protected short vert_pos_cmd = (short)0;
protected short vert_pos_feedback = (short)0;
protected short vert_pos_P_ctrl = (short)0;
protected short vert_pos_output = (short)0;
protected short vert_vel_status = (short)0;
protected short vert_vel_cmd_id = (short)0;
protected short vert_vel_feedback_id = (short)0;
protected short vert_vel_cmd = (short)0;
protected short vert_vel_cmd_before_limit = (short)0;
protected short vert_vel_cmd_after_limit = (short)0;
protected short vert_vel_feedback = (short)0;
protected short vert_vel_P_ctrl = (short)0;
protected short vert_vel_output = (short)0;
protected short vert_acc_status = (short)0;
protected short vert_acc_cmd_id = (short)0;
protected short vert_acc_feedback_id = (short)0;
protected short vert_acc_cmd = (short)0;
protected short vert_acc_feedback = (short)0;
protected short vert_acc_P_ctrl = (short)0;
protected short vert_acc_I_ctrl = (short)0;
protected short vert_acc_feedforward = (short)0;
protected short vert_acc_output = (short)0;
protected short vert_thrust_status = (short)0;
protected short vert_thrust_cmd_id = (short)0;
protected short vert_thrust_feedback_id = (short)0;
protected short vert_thrust_cmd_data = (short)0;

      public ctrl_vert_50(ConvertDat convertDat) {
           super(convertDat, 50, 68);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

vert_module_module_mode = record.getUnsignedByte(0);
vert_module_vert_hover_state = record.getUnsignedByte(1);
vert_module_vert_hover_enable = record.getUnsignedByte(2);
 vert_module_vert_hover_pos = record.getFloat(3);
 vert_module_vert_hover_brake_timer = record.getFloat(7);
 vert_module_take_off_thrust = record.getFloat(11);
vert_module_auto_take_off_state = record.getUnsignedByte(15);
 vert_module_auto_take_off_height = record.getFloat(16);
api_vert_ctrl_mode = record.getUnsignedByte(20);
api_vert_ctrl_cmd_id = record.getUnsignedByte(21);
vert_pos_status = record.getUnsignedByte(22);
vert_pos_cmd_id = record.getUnsignedByte(23);
vert_pos_feedback_id = record.getUnsignedByte(24);
 vert_pos_cmd = record.getShort(25);
 vert_pos_feedback = record.getShort(27);
 vert_pos_P_ctrl = record.getShort(29);
 vert_pos_output = record.getShort(31);
vert_vel_status = record.getUnsignedByte(33);
vert_vel_cmd_id = record.getUnsignedByte(34);
vert_vel_feedback_id = record.getUnsignedByte(35);
 vert_vel_cmd = record.getShort(36);
 vert_vel_cmd_before_limit = record.getShort(38);
 vert_vel_cmd_after_limit = record.getShort(40);
 vert_vel_feedback = record.getShort(42);
 vert_vel_P_ctrl = record.getShort(44);
 vert_vel_output = record.getShort(46);
vert_acc_status = record.getUnsignedByte(48);
vert_acc_cmd_id = record.getUnsignedByte(49);
vert_acc_feedback_id = record.getUnsignedByte(50);
 vert_acc_cmd = record.getShort(51);
 vert_acc_feedback = record.getShort(53);
 vert_acc_P_ctrl = record.getShort(55);
 vert_acc_I_ctrl = record.getShort(57);
 vert_acc_feedforward = record.getShort(59);
 vert_acc_output = record.getShort(61);
vert_thrust_status = record.getUnsignedByte(63);
vert_thrust_cmd_id = record.getUnsignedByte(64);
vert_thrust_feedback_id = record.getUnsignedByte(65);
 vert_thrust_cmd_data = record.getShort(66);
} catch (Exception e) {RecordException(e);}}


    protected static Signal ctrl_vertIntSig = Signal
.SeriesInt("ctrl_vert", "", null, Units.noUnits);
    protected static Signal ctrl_vertFloatSig = Signal
.SeriesFloat("ctrl_vert", "", null, Units.noUnits);
    protected static Signal ctrl_vertDoubleSig = Signal
.SeriesDouble("ctrl_vert", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(vert_module_module_mode, ctrl_vertIntSig, "vert_module_module_mode",lineT, valid);
 printCSVValue(vert_module_vert_hover_state, ctrl_vertIntSig, "vert_module_vert_hover_state",lineT, valid);
 printCSVValue(vert_module_vert_hover_enable, ctrl_vertIntSig, "vert_module_vert_hover_enable",lineT, valid);
 printCSVValue(vert_module_vert_hover_pos, ctrl_vertFloatSig, "vert_module_vert_hover_pos",lineT, valid);
 printCSVValue(vert_module_vert_hover_brake_timer, ctrl_vertFloatSig, "vert_module_vert_hover_brake_timer",lineT, valid);
 printCSVValue(vert_module_take_off_thrust, ctrl_vertFloatSig, "vert_module_take_off_thrust",lineT, valid);
 printCSVValue(vert_module_auto_take_off_state, ctrl_vertIntSig, "vert_module_auto_take_off_state",lineT, valid);
 printCSVValue(vert_module_auto_take_off_height, ctrl_vertFloatSig, "vert_module_auto_take_off_height",lineT, valid);
 printCSVValue(api_vert_ctrl_mode, ctrl_vertIntSig, "api_vert_ctrl_mode",lineT, valid);
 printCSVValue(api_vert_ctrl_cmd_id, ctrl_vertIntSig, "api_vert_ctrl_cmd_id",lineT, valid);
 printCSVValue(vert_pos_status, ctrl_vertIntSig, "vert_pos_status",lineT, valid);
 printCSVValue(vert_pos_cmd_id, ctrl_vertIntSig, "vert_pos_cmd_id",lineT, valid);
 printCSVValue(vert_pos_feedback_id, ctrl_vertIntSig, "vert_pos_feedback_id",lineT, valid);
 printCSVValue(vert_pos_cmd, ctrl_vertIntSig, "vert_pos_cmd",lineT, valid);
 printCSVValue(vert_pos_feedback, ctrl_vertIntSig, "vert_pos_feedback",lineT, valid);
 printCSVValue(vert_pos_P_ctrl, ctrl_vertIntSig, "vert_pos_P_ctrl",lineT, valid);
 printCSVValue(vert_pos_output, ctrl_vertIntSig, "vert_pos_output",lineT, valid);
 printCSVValue(vert_vel_status, ctrl_vertIntSig, "vert_vel_status",lineT, valid);
 printCSVValue(vert_vel_cmd_id, ctrl_vertIntSig, "vert_vel_cmd_id",lineT, valid);
 printCSVValue(vert_vel_feedback_id, ctrl_vertIntSig, "vert_vel_feedback_id",lineT, valid);
 printCSVValue(vert_vel_cmd, ctrl_vertIntSig, "vert_vel_cmd",lineT, valid);
 printCSVValue(vert_vel_cmd_before_limit, ctrl_vertIntSig, "vert_vel_cmd_before_limit",lineT, valid);
 printCSVValue(vert_vel_cmd_after_limit, ctrl_vertIntSig, "vert_vel_cmd_after_limit",lineT, valid);
 printCSVValue(vert_vel_feedback, ctrl_vertIntSig, "vert_vel_feedback",lineT, valid);
 printCSVValue(vert_vel_P_ctrl, ctrl_vertIntSig, "vert_vel_P_ctrl",lineT, valid);
 printCSVValue(vert_vel_output, ctrl_vertIntSig, "vert_vel_output",lineT, valid);
 printCSVValue(vert_acc_status, ctrl_vertIntSig, "vert_acc_status",lineT, valid);
 printCSVValue(vert_acc_cmd_id, ctrl_vertIntSig, "vert_acc_cmd_id",lineT, valid);
 printCSVValue(vert_acc_feedback_id, ctrl_vertIntSig, "vert_acc_feedback_id",lineT, valid);
 printCSVValue(vert_acc_cmd, ctrl_vertIntSig, "vert_acc_cmd",lineT, valid);
 printCSVValue(vert_acc_feedback, ctrl_vertIntSig, "vert_acc_feedback",lineT, valid);
 printCSVValue(vert_acc_P_ctrl, ctrl_vertIntSig, "vert_acc_P_ctrl",lineT, valid);
 printCSVValue(vert_acc_I_ctrl, ctrl_vertIntSig, "vert_acc_I_ctrl",lineT, valid);
 printCSVValue(vert_acc_feedforward, ctrl_vertIntSig, "vert_acc_feedforward",lineT, valid);
 printCSVValue(vert_acc_output, ctrl_vertIntSig, "vert_acc_output",lineT, valid);
 printCSVValue(vert_thrust_status, ctrl_vertIntSig, "vert_thrust_status",lineT, valid);
 printCSVValue(vert_thrust_cmd_id, ctrl_vertIntSig, "vert_thrust_cmd_id",lineT, valid);
 printCSVValue(vert_thrust_feedback_id, ctrl_vertIntSig, "vert_thrust_feedback_id",lineT, valid);
 printCSVValue(vert_thrust_cmd_data, ctrl_vertIntSig, "vert_thrust_cmd_data",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
