package DatConRecs.String;

import Files.RecClassSpec;

import java.util.Vector;

public class Dictionary {

    public static Vector<RecClassSpec> entries = new Vector<RecClassSpec>();
    static {

        entries.add(new RecClassSpec(Sys_cfg_65535.class, 65535, -1));
        entries.add(new RecClassSpec(RecDefs_65533.class, 65533, -1));
        entries.add(new RecClassSpec(RecFlyLog_32768.class, 32768, -1));
    }

}
