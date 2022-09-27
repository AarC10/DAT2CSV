package DatConRecs.FromViewer;

import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;

public class ctrl_atti_52 extends Record {
    protected boolean valid = false;

    protected short horiz_atti_tilt_tag_status = (short) 0;

    protected short horiz_atti_tilt_tag_cmd_id = (short) 0;

    protected short horiz_atti_tilt_tag_feedback_id = (short) 0;

    protected short horiz_atti_torsion_tag_status = (short) 0;

    protected short horiz_atti_torsion_tag_cmd_id = (short) 0;

    protected short horiz_atti_torsion_tag_feedback_id = (short) 0;

    protected float horiz_atti_tgt_acc_x = (float) 0;

    protected float horiz_atti_tgt_acc_y = (float) 0;

    protected float horiz_atti_tgt_tilt_x = (float) 0;

    protected float horiz_atti_tgt_tilt_y = (float) 0;

    protected float horiz_atti_tgt_body_tilt_x = (float) 0;

    protected float horiz_atti_tgt_body_tilt_y = (float) 0;

    protected float horiz_atti_tgt_ground_tilt_x = (float) 0;

    protected float horiz_atti_tgt_ground_tilt_y = (float) 0;

    protected float horiz_atti_tgt_tilt_before_limit_x = (float) 0;

    protected float horiz_atti_tgt_tilt_before_limit_y = (float) 0;

    protected float horiz_atti_tgt_tilt_after_limit_x = (float) 0;

    protected float horiz_atti_tgt_tilt_after_limit_y = (float) 0;

    protected float horiz_atti_tgt_quat_0 = (float) 0;

    protected float horiz_atti_tgt_quat_1 = (float) 0;

    protected float horiz_atti_tgt_quat_2 = (float) 0;

    protected float horiz_atti_tgt_quat_3 = (float) 0;

    protected float horiz_atti_tgt_torsion = (float) 0;

    protected float horiz_atti_tgt_torsion_rate = (float) 0;

    protected float horiz_atti_feedback_quat_0 = (float) 0;

    protected float horiz_atti_feedback_quat_1 = (float) 0;

    protected float horiz_atti_feedback_quat_2 = (float) 0;

    protected float horiz_atti_feedback_quat_3 = (float) 0;

    protected float horiz_atti_locked_torsion = (float) 0;

    protected float horiz_atti_err_tilt_x = (float) 0;

    protected float horiz_atti_err_tilt_y = (float) 0;

    protected float horiz_atti_err_torsion = (float) 0;

    protected float horiz_atti_output_x = (float) 0;

    protected float horiz_atti_output_y = (float) 0;

    protected float horiz_atti_output_z = (float) 0;

    protected short horiz_ang_vel_status = (short) 0;

    protected short horiz_ang_vel_cmd_id = (short) 0;

    protected short horiz_ang_vel_feedback_id = (short) 0;

    protected short horiz_ang_vel_cmd_x = (short) 0;

    protected short horiz_ang_vel_cmd_y = (short) 0;

    protected short horiz_ang_vel_cmd_z = (short) 0;

    protected short horiz_ang_vel_feedback_x = (short) 0;

    protected short horiz_ang_vel_feedback_y = (short) 0;

    protected short horiz_ang_vel_feedback_z = (short) 0;

    protected short horiz_ang_vel_feedback_P_x = (short) 0;

    protected short horiz_ang_vel_feedback_P_y = (short) 0;

    protected short horiz_ang_vel_feedback_P_z = (short) 0;

    protected short horiz_ang_vel_feedback_D_x = (short) 0;

    protected short horiz_ang_vel_feedback_D_y = (short) 0;

    protected short horiz_ang_vel_feedback_D_z = (short) 0;

    protected short horiz_ang_vel_output_x = (short) 0;

    protected short horiz_ang_vel_output_y = (short) 0;

    protected short horiz_ang_vel_output_z = (short) 0;

    protected short horiz_ang_acc_status = (short) 0;

    protected short horiz_ang_acc_cmd_id = (short) 0;

    protected short horiz_ang_acc_feedback_id = (short) 0;

