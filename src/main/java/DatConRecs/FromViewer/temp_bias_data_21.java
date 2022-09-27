package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class temp_bias_data_21 extends Record {
protected boolean valid = false;

protected float _bw_x = (float)0;
protected float _bw_y = (float)0;
protected float _bw_z = (float)0;
protected float _ba_x = (float)0;
protected float _ba_y = (float)0;
protected float _ba_z = (float)0;
protected float _temp = (float)0;
protected short _flag = (short)0;

      public temp_bias_data_21(ConvertDat convertDat) {
           super(convertDat, 21, 29);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

 _bw_x = record.getFloat(0);
 _bw_y = record.getFloat(4);
 _bw_z = record.getFloat(8);
 _ba_x = record.getFloat(12);
 _ba_y = record.getFloat(16);
 _ba_z = record.getFloat(20);
 _temp = record.getFloat(24);
_flag = record.getUnsignedByte(28);
} catch (Exception e) {RecordException(e);}}


    protected static Signal temp_bias_dataIntSig = Signal
.SeriesInt("temp_bias_data", "", null, Units.noUnits);
    protected static Signal temp_bias_dataFloatSig = Signal
.SeriesFloat("temp_bias_data", "", null, Units.noUnits);
    protected static Signal temp_bias_dataDoubleSig = Signal
.SeriesDouble("temp_bias_data", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(_bw_x, temp_bias_dataFloatSig, "_bw_x",lineT, valid);
 printCSVValue(_bw_y, temp_bias_dataFloatSig, "_bw_y",lineT, valid);
 printCSVValue(_bw_z, temp_bias_dataFloatSig, "_bw_z",lineT, valid);
 printCSVValue(_ba_x, temp_bias_dataFloatSig, "_ba_x",lineT, valid);
 printCSVValue(_ba_y, temp_bias_dataFloatSig, "_ba_y",lineT, valid);
 printCSVValue(_ba_z, temp_bias_dataFloatSig, "_ba_z",lineT, valid);
 printCSVValue(_temp, temp_bias_dataFloatSig, "_temp",lineT, valid);
 printCSVValue(_flag, temp_bias_dataIntSig, "_flag",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
