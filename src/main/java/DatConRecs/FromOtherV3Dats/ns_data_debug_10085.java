package DatConRecs.FromOtherV3Dats;

import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;

public class ns_data_debug_10085 extends Record {
    protected boolean valid = false;

    protected float d00 = (float) 0;

    protected float d01 = (float) 0;

    protected float d02 = (float) 0;

    protected float d03 = (float) 0;

    protected float d04 = (float) 0;

    protected float d05 = (float) 0;

    protected float d06 = (float) 0;

    protected float d07 = (float) 0;

    protected float d08 = (float) 0;

    protected float d09 = (float) 0;

    protected float d10 = (float) 0;

    protected float d11 = (float) 0;

    protected float d12 = (float) 0;

    protected float d13 = (float) 0;

    protected float d14 = (float) 0;

    protected float d15 = (float) 0;

    protected float d16 = (float) 0;

    protected float d17 = (float) 0;

    protected float d18 = (float) 0;

    protected float d19 = (float) 0;

    public ns_data_debug_10085(ConvertDat convertDat) {
        super(convertDat, 10085, 80);
    }

    @Override
    public void process(Payload _payload) {
        super.process(_payload);
        try {
            valid = true;

            d00 = _payload.getFloat(0);
            d01 = _payload.getFloat(4);
            d02 = _payload.getFloat(8);
            d03 = _payload.getFloat(12);
            d04 = _payload.getFloat(16);
            d05 = _payload.getFloat(20);
            d06 = _payload.getFloat(24);
            d07 = _payload.getFloat(28);
            d08 = _payload.getFloat(32);
            d09 = _payload.getFloat(36);
            d10 = _payload.getFloat(40);
            d11 = _payload.getFloat(44);
            d12 = _payload.getFloat(48);
            d13 = _payload.getFloat(52);
            d14 = _payload.getFloat(56);
            d15 = _payload.getFloat(60);
            d16 = _payload.getFloat(64);
            d17 = _payload.getFloat(68);
            d18 = _payload.getFloat(72);
            d19 = _payload.getFloat(76);
        } catch (Exception e) {
            RecordException(e);
        }
    }

    protected static Signal ns_data_debugIntSig = Signal
            .SeriesInt("ns_data_debug", "", null, Units.noUnits);

    protected static Signal ns_data_debugFloatSig = Signal
            .SeriesFloat("ns_data_debug", "", null, Units.noUnits);

    protected static Signal ns_data_debugDoubleSig = Signal
            .SeriesDouble("ns_data_debug", "", null, Units.noUnits);

    public void printCols(lineType lineT) {
        try {

            printCSVValue(d00, ns_data_debugFloatSig, "d00", lineT, valid);
            printCSVValue(d01, ns_data_debugFloatSig, "d01", lineT, valid);
            printCSVValue(d02, ns_data_debugFloatSig, "d02", lineT, valid);
            printCSVValue(d03, ns_data_debugFloatSig, "d03", lineT, valid);
            printCSVValue(d04, ns_data_debugFloatSig, "d04", lineT, valid);
            printCSVValue(d05, ns_data_debugFloatSig, "d05", lineT, valid);
            printCSVValue(d06, ns_data_debugFloatSig, "d06", lineT, valid);
            printCSVValue(d07, ns_data_debugFloatSig, "d07", lineT, valid);
            printCSVValue(d08, ns_data_debugFloatSig, "d08", lineT, valid);
            printCSVValue(d09, ns_data_debugFloatSig, "d09", lineT, valid);
            printCSVValue(d10, ns_data_debugFloatSig, "d10", lineT, valid);
            printCSVValue(d11, ns_data_debugFloatSig, "d11", lineT, valid);
            printCSVValue(d12, ns_data_debugFloatSig, "d12", lineT, valid);
            printCSVValue(d13, ns_data_debugFloatSig, "d13", lineT, valid);
            printCSVValue(d14, ns_data_debugFloatSig, "d14", lineT, valid);
            printCSVValue(d15, ns_data_debugFloatSig, "d15", lineT, valid);
            printCSVValue(d16, ns_data_debugFloatSig, "d16", lineT, valid);
            printCSVValue(d17, ns_data_debugFloatSig, "d17", lineT, valid);
            printCSVValue(d18, ns_data_debugFloatSig, "d18", lineT, valid);
            printCSVValue(d19, ns_data_debugFloatSig, "d19", lineT, valid);
        } catch (Exception e) {
            DatConLog.Exception(e);
        }
    }

}
