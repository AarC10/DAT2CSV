package DatConRecs.FromViewer;

import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;

public class ofdm_cnt_1999 extends Record {
    protected boolean valid = false;

    protected int recv_total = (int) 0;

    protected int header_error = (int) 0;

    protected int v1_error = (int) 0;

    protected int v0_error = (int) 0;

    protected int seccuss = (int) 0;

    public ofdm_cnt_1999(ConvertDat convertDat) {
        super(convertDat, 1999, 10);
    }

    @Override
    public void process(Payload record) {
        super.process(record);
        try {
            valid = true;

            recv_total = record.getUnsignedShort(0);
            header_error = record.getUnsignedShort(2);
            v1_error = record.getUnsignedShort(4);
            v0_error = record.getUnsignedShort(6);
            seccuss = record.getUnsignedShort(8);
        } catch (Exception e) {
            RecordException(e);
        }
    }

    protected static Signal ofdm_cntIntSig = Signal.SeriesInt("ofdm_cnt", "",
            null, Units.noUnits);

    protected static Signal ofdm_cntFloatSig = Signal.SeriesFloat("ofdm_cnt",
            "", null, Units.noUnits);

    protected static Signal ofdm_cntDoubleSig = Signal.SeriesDouble("ofdm_cnt",
            "", null, Units.noUnits);

    public void printCols(lineType lineT) {
        try {

            printCSVValue(recv_total, ofdm_cntIntSig, "recv_total", lineT,
                    valid);
            printCSVValue(header_error, ofdm_cntIntSig, "header_error", lineT,
                    valid);
            printCSVValue(v1_error, ofdm_cntIntSig, "v1_error", lineT, valid);
            printCSVValue(v0_error, ofdm_cntIntSig, "v0_error", lineT, valid);
            printCSVValue(seccuss, ofdm_cntIntSig, "seccuss", lineT, valid);
        } catch (Exception e) {
            DatConLog.Exception(e);
        }
    }

}
