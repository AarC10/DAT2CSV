package DatConRecs.Created4V3;

import DatConRecs.BattInfo;
import DatConRecs.Payload;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;

public class BattInfo_38_1710 extends BattInfo {
    protected boolean valid = false;

    protected float Vol = (float) 0;

    protected float Current = (float) 0;

    protected int R_time = (int) 0;

    protected float CellVol = 0.0f;

    protected float LowVolThreshold = (float) 0;

    protected float BatVol = 0.0f;

    protected float BatCurrent = 0.0f;

    protected int BatCap = (int) 0;

    protected short CapPercnt = (short) 0;

    protected float BatTemp = 0.0f;

    protected short BatAuth = (short) 0;

    protected long BatDataCnt = (long) 0;

    protected long FullCap = (long) 0;

    public BattInfo_38_1710(ConvertDat convertDat) {
        super(convertDat, 1710, 38);
    }

    @Override
    public void process(Payload record) {
        super.process(record);
        try {
            this.valid = true;
            Vol = record.getFloat(0);
            Current = (float) (((float) (record.getFloat(4))) / 1000.0);
            R_time = record.getUnsignedShort(8);
            CellVol = (float) (((float) (record.getUnsignedShort(10)))
                    / 1000.0);
            LowVolThreshold = record.getFloat(12);
            BatVol = (float) (((float) (record.getInt(16))) / 1000.0);
            BatCurrent = -(float) (((float) (record.getInt(20))) / 1000.0);
            BatCap = record.getUnsignedShort(24);
            CapPercnt = record.getUnsignedByte(26);
            BatTemp = (float) (((float) (record.getShort(27))) / 10.0);
            BatAuth = record.getUnsignedByte(29);
            BatDataCnt = record.getUnsignedInt(30);
            FullCap = record.getUnsignedInt(34);
        } catch (Exception e) {
            RecordException(e);
        }
    }

    public void printCols(lineType lineT) {
        try {

            printCSVValue(Vol, batteryInfoFloatSig, "Vol", lineT, valid);
            printCSVValue(Current, currentSig, "Current", lineT, valid);
            printCSVValue(R_time, battInfoRemainTimeSig, "remainingTime", lineT,
                    valid);
            printCSVValue(CellVol, cellVoltSig, "CellVol", lineT, valid);
            printCSVValue(LowVolThreshold, batteryInfoFloatSig,
                    "LowVolThreshold", lineT, valid);
            printCSVValue(BatVol, battVoltSig, "BatVol", lineT, valid);
            printCSVValue(BatCurrent, currentSig, "BatCurrent", lineT, valid);
            printCSVValue(BatCap, batteryCap, "FullChargeCap", lineT, valid);
            printCSVValue(CapPercnt, batteryCapPercent, "Remaining%", lineT,
                    valid);
            printCSVValue(BatTemp, batteryTempSig, "BatTemp", lineT, valid);
            //printCsvValue(BatAuth, battery_infoIntSig, "BatAuth", lineT, valid);
            printCSVValue(BatDataCnt, batteryInfoIntSig, "BatDataCnt", lineT,
                    valid);
            printCSVValue(FullCap, batteryCap, "OriginalCap", lineT, valid);
        } catch (Exception e) {
            DatConLog.Exception(e);
        }
    }

}
