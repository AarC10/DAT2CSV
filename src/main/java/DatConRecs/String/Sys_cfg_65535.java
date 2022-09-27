package DatConRecs.String;

import java.nio.ByteBuffer;

import DatConRecs.Payload;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;

public class Sys_cfg_65535 extends Record {

    ByteBuffer payload = null;

    protected String payloadString;

    public Sys_cfg_65535(ConvertDat convertDat) {
        super(convertDat, 65535, -1);
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
