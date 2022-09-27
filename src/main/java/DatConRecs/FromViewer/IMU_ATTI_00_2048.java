package DatConRecs.FromViewer;

import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;

public class IMU_ATTI_00_2048 extends Record {
    protected boolean valid = false;

    protected double longti_00 = (double) 0;

    protected double lati_00 = (double) 0;

    protected float alti_00 = (float) 0;

    protected float acc_x_00 = (float) 0;

    protected float acc_y_00 = (float) 0;

    protected float acc_z_00 = (float) 0;

    protected float gyro_x_00 = (float) 0;

    protected float gyro_y_00 = (float) 0;

    protected float gyro_z_00 = (float) 0;

    protected float press_00 = (float) 0;

    protected float q0_00 = (float) 0;

    protected float q1_00 = (float) 0;

    protected float q2_00 = (float) 0;

    protected float q3_00 = (float) 0;

    protected float ag_x_00 = (float) 0;

    protected float ag_y_00 = (float) 0;

    protected float ag_z_00 = (float) 0;

    protected float vg_x_00 = (float) 0;

    protected float vg_y_00 = (float) 0;

    protected float vg_z_00 = (float) 0;

    protected float gb_x_00 = (float) 0;

    protected float gb_y_00 = (float) 0;

    protected float gb_z_00 = (float) 0;

    protected short m_x_00 = (short) 0;

    protected short m_y_00 = (short) 0;

    protected short m_z_00 = (short) 0;

    protected short temp_x_00 = (short) 0;

    protected short temp_y_00 = (short) 0;

    protected short temp_z_00 = (short) 0;

    protected int sensor_monitor_00 = (int) 0;

    protected int filter_status_00 = (int) 0;

    protected int svn_00 = (int) 0;

    protected int cnt_atti_00 = (int) 0;

    public IMU_ATTI_00_2048(ConvertDat convertDat) {
        super(convertDat, 2048, 120);
    }

    @Override
    public void process(Payload record) {
        super.process(record);
        try {
            valid = true;

            longti_00 = record.getDouble(0);
            lati_00 = record.getDouble(8);
            alti_00 = record.getFloat(16);
            acc_x_00 = record.getFloat(20);
            acc_y_00 = record.getFloat(24);
            acc_z_00 = record.getFloat(28);
            gyro_x_00 = record.getFloat(32);
            gyro_y_00 = record.getFloat(36);
            gyro_z_00 = record.getFloat(40);
            press_00 = record.getFloat(44);
            q0_00 = record.getFloat(48);
            q1_00 = record.getFloat(52);
            q2_00 = record.getFloat(56);
            q3_00 = record.getFloat(60);
            ag_x_00 = record.getFloat(64);
            ag_y_00 = record.getFloat(68);
            ag_z_00 = record.getFloat(72);
            vg_x_00 = record.getFloat(76);
            vg_y_00 = record.getFloat(80);
            vg_z_00 = record.getFloat(84);
            gb_x_00 = record.getFloat(88);
            gb_y_00 = record.getFloat(92);
            gb_z_00 = record.getFloat(96);
            m_x_00 = record.getShort(100);
            m_y_00 = record.getShort(102);
            m_z_00 = record.getShort(104);
            temp_x_00 = record.getShort(106);
            temp_y_00 = record.getShort(108);
            temp_z_00 = record.getShort(110);
            sensor_monitor_00 = record.getUnsignedShort(112);
            filter_status_00 = record.getUnsignedShort(114);
            svn_00 = record.getUnsignedShort(116);
            cnt_atti_00 = record.getUnsignedShort(118);
        } catch (Exception e) {
            RecordException(e);
        }
    }

    protected static Signal IMU_ATTI_00IntSig = Signal.SeriesInt("IMU_ATTI_00",
            "", null, Units.noUnits);

    protected static Signal IMU_ATTI_00FloatSig = Signal
            .SeriesFloat("IMU_ATTI_00", "", null, Units.noUnits);

    protected static Signal IMU_ATTI_00DoubleSig = Signal
            .SeriesDouble("IMU_ATTI_00", "", null, Units.noUnits);

