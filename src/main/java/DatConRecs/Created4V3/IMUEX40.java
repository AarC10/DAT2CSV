package DatConRecs.Created4V3;

import DatConRecs.IMUEX;
import DatConRecs.Payload;
import files.ConvertDat;
import files.ConvertDat.lineType;

public class IMUEX40 extends IMUEX {

    public IMUEX40(ConvertDat convertDat, int id, int length, int index) {
        super(convertDat, id, length, index);
    }

    @Override
    public void process(Payload record) {
        super.process(record);
        try {
            valid = true;

            vo_vx = record.getFloat(0);
            vo_vy = record.getFloat(4);
            vo_vz = record.getFloat(8);
            vo_px = record.getFloat(12);
            vo_py = record.getFloat(16);
            vo_pz = record.getFloat(20);
            us_v = record.getFloat(24);
            us_p = record.getFloat(28);
            vo_flag_navi = record.getUnsignedShort(32);
            flag_err = record.getUnsignedShort(34);
            vo_flag_rsv = record.getUnsignedShort(36);
            ex_cnt = record.getUnsignedShort(38);
            errString = getErrString(flag_err);
        } catch (Exception e) {
            RecordException(e);
        }
    }

    public void printCols(lineType lineT) {
        super.printCols(lineT);
    }
}
