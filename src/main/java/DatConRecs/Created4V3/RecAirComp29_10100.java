/* Record68_17 class

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
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Persist;
import files.Signal;
import files.Units;

public class RecAirComp29_10100 extends RecAirComp {

    private float windSpeed = 0.0f;

    private float windX = 0.0f;

    private float windY = 0.0f;

    private float motorSpeed = 0.0f;

    public RecAirComp29_10100(ConvertDat convertDat) {
        super(convertDat, 10100, 29);
    }

    public void process(Payload record) {
        super.process(record);
        try {
            valid = true;
            vbx = payloadBB.getFloat(0);
            vby = payloadBB.getFloat(4);
            compAlti = payloadBB.getFloat(8);
            windSpeed = payloadBB.getFloat(12);
            windX = payloadBB.getFloat(16);
            windY = payloadBB.getFloat(20);
            motorSpeed = payloadBB.getFloat(24);
            velLevel = (short) (0xff & payloadBB.get(26));
            if (Persist.EXPERIMENTAL_FIELDS) {
                super.windComps();
            }
        } catch (Exception e) {
            RecordException(e);
        }
    }

    public static Signal windSpeedSig = Signal.SeriesFloat("AirComp:WindSpeed",
            "AirComp WindSpeed", null, Units.metersPerSec);

    public static Signal windSig = Signal.SeriesFloat("AirComp:Wind",
            "AirComp Wind", null, Units.metersPerSec);

    public static Signal motorSpeedSig = Signal.SeriesFloat(
            "AirComp:MotorSpeed", "AirComp Motor Speed", null, Units.rpm);

    @Override
    public void printCols(lineType lineT) {
        try {
            printCSVValue(vbx, vbSig, "X", lineT, valid);
            printCSVValue(vby, vbSig, "Y", lineT, valid);
            printCSVValue(compAlti, compAltiSig, "", lineT, valid);
            printCSVValue(windSpeed, windSpeedSig, "", lineT, valid);
            printCSVValue(windX, windSig, "X", lineT, valid);
            printCSVValue(windY, windSig, "Y", lineT, valid);
            printCSVValue(motorSpeed, motorSpeedSig, "", lineT, valid);
            printCSVValue(velLevel, velLevelSig, "", lineT, valid);
            if (Persist.EXPERIMENTAL_FIELDS) {
                super.printWindComps(lineT);
            }
        } catch (Exception e) {
            DatConLog.Exception(e);
        }
    }
}
