package DatConRecs.FromViewer;

import java.nio.ByteBuffer;

import DatConRecs.*;
import DatConRecs.Record;
import DatConRecs.*;
import DatConRecs.Record;
import Files.ConvertDat;
import Files.ConvertDat.lineType;
import Files.DatConLog;

public class svn_info_65534 extends Record {

    ByteBuffer payload = null;

    protected String payloadString;

    public svn_info_65534(ConvertDat convertDat) {
        super(convertDat, 65534, -1);
    }

    @Override
    public void process(Payload _payload) {
        super.process(_payload);
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
