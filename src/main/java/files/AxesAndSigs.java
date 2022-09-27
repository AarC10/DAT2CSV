package files;

public class AxesAndSigs {

    public static Axis motorSpeedAxis = new Axis("motorSpeed", "Motor Speed",
            Units.rpm);

    public static Axis motorVoltsAxis = new Axis("motorVolts", "Motor Volts",
            Units.volts);

    public static Axis motorEscTempAxis = new Axis("motorESCTemp",
            "Motor ESC Temp", Units.degrees);

    public static Axis motorPWMAxis = new Axis("motorCommanded",
            "Motor Commanded", Units.percentage);

    public static Axis motorVoutAxis = new Axis("motorVout", "Motor Vout",
            Units.volts);

    public static Axis motorPPMrecvAxis = new Axis("motorPPMrecv",
            "Motor PPM recv");

    public static Axis motorPPMsendAxis = new Axis("motorPPMsend",
            "Motor PPM send");

    public static Axis motorCurrentAxis = new Axis("motorCurrent",
            "Motor Current");

    public static Axis motorWattsAxis = new Axis("motorWatts", "Motor Watts");

    public static Axis motorWattsSecsAxis = new Axis("motorWattsSecs",
            "Motor Watts Secs");

    public static Axis motorWattsSecsPerDistAxis = new Axis(
            "motorWattsSecs/Dist", "Motor Watts Secs / Dist");

    public static Axis motorWattsPerVelAxis = new Axis("motorWatts/Vel",
            "Motor Watts Per Vel");

    public static Axis motorStatusAxis = new Axis("motorStatus",
            "Motor Status");

    public static Axis cellVoltsAxis = new Axis("cellVolts", "Cell Volts",
            Units.volts);

    public static Axis gyroAxis = new Axis("gyro", "Gyro", Units.degreesPerSec);

    public static Axis accelAxis = new Axis("accel", "Accelerometer", Units.G);

    public static Axis controlAxis = new Axis("control", "Control",
            Units.controlStick);

    public static Signal motorSpeedSig = Signal.SeriesInt("Motor:Speed",
            "Motor Speed", motorSpeedAxis, Units.rpm);

    public static Signal motorVoltsSig = Signal.SeriesFloat("Motor:Volts",
            "motor Volts", motorVoltsAxis, Units.volts);

    public static Signal motorEscTempSig = Signal.SeriesInt("Motor:EscTemp",
            "Motor ESC Temp", motorEscTempAxis, Units.degrees);

    public static Signal motorStatusSig = Signal.SeriesInt("Motor:Status",
            "Motor Status", motorStatusAxis, Units.noUnits);

    public static Signal motorCtrlPWMSig = Signal.SeriesFloat("MotorCtrl:PWM",
            "Motor Commanded", motorPWMAxis, Units.percentage);

    public static Signal motorVoutSig = Signal.SeriesFloat("Motor:V_out",
            "Motor V out", motorVoutAxis, Units.volts);

    public static Signal motorPPMrecvSig = Signal.SeriesInt("Motor:PPMrecv",
            "Motor PPMrecv", motorPPMrecvAxis, Units.noUnits);

    public static Signal motorPPMsendSig = Signal.SeriesInt("Motor:PPMsend",
            "Motor PPM send", motorPPMsendAxis, Units.noUnits);

    public static Signal motorCurrentSig = Signal.SeriesFloat("Motor:Current",
            "Motor Load", motorCurrentAxis, Units.amps);

    public static Signal motorWattsSig = Signal.SeriesFloat("Motor:Watts",
            "Motor Load", motorWattsAxis, Units.watts);

    public static Signal thrustThetaSig = Signal.SeriesDouble(
            "Motor:thrustAngle", "Thrust angle computed from motor speeds",
            null, Units.degrees180);

    public static Signal battGoHome = Signal.SeriesInt("SMART_BATT:goHome%",
            "Smart Battery computed go home %", null, Units.percentage);

    public static Signal battLand = Signal.SeriesInt("SMART_BATT:land%",
            "Smart Battery computed land %", null, Units.percentage);

    public static Signal battGoHomeTime = Signal.SeriesInt(
            "SMART_BATT:goHomeTime", "Smart Battery computed go home time",
            null, Units.seconds);

    public static Signal battLandTime = Signal.SeriesInt("SMART_BATT:landTime",
            "Smart Battery computed land time", null, Units.seconds);

    public final static Signal magSig = Signal.SeriesFloat("Mag",
            "Magnetometer", null, Units.aTesla);


    public final static Signal magYawSig = Signal.SeriesDouble("magYaw:magYaw",
            "Yaw computed from magnetometers", null, Units.degrees180);

    public final static Signal magYawDiffSig = Signal.SeriesDouble(
            "magYaw:Yaw-magYaw", "Yaw magYaw diff", null, Units.degrees180);


    public static Signal throttleSig = Signal.SeriesInt("RC:Throttle",
            "Throttle", controlAxis, Units.controlStick);

    public static Signal rudderSig = Signal.SeriesInt("RC:Rudder", "Rudder",
            controlAxis, Units.controlStick);

    public static Signal elevatorSig = Signal.SeriesInt("RC:Elevator",
            "Elevator", controlAxis, Units.controlStick);

    public static Signal aileronSig = Signal.SeriesInt("RC:Aileron", "Aileron",
            controlAxis, Units.controlStick);

    public static Signal rthHeightSig = Signal.SeriesDouble("HP:rthHeight",
            "Return To Home Height", null, Units.meters);

    public final static Signal hpLongitudeSig = Signal
            .SeriesDouble("HP:Longitude", "Longitude", null, Units.degrees180);

    public final static Signal hpLatitudeSig = Signal
            .SeriesDouble("HP:Latitude", "Longitude", null, Units.degrees180);

}
