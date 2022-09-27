package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class fmu_device_run_time_41 extends Record {
protected boolean valid = false;

protected long battery = (long)0;
protected long led = (long)0;
protected long baromter = (long)0;
protected long gyro_acc = (long)0;
protected long imu = (long)0;
protected long vo = (long)0;
protected long ultrasonic = (long)0;
protected long pmu = (long)0;
protected long esc = (long)0;
protected long mc = (long)0;
protected long camera = (long)0;
protected long gps = (long)0;
protected long Compass = (long)0;
protected long gimbal = (long)0;
protected long rc = (long)0;
protected long gear = (long)0;

      public fmu_device_run_time_41(ConvertDat convertDat) {
           super(convertDat, 41, 64);
       }

@Override
  public void process(Payload _payload) {
      super.process(_payload);
        try {
      valid = true;

 battery = _payload.getUnsignedInt(0);
 led = _payload.getUnsignedInt(4);
 baromter = _payload.getUnsignedInt(8);
 gyro_acc = _payload.getUnsignedInt(12);
 imu = _payload.getUnsignedInt(16);
 vo = _payload.getUnsignedInt(20);
 ultrasonic = _payload.getUnsignedInt(24);
 pmu = _payload.getUnsignedInt(28);
 esc = _payload.getUnsignedInt(32);
 mc = _payload.getUnsignedInt(36);
 camera = _payload.getUnsignedInt(40);
 gps = _payload.getUnsignedInt(44);
 Compass = _payload.getUnsignedInt(48);
 gimbal = _payload.getUnsignedInt(52);
 rc = _payload.getUnsignedInt(56);
 gear = _payload.getUnsignedInt(60);
} catch (Exception e) {RecordException(e);}}


    protected static Signal fmu_device_run_timeIntSig = Signal
.SeriesInt("fmu_device_run_time", "", null, Units.noUnits);
    protected static Signal fmu_device_run_timeFloatSig = Signal
.SeriesFloat("fmu_device_run_time", "", null, Units.noUnits);
    protected static Signal fmu_device_run_timeDoubleSig = Signal
.SeriesDouble("fmu_device_run_time", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(battery, fmu_device_run_timeIntSig, "battery",lineT, valid);
 printCSVValue(led, fmu_device_run_timeIntSig, "led",lineT, valid);
 printCSVValue(baromter, fmu_device_run_timeIntSig, "baromter",lineT, valid);
 printCSVValue(gyro_acc, fmu_device_run_timeIntSig, "gyro_acc",lineT, valid);
 printCSVValue(imu, fmu_device_run_timeIntSig, "imu",lineT, valid);
 printCSVValue(vo, fmu_device_run_timeIntSig, "vo",lineT, valid);
 printCSVValue(ultrasonic, fmu_device_run_timeIntSig, "ultrasonic",lineT, valid);
 printCSVValue(pmu, fmu_device_run_timeIntSig, "pmu",lineT, valid);
 printCSVValue(esc, fmu_device_run_timeIntSig, "esc",lineT, valid);
 printCSVValue(mc, fmu_device_run_timeIntSig, "mc",lineT, valid);
 printCSVValue(camera, fmu_device_run_timeIntSig, "camera",lineT, valid);
 printCSVValue(gps, fmu_device_run_timeIntSig, "gps",lineT, valid);
 printCSVValue(Compass, fmu_device_run_timeIntSig, "Compass",lineT, valid);
 printCSVValue(gimbal, fmu_device_run_timeIntSig, "gimbal",lineT, valid);
 printCSVValue(rc, fmu_device_run_timeIntSig, "rc",lineT, valid);
 printCSVValue(gear, fmu_device_run_timeIntSig, "gear",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
