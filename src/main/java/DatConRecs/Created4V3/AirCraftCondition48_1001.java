package DatConRecs.Created4V3;

import DatConRecs.AirCraftCondition;
import DatConRecs.Payload;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;

public class AirCraftCondition48_1001 extends AirCraftCondition {

    protected short launchState = (short) 0;

    protected double launchAccDur = 0;

    protected double launchDeltaV = 0;

    protected double launchFreeFallDur = 0;

    protected double launchFreeFallDeltaV = 0;

    protected short thrust = 0;

    protected short gyro = 0;

    protected double landDurPress = 0;

    protected double landDurSonic = 0;

    protected short thrustBody = (short) 0;

    protected short thrustGnd = (short) 0;

    protected short thrustGndCompen = (short) 0;

    protected short safeTiltRaw = (short) 0;

    protected short safeTilt = (short) 0;

    protected double satTimer = 0;

    public AirCraftCondition48_1001(ConvertDat convertDat) {
        super(convertDat, 1001, 48);
    }

    @Override
    public void process(Payload _payload) {
        super.process(_payload);
        try {
            valid = true;
            intFlightState = _payload.getUnsignedByte(0);
            flightState = _payload.getUnsignedByte(1);
            lastFlightState = _payload.getUnsignedByte(2);
            nearGndState = _payload.getUnsignedByte(3);
            launchState = _payload.getUnsignedByte(4);
            launchAccDur = _payload.getFloat(5);
            launchDeltaV = _payload.getFloat(9);
            launchFreeFallDur = _payload.getFloat(13);
            launchFreeFallDeltaV = _payload.getFloat(17);
            landState = _payload.getUnsignedByte(21);
            thrust = _payload.getShort(22);
            gyro = _payload.getShort(24);
            landDurPress = _payload.getFloat(26);
            landDurSonic = _payload.getFloat(30);
            thrustBody = _payload.getShort(34);
            thrustGnd = _payload.getShort(36);
            thrustGndCompen = _payload.getShort(38);
            safeTiltRaw = _payload.getShort(40);
            safeTilt = _payload.getShort(42);
            satTimer = _payload.getFloat(44);
            nearGrnd = (nearGndState != 0) ? "True" : "False";
        } catch (Exception e) {
            RecordException(e);
        }
    }

    public void printCols(lineType lineT) {
        try {
            super.printCols(lineT);
            printCSVValue(launchState, aircraft_conditionIntSig, "launch_state", lineT, valid);
            printCSVValue(launchAccDur, aircraft_conditionFloatSig, "launch_acc_dur", lineT, valid);
            printCSVValue(launchDeltaV, aircraft_conditionFloatSig, "launch_delta_v", lineT, valid);
            printCSVValue(launchFreeFallDur, aircraft_conditionFloatSig, "launch_free_fall_dur", lineT, valid);
            printCSVValue(launchFreeFallDeltaV, aircraft_conditionFloatSig, "launch_free_fall_delta_v", lineT, valid);
            printCSVValue(thrust, aircraft_conditionIntSig, "thrust", lineT, valid);
            printCSVValue(gyro, aircraft_conditionIntSig, "gyro", lineT, valid);
            printCSVValue(landDurPress, aircraft_conditionFloatSig, "land_dur_press", lineT, valid);
            printCSVValue(landDurSonic, aircraft_conditionFloatSig, "land_dur_sonic", lineT, valid);
            printCSVValue(thrustBody, aircraft_conditionIntSig, "thrust_body", lineT, valid);
            printCSVValue(thrustGnd, aircraft_conditionIntSig, "thrust_gnd", lineT, valid);
            printCSVValue(thrustGndCompen, aircraft_conditionIntSig, "thrust_gnd_compen", lineT, valid);
            printCSVValue(safeTiltRaw, aircraft_conditionIntSig, "safe_tilt_raw", lineT, valid);
            printCSVValue(safeTilt, aircraft_conditionIntSig, "safe_tilt", lineT, valid);
            printCSVValue(satTimer, aircraft_conditionFloatSig, "sat_timer", lineT, valid);
        } catch (Exception e) {
            DatConLog.Exception(e);
        }
    }

}
