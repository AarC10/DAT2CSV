package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class temp_cali_data_01_2196 extends Record {
protected boolean valid = false;

protected short _start_flag_01 = (short)0;
protected short _state_01 = (short)0;
protected short _cali_cnt_01 = (short)0;
protected short _temp_ready_01 = (short)0;
protected short _step_01 = (short)0;
protected short _cali_type_01 = (short)0;
protected int _tick_01 = (int)0;
protected short _grav_acc_x_01 = (short)0;
protected short _grav_acc_y_01 = (short)0;
protected short _grav_acc_z_01 = (short)0;
protected short _dst_cali_temp_01 = (short)0;
protected float _dst_cali_temp_01_1 = (float)0;
protected float _temp_min_01 = (float)0;
protected float _temp_max_01 = (float)0;
protected short _temp_cali_status_01 = (short)0;
protected short _base_cali_status_01 = (short)0;
protected short _cfg_temp_cali_fw_version_01 = (short)0;
protected short _cur_temp_cali_fw_version_01 = (short)0;
protected float _temp_bw_x_01 = (float)0;
protected float _temp_bw_y_01 = (float)0;
protected float _temp_bw_z_01 = (float)0;
protected float _temp_ba_x_01 = (float)0;
protected float _temp_ba_y_01 = (float)0;
protected float _temp_ba_z_01 = (float)0;
protected float _temp_temp_01 = (float)0;
protected float _base_bw_x_01 = (float)0;
protected float _base_bw_y_01 = (float)0;
protected float _base_bw_z_01 = (float)0;
protected float _base_ba_x_01 = (float)0;
protected float _base_ba_y_01 = (float)0;
protected float _base_ba_z_01 = (float)0;
protected float _base_temp_01 = (float)0;

      public temp_cali_data_01_2196(ConvertDat convertDat) {
           super(convertDat, 2196, 84);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

_start_flag_01 = record.getUnsignedByte(0);
 _state_01 = record.getByte(1);;
_cali_cnt_01 = record.getUnsignedByte(2);
_temp_ready_01 = record.getUnsignedByte(3);
_step_01 = record.getUnsignedByte(4);
_cali_type_01 = record.getUnsignedByte(5);
 _tick_01 = record.getUnsignedShort(6);
 _grav_acc_x_01 = record.getByte(8);;
 _grav_acc_y_01 = record.getByte(9);;
 _grav_acc_z_01 = record.getByte(10);;
 _dst_cali_temp_01 = record.getByte(11);;
 _dst_cali_temp_01_1 = record.getFloat(12);
 _temp_min_01 = record.getFloat(16);
 _temp_max_01 = record.getFloat(20);
_temp_cali_status_01 = record.getUnsignedByte(24);
_base_cali_status_01 = record.getUnsignedByte(25);
_cfg_temp_cali_fw_version_01 = record.getUnsignedByte(26);
_cur_temp_cali_fw_version_01 = record.getUnsignedByte(27);
 _temp_bw_x_01 = record.getFloat(28);
 _temp_bw_y_01 = record.getFloat(32);
 _temp_bw_z_01 = record.getFloat(36);
 _temp_ba_x_01 = record.getFloat(40);
 _temp_ba_y_01 = record.getFloat(44);
 _temp_ba_z_01 = record.getFloat(48);
 _temp_temp_01 = record.getFloat(52);
 _base_bw_x_01 = record.getFloat(56);
 _base_bw_y_01 = record.getFloat(60);
 _base_bw_z_01 = record.getFloat(64);
 _base_ba_x_01 = record.getFloat(68);
 _base_ba_y_01 = record.getFloat(72);
 _base_ba_z_01 = record.getFloat(76);
 _base_temp_01 = record.getFloat(80);
} catch (Exception e) {RecordException(e);}}


    protected static Signal temp_cali_data_01IntSig = Signal
.SeriesInt("temp_cali_data_01", "", null, Units.noUnits);
    protected static Signal temp_cali_data_01FloatSig = Signal
.SeriesFloat("temp_cali_data_01", "", null, Units.noUnits);
    protected static Signal temp_cali_data_01DoubleSig = Signal
