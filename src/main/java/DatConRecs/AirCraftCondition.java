package DatConRecs;

import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;

public class AirCraftCondition extends Record {
    protected boolean valid = false;

    protected short intFlightState = (short) 0;

    protected short flightState = (short) 0;

    protected short lastFlightState = (short) 0;

    protected short nearGndState = (short) 0;

    protected short UP_state = (short) 0;

    protected short landState = (short) 0;

    protected short safe_fltr = (short) 0;

    protected String nearGrnd = "False";

    public AirCraftCondition(ConvertDat convertDat, int id, int length) {
        super(convertDat, id, length);
    }

    protected static Signal nearGndSig = Signal.State("AirCraftCondition:nearGround", "Near Ground", "False");

    private static Signal fsmStateSig = Signal.State("AirCraftCondition:fsmState", "FSM State", "0");

    private static Signal landStateSig = Signal.State("AirCraftCondition:landState", "Land State", "0");

    protected static Signal aircraft_conditionIntSig = Signal.SeriesIntExperimental("AirCraftCondition", "", null, Units.noUnits);

    protected static Signal aircraft_conditionFloatSig = Signal.SeriesFloat("AirCraftCondition", "", null, Units.noUnits);

    protected static Signal aircraft_conditionDoubleSig = Signal.SeriesDouble("AirCraftCondition", "", null, Units.noUnits);

    public void printCols(lineType lineT) {
        try {

            printCSVValue(intFlightState, aircraft_conditionIntSig, "int_fsm", lineT, valid);
            printCSVValue(flightState, fsmStateSig, "", lineT, valid);
            printCSVValue(lastFlightState, aircraft_conditionIntSig, "last_fsm", lineT, valid);
            printCSVValue(nearGrnd, nearGndSig, "", lineT, valid);
            printCSVValue(UP_state, aircraft_conditionIntSig, "UP_state", lineT, valid);
            printCSVValue(landState, landStateSig, "", lineT, valid);
            printCSVValue(safe_fltr, aircraft_conditionIntSig, "safe_fltr", lineT, valid);
        } catch (Exception e) {
            DatConLog.Exception(e);
        }
    }

}