    protected short horiz_ang_acc_cmd_x = (short) 0;

    protected short horiz_ang_acc_cmd_y = (short) 0;

    protected short horiz_ang_acc_cmd_z = (short) 0;

    protected short horiz_ang_acc_feedback_x = (short) 0;

    protected short horiz_ang_acc_feedback_y = (short) 0;

    protected short horiz_ang_acc_feedback_z = (short) 0;

    protected short horiz_ang_acc_P_ctrl_x = (short) 0;

    protected short horiz_ang_acc_P_ctrl_y = (short) 0;

    protected short horiz_ang_acc_P_ctrl_z = (short) 0;

    protected short horiz_ang_acc_I_ctrl_x = (short) 0;

    protected short horiz_ang_acc_I_ctrl_y = (short) 0;

    protected short horiz_ang_acc_I_ctrl_z = (short) 0;

    protected short horiz_ang_acc_feedforward_direct_x = (short) 0;

    protected short horiz_ang_acc_feedforward_direct_y = (short) 0;

    protected short horiz_ang_acc_feedforward_direct_z = (short) 0;

    protected short horiz_ang_acc_feedforward_compen_x = (short) 0;

    protected short horiz_ang_acc_feedforward_compen_y = (short) 0;

    protected short horiz_ang_acc_feedforward_compen_z = (short) 0;

    protected short horiz_ang_acc_output_x = (short) 0;

    protected short horiz_ang_acc_output_y = (short) 0;

    protected short horiz_ang_acc_output_z = (short) 0;

    public ctrl_atti_52(ConvertDat convertDat) {
        super(convertDat, 52, 200);
    }

