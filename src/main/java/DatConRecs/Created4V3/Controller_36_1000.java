package DatConRecs.Created4V3;

import DatConRecs.Payload;
import files.ConvertDat;

public class Controller_36_1000 extends RecController {

    protected long ctrl_tick = (long) 0;

    protected short ctrl_mode_cur = (short) 0;

    protected short cur_mode_switch = (short) 0;

    protected short motor_state_cur = (short) 0;

    protected short motor_average_speed = (short) 0;

    protected short in_sim_model = (short) 0;

    protected int real_max_height = (int) 0;

    protected int real_max_radius = (int) 0;

    protected float distance_to_home_x = (float) 0;

    protected float distance_to_home_y = (float) 0;

    protected short action_reqest_id = (short) 0;

    protected short action_action_id = (short) 0;

    protected short cur_cmd_mode = (short) 0;

    protected short cur_cmd_mode_req_id = (short) 0;

    public Controller_36_1000(ConvertDat convertDat) {
        super(convertDat, 1000, 36);
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
            ctrl_mode_cur = record.getUnsignedByte(12);
            cur_mode_switch = record.getUnsignedByte(13);
            motor_state_cur = record.getUnsignedByte(14);
            motor_average_speed = record.getShort(15);
            sig_level = record.getUnsignedByte(17);
            ctrl_level = record.getUnsignedByte(18);
            in_sim_model = record.getUnsignedByte(19);
            real_max_height = record.getUnsignedShort(20);
            real_max_radius = record.getUnsignedShort(22);
            distance_to_home_x = record.getFloat(24);
            distance_to_home_y = record.getFloat(28);
            action_reqest_id = record.getUnsignedByte(32);
            action_action_id = record.getUnsignedByte(33);
            cur_cmd_mode = record.getUnsignedByte(34);
            cur_cmd_mode_req_id = record.getUnsignedByte(35);
        } catch (Exception e) {
            RecordException(e);
        }
    }
}
