package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class temp_cali_data_22 extends Record {
protected boolean valid = false;

protected short _start_flag = (short)0;
protected short _state = (short)0;
protected short _cali_cnt = (short)0;
protected short _temp_ready = (short)0;
protected short _step = (short)0;
protected short _cali_type = (short)0;
protected int _tick = (int)0;
protected short _grav_acc_x = (short)0;
protected short _grav_acc_y = (short)0;
protected short _grav_acc_z = (short)0;
protected short _dst_cali_temp = (short)0;
protected float _dst_cali_temp_1 = (float)0;
protected float _temp_min = (float)0;
protected float _temp_max = (float)0;
protected short _temp_cali_status = (short)0;
protected short _base_cali_status = (short)0;
protected short _cfg_temp_cali_fw_version = (short)0;
protected short _cur_temp_cali_fw_version = (short)0;
protected float _temp_bw_x = (float)0;
protected float _temp_bw_y = (float)0;
protected float _temp_bw_z = (float)0;
protected float _temp_ba_x = (float)0;
protected float _temp_ba_y = (float)0;
protected float _temp_ba_z = (float)0;
protected float _temp_temp = (float)0;
protected float _base_bw_x = (float)0;
protected float _base_bw_y = (float)0;
protected float _base_bw_z = (float)0;
protected float _base_ba_x = (float)0;
protected float _base_ba_y = (float)0;
protected float _base_ba_z = (float)0;
protected float _base_temp = (float)0;

      public temp_cali_data_22(ConvertDat convertDat) {
           super(convertDat, 22, 84);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

_start_flag = record.getUnsignedByte(0);
 _state = record.getByte(1);;
_cali_cnt = record.getUnsignedByte(2);
_temp_ready = record.getUnsignedByte(3);
_step = record.getUnsignedByte(4);
_cali_type = record.getUnsignedByte(5);
 _tick = record.getUnsignedShort(6);
 _grav_acc_x = record.getByte(8);;
 _grav_acc_y = record.getByte(9);;
 _grav_acc_z = record.getByte(10);;
 _dst_cali_temp = record.getByte(11);;
 _dst_cali_temp_1 = record.getFloat(12);
 _temp_min = record.getFloat(16);
 _temp_max = record.getFloat(20);
_temp_cali_status = record.getUnsignedByte(24);
_base_cali_status = record.getUnsignedByte(25);
_cfg_temp_cali_fw_version = record.getUnsignedByte(26);
_cur_temp_cali_fw_version = record.getUnsignedByte(27);
 _temp_bw_x = record.getFloat(28);
 _temp_bw_y = record.getFloat(32);
 _temp_bw_z = record.getFloat(36);
 _temp_ba_x = record.getFloat(40);
 _temp_ba_y = record.getFloat(44);
 _temp_ba_z = record.getFloat(48);
 _temp_temp = record.getFloat(52);
 _base_bw_x = record.getFloat(56);
 _base_bw_y = record.getFloat(60);
 _base_bw_z = record.getFloat(64);
 _base_ba_x = record.getFloat(68);
 _base_ba_y = record.getFloat(72);
 _base_ba_z = record.getFloat(76);
 _base_temp = record.getFloat(80);
} catch (Exception e) {RecordException(e);}}


    protected static Signal temp_cali_dataIntSig = Signal
.SeriesInt("temp_cali_data", "", null, Units.noUnits);
    protected static Signal temp_cali_dataFloatSig = Signal
.SeriesFloat("temp_cali_data", "", null, Units.noUnits);
    protected static Signal temp_cali_dataDoubleSig = Signal
.SeriesDouble("temp_cali_data", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(_start_flag, temp_cali_dataIntSig, "_start_flag",lineT, valid);
 printCSVValue(_state, temp_cali_dataIntSig, "_state",lineT, valid);
 printCSVValue(_cali_cnt, temp_cali_dataIntSig, "_cali_cnt",lineT, valid);
 printCSVValue(_temp_ready, temp_cali_dataIntSig, "_temp_ready",lineT, valid);
 printCSVValue(_step, temp_cali_dataIntSig, "_step",lineT, valid);
 printCSVValue(_cali_type, temp_cali_dataIntSig, "_cali_type",lineT, valid);
 printCSVValue(_tick, temp_cali_dataIntSig, "_tick",lineT, valid);
 printCSVValue(_grav_acc_x, temp_cali_dataIntSig, "_grav_acc_x",lineT, valid);
 printCSVValue(_grav_acc_y, temp_cali_dataIntSig, "_grav_acc_y",lineT, valid);
 printCSVValue(_grav_acc_z, temp_cali_dataIntSig, "_grav_acc_z",lineT, valid);
 printCSVValue(_dst_cali_temp, temp_cali_dataIntSig, "_dst_cali_temp",lineT, valid);
 printCSVValue(_dst_cali_temp_1, temp_cali_dataFloatSig, "_dst_cali_temp_1",lineT, valid);
 printCSVValue(_temp_min, temp_cali_dataFloatSig, "_temp_min",lineT, valid);
 printCSVValue(_temp_max, temp_cali_dataFloatSig, "_temp_max",lineT, valid);
 printCSVValue(_temp_cali_status, temp_cali_dataIntSig, "_temp_cali_status",lineT, valid);
 printCSVValue(_base_cali_status, temp_cali_dataIntSig, "_base_cali_status",lineT, valid);
 printCSVValue(_cfg_temp_cali_fw_version, temp_cali_dataIntSig, "_cfg_temp_cali_fw_version",lineT, valid);
 printCSVValue(_cur_temp_cali_fw_version, temp_cali_dataIntSig, "_cur_temp_cali_fw_version",lineT, valid);
 printCSVValue(_temp_bw_x, temp_cali_dataFloatSig, "_temp_bw_x",lineT, valid);
 printCSVValue(_temp_bw_y, temp_cali_dataFloatSig, "_temp_bw_y",lineT, valid);
 printCSVValue(_temp_bw_z, temp_cali_dataFloatSig, "_temp_bw_z",lineT, valid);
 printCSVValue(_temp_ba_x, temp_cali_dataFloatSig, "_temp_ba_x",lineT, valid);
 printCSVValue(_temp_ba_y, temp_cali_dataFloatSig, "_temp_ba_y",lineT, valid);
 printCSVValue(_temp_ba_z, temp_cali_dataFloatSig, "_temp_ba_z",lineT, valid);
 printCSVValue(_temp_temp, temp_cali_dataFloatSig, "_temp_temp",lineT, valid);
 printCSVValue(_base_bw_x, temp_cali_dataFloatSig, "_base_bw_x",lineT, valid);
 printCSVValue(_base_bw_y, temp_cali_dataFloatSig, "_base_bw_y",lineT, valid);
 printCSVValue(_base_bw_z, temp_cali_dataFloatSig, "_base_bw_z",lineT, valid);
 printCSVValue(_base_ba_x, temp_cali_dataFloatSig, "_base_ba_x",lineT, valid);
 printCSVValue(_base_ba_y, temp_cali_dataFloatSig, "_base_ba_y",lineT, valid);
 printCSVValue(_base_ba_z, temp_cali_dataFloatSig, "_base_ba_z",lineT, valid);
 printCSVValue(_base_temp, temp_cali_dataFloatSig, "_base_temp",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
