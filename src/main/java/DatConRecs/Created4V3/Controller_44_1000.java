package DatConRecs.Created4V3;

import DatConRecs.Payload;
import files.ConvertDat;

public class Controller_44_1000 extends RecController {

    protected long ctrl_tick = (long) 0;

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

    protected short is_soaring_up = (short) 0;

    protected short eagle_temp_level = (short) 0;

    public Controller_44_1000(ConvertDat convertDat) {
        super(convertDat, 1000, 44);
    }

    @Override
    public void process(Payload record) {
        super.process(record);
        try {
            valid = true;

            ctrl_tick = record.getUnsignedInt(0);
            ctrl_pitch = (short) (record.getFloat(4) * 10000);
            ctrl_roll = (short) (record.getFloat(8) * 10000);
            ctrl_yaw = (short) (record.getFloat(12) * 10000);
            ctrl_thr = (short) (record.getFloat(16) * 10000);
            ctrl_mode = record.getUnsignedByte(20);
            mode_switch = record.getUnsignedByte(21);
            motor_state = record.getUnsignedByte(22);
            sig_level = record.getUnsignedByte(23);
            ctrl_level = record.getUnsignedByte(24);
            sim_model = record.getUnsignedByte(25);
            max_height = record.getUnsignedShort(26);
            max_radius = record.getUnsignedShort(28);
            D2H_x = record.getFloat(30);
            D2H_y = record.getFloat(34);
            act_req_id = record.getUnsignedByte(38);
            act_act_id = record.getUnsignedByte(39);
            cmd_mod = record.getUnsignedByte(40);
            mod_req_id = record.getUnsignedByte(41);
            is_soaring_up = record.getUnsignedByte(42);
            eagle_temp_level = record.getUnsignedByte(43);
        } catch (Exception e) {
            RecordException(e);
        }
    }
}
