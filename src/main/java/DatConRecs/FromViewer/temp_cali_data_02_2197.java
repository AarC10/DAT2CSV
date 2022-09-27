package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class temp_cali_data_02_2197 extends Record {
protected boolean valid = false;

protected short _start_flag_02 = (short)0;
protected short _state_02 = (short)0;
protected short _cali_cnt_02 = (short)0;
protected short _temp_ready_02 = (short)0;
protected short _step_02 = (short)0;
protected short _cali_type_02 = (short)0;
protected int _tick_02 = (int)0;
protected short _grav_acc_x_02 = (short)0;
protected short _grav_acc_y_02 = (short)0;
protected short _grav_acc_z_02 = (short)0;
protected short _dst_cali_temp_02 = (short)0;
protected float _temp_min_02 = (float)0;
protected float _temp_max_02 = (float)0;
protected short _temp_cali_status_02 = (short)0;
protected short _base_cali_status_02 = (short)0;
protected short _cfg_temp_cali_fw_version_02 = (short)0;
protected short _cur_temp_cali_fw_version_02 = (short)0;
protected float _temp_bw_x_02 = (float)0;
protected float _temp_bw_y_02 = (float)0;
protected float _temp_bw_z_02 = (float)0;
protected float _temp_ba_x_02 = (float)0;
protected float _temp_ba_y_02 = (float)0;
protected float _temp_ba_z_02 = (float)0;
protected float _temp_temp_02 = (float)0;
protected float _base_bw_x_02 = (float)0;
protected float _base_bw_y_02 = (float)0;
protected float _base_bw_z_02 = (float)0;
protected float _base_ba_x_02 = (float)0;
protected float _base_ba_y_02 = (float)0;
protected float _base_ba_z_02 = (float)0;
protected float _base_temp_02 = (float)0;

      public temp_cali_data_02_2197(ConvertDat convertDat) {
           super(convertDat, 2197, 80);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

_start_flag_02 = record.getUnsignedByte(0);
 _state_02 = record.getByte(1);;
_cali_cnt_02 = record.getUnsignedByte(2);
_temp_ready_02 = record.getUnsignedByte(3);
_step_02 = record.getUnsignedByte(4);
_cali_type_02 = record.getUnsignedByte(5);
 _tick_02 = record.getUnsignedShort(6);
 _grav_acc_x_02 = record.getByte(8);;
 _grav_acc_y_02 = record.getByte(9);;
 _grav_acc_z_02 = record.getByte(10);;
 _dst_cali_temp_02 = record.getByte(11);;
 _temp_min_02 = record.getFloat(12);
 _temp_max_02 = record.getFloat(16);
_temp_cali_status_02 = record.getUnsignedByte(20);
_base_cali_status_02 = record.getUnsignedByte(21);
_cfg_temp_cali_fw_version_02 = record.getUnsignedByte(22);
_cur_temp_cali_fw_version_02 = record.getUnsignedByte(23);
 _temp_bw_x_02 = record.getFloat(24);
 _temp_bw_y_02 = record.getFloat(28);
 _temp_bw_z_02 = record.getFloat(32);
 _temp_ba_x_02 = record.getFloat(36);
 _temp_ba_y_02 = record.getFloat(40);
 _temp_ba_z_02 = record.getFloat(44);
 _temp_temp_02 = record.getFloat(48);
 _base_bw_x_02 = record.getFloat(52);
 _base_bw_y_02 = record.getFloat(56);
 _base_bw_z_02 = record.getFloat(60);
 _base_ba_x_02 = record.getFloat(64);
 _base_ba_y_02 = record.getFloat(68);
 _base_ba_z_02 = record.getFloat(72);
 _base_temp_02 = record.getFloat(76);
} catch (Exception e) {RecordException(e);}}


    protected static Signal temp_cali_data_02IntSig = Signal
.SeriesInt("temp_cali_data_02", "", null, Units.noUnits);
    protected static Signal temp_cali_data_02FloatSig = Signal
.SeriesFloat("temp_cali_data_02", "", null, Units.noUnits);
    protected static Signal temp_cali_data_02DoubleSig = Signal
