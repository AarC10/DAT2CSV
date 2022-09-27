package DatConRecs.Created4V3;

import DatConRecs.Payload;
import files.ConvertDat;

public class Controller_47_1000 extends RecController {

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

    protected short OH_take = (short) 0;

    protected short OH_take_f = (short) 0;

    protected short rc_cnt = (short) 0;

    protected short sup_rc = (short) 0;

    protected short is_soaring_up = (short) 0;

    protected float soar_up_timer = (float) 0;

    protected float vert_vel_err = (float) 0;

    protected float vert_vel_err_fltr = (float) 0;

    public Controller_47_1000(ConvertDat convertDat) {
        super(convertDat, 1000, 47);
    }

    @Override
    public void process(Payload record) {
        super.process(record);
        try {
            valid = true;

            ctrl_tick = record.getUnsignedInt(0);
            ctrl_pitch = record.getShort(4);
            ctrl_yaw = record.getShort(6);
            ctrl_thr = record.getShort(8);
            ctrl_mode = record.getUnsignedByte(10);
            mode_switch = record.getUnsignedByte(11);
            motor_state = record.getUnsignedByte(12);
            sig_level = record.getUnsignedByte(13);
            ctrl_level = record.getUnsignedByte(14);
            sim_model = record.getUnsignedByte(15);
            max_height = record.getUnsignedShort(16);
            D2H_x = record.getFloat(18);
            D2H_y = record.getFloat(22);
            act_req_id = record.getUnsignedByte(26);
            act_act_id = record.getUnsignedByte(27);
            cmd_mod = record.getUnsignedByte(28);
            mod_req_id = record.getUnsignedByte(29);
            OH_take = record.getUnsignedByte(30);
            OH_take_f = record.getUnsignedByte(31);
            rc_cnt = record.getUnsignedByte(32);
            sup_rc = record.getUnsignedByte(33);
            is_soaring_up = record.getUnsignedByte(34);
            soar_up_timer = record.getFloat(35);
            vert_vel_err = record.getFloat(39);
            vert_vel_err_fltr = record.getFloat(43);
        } catch (Exception e) {
            RecordException(e);
        }
    }
}
