package DatConRecs;

import java.nio.ByteBuffer;

import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;

public class svn_info_65534 extends Record {

    ByteBuffer payload = null;

    protected String payloadString;

    public svn_info_65534(ConvertDat convertDat) {
        super(convertDat, 65534, -1);
    }

    @Override
    public void process(Payload record) {
        super.process(record);
        try {
            payload = record.getBB();
            payloadString = record.getString();
            if (convertDat.cloPS != null) {
                if (payloadString.length() > 0) {
                    convertDat.cloPS.println(record.getCleanString());
                }
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
