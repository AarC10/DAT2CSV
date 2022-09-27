
package DatConRecs.Created4V3;

import DatConRecs.Payload;
import DatConRecs.Record;
import DatConRecs.RecIMU;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;

public class RecAirComp extends Record {
    protected boolean valid = false;

    protected short velLevel;

    protected float vbx = 0.0f;

    protected float vby = 0.0f;

    protected float compAlti = 0.0f;

    private double windHeading = 0.0f;

    private double windMag = 0.0;

    protected static Signal vbSig = Signal.SeriesFloat("AirComp:AirSpeedBody",
            "AirComp AirSpeedBody", null, Units.metersPerSec);

    protected static Signal experimentalSig = Signal.SeriesFloatExperimental(
            "AirComp:exp", "AirComp AirSpeedBody", null, Units.noUnits);

    protected static Signal compAltiSig = Signal.SeriesFloat("AirComp:Alti",
            "AirComp Altitude", null, Units.meters);

    protected static Signal velLevelSig = Signal.SeriesInt("AirComp:VelLevel",
            "AirComp VelLevel", null, Units.noUnits);

    protected static Signal windHeadingSig = Signal.SeriesInt(
            "AirComp:WindHeading", "AirComp Derived Wind Heading", null,
            Units.degrees180);

    protected static Signal windMagSig = Signal.SeriesInt(
            "AirComp:WindMagnitude", "AirComp Derived Wind Magnitude", null,
            Units.metersPerSec);

    protected static Signal velNormSig = Signal.SeriesFloat("AirComp:VelNorm",
            "AirComp Velocity Norm", null, Units.noUnits);

    protected static Signal velLevelTimeSig = Signal.SeriesInt(
            "AirComp:VelTime", "AirComp Velocity Time", null, Units.noUnits);

    protected static Signal vgSig = Signal.SeriesFloat("AirComp:AirSpeedGround",
            "AirComp AirSpeedGround", null, Units.metersPerSec);

    public RecAirComp(ConvertDat convertDat, int id, int length) {
        super(convertDat, id, length);
    }

    public void process(Payload _payload) {
        super.process(_payload);
    }

    double gX = 0.0;

    double gY = 0.0;

    double wX = 0.0;

    double wY = 0.0;

    double alpha = 0.0;

    double theta = 0.0;

    double yawRadians = 0.0;

    private double Vh = 0.0;

    private double windMag2 = 0.0;

    protected void windComps() {
        yawRadians = RecIMU.current.getYawRadians();
        double Vn = RecIMU.current.getVn();
        double Ve = RecIMU.current.getVe();
        Vh = Math.sqrt(Ve * Ve + Vn * Vn);
        Vh = Vh * ((double) velLevel) / 100.0;
        alpha = Math.atan2(Ve, Vn);
        theta = alpha - yawRadians;
        // * (((double) velLevel) / 100.0);
        gX = Math.cos(theta) * Vh;
        gY = Math.sin(theta) * Vh;
        //        vbx = vbx * (((float) velLevel) / 100.0f);
        //        vby = vby * (((float) velLevel) / 100.0f);
        wX = (vbx - gX);
        wY = (vby - gY);
        double head = Math.toDegrees(Math.atan2(wY, wX) + yawRadians);
        if (head > 180.0) {
            head = head - 360.0;
        }
        windHeading = head;
        windMag = Math.sqrt(wX * wX + wY * wY);
        windMag2 = windMag * ((double) velLevel) / 100.0;
    }

    protected void printWindComps(lineType lineT) {
        try {
            printCSVValue(Math.toDegrees(yawRadians), experimentalSig,
                    "yawDegrees", lineT, valid);
            printCSVValue(Math.toDegrees(alpha), experimentalSig,
                    "alphaDegrees", lineT, valid);
            printCSVValue(theta, experimentalSig, "theta", lineT, valid);
            printCSVValue(Vh, experimentalSig, "Vh", lineT, valid);
            printCSVValue(gX, experimentalSig, "gX", lineT, valid);
            printCSVValue(gY, experimentalSig, "gY", lineT, valid);
            printCSVValue(wX, experimentalSig, "wX", lineT, valid);
            printCSVValue(wY, experimentalSig, "wY", lineT, valid);
            printCSVValue(windHeading, windHeadingSig, "", lineT, valid);
            printCSVValue(windMag, windMagSig, "", lineT, valid);
            printCSVValue(windMag2, windMagSig, "2", lineT, valid);
        } catch (Exception e) {
            DatConLog.Exception(e);
        }
    }
}
