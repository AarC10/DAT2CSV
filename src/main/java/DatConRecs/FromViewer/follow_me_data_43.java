package DatConRecs.FromViewer;

import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;

public class follow_me_data_43 extends Record {
    protected boolean valid = false;

    protected float heading_ref = (float) 0;

    protected float heading_error = (float) 0;

    protected float heading_rate = (float) 0;

    protected float ascending_tgt_height = (float) 0;

    protected float ascending_error = (float) 0;

    protected float ascending_vel = (float) 0;

    protected double phone_tagt_x = (double) 0;

    protected double phone_tagt_y = (double) 0;

    protected double quadrotor_cur_x = (double) 0;

    protected double quadrotor_cur_y = (double) 0;

    protected float quadrotor2phone_offset_x = (float) 0;

    protected float quadrotor2phone_offset_y = (float) 0;

    protected float quadrotor2phone_distance = (float) 0;

    protected float quadrotor2targetpoint_offset_x = (float) 0;

    protected float quadrotor2targetpoint_offset_y = (float) 0;

    protected float quadrotor2targetpoint_distance = (float) 0;

    protected float tagt_vel_x = (float) 0;

    protected float tagt_vel_y = (float) 0;

    protected float cur_vel_x = (float) 0;

    protected float cur_vel_y = (float) 0;

    protected float cruise_vel_x = (float) 0;

    protected float cruise_vel_y = (float) 0;

    protected float fixed_offset_x = (float) 0;

    protected float fixed_offset_y = (float) 0;

    protected float fixed_distance_offset = (float) 0;

    protected float dist_drone2drone = (float) 0;

    protected float dist_phone2phone = (float) 0;

    protected float gimbal_ptich_tgt = (float) 0;

    protected float gimbal_pitch_error = (float) 0;

    protected float gimbal_pitch_rate = (float) 0;

    protected short in_height_limit = (short) 0;

    protected short target_loss_count = (short) 0;

    protected short mission_status = (short) 0;

    public follow_me_data_43(ConvertDat convertDat) {
        super(convertDat, 43, 139);
    }

    @Override
    public void process(Payload record) {
        super.process(record);
        try {
            valid = true;

            heading_ref = record.getFloat(0);
            heading_error = record.getFloat(4);
            heading_rate = record.getFloat(8);
            ascending_tgt_height = record.getFloat(12);
            ascending_error = record.getFloat(16);
            ascending_vel = record.getFloat(20);
            phone_tagt_x = record.getDouble(24);
            phone_tagt_y = record.getDouble(32);
            quadrotor_cur_x = record.getDouble(40);
            quadrotor_cur_y = record.getDouble(48);
            quadrotor2phone_offset_x = record.getFloat(56);
            quadrotor2phone_offset_y = record.getFloat(60);
            quadrotor2phone_distance = record.getFloat(64);
            quadrotor2targetpoint_offset_x = record.getFloat(68);
            quadrotor2targetpoint_offset_y = record.getFloat(72);
            quadrotor2targetpoint_distance = record.getFloat(76);
            tagt_vel_x = record.getFloat(80);
            tagt_vel_y = record.getFloat(84);
            cur_vel_x = record.getFloat(88);
            cur_vel_y = record.getFloat(92);
            cruise_vel_x = record.getFloat(96);
            cruise_vel_y = record.getFloat(100);
            fixed_offset_x = record.getFloat(104);
            fixed_offset_y = record.getFloat(108);
            fixed_distance_offset = record.getFloat(112);
            dist_drone2drone = record.getFloat(116);
            dist_phone2phone = record.getFloat(120);
            gimbal_ptich_tgt = record.getFloat(124);
            gimbal_pitch_error = record.getFloat(128);
            gimbal_pitch_rate = record.getFloat(132);
            in_height_limit = record.getUnsignedByte(136);
            target_loss_count = record.getUnsignedByte(137);
            mission_status = record.getUnsignedByte(138);
        } catch (Exception e) {
            RecordException(e);
        }
    }

    protected static Signal follow_me_dataIntSig = Signal
            .SeriesInt("follow_me_data", "", null, Units.noUnits);

    protected static Signal follow_me_dataFloatSig = Signal
            .SeriesFloat("follow_me_data", "", null, Units.noUnits);

    protected static Signal follow_me_dataDoubleSig = Signal
            .SeriesDouble("follow_me_data", "", null, Units.noUnits);

