package DatConRecs.FromOtherV3Dats;

import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;

public class serial_api_inputs_1002 extends Record {
    protected boolean valid = false;

    protected short sdk_ctrl_F = (short) 0;

    protected short sdk_roll_x = (short) 0;

    protected short sdk_pitch_y = (short) 0;

    protected short sdk_thr_z = (short) 0;

    protected short sdk_yaw = (short) 0;

    protected short sdk_fdfd_x = (short) 0;

    protected short sdk_fdfd_y = (short) 0;

    protected short ctrl_dev = (short) 0;

    protected short sub_mode = (short) 0;

    protected short open_req = (short) 0;

    protected short open_ack = (short) 0;

    protected short cmd_req = (short) 0;

    protected short cmd_ack = (short) 0;

    protected short avoid_E = (short) 0;

    protected short bit_S = (short) 0;

    protected short fact_cnt = (short) 0;

    protected short f_test = (short) 0;

    public serial_api_inputs_1002(ConvertDat convertDat) {
        super(convertDat, 1002, 23);
    }

    @Override
    public void process(Payload record) {
        super.process(record);
        try {
            valid = true;

            sdk_ctrl_F = record.getUnsignedByte(0);
            sdk_roll_x = record.getShort(1);
            sdk_pitch_y = record.getShort(3);
            sdk_thr_z = record.getShort(5);
            sdk_yaw = record.getShort(7);
            sdk_fdfd_x = record.getShort(9);
            sdk_fdfd_y = record.getShort(11);
            ctrl_dev = record.getUnsignedByte(13);
            sub_mode = record.getUnsignedByte(14);
            open_req = record.getUnsignedByte(15);
            open_ack = record.getUnsignedByte(16);
            cmd_req = record.getUnsignedByte(17);
            cmd_ack = record.getUnsignedByte(18);
            avoid_E = record.getUnsignedByte(19);
            bit_S = record.getUnsignedByte(20);
            fact_cnt = record.getUnsignedByte(21);
            f_test = record.getUnsignedByte(22);
        } catch (Exception e) {
            RecordException(e);
        }
    }

    protected static Signal serial_api_inputsIntSig = Signal
            .SeriesInt("serial_api_inputs", "", null, Units.noUnits);

    protected static Signal serial_api_inputsFloatSig = Signal
            .SeriesFloat("serial_api_inputs", "", null, Units.noUnits);

    protected static Signal serial_api_inputsDoubleSig = Signal
            .SeriesDouble("serial_api_inputs", "", null, Units.noUnits);

    public void printCols(lineType lineT) {
        try {

            printCSVValue(sdk_ctrl_F, serial_api_inputsIntSig, "sdk_ctrl_F",
                    lineT, valid);
            printCSVValue(sdk_roll_x, serial_api_inputsIntSig, "sdk_roll_x",
                    lineT, valid);
            printCSVValue(sdk_pitch_y, serial_api_inputsIntSig, "sdk_pitch_y",
                    lineT, valid);
            printCSVValue(sdk_thr_z, serial_api_inputsIntSig, "sdk_thr_z",
                    lineT, valid);
            printCSVValue(sdk_yaw, serial_api_inputsIntSig, "sdk_yaw", lineT,
                    valid);
            printCSVValue(sdk_fdfd_x, serial_api_inputsIntSig, "sdk_fdfd_x",
                    lineT, valid);
            printCSVValue(sdk_fdfd_y, serial_api_inputsIntSig, "sdk_fdfd_y",
                    lineT, valid);
            printCSVValue(ctrl_dev, serial_api_inputsIntSig, "ctrl_dev", lineT,
                    valid);
            printCSVValue(sub_mode, serial_api_inputsIntSig, "sub_mode", lineT,
                    valid);
            printCSVValue(open_req, serial_api_inputsIntSig, "open_req", lineT,
                    valid);
            printCSVValue(open_ack, serial_api_inputsIntSig, "open_ack", lineT,
                    valid);
            printCSVValue(cmd_req, serial_api_inputsIntSig, "cmd_req", lineT,
                    valid);
            printCSVValue(cmd_ack, serial_api_inputsIntSig, "cmd_ack", lineT,
                    valid);
            printCSVValue(avoid_E, serial_api_inputsIntSig, "avoid_E", lineT,
                    valid);
            printCSVValue(bit_S, serial_api_inputsIntSig, "bit_S", lineT,
                    valid);
            printCSVValue(fact_cnt, serial_api_inputsIntSig, "fact_cnt", lineT,
                    valid);
            printCSVValue(f_test, serial_api_inputsIntSig, "f_test", lineT,
                    valid);
        } catch (Exception e) {
            DatConLog.Exception(e);
        }
    }

}
