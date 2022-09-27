package DatConRecs.Created4V1;

import DatConRecs.MotorControl;
import DatConRecs.Payload;
import files.ConvertDat;

public class MotorCtrl35_54 extends MotorControl {
  
    public MotorCtrl35_54(ConvertDat convertDat) {
        super(convertDat, 54, 35);
    }

    @Override
    public void process(Payload payload) {
        super.process(payload);
        try {
            valid = true;
            pwm1 = payload.getUnsignedShort(19) / 100.0f;
            pwm2 = payload.getUnsignedShort(21) / 100.0f;
            pwm3 = payload.getUnsignedShort(23) / 100.0f;
            pwm4 = payload.getUnsignedShort(25) / 100.0f;
            pwm5 = payload.getUnsignedShort(27) / 100.0f;
            pwm6 = payload.getUnsignedShort(29) / 100.0f;
            pwm7 = payload.getUnsignedShort(31) / 100.0f;
            pwm8 = payload.getUnsignedShort(33) / 100.0f;
        } catch (Exception e) {
            RecordException(e);
        }
    }
    
}