    public void printCols(lineType lineT) {
        try {

            printCSVValue(heading_ref, follow_me_dataFloatSig, "heading_ref",
                    lineT, valid);
            printCSVValue(heading_error, follow_me_dataFloatSig,
                    "heading_error", lineT, valid);
            printCSVValue(heading_rate, follow_me_dataFloatSig, "heading_rate",
                    lineT, valid);
            printCSVValue(ascending_tgt_height, follow_me_dataFloatSig,
                    "ascending_tgt_height", lineT, valid);
            printCSVValue(ascending_error, follow_me_dataFloatSig,
                    "ascending_error", lineT, valid);
            printCSVValue(ascending_vel, follow_me_dataFloatSig,
                    "ascending_vel", lineT, valid);
            printCSVValue(phone_tagt_x, follow_me_dataDoubleSig, "phone_tagt_x",
                    lineT, valid);
            printCSVValue(phone_tagt_y, follow_me_dataDoubleSig, "phone_tagt_y",
                    lineT, valid);
            printCSVValue(quadrotor_cur_x, follow_me_dataDoubleSig,
                    "quadrotor_cur_x", lineT, valid);
            printCSVValue(quadrotor_cur_y, follow_me_dataDoubleSig,
                    "quadrotor_cur_y", lineT, valid);
            printCSVValue(quadrotor2phone_offset_x, follow_me_dataFloatSig,
                    "quadrotor2phone_offset_x", lineT, valid);
            printCSVValue(quadrotor2phone_offset_y, follow_me_dataFloatSig,
                    "quadrotor2phone_offset_y", lineT, valid);
            printCSVValue(quadrotor2phone_distance, follow_me_dataFloatSig,
                    "quadrotor2phone_distance", lineT, valid);
            printCSVValue(quadrotor2targetpoint_offset_x,
                    follow_me_dataFloatSig, "quadrotor2targetpoint_offset_x",
                    lineT, valid);
            printCSVValue(quadrotor2targetpoint_offset_y,
                    follow_me_dataFloatSig, "quadrotor2targetpoint_offset_y",
                    lineT, valid);
            printCSVValue(quadrotor2targetpoint_distance,
                    follow_me_dataFloatSig, "quadrotor2targetpoint_distance",
                    lineT, valid);
            printCSVValue(tagt_vel_x, follow_me_dataFloatSig, "tagt_vel_x",
                    lineT, valid);
            printCSVValue(tagt_vel_y, follow_me_dataFloatSig, "tagt_vel_y",
                    lineT, valid);
            printCSVValue(cur_vel_x, follow_me_dataFloatSig, "cur_vel_x", lineT,
                    valid);
            printCSVValue(cur_vel_y, follow_me_dataFloatSig, "cur_vel_y", lineT,
                    valid);
            printCSVValue(cruise_vel_x, follow_me_dataFloatSig, "cruise_vel_x",
                    lineT, valid);
            printCSVValue(cruise_vel_y, follow_me_dataFloatSig, "cruise_vel_y",
                    lineT, valid);
            printCSVValue(fixed_offset_x, follow_me_dataFloatSig,
                    "fixed_offset_x", lineT, valid);
            printCSVValue(fixed_offset_y, follow_me_dataFloatSig,
                    "fixed_offset_y", lineT, valid);
            printCSVValue(fixed_distance_offset, follow_me_dataFloatSig,
                    "fixed_distance_offset", lineT, valid);
            printCSVValue(dist_drone2drone, follow_me_dataFloatSig,
                    "dist_drone2drone", lineT, valid);
            printCSVValue(dist_phone2phone, follow_me_dataFloatSig,
                    "dist_phone2phone", lineT, valid);
            printCSVValue(gimbal_ptich_tgt, follow_me_dataFloatSig,
                    "gimbal_ptich_tgt", lineT, valid);
            printCSVValue(gimbal_pitch_error, follow_me_dataFloatSig,
                    "gimbal_pitch_error", lineT, valid);
            printCSVValue(gimbal_pitch_rate, follow_me_dataFloatSig,
                    "gimbal_pitch_rate", lineT, valid);
            printCSVValue(in_height_limit, follow_me_dataIntSig,
                    "in_height_limit", lineT, valid);
            printCSVValue(target_loss_count, follow_me_dataIntSig,
                    "target_loss_count", lineT, valid);
            printCSVValue(mission_status, follow_me_dataIntSig,
                    "mission_status", lineT, valid);
        } catch (Exception e) {
            DatConLog.Exception(e);
        }
    }

}
