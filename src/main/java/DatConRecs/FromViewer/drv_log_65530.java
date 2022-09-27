package DatConRecs.FromViewer;

import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;

public class drv_log_65530 extends Record {
    String text = "";

    public drv_log_65530(ConvertDat convertDat) {
        super(convertDat, 65530, -1);
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
