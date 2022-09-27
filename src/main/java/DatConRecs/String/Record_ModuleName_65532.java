
package DatConRecs.String;

import DatConRecs.Payload;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Persist;

public class Record_ModuleName_65532 extends Record {

    public static Record_ModuleName_65532 current = null;

    String payloadString = "";

    public Record_ModuleName_65532(ConvertDat convertDat) {
        super(convertDat, 65532, -1);
    }

    @Override
    public void process(Payload record) {
        super.process(record);
        try{
        if (Persist.EXPERIMENTAL_DEV) {
            payloadString = record.getString();
            System.out.println("Record_ModuleName_65532 " + payloadString);
        }
        } catch (Exception e) {
            RecordException(e);
        }
    }

    @Override
    public void printCols(lineType lineT) {
        try {

        } catch (Exception e) {
            DatConLog.Exception(e);
        }
    }

}