.SeriesDouble("temp_cali_data_02", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(_start_flag_02, temp_cali_data_02IntSig, "_start_flag_02",lineT, valid);
 printCSVValue(_state_02, temp_cali_data_02IntSig, "_state_02",lineT, valid);
 printCSVValue(_cali_cnt_02, temp_cali_data_02IntSig, "_cali_cnt_02",lineT, valid);
 printCSVValue(_temp_ready_02, temp_cali_data_02IntSig, "_temp_ready_02",lineT, valid);
 printCSVValue(_step_02, temp_cali_data_02IntSig, "_step_02",lineT, valid);
 printCSVValue(_cali_type_02, temp_cali_data_02IntSig, "_cali_type_02",lineT, valid);
 printCSVValue(_tick_02, temp_cali_data_02IntSig, "_tick_02",lineT, valid);
 printCSVValue(_grav_acc_x_02, temp_cali_data_02IntSig, "_grav_acc_x_02",lineT, valid);
 printCSVValue(_grav_acc_y_02, temp_cali_data_02IntSig, "_grav_acc_y_02",lineT, valid);
 printCSVValue(_grav_acc_z_02, temp_cali_data_02IntSig, "_grav_acc_z_02",lineT, valid);
 printCSVValue(_dst_cali_temp_02, temp_cali_data_02IntSig, "_dst_cali_temp_02",lineT, valid);
 printCSVValue(_temp_min_02, temp_cali_data_02FloatSig, "_temp_min_02",lineT, valid);
 printCSVValue(_temp_max_02, temp_cali_data_02FloatSig, "_temp_max_02",lineT, valid);
 printCSVValue(_temp_cali_status_02, temp_cali_data_02IntSig, "_temp_cali_status_02",lineT, valid);
 printCSVValue(_base_cali_status_02, temp_cali_data_02IntSig, "_base_cali_status_02",lineT, valid);
 printCSVValue(_cfg_temp_cali_fw_version_02, temp_cali_data_02IntSig, "_cfg_temp_cali_fw_version_02",lineT, valid);
 printCSVValue(_cur_temp_cali_fw_version_02, temp_cali_data_02IntSig, "_cur_temp_cali_fw_version_02",lineT, valid);
 printCSVValue(_temp_bw_x_02, temp_cali_data_02FloatSig, "_temp_bw_x_02",lineT, valid);
 printCSVValue(_temp_bw_y_02, temp_cali_data_02FloatSig, "_temp_bw_y_02",lineT, valid);
 printCSVValue(_temp_bw_z_02, temp_cali_data_02FloatSig, "_temp_bw_z_02",lineT, valid);
 printCSVValue(_temp_ba_x_02, temp_cali_data_02FloatSig, "_temp_ba_x_02",lineT, valid);
 printCSVValue(_temp_ba_y_02, temp_cali_data_02FloatSig, "_temp_ba_y_02",lineT, valid);
 printCSVValue(_temp_ba_z_02, temp_cali_data_02FloatSig, "_temp_ba_z_02",lineT, valid);
 printCSVValue(_temp_temp_02, temp_cali_data_02FloatSig, "_temp_temp_02",lineT, valid);
 printCSVValue(_base_bw_x_02, temp_cali_data_02FloatSig, "_base_bw_x_02",lineT, valid);
 printCSVValue(_base_bw_y_02, temp_cali_data_02FloatSig, "_base_bw_y_02",lineT, valid);
 printCSVValue(_base_bw_z_02, temp_cali_data_02FloatSig, "_base_bw_z_02",lineT, valid);
 printCSVValue(_base_ba_x_02, temp_cali_data_02FloatSig, "_base_ba_x_02",lineT, valid);
 printCSVValue(_base_ba_y_02, temp_cali_data_02FloatSig, "_base_ba_y_02",lineT, valid);
 printCSVValue(_base_ba_z_02, temp_cali_data_02FloatSig, "_base_ba_z_02",lineT, valid);
 printCSVValue(_base_temp_02, temp_cali_data_02FloatSig, "_base_temp_02",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
