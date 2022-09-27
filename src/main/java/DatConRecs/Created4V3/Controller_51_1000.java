package DatConRecs.Created4V3;

import DatConRecs.Payload;
import files.ConvertDat;

public class Controller_51_1000 extends RecController {
    protected long ctrl_tick = (long) 0;

    protected short ctrl_mode = (short) 0;

    protected short mode_switch = (short) 0;

    protected short motor_state = (short) 0;

    protected short sim_model = (short) 0;

    protected int max_height = (int) 0;

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

    public Controller_51_1000(ConvertDat convertDat) {
        super(convertDat, 1000, 51);
    }

    @Override
    public void process(Payload record) {
        super.process(record);
        try {
            valid = true;

            ctrl_tick = record.getUnsignedInt(0);
            ctrl_pitch = record.getShort(4);
            ctrl_roll = record.getShort(6);
            ctrl_yaw = record.getShort(8);
            ctrl_thr = record.getShort(10);
            ctrl_mode = record.getUnsignedByte(12);
            mode_switch = record.getUnsignedByte(13);
            motor_state = record.getUnsignedByte(14);
            sig_level = record.getUnsignedByte(15);
            ctrl_level = record.getUnsignedByte(16);
            sim_model = record.getUnsignedByte(17);
            max_height = record.getUnsignedShort(18);
            D2H_x = record.getFloat(20);
            D2H_y = record.getFloat(24);
            act_req_id = record.getUnsignedByte(28);
            act_act_id = record.getUnsignedByte(29);
            cmd_mod = record.getUnsignedByte(30);
            mod_req_id = record.getUnsignedByte(31);
            fw_flag = record.getUnsignedByte(32);
            mot_sta = record.getUnsignedByte(33);
            OH_take = record.getUnsignedByte(34);
            OH_take_f = record.getUnsignedByte(35);
            rc_cnt = record.getUnsignedByte(36);
            sup_rc = record.getUnsignedByte(37);
            is_soaring_up = record.getUnsignedByte(38);
            soar_up_timer = record.getFloat(39);
            vert_vel_err = record.getFloat(43);
            vert_vel_err_fltr = record.getFloat(47);
        } catch (Exception e) {
            RecordException(e);
        }
    }

}
