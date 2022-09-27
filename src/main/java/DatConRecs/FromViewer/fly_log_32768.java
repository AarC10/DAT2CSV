package DatConRecs.FromViewer;

import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;

public class fly_log_32768 extends Record {
    String text = "";

    public fly_log_32768(ConvertDat convertDat) {
        super(convertDat, 32768, -1);
        setRecType(RecType.STRING);
    }

    @Override
    public void process(Payload record) {
        super.process(record);
        try {
        } catch (Exception e) {
            RecordException(e);
        }
    }

    public void printCols(lineType lineT) {
        try {

        } catch (Exception e) {
            DatConLog.Exception(e);
        }
    }

}
