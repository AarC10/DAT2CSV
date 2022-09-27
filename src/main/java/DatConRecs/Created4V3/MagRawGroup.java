package DatConRecs.Created4V3;

import DatConRecs.Payload;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Persist;
import files.Signal;
import files.Units;

public class MagRawGroup extends Record {

    public short magX = 0;

    public short magY = 0;

    public short magZ = 0;

    public boolean valid;

    private int index;

    public MagRawGroup(ConvertDat convertDat, int id, int length, int index) {
        super(convertDat, id, length);
        this.index = index;
        magRawSig = Signal.SeriesFloat("Mag" + "(" + index + ")",
                "Magnetometer", null, Units.aTesla);
    }

    protected Signal magRawSig = null;

    public void process(Payload record) {
        super.process(record);
        try {
            magX = payloadBB.getShort(0);
            magY = payloadBB.getShort(2);
            magZ = payloadBB.getShort(4);
            valid = true;
        } catch (Exception e) {
            RecordException(e);
        }
    }

    @Override
    public void printCols(lineType lineT) {
        if (Persist.magCalcs) {
            try {
                float magMod = (int) Math
                        .sqrt(magX * magX + magY * magY + magZ * magZ);
                printCSVValue(magX, magRawSig, "rawX", lineT, valid);
                printCSVValue(magY, magRawSig, "rawY", lineT, valid);
                printCSVValue(magZ, magRawSig, "rawZ", lineT, valid);
                printCSVValue(magMod, magRawSig, "rawMod", lineT, valid);
                //            printCsvValue(magYaw, AxesAndSigs.magYawSig, "(" + index + ")",
                //                    lineT, valid);
            } catch (Exception e) {
                DatConLog.Exception(e);
            }
        }
    }
}
