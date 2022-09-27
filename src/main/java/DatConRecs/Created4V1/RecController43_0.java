
package DatConRecs.Created4V1;

import DatConRecs.Payload;
import DatConRecs.Record;
import files.AxesAndSigs;
import files.ConvertDat;
import files.DatConLog;
import files.ConvertDat.lineType;

public class RecController43_0 extends Record {
    
    public static RecController43_0 current = null;

    public short aileron = 0;

    public short elevator = 0;

    public short throttle = 0;

    public short rudder = 0;

    public boolean sticksValid = false;

    public RecController43_0(ConvertDat convertDat) {
        super(convertDat, 0, 43);
    }

    @Override
    public void process(Payload record) {
        super.process(record);
        try {
            aileron = payloadBB.getShort(4);
            elevator = payloadBB.getShort(6);
            throttle = payloadBB.getShort(8);
            rudder = payloadBB.getShort(10);
            sticksValid = true;
        } catch (Exception e) {
            RecordException(e);
        }
    }

    @Override
    public void printCols(lineType lineT) {
        try {
            printCSVValue(aileron, AxesAndSigs.aileronSig, "", lineT,
                    sticksValid);
            printCSVValue(elevator, AxesAndSigs.elevatorSig, "", lineT,
                    sticksValid);
            printCSVValue(rudder, AxesAndSigs.rudderSig, "", lineT,
                    sticksValid);
            printCSVValue(throttle, AxesAndSigs.throttleSig, "", lineT,
                    sticksValid);
        } catch (Exception e) {
            DatConLog.Exception(e);
        }
    }
}
