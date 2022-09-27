
package DatConRecs.Created4V3;

import DatConRecs.Payload;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;

public class RecAirComp21_10100 extends RecAirComp {

    private float velNorm;

    private short velLevel1Time;

    private short velLevel2Time;

    public RecAirComp21_10100(ConvertDat convertDat) {
        super(convertDat, 10100, 21);
    }

    public void process(Payload record) {
        super.process(record);
        valid = true;
        vbx = payloadBB.getFloat(0);
        vby = payloadBB.getFloat(4);
        compAlti = payloadBB.getFloat(8);
        velNorm = payloadBB.getFloat(12);
        velLevel1Time = (short) (payloadBB.getShort(16));
        velLevel2Time = (short) (payloadBB.getShort(18));
        velLevel = (short) (payloadBB.get(20));
    }

    //    public static Signal velNormSig = Signal.SeriesFloat("AirComp:VelNorm",
    //            "AirComp Velocity Norm", null, Units.noUnits);
    //
    //    public static Signal velLevelTimeSig = Signal.SeriesInt("AirComp:VelTime",
    //            "AirComp Velocity Time", null, Units.noUnits);

    @Override
    public void printCols(lineType lineT) {
        try {
            printCSVValue(vbx, vbSig, "X", lineT, valid);
            printCSVValue(vby, vbSig, "Y", lineT, valid);
            printCSVValue(compAlti, compAltiSig, "", lineT, valid);
            printCSVValue(velNorm, velNormSig, "", lineT, valid);
            printCSVValue(velLevel1Time, velLevelTimeSig, "1", lineT, valid);
            printCSVValue(velLevel2Time, velLevelTimeSig, "2", lineT, valid);
            printCSVValue(velLevel, velLevelSig, "", lineT, valid);
        } catch (Exception e) {
            DatConLog.Exception(e);
        }
    }
    //    name        air_compensate_data
    //    type    10100
    //    Op.float        air_speed_est_vel_body_x 0
    //    Op.float        air_speed_est_vel_body_y 0
    //    Op.float        airspeed_comp_alti 0
    //    Op.float        air_speed_vel_norm 0
    //    Op.uint16_t     airspeed_level1_time 0
    //    Op.uint16_t     airspeed_level2_time 0
    //    Op.uint8_t      air_speed_vel_level 0

}
