package DatConRecs.Created4V3;

import DatConRecs.Payload;
import files.ConvertDat;

public class Controller_37_1000 extends RecController {
    public Controller_37_1000(ConvertDat convertDat) {
        super(convertDat, 1000, 37);
    }

    public void process(Payload record) {
        super.process(record);
        ctrl_pitch = (short) payloadBB.getShort(4);
        ctrl_roll = (short) payloadBB.getShort(6);
        ctrl_yaw = (short) payloadBB.getShort(8);
        ctrl_thr = (short) payloadBB.getShort(10);
        sig_level = record.getUnsignedByte(15);
        ctrl_level = record.getUnsignedByte(16);
        valid = true;
    }
}
