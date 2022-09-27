package DatConRecs.Created4V3;

import DatConRecs.AirCraftCondition;
import DatConRecs.Payload;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;

public class AirCraftCondition54_1001 extends AirCraftCondition {

    protected short launch_state = (short) 0;

    protected double launch_acc_dur = 0;

    protected double launch_delta_v = 0;

    protected double thrust = 0;

    protected double gyro = 0;

    protected double gyro_acc = 0;

    protected double land_dur = 0;

    protected double thrust_proj_gnd = 0;

    protected double thrust_proj_gnd_compen = 0;

    protected double thrust_compensator = 0;

    protected double hover_thrust = 0;

    protected double cos_safe_tilt = 0;

    protected double safe_tilt = 0;

    public AirCraftCondition54_1001(ConvertDat convertDat) {
        super(convertDat, 1001, 54);
    }

    @Override
    public void process(Payload record) {
        super.process(record);
        try {
            valid = true;

            intFlightState = record.getUnsignedByte(0);
            flightState = record.getUnsignedByte(1);
            lastFlightState = record.getUnsignedByte(2);
            nearGndState = record.getUnsignedByte(3);
            launch_state = record.getUnsignedByte(4);
            launch_acc_dur = record.getFloat(5);
            launch_delta_v = record.getFloat(9);
            landState = record.getUnsignedByte(13);
            thrust = record.getFloat(14);
            gyro = record.getFloat(18);
            gyro_acc = record.getFloat(22);
            land_dur = record.getFloat(26);
            thrust_proj_gnd = record.getFloat(30);
            thrust_proj_gnd_compen = record.getFloat(34);
            thrust_compensator = record.getFloat(38);
            hover_thrust = record.getFloat(42);
            cos_safe_tilt = record.getFloat(46);
            safe_tilt = record.getFloat(50);
            nearGrnd = (nearGndState != 0) ? "True" : "False";
        } catch (Exception e) {
            RecordException(e);
        }
    }

    public void printCols(lineType lineT) {
        try {
            super.printCols(lineT);
            printCSVValue(launch_state, aircraft_conditionIntSig, "launch_state", lineT, valid);
            printCSVValue(launch_acc_dur, aircraft_conditionFloatSig, "launch_acc_dur", lineT, valid);
            printCSVValue(launch_delta_v, aircraft_conditionFloatSig, "launch_delta_v", lineT, valid);
            printCSVValue(thrust, aircraft_conditionFloatSig, "thrust", lineT, valid);
            printCSVValue(gyro, aircraft_conditionFloatSig, "gyro", lineT, valid);
            printCSVValue(gyro_acc, aircraft_conditionFloatSig, "gyro_acc", lineT, valid);
            printCSVValue(land_dur, aircraft_conditionFloatSig, "land_dur", lineT, valid);
            printCSVValue(thrust_proj_gnd, aircraft_conditionFloatSig, "thrust_proj_gnd", lineT, valid);
            printCSVValue(thrust_proj_gnd_compen, aircraft_conditionFloatSig, "thrust_proj_gnd_compen", lineT, valid);
            printCSVValue(thrust_compensator, aircraft_conditionFloatSig, "thrust_compensator", lineT, valid);
            printCSVValue(hover_thrust, aircraft_conditionFloatSig, "hover_thrust", lineT, valid);
            printCSVValue(cos_safe_tilt, aircraft_conditionFloatSig, "cos_safe_tilt", lineT, valid);
            printCSVValue(safe_tilt, aircraft_conditionFloatSig, "safe_tilt", lineT, valid);
        } catch (Exception e) {
            DatConLog.Exception(e);
        }
    }

}