    public void printCols(lineType lineT) {
        try {

            printCSVValue(longti_00, IMU_ATTI_00DoubleSig, "longti_00", lineT,
                    valid);
            printCSVValue(lati_00, IMU_ATTI_00DoubleSig, "lati_00", lineT,
                    valid);
            printCSVValue(alti_00, IMU_ATTI_00FloatSig, "alti_00", lineT,
                    valid);
            printCSVValue(acc_x_00, IMU_ATTI_00FloatSig, "acc_x_00", lineT,
                    valid);
            printCSVValue(acc_y_00, IMU_ATTI_00FloatSig, "acc_y_00", lineT,
                    valid);
            printCSVValue(acc_z_00, IMU_ATTI_00FloatSig, "acc_z_00", lineT,
                    valid);
            printCSVValue(gyro_x_00, IMU_ATTI_00FloatSig, "gyro_x_00", lineT,
                    valid);
            printCSVValue(gyro_y_00, IMU_ATTI_00FloatSig, "gyro_y_00", lineT,
                    valid);
            printCSVValue(gyro_z_00, IMU_ATTI_00FloatSig, "gyro_z_00", lineT,
                    valid);
            printCSVValue(press_00, IMU_ATTI_00FloatSig, "press_00", lineT,
                    valid);
            printCSVValue(q0_00, IMU_ATTI_00FloatSig, "q0_00", lineT, valid);
            printCSVValue(q1_00, IMU_ATTI_00FloatSig, "q1_00", lineT, valid);
            printCSVValue(q2_00, IMU_ATTI_00FloatSig, "q2_00", lineT, valid);
            printCSVValue(q3_00, IMU_ATTI_00FloatSig, "q3_00", lineT, valid);
            printCSVValue(ag_x_00, IMU_ATTI_00FloatSig, "ag_x_00", lineT,
                    valid);
            printCSVValue(ag_y_00, IMU_ATTI_00FloatSig, "ag_y_00", lineT,
                    valid);
            printCSVValue(ag_z_00, IMU_ATTI_00FloatSig, "ag_z_00", lineT,
                    valid);
            printCSVValue(vg_x_00, IMU_ATTI_00FloatSig, "vg_x_00", lineT,
                    valid);
            printCSVValue(vg_y_00, IMU_ATTI_00FloatSig, "vg_y_00", lineT,
                    valid);
            printCSVValue(vg_z_00, IMU_ATTI_00FloatSig, "vg_z_00", lineT,
                    valid);
            printCSVValue(gb_x_00, IMU_ATTI_00FloatSig, "gb_x_00", lineT,
                    valid);
            printCSVValue(gb_y_00, IMU_ATTI_00FloatSig, "gb_y_00", lineT,
                    valid);
            printCSVValue(gb_z_00, IMU_ATTI_00FloatSig, "gb_z_00", lineT,
                    valid);
            printCSVValue(m_x_00, IMU_ATTI_00IntSig, "m_x_00", lineT, valid);
            printCSVValue(m_y_00, IMU_ATTI_00IntSig, "m_y_00", lineT, valid);
            printCSVValue(m_z_00, IMU_ATTI_00IntSig, "m_z_00", lineT, valid);
            printCSVValue(temp_x_00, IMU_ATTI_00IntSig, "temp_x_00", lineT,
                    valid);
            printCSVValue(temp_y_00, IMU_ATTI_00IntSig, "temp_y_00", lineT,
                    valid);
            printCSVValue(temp_z_00, IMU_ATTI_00IntSig, "temp_z_00", lineT,
                    valid);
            printCSVValue(sensor_monitor_00, IMU_ATTI_00IntSig,
                    "sensor_monitor_00", lineT, valid);
            printCSVValue(filter_status_00, IMU_ATTI_00IntSig,
                    "filter_status_00", lineT, valid);
            printCSVValue(svn_00, IMU_ATTI_00IntSig, "svn_00", lineT, valid);
            printCSVValue(cnt_atti_00, IMU_ATTI_00IntSig, "cnt_atti_00", lineT,
                    valid);
        } catch (Exception e) {
            DatConLog.Exception(e);
        }
    }

}