    @Override
    public void process(Payload record) {
        super.process(record);
        try {
            valid = true;

            horiz_atti_tilt_tag_status = record.getUnsignedByte(0);
            horiz_atti_tilt_tag_cmd_id = record.getUnsignedByte(1);
            horiz_atti_tilt_tag_feedback_id = record.getUnsignedByte(2);
            horiz_atti_torsion_tag_status = record.getUnsignedByte(3);
            horiz_atti_torsion_tag_cmd_id = record.getUnsignedByte(4);
            horiz_atti_torsion_tag_feedback_id = record.getUnsignedByte(5);
            horiz_atti_tgt_acc_x = record.getFloat(6);
            horiz_atti_tgt_acc_y = record.getFloat(10);
            horiz_atti_tgt_tilt_x = record.getFloat(14);
            horiz_atti_tgt_tilt_y = record.getFloat(18);
            horiz_atti_tgt_body_tilt_x = record.getFloat(22);
            horiz_atti_tgt_body_tilt_y = record.getFloat(26);
            horiz_atti_tgt_ground_tilt_x = record.getFloat(30);
            horiz_atti_tgt_ground_tilt_y = record.getFloat(34);
            horiz_atti_tgt_tilt_before_limit_x = record.getFloat(38);
            horiz_atti_tgt_tilt_before_limit_y = record.getFloat(42);
            horiz_atti_tgt_tilt_after_limit_x = record.getFloat(46);
            horiz_atti_tgt_tilt_after_limit_y = record.getFloat(50);
            horiz_atti_tgt_quat_0 = record.getFloat(54);
            horiz_atti_tgt_quat_1 = record.getFloat(58);
            horiz_atti_tgt_quat_2 = record.getFloat(62);
            horiz_atti_tgt_quat_3 = record.getFloat(66);
            horiz_atti_tgt_torsion = record.getFloat(70);
            horiz_atti_tgt_torsion_rate = record.getFloat(74);
            horiz_atti_feedback_quat_0 = record.getFloat(78);
            horiz_atti_feedback_quat_1 = record.getFloat(82);
            horiz_atti_feedback_quat_2 = record.getFloat(86);
            horiz_atti_feedback_quat_3 = record.getFloat(90);
            horiz_atti_locked_torsion = record.getFloat(94);
            horiz_atti_err_tilt_x = record.getFloat(98);
            horiz_atti_err_tilt_y = record.getFloat(102);
            horiz_atti_err_torsion = record.getFloat(106);
            horiz_atti_output_x = record.getFloat(110);
            horiz_atti_output_y = record.getFloat(114);
            horiz_atti_output_z = record.getFloat(118);
            horiz_ang_vel_status = record.getUnsignedByte(122);
            horiz_ang_vel_cmd_id = record.getUnsignedByte(123);
            horiz_ang_vel_feedback_id = record.getUnsignedByte(124);
            horiz_ang_vel_cmd_x = record.getShort(125);
            horiz_ang_vel_cmd_y = record.getShort(127);
            horiz_ang_vel_cmd_z = record.getShort(129);
            horiz_ang_vel_feedback_x = record.getShort(131);
            horiz_ang_vel_feedback_y = record.getShort(133);
            horiz_ang_vel_feedback_z = record.getShort(135);
            horiz_ang_vel_feedback_P_x = record.getShort(137);
            horiz_ang_vel_feedback_P_y = record.getShort(139);
            horiz_ang_vel_feedback_P_z = record.getShort(141);
            horiz_ang_vel_feedback_D_x = record.getShort(143);
            horiz_ang_vel_feedback_D_y = record.getShort(145);
            horiz_ang_vel_feedback_D_z = record.getShort(147);
            horiz_ang_vel_output_x = record.getShort(149);
            horiz_ang_vel_output_y = record.getShort(151);
            horiz_ang_vel_output_z = record.getShort(153);
            horiz_ang_acc_status = record.getUnsignedByte(155);
            horiz_ang_acc_cmd_id = record.getUnsignedByte(156);
            horiz_ang_acc_feedback_id = record.getUnsignedByte(157);
            horiz_ang_acc_cmd_x = record.getShort(158);
            horiz_ang_acc_cmd_y = record.getShort(160);
            horiz_ang_acc_cmd_z = record.getShort(162);
            horiz_ang_acc_feedback_x = record.getShort(164);
            horiz_ang_acc_feedback_y = record.getShort(166);
            horiz_ang_acc_feedback_z = record.getShort(168);
            horiz_ang_acc_P_ctrl_x = record.getShort(170);
            horiz_ang_acc_P_ctrl_y = record.getShort(172);
            horiz_ang_acc_P_ctrl_z = record.getShort(174);
            horiz_ang_acc_I_ctrl_x = record.getShort(176);
            horiz_ang_acc_I_ctrl_y = record.getShort(178);
            horiz_ang_acc_I_ctrl_z = record.getShort(180);
            horiz_ang_acc_feedforward_direct_x = record.getShort(182);
            horiz_ang_acc_feedforward_direct_y = record.getShort(184);
            horiz_ang_acc_feedforward_direct_z = record.getShort(186);
            horiz_ang_acc_feedforward_compen_x = record.getShort(188);
            horiz_ang_acc_feedforward_compen_y = record.getShort(190);
            horiz_ang_acc_feedforward_compen_z = record.getShort(192);
            horiz_ang_acc_output_x = record.getShort(194);
            horiz_ang_acc_output_y = record.getShort(196);
            horiz_ang_acc_output_z = record.getShort(198);
        } catch (Exception e) {
            RecordException(e);
        }
    }

    protected static Signal ctrl_attiIntSig = Signal.SeriesInt("ctrl_atti", "",
            null, Units.noUnits);

    protected static Signal ctrl_attiFloatSig = Signal.SeriesFloat("ctrl_atti",
            "", null, Units.noUnits);

    protected static Signal ctrl_attiDoubleSig = Signal
            .SeriesDouble("ctrl_atti", "", null, Units.noUnits);

