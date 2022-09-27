package DatConRecs.FromOtherV3Dats;

import DatConRecs.Payload;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;

public class pwm_output_76_20001 extends Record {
    protected boolean valid = false;

    protected long OUT_M1 = (long) 0;

    protected long OUT_M2 = (long) 0;

    protected long OUT_M3 = (long) 0;

    protected long OUT_M4 = (long) 0;

    protected long OUT_M5 = (long) 0;

    protected long OUT_M6 = (long) 0;

    protected long OUT_M7 = (long) 0;

    protected long OUT_M8 = (long) 0;

    protected long OUT_F1 = (long) 0;

    protected long OUT_F2 = (long) 0;

    protected long OUT_F3 = (long) 0;

    protected long OUT_F4 = (long) 0;

    protected long OUT_F5 = (long) 0;

    protected long OUT_F6 = (long) 0;

    protected long OUT_F7 = (long) 0;

    protected long OUT_F8 = (long) 0;

    protected long OUT_TEMP_CTRL_0 = (long) 0;

    protected long OUT_TEMP_CTRL_1 = (long) 0;

    protected long OUT_TEMP_CTRL = (long) 0;

    public pwm_output_76_20001(ConvertDat convertDat) {
        super(convertDat, 20001, 76);
    }

    @Override
    public void process(Payload record) {
        super.process(record);
        try {
            valid = true;

            OUT_M1 = record.getUnsignedInt(0);
            OUT_M2 = record.getUnsignedInt(4);
            OUT_M3 = record.getUnsignedInt(8);
            OUT_M4 = record.getUnsignedInt(12);
            OUT_M5 = record.getUnsignedInt(16);
            OUT_M6 = record.getUnsignedInt(20);
            OUT_M7 = record.getUnsignedInt(24);
            OUT_M8 = record.getUnsignedInt(28);
            OUT_F1 = record.getUnsignedInt(32);
            OUT_F2 = record.getUnsignedInt(36);
            OUT_F3 = record.getUnsignedInt(40);
            OUT_F4 = record.getUnsignedInt(44);
            OUT_F5 = record.getUnsignedInt(48);
            OUT_F6 = record.getUnsignedInt(52);
            OUT_F7 = record.getUnsignedInt(56);
            OUT_F8 = record.getUnsignedInt(60);
            OUT_TEMP_CTRL_0 = record.getUnsignedInt(64);
            OUT_TEMP_CTRL_1 = record.getUnsignedInt(68);
            OUT_TEMP_CTRL = record.getUnsignedInt(72);
        } catch (Exception e) {
            RecordException(e);
        }
    }

    protected static Signal pwm_outputIntSig = Signal.SeriesInt("pwm_output",
            "", null, Units.noUnits);

    protected static Signal pwm_outputFloatSig = Signal
            .SeriesFloat("pwm_output", "", null, Units.noUnits);

    protected static Signal pwm_outputDoubleSig = Signal
            .SeriesDouble("pwm_output", "", null, Units.noUnits);

    public void printCols(lineType lineT) {
        try {
            printCSVValue(OUT_M1, pwm_outputIntSig, "OUT_M1", lineT, valid);
            printCSVValue(OUT_M2, pwm_outputIntSig, "OUT_M2", lineT, valid);
            printCSVValue(OUT_M3, pwm_outputIntSig, "OUT_M3", lineT, valid);
            printCSVValue(OUT_M4, pwm_outputIntSig, "OUT_M4", lineT, valid);
            printCSVValue(OUT_M5, pwm_outputIntSig, "OUT_M5", lineT, valid);
            printCSVValue(OUT_M6, pwm_outputIntSig, "OUT_M6", lineT, valid);
            printCSVValue(OUT_M7, pwm_outputIntSig, "OUT_M7", lineT, valid);
            printCSVValue(OUT_M8, pwm_outputIntSig, "OUT_M8", lineT, valid);
            printCSVValue(OUT_F1, pwm_outputIntSig, "OUT_F1", lineT, valid);
            printCSVValue(OUT_F2, pwm_outputIntSig, "OUT_F2", lineT, valid);
            printCSVValue(OUT_F3, pwm_outputIntSig, "OUT_F3", lineT, valid);
            printCSVValue(OUT_F4, pwm_outputIntSig, "OUT_F4", lineT, valid);
            printCSVValue(OUT_F5, pwm_outputIntSig, "OUT_F5", lineT, valid);
            printCSVValue(OUT_F6, pwm_outputIntSig, "OUT_F6", lineT, valid);
            printCSVValue(OUT_F7, pwm_outputIntSig, "OUT_F7", lineT, valid);
            printCSVValue(OUT_F8, pwm_outputIntSig, "OUT_F8", lineT, valid);
//            printCsvValue(OUT_TEMP_CTRL_0, pwm_outputIntSig, "OUT_TEMP_CTRL_0",
//                    lineT, valid);
//            printCsvValue(OUT_TEMP_CTRL_1, pwm_outputIntSig, "OUT_TEMP_CTRL_1",
//                    lineT, valid);
//            printCsvValue(OUT_TEMP_CTRL, pwm_outputIntSig, "OUT_TEMP_CTRL",
//                    lineT, valid);
        } catch (Exception e) {
            DatConLog.Exception(e);
        }
    }

}
