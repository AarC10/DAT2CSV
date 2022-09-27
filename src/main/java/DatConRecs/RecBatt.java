package DatConRecs;

import files.AxesAndSigs;
import files.ConvertDat;
import files.DatConLog;
import files.Signal;
import files.Units;
import files.ConvertDat.lineType;

public class RecBatt extends Record {

    public double crrnt = 0.0;

    protected short batteryPercent = 0;

    protected double fcc = 0.0f;

    protected double remcap = 0.0f;

    public double[] volt;

    protected int numCells = 0;

    public double temp = 0.0;
    ;

    public double totalVolts = 0.0;

    public double maxVolts = 0.0;

    public double minVolts = 0.0;

    public double sumOfVolts = 0.0;

    public double avgVolts = 0.0;

    protected long sumOfCurrents = 0;

    protected long numSamples = 0;

    public double voltDiff = 0.0;

    public double maxCurrent = 0.0;

    public double minCurrent = 0.0;

    public double avgCurrent = 0.0;

    public double watts = 0.0;

    public double maxWatts = 0.0;

    public double minWatts = 0.0;

    protected double sumOfWatts = 0.0;

    public double avgWatts = 0.0;

    public boolean valid = false;

    protected Signal statusSig = null;

    protected Signal battPercent = null;

    protected Signal currentSig = null;

    protected Signal cellVoltSig = null;

    protected Signal batteryTempSig = null;

    protected Signal batteryFCC = null;

    protected Signal batteryRemCap = null;

    protected Signal voltsSig = null;

    protected Signal wattsSig = null;

    public RecBatt(ConvertDat convertDat, int id, int length, int index) {
        super(convertDat, id, length);
        numCells = convertDat.getDatFile().getNumBattCells();
        volt = new double[numCells];
        for (int i = 0; i < numCells; i++) {
            volt[i] = 0.0f;
        }
        statusSig = Signal.SeriesIntExperimental("Battery", index,
                "Battery Status", null, Units.noUnits);
        battPercent = Signal.SeriesInt("Battery", index, "Battery Percentage",
                null, Units.percentage);

        currentSig = Signal.SeriesFloat("Battery", index, "Current", null,
                Units.amps);

        cellVoltSig = Signal.SeriesFloat("Battery", index, "Cell Volts",
                AxesAndSigs.cellVoltsAxis, Units.volts);

        batteryTempSig = Signal.SeriesFloat("Battery", index, "Battery Temp",
                null, Units.degreesC);

        batteryFCC = Signal.SeriesFloat("Battery", index,
                "Battery Full Charge Capacity", null, Units.mAh);

        batteryRemCap = Signal.SeriesFloat("Battery", index,
                "Battery Remaining Cap", null, Units.mAh);

        voltsSig = Signal.SeriesFloat("Battery", index, "Volts", null,
                Units.volts);

        wattsSig = Signal.SeriesFloat("Battery", index, "Watts", null,
                Units.watts);

    }

    protected void init() {
        maxVolts = (float) -1.0;
        minVolts = Float.MAX_VALUE;
        minCurrent = Float.MAX_VALUE;
        avgCurrent = (float) 0.0;
        maxWatts = (float) -1.0;
        minWatts = Float.MAX_VALUE;
    }

    protected double maxVolt(double... floatVolts) {
        double retv = -Float.MAX_VALUE;
        for (double volts : floatVolts) {
            if (volts > retv) {
                retv = volts;
            }
        }
        return retv;
    }

    protected double minVolt(double... floatVolts) {
        double retv = Float.MAX_VALUE;
        for (double volts : floatVolts) {
            if (volts < retv) {
                retv = volts;
            }
        }
        return retv;
    }

    protected double minVolts(double[] volts) {
        double min = Double.MAX_VALUE;
        for (double v : volts) {
            if (v < min)
                min = v;
        }
        return min;
    }

    protected double maxVolts(double[] volts) {
        double max = Float.MIN_VALUE;
        for (int i = 0; i < volts.length; i++) {
            if (volts[i] > max)
                max = volts[i];
        }
        return max;
    }

    protected void processComputedBatt() {
        if (totalVolts > maxVolts)
            maxVolts = totalVolts;
        if (totalVolts < minVolts)
            minVolts = totalVolts;
        sumOfVolts += totalVolts;
        avgVolts = sumOfVolts / (float) numSamples;

        if (crrnt > maxCurrent)
            maxCurrent = crrnt;
        if (crrnt < minCurrent)
            minCurrent = crrnt;
        sumOfCurrents += crrnt;
        avgCurrent = sumOfCurrents / (float) numSamples;

        watts = totalVolts * crrnt;
        if (watts > maxWatts)
            maxWatts = watts;
        if (watts < minWatts)
            minWatts = watts;
        sumOfWatts += watts;
        avgWatts = sumOfWatts / (float) numSamples;
    }

    protected void printComputedBattCols(lineType lineT) throws Exception {
        printCSVValue(voltDiff, voltsSig, "voltSpread", lineT, valid);
        printCSVValue(watts, wattsSig, "watts", lineT, valid);
        printCSVValue(minCurrent, currentSig, "minCurrent", lineT, valid);
        printCSVValue(maxCurrent, currentSig, "maxCurrent", lineT, valid);
        printCSVValue(avgCurrent, currentSig, "avgCurrent", lineT, valid);

        printCSVValue(minVolts, voltsSig, "minVolts", lineT, valid);
        printCSVValue(maxVolts, voltsSig, "maxVolts", lineT, valid);
        printCSVValue(avgVolts, voltsSig, "avgVolts", lineT, valid);

        printCSVValue(minWatts, wattsSig, "minWatts", lineT, valid);
        printCSVValue(maxWatts, wattsSig, "maxWatts", lineT, valid);
        printCSVValue(avgWatts, wattsSig, "avgWatts", lineT, valid);
    }

    @Override
    public void printCols(lineType lineT) {
        try {
            for (int i = 1; i <= _datFile.getNumBattCells(); i++) {
                printCSVValue(volt[i - 1], cellVoltSig, "cellVolts" + i, lineT,
                        valid);
            }
            printCSVValue(crrnt, currentSig, "current", lineT, valid);
            printCSVValue(totalVolts, voltsSig, "totalVolts", lineT, valid);
            printCSVValue(temp, batteryTempSig, "Temp", lineT, valid);
            printCSVValue(batteryPercent, battPercent, "battery%", lineT,
                    valid);
            printCSVValue(fcc, batteryFCC, "FullChargeCap", lineT, valid);
            printCSVValue(remcap, batteryRemCap, "RemainingCap", lineT, valid);
            printComputedBattCols(lineT);

        } catch (Exception e) {
            DatConLog.Exception(e);
        }
    }

}
