package DatConRecs;

import files.AxesAndSigs;
import files.ConvertDat;
import files.DatConLog;
import files.Signal;
import files.Units;
import files.ConvertDat.lineType;

public class MotorControl extends Record {

    protected float pwm1 = (float) 0;

    protected float pwm2 = (float) 0;

    protected float pwm3 = (float) 0;

    protected float pwm4 = (float) 0;

    protected float pwm5 = (float) 0;

    protected float pwm6 = (float) 0;

    protected float pwm7 = (float) 0;

    protected float pwm8 = (float) 0;

    protected boolean valid = false;

    protected short motor_status = (short) 0;

    protected boolean status = false;

    public MotorControl(ConvertDat convertDat, int id, int length) {
        super(convertDat, id, length);
    }

    public void process(Payload record) {
        super.process(record);
    }

    public static Signal motorCtrlStatusSig = Signal.SeriesFloat(
            "MotorCtrl:Status", "Motor Ctrl Status", null, Units.noUnits);

    public void printCols(lineType lineT) {
        try {
            if (status) {
                printCSVValue(motor_status, motorCtrlStatusSig, "", lineT,
                        valid);
            }
            if (convertDat.getNumMotors() == 6) {
                printCSVValue(pwm1, AxesAndSigs.motorCtrlPWMSig, "RFront",
                        lineT, valid);
                printCSVValue(pwm2, AxesAndSigs.motorCtrlPWMSig, "LFront",
                        lineT, valid);
                printCSVValue(pwm3, AxesAndSigs.motorCtrlPWMSig, "LSide", lineT,
                        valid);
                printCSVValue(pwm4, AxesAndSigs.motorCtrlPWMSig, "LBack", lineT,
                        valid);
                printCSVValue(pwm5, AxesAndSigs.motorCtrlPWMSig, "RBack", lineT,
                        valid);
                printCSVValue(pwm6, AxesAndSigs.motorCtrlPWMSig, "RSide", lineT,
                        valid);
            } else {
                printCSVValue(pwm1, AxesAndSigs.motorCtrlPWMSig, "RFront",
                        lineT, valid);
                printCSVValue(pwm2, AxesAndSigs.motorCtrlPWMSig, "LFront",
                        lineT, valid);
                printCSVValue(pwm3, AxesAndSigs.motorCtrlPWMSig, "LBack", lineT,
                        valid);
                printCSVValue(pwm4, AxesAndSigs.motorCtrlPWMSig, "RBack", lineT,
                        valid);
            }
        } catch (Exception e) {
            DatConLog.Exception(e);
        }
    }

}
