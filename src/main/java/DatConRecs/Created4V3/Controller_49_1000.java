package DatConRecs.Created4V3;

import DatConRecs.Payload;
import files.ConvertDat;

public class Controller_49_1000 extends RecController {

    protected short ctrl_mode = (short) 0;

    protected short mode_switch = (short) 0;

    protected short motor_state = (short) 0;

    protected short sim_model = (short) 0;

    protected int max_height = (int) 0;

    protected int max_radius = (int) 0;

    protected float D2H_x = (float) 0;

    protected float D2H_y = (float) 0;

    protected short act_req_id = (short) 0;

    protected short act_act_id = (short) 0;

    protected short cmd_mod = (short) 0;

    protected short mod_req_id = (short) 0;

    protected short fw_flag = (short) 0;

    protected short mot_sta = (short) 0;

    protected short OH_take = (short) 0;

    protected short OH_take_f = (short) 0;

    protected short rc_cnt = (short) 0;

    protected short sup_rc = (short) 0;

    protected short is_soaring_up = (short) 0;

    protected float soar_up_timer = (float) 0;

    protected float vert_vel_err = (float) 0;

    protected float vert_vel_err_fltr = (float) 0;

    public Controller_49_1000(ConvertDat convertDat) {
        super(convertDat, 1000, 49);
    }

    @Override
    public void process(Payload record) {
        super.process(record);
        try {
            valid = true;

            ctrl_pitch = record.getShort(0);
            ctrl_roll = record.getShort(2);
            ctrl_yaw = record.getShort(4);
            ctrl_thr = record.getShort(6);
            ctrl_mode = record.getUnsignedByte(8);
            mode_switch = record.getUnsignedByte(9);
            motor_state = record.getUnsignedByte(10);
            sig_level = record.getUnsignedByte(11);
            ctrl_level = record.getUnsignedByte(12);
            sim_model = record.getUnsignedByte(13);
            max_height = record.getUnsignedShort(14);
            max_radius = record.getUnsignedShort(16);
            D2H_x = record.getFloat(18);
            D2H_y = record.getFloat(22);
            act_req_id = record.getUnsignedByte(26);
            act_act_id = record.getUnsignedByte(27);
            cmd_mod = record.getUnsignedByte(28);
            mod_req_id = record.getUnsignedByte(29);
            fw_flag = record.getUnsignedByte(30);
            mot_sta = record.getUnsignedByte(31);
            OH_take = record.getUnsignedByte(32);
            OH_take_f = record.getUnsignedByte(33);
            rc_cnt = record.getUnsignedByte(34);
            sup_rc = record.getUnsignedByte(35);
            is_soaring_up = record.getUnsignedByte(36);
            soar_up_timer = record.getFloat(37);
            vert_vel_err = record.getFloat(41);
            vert_vel_err_fltr = record.getFloat(45);
        } catch (Exception e) {
            RecordException(e);
        }
    }
}