    public void printCols(lineType lineT) {
        try {

            printCSVValue(horiz_atti_tilt_tag_status, ctrl_attiIntSig,
                    "horiz_atti_tilt_tag_status", lineT, valid);
            printCSVValue(horiz_atti_tilt_tag_cmd_id, ctrl_attiIntSig,
                    "horiz_atti_tilt_tag_cmd_id", lineT, valid);
            printCSVValue(horiz_atti_tilt_tag_feedback_id, ctrl_attiIntSig,
                    "horiz_atti_tilt_tag_feedback_id", lineT, valid);
            printCSVValue(horiz_atti_torsion_tag_status, ctrl_attiIntSig,
                    "horiz_atti_torsion_tag_status", lineT, valid);
            printCSVValue(horiz_atti_torsion_tag_cmd_id, ctrl_attiIntSig,
                    "horiz_atti_torsion_tag_cmd_id", lineT, valid);
            printCSVValue(horiz_atti_torsion_tag_feedback_id, ctrl_attiIntSig,
                    "horiz_atti_torsion_tag_feedback_id", lineT, valid);
            printCSVValue(horiz_atti_tgt_acc_x, ctrl_attiFloatSig,
                    "horiz_atti_tgt_acc_x", lineT, valid);
            printCSVValue(horiz_atti_tgt_acc_y, ctrl_attiFloatSig,
                    "horiz_atti_tgt_acc_y", lineT, valid);
            printCSVValue(horiz_atti_tgt_tilt_x, ctrl_attiFloatSig,
                    "horiz_atti_tgt_tilt_x", lineT, valid);
            printCSVValue(horiz_atti_tgt_tilt_y, ctrl_attiFloatSig,
                    "horiz_atti_tgt_tilt_y", lineT, valid);
            printCSVValue(horiz_atti_tgt_body_tilt_x, ctrl_attiFloatSig,
                    "horiz_atti_tgt_body_tilt_x", lineT, valid);
            printCSVValue(horiz_atti_tgt_body_tilt_y, ctrl_attiFloatSig,
                    "horiz_atti_tgt_body_tilt_y", lineT, valid);
            printCSVValue(horiz_atti_tgt_ground_tilt_x, ctrl_attiFloatSig,
                    "horiz_atti_tgt_ground_tilt_x", lineT, valid);
            printCSVValue(horiz_atti_tgt_ground_tilt_y, ctrl_attiFloatSig,
                    "horiz_atti_tgt_ground_tilt_y", lineT, valid);
            printCSVValue(horiz_atti_tgt_tilt_before_limit_x, ctrl_attiFloatSig,
                    "horiz_atti_tgt_tilt_before_limit_x", lineT, valid);
            printCSVValue(horiz_atti_tgt_tilt_before_limit_y, ctrl_attiFloatSig,
                    "horiz_atti_tgt_tilt_before_limit_y", lineT, valid);
            printCSVValue(horiz_atti_tgt_tilt_after_limit_x, ctrl_attiFloatSig,
                    "horiz_atti_tgt_tilt_after_limit_x", lineT, valid);
            printCSVValue(horiz_atti_tgt_tilt_after_limit_y, ctrl_attiFloatSig,
                    "horiz_atti_tgt_tilt_after_limit_y", lineT, valid);
            printCSVValue(horiz_atti_tgt_quat_0, ctrl_attiFloatSig,
                    "horiz_atti_tgt_quat_0", lineT, valid);
            printCSVValue(horiz_atti_tgt_quat_1, ctrl_attiFloatSig,
                    "horiz_atti_tgt_quat_1", lineT, valid);
            printCSVValue(horiz_atti_tgt_quat_2, ctrl_attiFloatSig,
                    "horiz_atti_tgt_quat_2", lineT, valid);
            printCSVValue(horiz_atti_tgt_quat_3, ctrl_attiFloatSig,
                    "horiz_atti_tgt_quat_3", lineT, valid);
            printCSVValue(horiz_atti_tgt_torsion, ctrl_attiFloatSig,
                    "horiz_atti_tgt_torsion", lineT, valid);
            printCSVValue(horiz_atti_tgt_torsion_rate, ctrl_attiFloatSig,
                    "horiz_atti_tgt_torsion_rate", lineT, valid);
            printCSVValue(horiz_atti_feedback_quat_0, ctrl_attiFloatSig,
                    "horiz_atti_feedback_quat_0", lineT, valid);
            printCSVValue(horiz_atti_feedback_quat_1, ctrl_attiFloatSig,
                    "horiz_atti_feedback_quat_1", lineT, valid);
            printCSVValue(horiz_atti_feedback_quat_2, ctrl_attiFloatSig,
                    "horiz_atti_feedback_quat_2", lineT, valid);
            printCSVValue(horiz_atti_feedback_quat_3, ctrl_attiFloatSig,
                    "horiz_atti_feedback_quat_3", lineT, valid);
            printCSVValue(horiz_atti_locked_torsion, ctrl_attiFloatSig,
                    "horiz_atti_locked_torsion", lineT, valid);
            printCSVValue(horiz_atti_err_tilt_x, ctrl_attiFloatSig,
                    "horiz_atti_err_tilt_x", lineT, valid);
            printCSVValue(horiz_atti_err_tilt_y, ctrl_attiFloatSig,
                    "horiz_atti_err_tilt_y", lineT, valid);
            printCSVValue(horiz_atti_err_torsion, ctrl_attiFloatSig,
                    "horiz_atti_err_torsion", lineT, valid);
            printCSVValue(horiz_atti_output_x, ctrl_attiFloatSig,
                    "horiz_atti_output_x", lineT, valid);
            printCSVValue(horiz_atti_output_y, ctrl_attiFloatSig,
                    "horiz_atti_output_y", lineT, valid);
            printCSVValue(horiz_atti_output_z, ctrl_attiFloatSig,
                    "horiz_atti_output_z", lineT, valid);
            printCSVValue(horiz_ang_vel_status, ctrl_attiIntSig,
                    "horiz_ang_vel_status", lineT, valid);
            printCSVValue(horiz_ang_vel_cmd_id, ctrl_attiIntSig,
                    "horiz_ang_vel_cmd_id", lineT, valid);
            printCSVValue(horiz_ang_vel_feedback_id, ctrl_attiIntSig,
                    "horiz_ang_vel_feedback_id", lineT, valid);
            printCSVValue(horiz_ang_vel_cmd_x, ctrl_attiIntSig,
                    "horiz_ang_vel_cmd_x", lineT, valid);
            printCSVValue(horiz_ang_vel_cmd_y, ctrl_attiIntSig,
                    "horiz_ang_vel_cmd_y", lineT, valid);
            printCSVValue(horiz_ang_vel_cmd_z, ctrl_attiIntSig,
                    "horiz_ang_vel_cmd_z", lineT, valid);
            printCSVValue(horiz_ang_vel_feedback_x, ctrl_attiIntSig,
                    "horiz_ang_vel_feedback_x", lineT, valid);
            printCSVValue(horiz_ang_vel_feedback_y, ctrl_attiIntSig,
                    "horiz_ang_vel_feedback_y", lineT, valid);
            printCSVValue(horiz_ang_vel_feedback_z, ctrl_attiIntSig,
                    "horiz_ang_vel_feedback_z", lineT, valid);
            printCSVValue(horiz_ang_vel_feedback_P_x, ctrl_attiIntSig,
                    "horiz_ang_vel_feedback_P_x", lineT, valid);
            printCSVValue(horiz_ang_vel_feedback_P_y, ctrl_attiIntSig,
                    "horiz_ang_vel_feedback_P_y", lineT, valid);
            printCSVValue(horiz_ang_vel_feedback_P_z, ctrl_attiIntSig,
                    "horiz_ang_vel_feedback_P_z", lineT, valid);
            printCSVValue(horiz_ang_vel_feedback_D_x, ctrl_attiIntSig,
                    "horiz_ang_vel_feedback_D_x", lineT, valid);
            printCSVValue(horiz_ang_vel_feedback_D_y, ctrl_attiIntSig,
                    "horiz_ang_vel_feedback_D_y", lineT, valid);
            printCSVValue(horiz_ang_vel_feedback_D_z, ctrl_attiIntSig,
                    "horiz_ang_vel_feedback_D_z", lineT, valid);
            printCSVValue(horiz_ang_vel_output_x, ctrl_attiIntSig,
                    "horiz_ang_vel_output_x", lineT, valid);
            printCSVValue(horiz_ang_vel_output_y, ctrl_attiIntSig,
                    "horiz_ang_vel_output_y", lineT, valid);
            printCSVValue(horiz_ang_vel_output_z, ctrl_attiIntSig,
                    "horiz_ang_vel_output_z", lineT, valid);
            printCSVValue(horiz_ang_acc_status, ctrl_attiIntSig,
                    "horiz_ang_acc_status", lineT, valid);
            printCSVValue(horiz_ang_acc_cmd_id, ctrl_attiIntSig,
                    "horiz_ang_acc_cmd_id", lineT, valid);
            printCSVValue(horiz_ang_acc_feedback_id, ctrl_attiIntSig,
                    "horiz_ang_acc_feedback_id", lineT, valid);
            printCSVValue(horiz_ang_acc_cmd_x, ctrl_attiIntSig,
                    "horiz_ang_acc_cmd_x", lineT, valid);
            printCSVValue(horiz_ang_acc_cmd_y, ctrl_attiIntSig,
                    "horiz_ang_acc_cmd_y", lineT, valid);
            printCSVValue(horiz_ang_acc_cmd_z, ctrl_attiIntSig,
                    "horiz_ang_acc_cmd_z", lineT, valid);
            printCSVValue(horiz_ang_acc_feedback_x, ctrl_attiIntSig,
                    "horiz_ang_acc_feedback_x", lineT, valid);
            printCSVValue(horiz_ang_acc_feedback_y, ctrl_attiIntSig,
                    "horiz_ang_acc_feedback_y", lineT, valid);
            printCSVValue(horiz_ang_acc_feedback_z, ctrl_attiIntSig,
                    "horiz_ang_acc_feedback_z", lineT, valid);
            printCSVValue(horiz_ang_acc_P_ctrl_x, ctrl_attiIntSig,
                    "horiz_ang_acc_P_ctrl_x", lineT, valid);
            printCSVValue(horiz_ang_acc_P_ctrl_y, ctrl_attiIntSig,
                    "horiz_ang_acc_P_ctrl_y", lineT, valid);
            printCSVValue(horiz_ang_acc_P_ctrl_z, ctrl_attiIntSig,
                    "horiz_ang_acc_P_ctrl_z", lineT, valid);
            printCSVValue(horiz_ang_acc_I_ctrl_x, ctrl_attiIntSig,
                    "horiz_ang_acc_I_ctrl_x", lineT, valid);
            printCSVValue(horiz_ang_acc_I_ctrl_y, ctrl_attiIntSig,
                    "horiz_ang_acc_I_ctrl_y", lineT, valid);
            printCSVValue(horiz_ang_acc_I_ctrl_z, ctrl_attiIntSig,
                    "horiz_ang_acc_I_ctrl_z", lineT, valid);
            printCSVValue(horiz_ang_acc_feedforward_direct_x, ctrl_attiIntSig,
                    "horiz_ang_acc_feedforward_direct_x", lineT, valid);
            printCSVValue(horiz_ang_acc_feedforward_direct_y, ctrl_attiIntSig,
                    "horiz_ang_acc_feedforward_direct_y", lineT, valid);
            printCSVValue(horiz_ang_acc_feedforward_direct_z, ctrl_attiIntSig,
                    "horiz_ang_acc_feedforward_direct_z", lineT, valid);
            printCSVValue(horiz_ang_acc_feedforward_compen_x, ctrl_attiIntSig,
                    "horiz_ang_acc_feedforward_compen_x", lineT, valid);
            printCSVValue(horiz_ang_acc_feedforward_compen_y, ctrl_attiIntSig,
                    "horiz_ang_acc_feedforward_compen_y", lineT, valid);
            printCSVValue(horiz_ang_acc_feedforward_compen_z, ctrl_attiIntSig,
                    "horiz_ang_acc_feedforward_compen_z", lineT, valid);
            printCSVValue(horiz_ang_acc_output_x, ctrl_attiIntSig,
                    "horiz_ang_acc_output_x", lineT, valid);
            printCSVValue(horiz_ang_acc_output_y, ctrl_attiIntSig,
                    "horiz_ang_acc_output_y", lineT, valid);
            printCSVValue(horiz_ang_acc_output_z, ctrl_attiIntSig,
                    "horiz_ang_acc_output_z", lineT, valid);
        } catch (Exception e) {
            DatConLog.Exception(e);
        }
    }

}
