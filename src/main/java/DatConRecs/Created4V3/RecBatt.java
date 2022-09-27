package DatConRecs.Created4V3;

import DatConRecs.Record;
import files.AxesAndSigs;
import files.ConvertDat;
import files.Signal;
import files.Units;
import files.ConvertDat.lineType;

public class RecBatt extends Record {

    public double crrnt = (float) 0.0;

    public short batteryPercent = 0;

    public double[] volt;

    protected int numCells = 0;

    public double temp = (float) 0.0;
    ;

    public double totalVolts = (float) 0.0;

    public double maxVolts = (float) 0.0;

    public double minVolts = (float) 0.0;

    public double sumOfVolts = (float) 0.0;

    public double avgVolts = (float) 0.0;

    protected double sumOfCurrents = 0;

    protected long numSamples = 0;

    public double voltDiff = (float) 0.0;

    public double maxCurrent = (float) 0.0;

    public double minCurrent = (float) 0.0;

    public double avgCurrent = (float) 0.0;

    public double watts = (float) 0.0;

    public double maxWatts = (float) 0.0;

    public double minWatts = (float) 0.0;

    protected double sumOfWatts = (float) 0.0;

    public double avgWatts = (float) 0.0;

    public boolean valid = false;

    protected Signal battPercent = null;

    protected Signal currentSig = null;

    protected Signal cellVoltSig = null;

    protected Signal batteryTempSig = null;

    protected Signal batteryFCC = null;

    protected Signal batteryRemCap = null;

    protected Signal voltsSig = null;

    protected Signal wattsSig = null;

    protected Signal statusSig = Signal.SeriesIntExperimental("Battery:Status", "Battery Status", null, Units.noUnits);


    public RecBatt(ConvertDat convertDat, int id, int length, int index) {
        super(convertDat, id, length);
        numCells = convertDat.getDatFile().getNumBattCells();
        volt = new double[numCells];
        for (int i = 0; i < numCells; i++) {
            volt[i] = 0.0f;
        }
        statusSig = Signal.SeriesIntExperimental("Battery", index, "Battery Status", null, Units.noUnits);
        battPercent = Signal.SeriesInt("Battery", index, "Battery Percentage", null, Units.percentage);

        currentSig = Signal.SeriesFloat("Battery", index, "Current", null, Units.amps);

        cellVoltSig = Signal.SeriesFloat("Battery", index, "Cell Volts", AxesAndSigs.cellVoltsAxis, Units.volts);

        batteryTempSig = Signal.SeriesFloat("Battery", index, "Battery Temp", null, Units.degreesC);

        batteryFCC = Signal.SeriesFloat("Battery", index, "Battery Full Charge Capacity", null, Units.mAh);

        batteryRemCap = Signal.SeriesFloat("Battery", index, "Battery Remaining Cap", null, Units.mAh);

        voltsSig = Signal.SeriesFloat("Battery", index, "Volts", null, Units.volts);

        wattsSig = Signal.SeriesFloat("Battery", index, "Watts", null, Units.watts);

    }

    protected void init() {
        maxVolts = (float) -1.0;
        minVolts = Float.MAX_VALUE;
        minCurrent = Float.MAX_VALUE;
        avgCurrent = (float) 0.0;
        maxWatts = (float) -1.0;
        minWatts = Float.MAX_VALUE;
    }

    protected float maxVolt(float... floatVolts) {
        float retv = -Float.MAX_VALUE;
        for (float volts : floatVolts) {
            if (volts > retv) {
                retv = volts;
            }
        }
        return retv;
    }

    protected float minVolt(float... floatVolts) {
        float retv = Float.MAX_VALUE;
        for (float volts : floatVolts) {
            if (volts < retv) {
                retv = volts;
            }
        }
        return retv;
    }

    protected float minVolts(float[] volts) {
        float min = Float.MAX_VALUE;
        for (int i = 0; i < volts.length; i++) {
            if (volts[i] < min) min = volts[i];
        }
        return min;
    }

    protected float maxVolts(float[] volts) {
        float max = Float.MIN_VALUE;
        for (int i = 0; i < volts.length; i++) {
            if (volts[i] > max) max = volts[i];
        }
        return max;
    }

    protected void processComputedBatt() {
        if (totalVolts > maxVolts) maxVolts = totalVolts;
        if (totalVolts < minVolts) minVolts = totalVolts;
        sumOfVolts += totalVolts;
        avgVolts = sumOfVolts / numSamples;

        if (crrnt > maxCurrent) maxCurrent = crrnt;
        if (crrnt < minCurrent) minCurrent = crrnt;
        sumOfCurrents += crrnt;
        avgCurrent = sumOfCurrents / numSamples;

        watts = totalVolts * crrnt;
        if (watts > maxWatts) maxWatts = watts;
        if (watts < minWatts) minWatts = watts;
        sumOfWatts += watts;
        avgWatts = sumOfWatts / numSamples;
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
}
