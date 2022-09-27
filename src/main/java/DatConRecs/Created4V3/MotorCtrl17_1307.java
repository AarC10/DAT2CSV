package DatConRecs.Created4V3;

import DatConRecs.MotorControl;
import DatConRecs.Payload;
import files.ConvertDat;

public class MotorCtrl17_1307 extends MotorControl {
  
    public MotorCtrl17_1307(ConvertDat convertDat) {
        super(convertDat, 1307, 17);
        status = true;
    }

    @Override
    public void process(Payload record) {
        super.process(record);
        try {
            valid = true;
            motor_status = record.getUnsignedByte(0);
            pwm1 = ((float) record.getUnsignedShort(1)) / 100.0f;
            pwm2 = ((float) record.getUnsignedShort(3)) / 100.0f;
            pwm3 = ((float) record.getUnsignedShort(5)) / 100.0f;
            pwm4 = ((float) record.getUnsignedShort(7)) / 100.0f;
            pwm5 = ((float) record.getUnsignedShort(9)) / 100.0f;
            pwm6 = ((float) record.getUnsignedShort(11)) / 100.0f;
            pwm7 = ((float) record.getUnsignedShort(13)) / 100.0f;
            pwm8 = ((float) record.getUnsignedShort(15)) / 100.0f;
        } catch (Exception e) {
            RecordException(e);
        }
    }

}
