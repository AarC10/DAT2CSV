package DatConRecs.Created4V3;

import DatConRecs.*;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;

public class BatBox32_500X extends RecBatt {
    protected boolean valid = false;

    protected int time = 0;

    protected short rec_data = (short) 0;

    protected short proCurr = (short) 0;

    protected short current = (short) 0;

    protected short temp1 = (short) 0;

    protected short temp2 = (short) 0;

    protected int flag = 0;

    protected long userDef = 0;


    public BatBox32_500X(ConvertDat convertDat, int id, int index) {
        super(convertDat, id, 32, index);
        batBoxIntSig = Signal.SeriesInt("Battery", index, "", null,
                Units.noUnits);

    }

    @Override
    public void process(Payload record) {
        super.process(record);
        try {
            valid = true;

            time = record.getInt(0);
            rec_data = record.getUnsignedByte(4);
            batteryPercent = payloadBB.get(5);
            for (int i = 0; i < numCells; i++) {
                volt[i] = (float) (((float) (payloadBB.getShort(6 + (2 * i))))
                        / 1000.0);
            }

            proCurr = record.getShort(18);
            current = record.getShort(20);
            totalVolts = payloadBB.getInt(22) / 1000.0;
            temp1 = record.getUnsignedByte(24);
            temp2 = record.getUnsignedByte(25);
            flag = record.getUnsignedShort(26);
            userDef = record.getUnsignedInt(28);
        } catch (Exception e) {
            RecordException(e);
        }
    }

    protected Signal batBoxIntSig = null;

    @Override
    public void printCols(lineType lineT) {

        try {
            for (int i = 1; i <= datFile.getNumBattCells(); i++) {
                printCSVValue(volt[i - 1], cellVoltSig, "cellVolts" + i, lineT,
                        valid);
            }
            printCSVValue(crrnt, currentSig, "current", lineT, valid);
            printCSVValue(totalVolts, voltsSig, "totalVolts", lineT, valid);
            printCSVValue(batteryPercent, battPercent, "battery%", lineT,
                    valid);
            printComputedBattCols(lineT);
            printCSVValue(time, batBoxIntSig, "time", lineT, valid);
            printCSVValue(rec_data, batBoxIntSig, "rec_data", lineT, valid);

            printCSVValue(proCurr, batBoxIntSig, "pro_curr", lineT, valid);
            printCSVValue(current, batBoxIntSig, "current", lineT, valid);
            printCSVValue(temp1, batBoxIntSig, "temp1", lineT, valid);
            printCSVValue(temp2, batBoxIntSig, "temp2", lineT, valid);
            printCSVValue(flag, batBoxIntSig, "flag", lineT, valid);
        } catch (Exception e) {
            DatConLog.Exception(e);
        }
    }

}
