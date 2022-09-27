package DatConRecs;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Vector;

import DatConRecs.Created4V1.RecBatt45_17;
import files.ConvertDat;
import files.DatConLog;
import files.Persist;
import files.RecClassSpec;
import files.RecSpec;

public class Dictionary {

    public static Vector<RecClassSpec> entries = new Vector<RecClassSpec>();

    static {
        entries.add(new RecClassSpec(GoTxt50_12.class, 12, 50, 52, 53, 55));
        entries.add(new RecClassSpec(RecBatt45_17.class, 17, 45));
        entries.add(new RecClassSpec(svnInfo65534.class, 65534, -1));
    }

    public static Vector<Integer> defaultOrder = new Vector<Integer>();

    static {
        defaultOrder.add(1);
        defaultOrder.add(2048);
        //GPS
        defaultOrder.add(2096);
        defaultOrder.add(2097);
        defaultOrder.add(2098);
        defaultOrder.add(5);
        //Controller
        defaultOrder.add(1000);
        defaultOrder.add(0);
        //RCStatus
        defaultOrder.add(1700);
        //MagGroup
        defaultOrder.add(2256);
        defaultOrder.add(2257);
        //MagRawGroup
        defaultOrder.add(20350);
        defaultOrder.add(20351);
        defaultOrder.add(20352);
        //HomePoint
        defaultOrder.add(13);
        //Battery
        defaultOrder.add(5000);
        defaultOrder.add(5001);
        defaultOrder.add(5003);
        defaultOrder.add(17);
        //BattStat
        defaultOrder.add(1711);
        //SmartBat
        defaultOrder.add(1712);
        defaultOrder.add(18);
        //front Distance
        //ObstAvoid
        defaultOrder.add(1121);
        defaultOrder.add(100);
        //Motor
        defaultOrder.add(10090);
        defaultOrder.add(52721);
        defaultOrder.add(52);
        // tablet Loc
        defaultOrder.add(43);
        //AirComp
        defaultOrder.add(10100);
        defaultOrder.add(10099);
        //Logs
        defaultOrder.add(0x8000);

    }

    public static Record getRecordInst(List<RecClassSpec> entries, RecSpec recInDat, ConvertDat convertDat, boolean strictLength) {
        Record retv;
        for (RecClassSpec recClassSpec : entries) {
            if (recClassSpec.getId() == recInDat.getId()) {
                if ((recClassSpec.lengthOK(recInDat.getLength())) || (!strictLength && recClassSpec.getLength() < recInDat.getLength())) {
                    Class<?> recordClass = recClassSpec.getRecClass();
                    if (recordClass != null) {
                        try {
                            retv = (Record) recordClass.getConstructor(ConvertDat.class).newInstance(convertDat);
                            return retv;
                        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException |
                                 InvocationTargetException | NoSuchMethodException | SecurityException e) {
                            DatConLog.Exception(e);
                            if (Persist.EXPERIMENTAL_DEV) {
                                e.printStackTrace();
                            }
                            return null;
                        }
                    }
                } else {
                    DatConLog.Log("getRecordInst can't use " + recClassSpec + "/" + recClassSpec.getLength() + " wrong length RecInDat " + recInDat);
                }
            }
        }
        return null;
    }
}
