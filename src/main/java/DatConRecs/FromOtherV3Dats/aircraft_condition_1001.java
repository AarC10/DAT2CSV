package DatConRecs.FromOtherV3Dats;

import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;

public class aircraft_condition_1001 extends Record {
    protected boolean valid = false;

    protected short int_fsm = (short) 0;

    protected short fsm_state = (short) 0;

    protected short last_fsm = (short) 0;

    protected short near_gnd = (short) 0;

    protected short UP_state = (short) 0;

    protected short land_state = (short) 0;

    protected short safe_fltr = (short) 0;

    public aircraft_condition_1001(ConvertDat convertDat) {
        super(convertDat, 1001, 8);
    }

    @Override
    public void process(Payload record) {
        super.process(record);
        try {
            valid = true;

            int_fsm = record.getUnsignedByte(0);
            fsm_state = record.getUnsignedByte(1);
            last_fsm = record.getUnsignedByte(2);
            near_gnd = record.getUnsignedByte(3);
            UP_state = record.getUnsignedByte(4);
            land_state = record.getUnsignedByte(5);
            safe_fltr = record.getShort(6);
        } catch (Exception e) {
            RecordException(e);
        }
    }

    protected static Signal aircraft_conditionIntSig = Signal
            .SeriesInt("aircraft_condition", "", null, Units.noUnits);

    protected static Signal aircraft_conditionFloatSig = Signal
            .SeriesFloat("aircraft_condition", "", null, Units.noUnits);

    protected static Signal aircraft_conditionDoubleSig = Signal
            .SeriesDouble("aircraft_condition", "", null, Units.noUnits);

    public void printCols(lineType lineT) {
        try {

            printCSVValue(int_fsm, aircraft_conditionIntSig, "int_fsm", lineT,
                    valid);
            printCSVValue(fsm_state, aircraft_conditionIntSig, "fsm_state",
                    lineT, valid);
            printCSVValue(last_fsm, aircraft_conditionIntSig, "last_fsm", lineT,
                    valid);
            printCSVValue(near_gnd, aircraft_conditionIntSig, "near_gnd", lineT,
                    valid);
            printCSVValue(UP_state, aircraft_conditionIntSig, "UP_state", lineT,
                    valid);
            printCSVValue(land_state, aircraft_conditionIntSig, "land_state",
                    lineT, valid);
            printCSVValue(safe_fltr, aircraft_conditionIntSig, "safe_fltr",
                    lineT, valid);
        } catch (Exception e) {
            DatConLog.Exception(e);
        }
    }

}
