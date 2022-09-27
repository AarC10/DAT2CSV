package DatConRecs.Created4V3;

import DatConRecs.MotorControl;
import DatConRecs.Payload;
import files.ConvertDat;

public class MotorCtrl16_1307 extends MotorControl {

    public MotorCtrl16_1307(ConvertDat convertDat) {
        super(convertDat, 1307, 16);
    }

    @Override
    public void process(Payload record) {
        super.process(record);
        try {
            valid = true;
            pwm1 = ((float) record.getUnsignedShort(0)) / 100.0f;
            pwm2 = ((float) record.getUnsignedShort(2)) / 100.0f;
            pwm3 = ((float) record.getUnsignedShort(4)) / 100.0f;
            pwm4 = ((float) record.getUnsignedShort(6)) / 100.0f;
            pwm5 = ((float) record.getUnsignedShort(8)) / 100.0f;
            pwm6 = ((float) record.getUnsignedShort(10)) / 100.0f;
            pwm7 = ((float) record.getUnsignedShort(12)) / 100.0f;
            pwm8 = ((float) record.getUnsignedShort(14)) / 100.0f;
        } catch (Exception e) {
            RecordException(e);
        }
    }
}
