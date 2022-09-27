package DatConRecs.Created4V1;

import DatConRecs.MotorControl;
import DatConRecs.Payload;
import files.ConvertDat;

public class MotorCtrl35_54 extends MotorControl {
  
    public MotorCtrl35_54(ConvertDat convertDat) {
        super(convertDat, 54, 35);
    }

    @Override
    public void process(Payload record) {
        super.process(record);
        try {
            valid = true;
            pwm1 = record.getUnsignedShort(19) / 100.0f;
            pwm2 = record.getUnsignedShort(21) / 100.0f;
            pwm3 = record.getUnsignedShort(23) / 100.0f;
            pwm4 = record.getUnsignedShort(25) / 100.0f;
            pwm5 = record.getUnsignedShort(27) / 100.0f;
            pwm6 = record.getUnsignedShort(29) / 100.0f;
            pwm7 = record.getUnsignedShort(31) / 100.0f;
            pwm8 = record.getUnsignedShort(33) / 100.0f;
        } catch (Exception e) {
            RecordException(e);
        }
    }
    
}
