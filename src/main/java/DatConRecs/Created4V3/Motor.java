/* Motor class

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that redistribution of source code include
the following disclaimer in the documentation and/or other materials provided
with the distribution.

THIS SOFTWARE IS PROVIDED BY ITS CREATOR "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE CREATOR OR CONTRIBUTORS BE LIABLE FOR
ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package DatConRecs.Created4V3;

import DatConRecs.Record;
import DatConRecs.RecIMU;
import files.AxesAndSigs;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Persist;
import files.Signal;
import files.Units;

public class Motor extends Record {

    protected static int numSamples = 50;

    protected boolean valid = false;

    double thrustTheta = 0.0;

    protected boolean PPMsend = false;

    protected double voltsPerMotor[][] = null;

    protected double currentPerMotor[][] = null;

    protected double wattSecsPerDTPerMotor[][] = null;

    protected double wattsPerMotor[] = null;

    protected double wattsAvgPerMotor[] = null;

    protected double wattsPerMotorLast[] = null;

    protected double wattSecsPerMotor[] = null;

    protected double wattSecsPerMotorLast[] = null;

    protected double wattSecsPerTotalDistPerMotor[] = null;

    private int currentNumSamples = 0;

    private int sampleNum = 0;

    protected short rfPPM_recv = 0;

    protected short lfPPM_recv = 0;

    protected short lbPPM_recv = 0;

    protected short rbPPM_recv = 0;

    protected int rfPPM_send = 0;

    protected int lfPPM_send = 0;

    protected int lbPPM_send = 0;

    protected int rbPPM_send = 0;

    protected int lsPPM_send = 0;

    protected int rsPPM_send = 0;

    protected float rfVolts = 0;

    protected float lfVolts = 0;

    protected float lbVolts = 0;

    protected float rbVolts = 0;

    protected float rfV_out = 0;

    protected float lfV_out = 0;

    protected float lbV_out = 0;

    protected float rbV_out = 0;

    protected short rfSpeed = 0;

    protected short lfSpeed = 0;

    protected short lbSpeed = 0;

    protected short rbSpeed = 0;

    protected float rfCurrent = 0;

    protected float lfCurrent = 0;

    protected float lbCurrent = 0;

    protected float rbCurrent = 0;

    protected short rfTemp = 0;

    protected short lfTemp = 0;

    protected short lbTemp = 0;

    protected short rbTemp = 0;

    protected short rfStatus = 0;

    protected short lfStatus = 0;

    protected short lbStatus = 0;

    protected short rbStatus = 0;

    public short lsPPM_recv = 0;

    public short rsPPM_recv = 0;

    public float lsVolts = 0;

    public float rsVolts = 0;

    public float lsV_out = 0;

    public float rsV_out = 0;

    public short lsSpeed = 0;

    public short rsSpeed = 0;

    public float lsCurrent = 0;

    public float rsCurrent = 0;

    protected short lsTemp = 0;

    protected short rsTemp = 0;

    public short lsStatus = 0;

    public short rsStatus = 0;

    static int maxNumMotors = 6;

    public Motor(ConvertDat convertDat, int id, int length) {
        super(convertDat, id, length);
        try {
            voltsPerMotor = new double[maxNumMotors][numSamples];
            currentPerMotor = new double[maxNumMotors][numSamples];
            wattSecsPerDTPerMotor = new double[maxNumMotors][numSamples];
            wattsPerMotor = new double[maxNumMotors];
            wattsAvgPerMotor = new double[maxNumMotors];
            wattsPerMotorLast = new double[maxNumMotors];
            wattSecsPerMotor = new double[maxNumMotors];
            wattSecsPerMotorLast = new double[maxNumMotors];
            wattSecsPerTotalDistPerMotor = new double[maxNumMotors];
            for (int i = 0; i < maxNumMotors; i++) {
                wattSecsPerMotor[i] = 0.0;
                wattSecsPerMotorLast[i] = 0.0;
                wattSecsPerTotalDistPerMotor[i] = 0.0;
            }
            currentNumSamples = 0;
            sampleNum = 0;
        } catch (Exception e) {
            RecordException(e);
        }
    }

    public void printCols(lineType lineT) {
        try {
            if (convertDat.getNumMotors() == 4) {
                printCSVValue(rfSpeed, AxesAndSigs.motorSpeedSig, "RFront",
                        lineT, valid);
                printCSVValue(lfSpeed, AxesAndSigs.motorSpeedSig, "LFront",
                        lineT, valid);
                printCSVValue(lbSpeed, AxesAndSigs.motorSpeedSig, "LBack",
                        lineT, valid);
                printCSVValue(rbSpeed, AxesAndSigs.motorSpeedSig, "RBack",
                        lineT, valid);

                printCSVValue(rfTemp, AxesAndSigs.motorEscTempSig, "RFront",
                        lineT, valid);
                printCSVValue(lfTemp, AxesAndSigs.motorEscTempSig, "LFront",
                        lineT, valid);
                printCSVValue(lbTemp, AxesAndSigs.motorEscTempSig, "LBack",
                        lineT, valid);
                printCSVValue(rbTemp, AxesAndSigs.motorEscTempSig, "RBack",
                        lineT, valid);

                printCSVValue(rfPPM_recv, AxesAndSigs.motorPPMrecvSig, "RFront",
                        lineT, valid);
                printCSVValue(lfPPM_recv, AxesAndSigs.motorPPMrecvSig, "LFront",
                        lineT, valid);
                printCSVValue(lbPPM_recv, AxesAndSigs.motorPPMrecvSig, "LBack",
                        lineT, valid);
                printCSVValue(rbPPM_recv, AxesAndSigs.motorPPMrecvSig, "RBack",
                        lineT, valid);

                if (PPMsend) {
                    printCSVValue(rfPPM_send, AxesAndSigs.motorPPMsendSig,
                            "RFront", lineT, valid);
                    printCSVValue(lfPPM_send, AxesAndSigs.motorPPMsendSig,
                            "LFront", lineT, valid);
                    printCSVValue(lbPPM_send, AxesAndSigs.motorPPMsendSig,
                            "LBack", lineT, valid);
                    printCSVValue(rbPPM_send, AxesAndSigs.motorPPMsendSig,
                            "RBack", lineT, valid);
                }

                printCSVValue(rfV_out, AxesAndSigs.motorVoutSig, "RFront",
                        lineT, valid);
                printCSVValue(lfV_out, AxesAndSigs.motorVoutSig, "LFront",
                        lineT, valid);
                printCSVValue(lbV_out, AxesAndSigs.motorVoutSig, "LBack", lineT,
                        valid);
                printCSVValue(rbV_out, AxesAndSigs.motorVoutSig, "RBack", lineT,
                        valid);

                printCSVValue(rfVolts, AxesAndSigs.motorVoltsSig, "RFront",
                        lineT, valid);
                printCSVValue(lfVolts, AxesAndSigs.motorVoltsSig, "LFront",
                        lineT, valid);
                printCSVValue(lbVolts, AxesAndSigs.motorVoltsSig, "LBack",
                        lineT, valid);
                printCSVValue(rbVolts, AxesAndSigs.motorVoltsSig, "RBack",
                        lineT, valid);

                printCSVValue(rfCurrent, AxesAndSigs.motorCurrentSig, "RFront",
                        lineT, valid);
                printCSVValue(lfCurrent, AxesAndSigs.motorCurrentSig, "LFront",
                        lineT, valid);
                printCSVValue(lbCurrent, AxesAndSigs.motorCurrentSig, "LBack",
                        lineT, valid);
                printCSVValue(rbCurrent, AxesAndSigs.motorCurrentSig, "RBack",
                        lineT, valid);

                printCSVValue(rfStatus, AxesAndSigs.motorStatusSig, "RFront",
                        lineT, valid);
                printCSVValue(lfStatus, AxesAndSigs.motorStatusSig, "LFront",
                        lineT, valid);
                printCSVValue(lbStatus, AxesAndSigs.motorStatusSig, "LBack",
                        lineT, valid);
                printCSVValue(rbStatus, AxesAndSigs.motorStatusSig, "RBack",
                        lineT, valid);

                printCSVValue(thrustTheta, AxesAndSigs.thrustThetaSig, "",
                        lineT, valid);
                printPower(lineT, valid);
            } else if (convertDat.getNumMotors() == 6) {
                printCSVValue(rfStatus, AxesAndSigs.motorStatusSig, "RFront",
                        lineT, valid);
                printCSVValue(lfStatus, AxesAndSigs.motorStatusSig, "LFront",
                        lineT, valid);
                printCSVValue(lsStatus, AxesAndSigs.motorStatusSig, "LSide",
                        lineT, valid);
                printCSVValue(lbStatus, AxesAndSigs.motorStatusSig, "LBack",
                        lineT, valid);
                printCSVValue(rbStatus, AxesAndSigs.motorStatusSig, "RBack",
                        lineT, valid);
                printCSVValue(rsStatus, AxesAndSigs.motorStatusSig, "RSide",
                        lineT, valid);

                printCSVValue(rfSpeed, AxesAndSigs.motorSpeedSig, "RFront",
                        lineT, valid);
                printCSVValue(lfSpeed, AxesAndSigs.motorSpeedSig, "LFront",
                        lineT, valid);
                printCSVValue(lsSpeed, AxesAndSigs.motorSpeedSig, "LSide",
                        lineT, valid);
                printCSVValue(lbSpeed, AxesAndSigs.motorSpeedSig, "LBack",
                        lineT, valid);
                printCSVValue(rbSpeed, AxesAndSigs.motorSpeedSig, "RBack",
                        lineT, valid);
                printCSVValue(rsSpeed, AxesAndSigs.motorSpeedSig, "RSide",
                        lineT, valid);

                printCSVValue(rfVolts, AxesAndSigs.motorVoltsSig, "RFront",
                        lineT, valid);
                printCSVValue(lfVolts, AxesAndSigs.motorVoltsSig, "LFront",
                        lineT, valid);
                printCSVValue(lsVolts, AxesAndSigs.motorVoltsSig, "LSide",
                        lineT, valid);
                printCSVValue(lbVolts, AxesAndSigs.motorVoltsSig, "LBack",
                        lineT, valid);
                printCSVValue(rbVolts, AxesAndSigs.motorVoltsSig, "RBack",
                        lineT, valid);
                printCSVValue(rsVolts, AxesAndSigs.motorVoltsSig, "RSide",
                        lineT, valid);

                printCSVValue(rfTemp, AxesAndSigs.motorEscTempSig, "RFront",
                        lineT, valid);
                printCSVValue(lfTemp, AxesAndSigs.motorEscTempSig, "LFront",
                        lineT, valid);
                printCSVValue(lsTemp, AxesAndSigs.motorEscTempSig, "LSide",
                        lineT, valid);
                printCSVValue(lbTemp, AxesAndSigs.motorEscTempSig, "LBack",
                        lineT, valid);
                printCSVValue(rbTemp, AxesAndSigs.motorEscTempSig, "RBack",
                        lineT, valid);
                printCSVValue(rsTemp, AxesAndSigs.motorEscTempSig, "RSide",
                        lineT, valid);

                printCSVValue(rfPPM_recv, AxesAndSigs.motorPPMrecvSig, "RFront",
                        lineT, valid);
                printCSVValue(lfPPM_recv, AxesAndSigs.motorPPMrecvSig, "LFront",
                        lineT, valid);
                printCSVValue(lsPPM_recv, AxesAndSigs.motorPPMrecvSig, "LSide",
                        lineT, valid);
                printCSVValue(lbPPM_recv, AxesAndSigs.motorPPMrecvSig, "LBack",
                        lineT, valid);
                printCSVValue(rbPPM_recv, AxesAndSigs.motorPPMrecvSig, "RBack",
                        lineT, valid);
                printCSVValue(rsPPM_recv, AxesAndSigs.motorPPMrecvSig, "RSide",
                        lineT, valid);
                if (PPMsend) {
                    printCSVValue(rfPPM_send, AxesAndSigs.motorPPMsendSig,
                            "RFront", lineT, valid);
                    printCSVValue(lfPPM_send, AxesAndSigs.motorPPMsendSig,
                            "LFront", lineT, valid);
                    printCSVValue(lsPPM_send, AxesAndSigs.motorPPMsendSig,
                            "LSide", lineT, valid);
                    printCSVValue(lbPPM_send, AxesAndSigs.motorPPMsendSig,
                            "LBack", lineT, valid);
                    printCSVValue(rbPPM_send, AxesAndSigs.motorPPMsendSig,
                            "RBack", lineT, valid);
                    printCSVValue(rsPPM_send, AxesAndSigs.motorPPMsendSig,
                            "RSide", lineT, valid);
                }

                printCSVValue(rfV_out, AxesAndSigs.motorVoutSig, "RFront",
                        lineT, valid);
                printCSVValue(lfV_out, AxesAndSigs.motorVoutSig, "LFront",
                        lineT, valid);
                printCSVValue(lsV_out, AxesAndSigs.motorVoutSig, "LSide", lineT,
                        valid);
                printCSVValue(lbV_out, AxesAndSigs.motorVoutSig, "LBack", lineT,
                        valid);
                printCSVValue(rbV_out, AxesAndSigs.motorVoutSig, "RBack", lineT,
                        valid);
                printCSVValue(rsV_out, AxesAndSigs.motorVoutSig, "RSide", lineT,
                        valid);

                printCSVValue(rfCurrent, AxesAndSigs.motorCurrentSig, "RFront",
                        lineT, valid);
                printCSVValue(lfCurrent, AxesAndSigs.motorCurrentSig, "LFront",
                        lineT, valid);
                printCSVValue(lsCurrent, AxesAndSigs.motorCurrentSig, "LSide",
                        lineT, valid);
                printCSVValue(lbCurrent, AxesAndSigs.motorCurrentSig, "LBack",
                        lineT, valid);
                printCSVValue(rbCurrent, AxesAndSigs.motorCurrentSig, "RBack",
                        lineT, valid);
                printCSVValue(rsCurrent, AxesAndSigs.motorCurrentSig, "RSide",
                        lineT, valid);
            }
        } catch (Exception e) {
            DatConLog.Exception(e);
        }
    }

    protected double computeThrustTheta(short lbSpeed, short rfSpeed,
            short rbSpeed, short lfSpeed) {
        double lbrfDiff = lbSpeed - rfSpeed;
        double rblfDiff = rbSpeed - lfSpeed;
        double thrust1 = Math.toDegrees(Math.atan2(lbrfDiff, rblfDiff));
        double thrust2 = (thrust1 + 315.0) % 360.0;
        double thrustTheta = thrust2;
        if (thrust2 > 180.0) {
            thrustTheta = thrust2 - 360.0;
        }
        return thrustTheta;
    }

    boolean firstTime = true;

    double lastTime = 0.0;

    double lastDistanceTravelled = 0.0;

    protected void recordPower() {
        if (Persist.motorPowerCalcs) {
            double currentTime = convertDat.getTime();
            double currentDistanceTravelled = RecIMU.current
                    .getDistanceTravelled();
            if (currentNumSamples++ >= numSamples)
                currentNumSamples = numSamples;
            if (sampleNum >= numSamples)
                sampleNum = 0;
            voltsPerMotor[0][sampleNum] = rfVolts;
            voltsPerMotor[1][sampleNum] = lfVolts;
            voltsPerMotor[2][sampleNum] = lbVolts;
            voltsPerMotor[3][sampleNum] = rbVolts;
            currentPerMotor[0][sampleNum] = rfCurrent;
            currentPerMotor[1][sampleNum] = lfCurrent;
            currentPerMotor[2][sampleNum] = lbCurrent;
            currentPerMotor[3][sampleNum] = rbCurrent;
            wattsPerMotor[0] = rfVolts * rfCurrent;
            wattsPerMotor[1] = lfVolts * lfCurrent;
            wattsPerMotor[2] = lbVolts * lbCurrent;
            wattsPerMotor[3] = rbVolts * rbCurrent;
            if (!firstTime) {
                double deltaTime = currentTime - lastTime;
                double deltaDT = currentDistanceTravelled
                        - lastDistanceTravelled;
                for (int motorNum = 0; motorNum < convertDat
                        .getNumMotors(); motorNum++) {
                    wattSecsPerMotor[motorNum] += (0.5
                            * (wattsPerMotor[motorNum]
                                    + wattsPerMotorLast[motorNum]))
                            * deltaTime;
                    wattsPerMotorLast[motorNum] = wattsPerMotor[motorNum];
                    double wattSPM = 0.0;
                    if (deltaDT == 0.0) {
                        wattSPM = Double.NaN;
                    } else {
                        wattSPM = ((wattSecsPerMotor[motorNum]
                                - wattSecsPerMotorLast[motorNum]) / deltaDT);
                        wattSecsPerMotorLast[motorNum] = wattSecsPerMotor[motorNum];
                    }
                    if (currentDistanceTravelled > 0.0) {
                        wattSecsPerTotalDistPerMotor[motorNum] = wattSecsPerMotor[motorNum]
                                / currentDistanceTravelled;
                    }
                    wattSecsPerDTPerMotor[motorNum][sampleNum] = wattSPM;
                }
            }
            sampleNum++;
            lastTime = currentTime;
            lastDistanceTravelled = currentDistanceTravelled;
            firstTime = false;
        }
    }

    public static Signal motorVoltsAvgSig = Signal.SeriesFloat(
            "MotorPwrCalcs:Volts:Avg", "motor Volts",
            AxesAndSigs.motorVoltsAxis, Units.volts);

    public static Signal motorCurrentAvgSig = Signal.SeriesFloat(
            "MotorPwrCalcs:Current:Avg", "Motor Load",
            AxesAndSigs.motorCurrentAxis, Units.amps);

    public static Signal motorWattsAvgSig = Signal.SeriesFloat(
            "MotorPwrCalcs:Watts:Avg", "Motor Load", AxesAndSigs.motorWattsAxis,
            Units.watts);

    public static Signal motorWattsSecsSig = Signal.SeriesFloat(
            "MotorPwrCalcs:WattSecs", "Motor Watt Secs",
            AxesAndSigs.motorWattsSecsAxis, Units.wattsSecs);

    public static Signal motorWattsSecsPerDistSig = Signal.SeriesFloat(
            "MotorPwrCalcs:WattSecs/Dist", "Motor Watt Secs/Distance",
            AxesAndSigs.motorWattsSecsPerDistAxis, Units.wattsSecsPerDist);

    public static Signal motorWattSecsPerTotalDistSig = Signal.SeriesFloat(
            "MotorPwrCalcs:WattSecs/TotalDist",
            "Motor Watt Secs/Total Distance",
            AxesAndSigs.motorWattsSecsPerDistAxis, Units.wattsSecsPerDist);

    public static Signal motorWattsPerVelHSig = Signal.SeriesFloat(
            "MotorPwrCalcs:Watts/VelH", "Motor Watts Per Vel",
            AxesAndSigs.motorWattsPerVelAxis, Units.wattsPerVel);

    public static Signal motorWattsPerVelDSig = Signal.SeriesFloat(
            "MotorPwrCalcs:Watts/VelD", "Motor Watts Per Vel",
            AxesAndSigs.motorWattsPerVelAxis, Units.wattsPerVel);

    protected void printPower(lineType lineT, boolean valid) {
        if (Persist.motorPowerCalcs) {
            try {
                double[] voltsAvgPerMotor = { 0.0, 0.0, 0.0, 0.0 };
                double[] currentAvgPerMotor = { 0.0, 0.0, 0.0, 0.0 };
                double[] wattSecsPerDTAvgPerMotor = { 0.0, 0.0, 0.0, 0.0 };
                double avgVolts = 0.0f;
                double totalCurrent = 0.0f;
                if (currentNumSamples != 0) {
                    for (int motorNum = 0; motorNum < convertDat
                            .getNumMotors(); motorNum++) {
                        for (int sampleNum = 0; sampleNum < currentNumSamples; sampleNum++) {
                            voltsAvgPerMotor[motorNum] = voltsAvgPerMotor[motorNum]
                                    + voltsPerMotor[motorNum][sampleNum];
                            currentAvgPerMotor[motorNum] = currentAvgPerMotor[motorNum]
                                    + currentPerMotor[motorNum][sampleNum];
                            wattSecsPerDTAvgPerMotor[motorNum] += wattSecsPerDTPerMotor[motorNum][sampleNum];
                        }
                        voltsAvgPerMotor[motorNum] = voltsAvgPerMotor[motorNum]
                                / ((double) currentNumSamples);
                        currentAvgPerMotor[motorNum] = currentAvgPerMotor[motorNum]
                                / ((double) currentNumSamples);
                        wattSecsPerDTAvgPerMotor[motorNum] = wattSecsPerDTAvgPerMotor[motorNum]
                                / ((double) currentNumSamples);
                        avgVolts += voltsAvgPerMotor[motorNum];
                        totalCurrent += currentAvgPerMotor[motorNum];
                    }
                }
                avgVolts = avgVolts / ((double) convertDat.getNumMotors());
                printCSVValue(voltsAvgPerMotor[0], motorVoltsAvgSig, "RFront",
                        lineT, valid);
                printCSVValue(voltsAvgPerMotor[1], motorVoltsAvgSig, "LFront",
                        lineT, valid);
                printCSVValue(voltsAvgPerMotor[2], motorVoltsAvgSig, "LBack",
                        lineT, valid);
                printCSVValue(voltsAvgPerMotor[3], motorVoltsAvgSig, "RBack",
                        lineT, valid);
                printCSVValue(avgVolts, motorVoltsAvgSig, "All", lineT, valid);

                printCSVValue(currentAvgPerMotor[0], motorCurrentAvgSig,
                        "RFront", lineT, valid);
                printCSVValue(currentAvgPerMotor[1], motorCurrentAvgSig,
                        "LFront", lineT, valid);
                printCSVValue(currentAvgPerMotor[2], motorCurrentAvgSig,
                        "LBack", lineT, valid);
                printCSVValue(currentAvgPerMotor[3], motorCurrentAvgSig,
                        "RBack", lineT, valid);
                printCSVValue(totalCurrent, motorCurrentAvgSig, "All", lineT,
                        valid);
                for (int i = 0; i < convertDat.getNumMotors(); i++) {
                    wattsAvgPerMotor[i] = voltsAvgPerMotor[i]
                            * currentAvgPerMotor[i];
                }
                printCSVValue(wattsAvgPerMotor[0], motorWattsAvgSig, "RFront",
                        lineT, valid);
                printCSVValue(wattsAvgPerMotor[1], motorWattsAvgSig, "LFront",
                        lineT, valid);
                printCSVValue(wattsAvgPerMotor[2], motorWattsAvgSig, "LBack",
                        lineT, valid);
                printCSVValue(wattsAvgPerMotor[3], motorWattsAvgSig, "RBack",
                        lineT, valid);
                printCSVValue(avgVolts * totalCurrent, motorWattsAvgSig, "All",
                        lineT, valid);

                printCSVValue(wattSecsPerMotor[0], motorWattsSecsSig, "RFront",
                        lineT, valid);
                printCSVValue(wattSecsPerMotor[1], motorWattsSecsSig, "LFront",
                        lineT, valid);
                printCSVValue(wattSecsPerMotor[2], motorWattsSecsSig, "LBack",
                        lineT, valid);
                printCSVValue(wattSecsPerMotor[3], motorWattsSecsSig, "RBack",
                        lineT, valid);
                printCSVValue(
                        wattSecsPerMotor[0] + wattSecsPerMotor[1]
                                + wattSecsPerMotor[2] + wattSecsPerMotor[3],
                        motorWattsSecsSig, "All", lineT, valid);

                printCSVValue(wattSecsPerDTAvgPerMotor[0],
                        motorWattsSecsPerDistSig, "RFront", lineT,
                        !(Double.isNaN(wattSecsPerDTAvgPerMotor[0])));
                printCSVValue(wattSecsPerDTAvgPerMotor[1],
                        motorWattsSecsPerDistSig, "LFront", lineT,
                        !(Double.isNaN(wattSecsPerDTAvgPerMotor[1])));
                printCSVValue(wattSecsPerDTAvgPerMotor[2],
                        motorWattsSecsPerDistSig, "LBack", lineT,
                        !(Double.isNaN(wattSecsPerDTAvgPerMotor[2])));
                printCSVValue(wattSecsPerDTAvgPerMotor[3],
                        motorWattsSecsPerDistSig, "RBack", lineT,
                        !(Double.isNaN(wattSecsPerDTAvgPerMotor[3])));
                printCSVValue(
                        wattSecsPerDTAvgPerMotor[0]
                                + wattSecsPerDTAvgPerMotor[1]
                                + wattSecsPerDTAvgPerMotor[2]
                                + wattSecsPerDTAvgPerMotor[3],
                        motorWattsSecsPerDistSig, "All", lineT,
                        !(Double.isNaN(wattSecsPerDTAvgPerMotor[0]
                                + wattSecsPerDTAvgPerMotor[1]
                                + wattSecsPerDTAvgPerMotor[2]
                                + wattSecsPerDTAvgPerMotor[3])));

                printCSVValue(wattSecsPerTotalDistPerMotor[0],
                        motorWattSecsPerTotalDistSig, "RFront", lineT,
                        !(Double.isNaN(wattSecsPerTotalDistPerMotor[0])));
                printCSVValue(wattSecsPerTotalDistPerMotor[1],
                        motorWattSecsPerTotalDistSig, "LFront", lineT,
                        !(Double.isNaN(wattSecsPerTotalDistPerMotor[1])));
                printCSVValue(wattSecsPerTotalDistPerMotor[2],
                        motorWattSecsPerTotalDistSig, "LBack", lineT,
                        !(Double.isNaN(wattSecsPerTotalDistPerMotor[2])));
                printCSVValue(wattSecsPerTotalDistPerMotor[3],
                        motorWattSecsPerTotalDistSig, "RBack", lineT,
                        !(Double.isNaN(wattSecsPerTotalDistPerMotor[3])));
                printCSVValue(
                        wattSecsPerTotalDistPerMotor[0]
                                + wattSecsPerTotalDistPerMotor[1]
                                + wattSecsPerTotalDistPerMotor[2]
                                + wattSecsPerTotalDistPerMotor[3],
                        motorWattSecsPerTotalDistSig, "All", lineT,
                        !(Double.isNaN(wattSecsPerTotalDistPerMotor[0]
                                + wattSecsPerTotalDistPerMotor[1]
                                + wattSecsPerTotalDistPerMotor[2]
                                + wattSecsPerTotalDistPerMotor[3])));

                double VelH = RecIMU.current.getVh();
                printCSVValue(wattsAvgPerMotor[0] / VelH, motorWattsPerVelHSig,
                        "RFront", lineT, (valid && (VelH != 0.0)));
                printCSVValue(wattsAvgPerMotor[1] / VelH, motorWattsPerVelHSig,
                        "LFront", lineT, (valid && (VelH != 0.0)));
                printCSVValue(wattsAvgPerMotor[2] / VelH, motorWattsPerVelHSig,
                        "LBack", lineT, (valid && (VelH != 0.0)));
                printCSVValue(wattsAvgPerMotor[3] / VelH, motorWattsPerVelHSig,
                        "RBack", lineT, (valid && (VelH != 0.0)));
                printCSVValue(
                        (wattsAvgPerMotor[0] + wattsAvgPerMotor[1]
                                + wattsAvgPerMotor[2] + wattsAvgPerMotor[3])
                                / VelH,
                        motorWattsPerVelHSig, "All", lineT,
                        (valid && (VelH != 0.0)));

                double VelD = RecIMU.current.getVd();
                printCSVValue(wattsAvgPerMotor[0] / VelD, motorWattsPerVelDSig,
                        "RFront", lineT, (valid && (VelD != 0.0)));
                printCSVValue(wattsAvgPerMotor[1] / VelD, motorWattsPerVelDSig,
                        "LFront", lineT, (valid && (VelD != 0.0)));
                printCSVValue(wattsAvgPerMotor[2] / VelD, motorWattsPerVelDSig,
                        "LBack", lineT, (valid && (VelD != 0.0)));
                printCSVValue(wattsAvgPerMotor[3] / VelD, motorWattsPerVelDSig,
                        "RBack", lineT, (valid && (VelD != 0.0)));
                printCSVValue(
                        (wattsAvgPerMotor[0] + wattsAvgPerMotor[1]
                                + wattsAvgPerMotor[2] + wattsAvgPerMotor[3])
                                / VelD,
                        motorWattsPerVelDSig, "All", lineT,
                        (valid && (VelD != 0.0)));
            } catch (Exception e) {
                DatConLog.Exception(e);
            }
        }
    }
}
