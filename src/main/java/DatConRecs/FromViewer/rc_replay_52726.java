package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class rc_replay_52726 extends Record {
protected boolean valid = false;

protected short CMD_ALIERON = (short)0;
protected short CMD_ELEVATOR = (short)0;
protected short CMD_THROTTLE = (short)0;
protected short CMD_RUDDER = (short)0;
protected short CMD_MODE = (short)0;
protected short CMD_IOC = (short)0;
protected short CMD_GO_HOME = (short)0;
protected short CMD_D4 = (short)0;

      public rc_replay_52726(ConvertDat convertDat) {
           super(convertDat, 52726, 16);
       }

@Override
  public void process(Payload _payload) {
      super.process(_payload);
        try {
      valid = true;

 CMD_ALIERON = _payload.getShort(0);
 CMD_ELEVATOR = _payload.getShort(2);
 CMD_THROTTLE = _payload.getShort(4);
 CMD_RUDDER = _payload.getShort(6);
 CMD_MODE = _payload.getShort(8);
 CMD_IOC = _payload.getShort(10);
 CMD_GO_HOME = _payload.getShort(12);
 CMD_D4 = _payload.getShort(14);
} catch (Exception e) {RecordException(e);}}


    protected static Signal rc_replayIntSig = Signal
.SeriesInt("rc_replay", "", null, Units.noUnits);
    protected static Signal rc_replayFloatSig = Signal
.SeriesFloat("rc_replay", "", null, Units.noUnits);
    protected static Signal rc_replayDoubleSig = Signal
.SeriesDouble("rc_replay", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(CMD_ALIERON, rc_replayIntSig, "CMD_ALIERON",lineT, valid);
 printCSVValue(CMD_ELEVATOR, rc_replayIntSig, "CMD_ELEVATOR",lineT, valid);
 printCSVValue(CMD_THROTTLE, rc_replayIntSig, "CMD_THROTTLE",lineT, valid);
 printCSVValue(CMD_RUDDER, rc_replayIntSig, "CMD_RUDDER",lineT, valid);
 printCSVValue(CMD_MODE, rc_replayIntSig, "CMD_MODE",lineT, valid);
 printCSVValue(CMD_IOC, rc_replayIntSig, "CMD_IOC",lineT, valid);
 printCSVValue(CMD_GO_HOME, rc_replayIntSig, "CMD_GO_HOME",lineT, valid);
 printCSVValue(CMD_D4, rc_replayIntSig, "CMD_D4",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
