/* Record144_106 class

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that redistribution of source code include
the following disclaimer in the documentation and/or other materials provided
with the distribution.

THIS SOFTWARE IS PROVIDED BY ITS CREATOR "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE CREATOR OR CONTRIBUTORS BE LIABLE FOR
ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package DatConRecs.Created4V3;

import DatConRecs.Payload;
import DatConRecs.Record;
import files.ConvertDat;
import files.DatConLog;
import files.Signal;
import files.ConvertDat.lineType;

public class RecSVOAVOID15_1121 extends Record {
    protected boolean valid = false;

    protected short osd_avoid_obstacle_enable = (short) 0;

    protected short osd_user_avoid_enable = (short) 0;

    protected short osd_avoid_obstacle_work_flag = (short) 0;

    protected short osd_emergency_brake_work_flag = (short) 0;

    protected short go_home_avoid_enable = (short) 0;

    protected short avoid_ground_force_landing_flag = (short) 0;

    protected short radius_limit_work_flag = (short) 0;

    protected short airport_limit_work_flag = (short) 0;

    protected short avoid_obstacle_work_flag = (short) 0;

    protected short horiz_near_boundary_flag = (short) 0;

    protected short is_avoid_overshoot_act_flag = (short) 0;

    protected short vert_low_limit_work_flag = (short) 0;

    protected short vert_airport_limit_work_flag = (short) 0;

    protected short roof_limit_flag = (short) 0;

    protected short hit_ground_limit_work_flag = (short) 0;

    public RecSVOAVOID15_1121(ConvertDat convertDat) {
        super(convertDat, 1121, 15);
    }

    public void process(Payload record) {
        super.process(record);
        valid = true;

        osd_avoid_obstacle_enable = record.getUnsignedByte(0);
        osd_user_avoid_enable = record.getUnsignedByte(1);
        osd_avoid_obstacle_work_flag = record.getUnsignedByte(2);
        osd_emergency_brake_work_flag = record.getUnsignedByte(3);
        go_home_avoid_enable = record.getUnsignedByte(4);
        avoid_ground_force_landing_flag = record.getUnsignedByte(5);
        radius_limit_work_flag = record.getUnsignedByte(6);
        airport_limit_work_flag = record.getUnsignedByte(7);
        avoid_obstacle_work_flag = record.getUnsignedByte(8);
        horiz_near_boundary_flag = record.getUnsignedByte(9);
        is_avoid_overshoot_act_flag = record.getUnsignedByte(10);
        vert_low_limit_work_flag = record.getUnsignedByte(11);
        vert_airport_limit_work_flag = record.getUnsignedByte(12);
        roof_limit_flag = record.getUnsignedByte(13);
        hit_ground_limit_work_flag = record.getUnsignedByte(14);

        emergBrake = (osd_emergency_brake_work_flag == 1) ? "true" : "false";
        avoidObst = (osd_avoid_obstacle_work_flag == 1) ? "true" : "false";
        radiusLimit = (radius_limit_work_flag == 1) ? "true" : "false";
        airportLimit = (airport_limit_work_flag == 1) ? "true" : "false";
        groundForceLanding = (avoid_ground_force_landing_flag == 1) ? "true"
                : "false";
        horizNearBoundary = (horiz_near_boundary_flag == 1) ? "true" : "false";
        vertLowLimit = (vert_low_limit_work_flag == 1) ? "true" : "false";
        vertAirportLimit = (vert_airport_limit_work_flag == 1) ? "true"
                : "false";
        roofLimit = (roof_limit_flag == 1) ? "true" : "false";
        hitGroundLimit = (hit_ground_limit_work_flag == 1) ? "true" : "false";
    }

    public String avoidObst = "false";

    private static Signal avoidObstSig = Signal.State("OA:avoidObst",
            "Avoid Obstacle", "false");

    public String emergBrake = "false";

    private static Signal emergBrakeSig = Signal.State("OA:emergBrake",
            "Emergency Brake", "false");

    public String radiusLimit = "false";

    private static Signal radiusLimitSig = Signal.State("OA:radiusLimit",
            "Emergency Brake", "false");

    public String airportLimit = "false";

    private static Signal airportLimitSig = Signal.State("OA:airportLimit",
            "Emergency Brake", "false");

    public String groundForceLanding = "false";

    private static Signal groundForceLandingSig = Signal
            .State("OA:groundForceLanding", "Ground Force Landing", "false");

    public String horizNearBoundary = "false";

    private static Signal horizNearBoundarySig = Signal
            .State("OA:horizNearBoundary", "Horizontal Near Boundary", "false");

    public String vertLowLimit = "false";

    private static Signal vertLowLimitSig = Signal.State("OA:vertLowLimit",
            "Vertical Low Limit", "false");

    public String vertAirportLimit = "false";

    private static Signal vertAirportLimitSig = Signal
            .State("OA:vertAirportLimit", "Vertical Airport Limit", "false");

    public String roofLimit = "false";

    private static Signal roofLimitSig = Signal.State("OA:roofLimit",
            "Roof Limit", "false");

    public String hitGroundLimit = "false";

    private static Signal hitGroundLimitSig = Signal.State("OA:hitGroundLimit",
            "Hit Ground Limit", "false");

    @Override
    public void printCols(lineType lineT) {
        try {
            printCSVValue(avoidObst, avoidObstSig, "", lineT, valid);
            printCSVValue(emergBrake, emergBrakeSig, "", lineT, valid);
            printCSVValue(radiusLimit, radiusLimitSig, "", lineT, valid);
            printCSVValue(airportLimit, airportLimitSig, "", lineT, valid);
            printCSVValue(groundForceLanding, groundForceLandingSig, "", lineT,
                    valid);
            printCSVValue(horizNearBoundary, horizNearBoundarySig, "", lineT,
                    valid);
            printCSVValue(vertLowLimit, vertLowLimitSig, "", lineT, valid);
            printCSVValue(vertAirportLimit, vertAirportLimitSig, "", lineT,
                    valid);
            printCSVValue(roofLimit, roofLimitSig, "", lineT, valid);
            printCSVValue(hitGroundLimit, hitGroundLimitSig, "", lineT, valid);

        } catch (Exception e) {
            DatConLog.Exception(e);
        }
    }
}
