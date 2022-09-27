package DatConRecs;

import files.AxesAndSigs;
import files.ConvertDat;
import files.Signal;
import files.Units;

public class BattInfo extends Record {
    public BattInfo(ConvertDat convertDat) {
        super(convertDat, 1710, 38);
    }

    public BattInfo(ConvertDat convertDat, int id, int length) {
        super(convertDat, id, length);
    }

    @Override
    public void process(Payload record) {
        super.process(record);
    }

    protected static Signal batteryInfoIntSig = Signal.SeriesInt("BattInfo", "", null, Units.noUnits);

    protected static Signal batteryInfoFloatSig = Signal.SeriesFloat("BattInfo", "", null, Units.noUnits);

    public static Signal battInfoRemainTimeSig = Signal.SeriesInt("BattInfo", "RemainingTime", null, Units.seconds);

    public final static Signal currentSig = Signal.SeriesFloat("BattInfo", "Current", null, Units.amps);

    public static final Signal cellVoltSig = Signal.SeriesFloat("BattInfo", "Cell Volts", AxesAndSigs.cellVoltsAxis, Units.volts);

    public static final Signal battVoltSig = Signal.SeriesFloat("BattInfo", "Cell Volts", null, Units.volts);

    public static final Signal batteryTempSig = Signal.SeriesFloat("BattInfo", "Battery Temp", null, Units.degreesC);

    public static final Signal batteryCap = Signal.SeriesFloat("BattInfo", "Battery Capacity", null, Units.mAh);

    public static final Signal batteryCapPercent = Signal.SeriesFloat("BattInfo", "Battery Capacity %", null, Units.percentage);


}
