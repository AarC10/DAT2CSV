package DatConRecs.FromViewer;

import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Persist;

public class console_52719 extends Record {
    String text = "";

    public console_52719(ConvertDat convertDat) {
        super(convertDat, 52719, -1);
    }

    @Override
    public void process(Payload record) {
        super.process(record);
        try {
            String payloadString = record.getString();
            if (Persist.EXPERIMENTAL_DEV) {
                System.out.println("console_52719 " + payloadString);
            }
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
