package DatConRecs.Created4V1;

import DatConRecs.Payload;
import DatConRecs.Created4V3.Motor;
import files.ConvertDat;

public class RecMotor76_52721 extends Motor {

    public static RecMotor76_52721 current = null;

    public double thrustTheta = 0;

    public RecMotor76_52721(ConvertDat convertDat) {
        super(convertDat, 52721, 76);
        current = this;
    }

    public void process(Payload record) {
        super.process(record);
        try {
            valid = true;

            rfStatus = payloadBB.get(0);
            rfCurrent = payloadBB.getShort(1) / 100.0f;
            rfSpeed = payloadBB.getShort(3);
            rfVolts = payloadBB.getShort(5) / 10.0f;
            rfTemp = payloadBB.getShort(7);
            rfPPM_recv = payloadBB.getShort(9);
            rfV_out = payloadBB.getShort(11) / 10.0f;

            lfStatus = payloadBB.get(19);
            lfCurrent = payloadBB.getShort(20) / 100.0f;
            lfSpeed = payloadBB.getShort(22);
            lfVolts = payloadBB.getShort(24) / 10.0f;
            lfTemp = payloadBB.getShort(26);
            lfPPM_recv = payloadBB.getShort(28);
            lfV_out = payloadBB.getShort(30) / 10.0f;

            lbStatus = payloadBB.get(38);
            lbCurrent = payloadBB.getShort(39) / 100.0f;
            lbSpeed = payloadBB.getShort(41);
            lbVolts = payloadBB.getShort(43) / 10.0f;
            lbTemp = payloadBB.getShort(45);
            lbPPM_recv = payloadBB.getShort(47);
            lbV_out = payloadBB.getShort(49) / 10.0f;

            rbStatus = payloadBB.get(57);
            rbCurrent = payloadBB.getShort(58) / 100.0f;
            rbSpeed = payloadBB.getShort(60);
            rbVolts = payloadBB.getShort(62) / 10.0f;
            rbTemp = payloadBB.getShort(64);
            rbPPM_recv = payloadBB.getShort(66);
            rbV_out = payloadBB.getShort(68) / 10.0f;
            thrustTheta = computeThrustTheta(lbSpeed, rfSpeed, rbSpeed, lfSpeed);
            recordPower();
        } catch (Exception e) {
            RecordException(e);
        }
    }
}
