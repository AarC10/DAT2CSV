package DatConRecs.Created4V1;

import DatConRecs.AirCraftCondition;
import DatConRecs.Payload;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;

public class AirCraftCondition39_70 extends AirCraftCondition {

    protected short craftFlightMode = (short) 0;


    protected float launchAccDuration = (float) 0;

    protected float launchDeltaV = (float) 0;

    protected short launchState = (short) 0;

    protected float thrustProjGnd = (float) 0;

    protected float thrustProjGndCompen = (float) 0;

    protected float thrustCompensator = (float) 0;

    protected float hoverThrust = (float) 0;

    protected float dynamicThrust = (float) 0;

    protected float cosSafeTilt = (float) 0;

    protected float safeTilt = (float) 0;

    public AirCraftCondition39_70(ConvertDat convertDat) {
        super(convertDat, 70, 39);
    }

    @Override
    public void process(Payload payload) {
        super.process(payload);
        try {
            valid = true;

            craftFlightMode = payload.getUnsignedByte(0);
            nearGndState = payload.getUnsignedByte(1);
            launchAccDuration = payload.getFloat(2);
            launchDeltaV = payload.getFloat(6);
            launchState = payload.getUnsignedByte(10);
            thrustProjGnd = payload.getFloat(11);
            thrustProjGndCompen = payload.getFloat(15);
            thrustCompensator = payload.getFloat(19);
            hoverThrust = payload.getFloat(23);
            dynamicThrust = payload.getFloat(27);
            cosSafeTilt = payload.getFloat(31);
            safeTilt = payload.getFloat(35);
            nearGrnd = (nearGndState != 0) ? "True" : "False";
        } catch (Exception e) {
            RecordException(e);
        }
    }

    @Override
    public void printCols(lineType lineT) {
        try {

            printCSVValue(craftFlightMode, aircraft_conditionIntSig, "craft_flight_mode", lineT, valid);
            printCSVValue(nearGrnd, nearGndSig, "", lineT, valid);
            printCSVValue(launchAccDuration, aircraft_conditionFloatSig, "launch_acc_duration", lineT, valid);
            printCSVValue(launchDeltaV, aircraft_conditionFloatSig, "launch_delta_v", lineT, valid);
            printCSVValue(launchState, aircraft_conditionIntSig, "launch_state", lineT, valid);
            printCSVValue(thrustProjGnd, aircraft_conditionFloatSig, "thrust_proj_gnd", lineT, valid);
            printCSVValue(thrustProjGndCompen, aircraft_conditionFloatSig, "thrust_proj_gnd_compen", lineT, valid);
            printCSVValue(thrustCompensator, aircraft_conditionFloatSig, "thrust_compensator", lineT, valid);
            printCSVValue(hoverThrust, aircraft_conditionFloatSig, "hover_thrust", lineT, valid);
            printCSVValue(dynamicThrust, aircraft_conditionFloatSig, "dynamic_thrust", lineT, valid);
            printCSVValue(cosSafeTilt, aircraft_conditionFloatSig, "cos_safe_tilt", lineT, valid);
            printCSVValue(safeTilt, aircraft_conditionFloatSig, "safe_tilt", lineT, valid);
        } catch (Exception e) {
            DatConLog.Exception(e);
        }
    }

}