.SeriesDouble("temp_cali_data_01", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(_start_flag_01, temp_cali_data_01IntSig, "_start_flag_01",lineT, valid);
 printCSVValue(_state_01, temp_cali_data_01IntSig, "_state_01",lineT, valid);
 printCSVValue(_cali_cnt_01, temp_cali_data_01IntSig, "_cali_cnt_01",lineT, valid);
 printCSVValue(_temp_ready_01, temp_cali_data_01IntSig, "_temp_ready_01",lineT, valid);
 printCSVValue(_step_01, temp_cali_data_01IntSig, "_step_01",lineT, valid);
 printCSVValue(_cali_type_01, temp_cali_data_01IntSig, "_cali_type_01",lineT, valid);
 printCSVValue(_tick_01, temp_cali_data_01IntSig, "_tick_01",lineT, valid);
 printCSVValue(_grav_acc_x_01, temp_cali_data_01IntSig, "_grav_acc_x_01",lineT, valid);
 printCSVValue(_grav_acc_y_01, temp_cali_data_01IntSig, "_grav_acc_y_01",lineT, valid);
 printCSVValue(_grav_acc_z_01, temp_cali_data_01IntSig, "_grav_acc_z_01",lineT, valid);
 printCSVValue(_dst_cali_temp_01, temp_cali_data_01IntSig, "_dst_cali_temp_01",lineT, valid);
 printCSVValue(_dst_cali_temp_01_1, temp_cali_data_01FloatSig, "_dst_cali_temp_01_1",lineT, valid);
 printCSVValue(_temp_min_01, temp_cali_data_01FloatSig, "_temp_min_01",lineT, valid);
 printCSVValue(_temp_max_01, temp_cali_data_01FloatSig, "_temp_max_01",lineT, valid);
 printCSVValue(_temp_cali_status_01, temp_cali_data_01IntSig, "_temp_cali_status_01",lineT, valid);
 printCSVValue(_base_cali_status_01, temp_cali_data_01IntSig, "_base_cali_status_01",lineT, valid);
 printCSVValue(_cfg_temp_cali_fw_version_01, temp_cali_data_01IntSig, "_cfg_temp_cali_fw_version_01",lineT, valid);
 printCSVValue(_cur_temp_cali_fw_version_01, temp_cali_data_01IntSig, "_cur_temp_cali_fw_version_01",lineT, valid);
 printCSVValue(_temp_bw_x_01, temp_cali_data_01FloatSig, "_temp_bw_x_01",lineT, valid);
 printCSVValue(_temp_bw_y_01, temp_cali_data_01FloatSig, "_temp_bw_y_01",lineT, valid);
 printCSVValue(_temp_bw_z_01, temp_cali_data_01FloatSig, "_temp_bw_z_01",lineT, valid);
 printCSVValue(_temp_ba_x_01, temp_cali_data_01FloatSig, "_temp_ba_x_01",lineT, valid);
 printCSVValue(_temp_ba_y_01, temp_cali_data_01FloatSig, "_temp_ba_y_01",lineT, valid);
 printCSVValue(_temp_ba_z_01, temp_cali_data_01FloatSig, "_temp_ba_z_01",lineT, valid);
 printCSVValue(_temp_temp_01, temp_cali_data_01FloatSig, "_temp_temp_01",lineT, valid);
 printCSVValue(_base_bw_x_01, temp_cali_data_01FloatSig, "_base_bw_x_01",lineT, valid);
 printCSVValue(_base_bw_y_01, temp_cali_data_01FloatSig, "_base_bw_y_01",lineT, valid);
 printCSVValue(_base_bw_z_01, temp_cali_data_01FloatSig, "_base_bw_z_01",lineT, valid);
 printCSVValue(_base_ba_x_01, temp_cali_data_01FloatSig, "_base_ba_x_01",lineT, valid);
 printCSVValue(_base_ba_y_01, temp_cali_data_01FloatSig, "_base_ba_y_01",lineT, valid);
 printCSVValue(_base_ba_z_01, temp_cali_data_01FloatSig, "_base_ba_z_01",lineT, valid);
 printCSVValue(_base_temp_01, temp_cali_data_01FloatSig, "_base_temp_01",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
