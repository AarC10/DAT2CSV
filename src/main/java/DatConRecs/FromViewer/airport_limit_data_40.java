package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class airport_limit_data_40 extends Record {
protected boolean valid = false;

protected short area_state = (short)0;
protected short action_state = (short)0;
protected short work_point_num = (short)0;
protected int lat_int_0 = (int)0;
protected int lon_int_0 = (int)0;
protected short point_from_where_0 = (short)0;
protected short flag_limit_radius_0 = (short)0;
protected short flag_limit_hi_0 = (short)0;
protected float d2limit_edge_0 = (float)0;
protected float d2limit_hi_0 = (float)0;
protected float directx_0 = (float)0;
protected float directy_0 = (float)0;
protected int lat_int_1 = (int)0;
protected int lon_int_1 = (int)0;
protected short point_from_where_1 = (short)0;
protected short flag_limit_radius_1 = (short)0;
protected short flag_limit_hi_1 = (short)0;
protected float d2limit_edge_1 = (float)0;
protected float d2limit_hi_1 = (float)0;
protected float directx_1 = (float)0;
protected float directy_1 = (float)0;
protected int lat_int_2 = (int)0;
protected int lon_int_2 = (int)0;
protected short point_from_where_2 = (short)0;
protected short flag_limit_radius_2 = (short)0;
protected short flag_limit_hi_2 = (short)0;
protected float d2limit_edge_2 = (float)0;
protected float d2limit_hi_2 = (float)0;
protected float directx_2 = (float)0;
protected float directy_2 = (float)0;

      public airport_limit_data_40(ConvertDat convertDat) {
           super(convertDat, 40, 84);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

area_state = record.getUnsignedByte(0);
action_state = record.getUnsignedByte(1);
work_point_num = record.getUnsignedByte(2);
 lat_int_0 = record.getInt(3);
 lon_int_0 = record.getInt(7);
point_from_where_0 = record.getUnsignedByte(11);
flag_limit_radius_0 = record.getUnsignedByte(12);
flag_limit_hi_0 = record.getUnsignedByte(13);
 d2limit_edge_0 = record.getFloat(14);
 d2limit_hi_0 = record.getFloat(18);
 directx_0 = record.getFloat(22);
 directy_0 = record.getFloat(26);
 lat_int_1 = record.getInt(30);
 lon_int_1 = record.getInt(34);
point_from_where_1 = record.getUnsignedByte(38);
flag_limit_radius_1 = record.getUnsignedByte(39);
flag_limit_hi_1 = record.getUnsignedByte(40);
 d2limit_edge_1 = record.getFloat(41);
 d2limit_hi_1 = record.getFloat(45);
 directx_1 = record.getFloat(49);
 directy_1 = record.getFloat(53);
 lat_int_2 = record.getInt(57);
 lon_int_2 = record.getInt(61);
point_from_where_2 = record.getUnsignedByte(65);
flag_limit_radius_2 = record.getUnsignedByte(66);
flag_limit_hi_2 = record.getUnsignedByte(67);
 d2limit_edge_2 = record.getFloat(68);
 d2limit_hi_2 = record.getFloat(72);
 directx_2 = record.getFloat(76);
 directy_2 = record.getFloat(80);
} catch (Exception e) {RecordException(e);}}


    protected static Signal airport_limit_dataIntSig = Signal
.SeriesInt("airport_limit_data", "", null, Units.noUnits);
    protected static Signal airport_limit_dataFloatSig = Signal
.SeriesFloat("airport_limit_data", "", null, Units.noUnits);
    protected static Signal airport_limit_dataDoubleSig = Signal
.SeriesDouble("airport_limit_data", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(area_state, airport_limit_dataIntSig, "area_state",lineT, valid);
 printCSVValue(action_state, airport_limit_dataIntSig, "action_state",lineT, valid);
 printCSVValue(work_point_num, airport_limit_dataIntSig, "work_point_num",lineT, valid);
 printCSVValue(lat_int_0, airport_limit_dataIntSig, "lat_int_0",lineT, valid);
 printCSVValue(lon_int_0, airport_limit_dataIntSig, "lon_int_0",lineT, valid);
 printCSVValue(point_from_where_0, airport_limit_dataIntSig, "point_from_where_0",lineT, valid);
 printCSVValue(flag_limit_radius_0, airport_limit_dataIntSig, "flag_limit_radius_0",lineT, valid);
 printCSVValue(flag_limit_hi_0, airport_limit_dataIntSig, "flag_limit_hi_0",lineT, valid);
 printCSVValue(d2limit_edge_0, airport_limit_dataFloatSig, "d2limit_edge_0",lineT, valid);
 printCSVValue(d2limit_hi_0, airport_limit_dataFloatSig, "d2limit_hi_0",lineT, valid);
 printCSVValue(directx_0, airport_limit_dataFloatSig, "directx_0",lineT, valid);
 printCSVValue(directy_0, airport_limit_dataFloatSig, "directy_0",lineT, valid);
 printCSVValue(lat_int_1, airport_limit_dataIntSig, "lat_int_1",lineT, valid);
 printCSVValue(lon_int_1, airport_limit_dataIntSig, "lon_int_1",lineT, valid);
 printCSVValue(point_from_where_1, airport_limit_dataIntSig, "point_from_where_1",lineT, valid);
 printCSVValue(flag_limit_radius_1, airport_limit_dataIntSig, "flag_limit_radius_1",lineT, valid);
 printCSVValue(flag_limit_hi_1, airport_limit_dataIntSig, "flag_limit_hi_1",lineT, valid);
 printCSVValue(d2limit_edge_1, airport_limit_dataFloatSig, "d2limit_edge_1",lineT, valid);
 printCSVValue(d2limit_hi_1, airport_limit_dataFloatSig, "d2limit_hi_1",lineT, valid);
 printCSVValue(directx_1, airport_limit_dataFloatSig, "directx_1",lineT, valid);
 printCSVValue(directy_1, airport_limit_dataFloatSig, "directy_1",lineT, valid);
 printCSVValue(lat_int_2, airport_limit_dataIntSig, "lat_int_2",lineT, valid);
 printCSVValue(lon_int_2, airport_limit_dataIntSig, "lon_int_2",lineT, valid);
 printCSVValue(point_from_where_2, airport_limit_dataIntSig, "point_from_where_2",lineT, valid);
 printCSVValue(flag_limit_radius_2, airport_limit_dataIntSig, "flag_limit_radius_2",lineT, valid);
 printCSVValue(flag_limit_hi_2, airport_limit_dataIntSig, "flag_limit_hi_2",lineT, valid);
 printCSVValue(d2limit_edge_2, airport_limit_dataFloatSig, "d2limit_edge_2",lineT, valid);
 printCSVValue(d2limit_hi_2, airport_limit_dataFloatSig, "d2limit_hi_2",lineT, valid);
 printCSVValue(directx_2, airport_limit_dataFloatSig, "directx_2",lineT, valid);
 printCSVValue(directy_2, airport_limit_dataFloatSig, "directy_2",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
