package DatConRecs.Created4V3;

import DatConRecs.Payload;
import files.ConvertDat;

public class Controller_40_1000 extends RecController {

    protected long ctrl_tick = (long) 0;

    protected short COMMAND_AILERON = (short) 0;

    protected short COMMAND_ELEVATOR = (short) 0;

    protected short COMMAND_THROTTLE = (short) 0;

    protected short COMMAND_RUDDER = (short) 0;

    protected short COMMAND_MODE = (short) 0;

    protected short COMMAND_IOC = (short) 0;

    protected short COMMAND_GO_HOME = (short) 0;

    protected short COMMAND_D4 = (short) 0;

    protected short ctrl_mode_cur = (short) 0;

    protected short ctrl_real_mode = (short) 0;

    protected short ioc_control_command_mode = (short) 0;

    protected short cur_mode_switch = (short) 0;

    protected short motor_state_cur = (short) 0;

    protected int bat_ad_voltage = (int) 0;

    protected short real_ctl_out_per = (short) 0;

    protected short us_fail = (short) 0;

    protected short in_sim_model = (short) 0;

    public Controller_40_1000(ConvertDat convertDat) {
        super(convertDat, 1000, 40);
    }

    @Override
    public void process(Payload record) {
        super.process(record);
        try {
            valid = true;

            ctrl_tick = record.getUnsignedInt(0);
            COMMAND_AILERON = record.getShort(4);
            COMMAND_ELEVATOR = record.getShort(6);
            COMMAND_THROTTLE = record.getShort(8);
            COMMAND_RUDDER = record.getShort(10);
            COMMAND_MODE = record.getShort(12);
            COMMAND_IOC = record.getShort(14);
            COMMAND_GO_HOME = record.getShort(16);
            COMMAND_D4 = record.getShort(18);
            ctrl_pitch = record.getShort(20);
            ctrl_roll = record.getShort(22);
            ctrl_yaw = record.getShort(24);
            ctrl_thr = record.getShort(26);
            ctrl_mode_cur = record.getUnsignedByte(28);
            ctrl_real_mode = record.getUnsignedByte(29);
            ioc_control_command_mode = record.getUnsignedByte(30);
            cur_mode_switch = record.getUnsignedByte(31);
            motor_state_cur = record.getUnsignedByte(32);
            bat_ad_voltage = record.getUnsignedShort(33);
            real_ctl_out_per = record.getUnsignedByte(35);
            us_fail = record.getUnsignedByte(36);
            sig_level = record.getUnsignedByte(37);
            ctrl_level = record.getUnsignedByte(38);
            in_sim_model = record.getUnsignedByte(39);
        } catch (Exception e) {
            RecordException(e);
        }
    }
}
