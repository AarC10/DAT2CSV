package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class temp_cali_data_00_2195 extends Record {
protected boolean valid = false;

protected short _start_flag_00 = (short)0;
protected short _state_00 = (short)0;
protected short _cali_cnt_00 = (short)0;
protected short _temp_ready_00 = (short)0;
protected short _step_00 = (short)0;
protected short _cali_type_00 = (short)0;
protected int _tick_00 = (int)0;
protected short _grav_acc_x_00 = (short)0;
protected short _grav_acc_y_00 = (short)0;
protected short _grav_acc_z_00 = (short)0;
protected short _dst_cali_temp_00 = (short)0;
protected float _dst_cali_temp_00_1 = (float)0;
protected float _temp_min_00 = (float)0;
protected float _temp_max_00 = (float)0;
protected short _temp_cali_status_00 = (short)0;
protected short _base_cali_status_00 = (short)0;
protected short _cfg_temp_cali_fw_version_00 = (short)0;
protected short _cur_temp_cali_fw_version_00 = (short)0;
protected float _temp_bw_x_00 = (float)0;
protected float _temp_bw_y_00 = (float)0;
protected float _temp_bw_z_00 = (float)0;
protected float _temp_ba_x_00 = (float)0;
protected float _temp_ba_y_00 = (float)0;
protected float _temp_ba_z_00 = (float)0;
protected float _temp_temp_00 = (float)0;
protected float _base_bw_x_00 = (float)0;
protected float _base_bw_y_00 = (float)0;
protected float _base_bw_z_00 = (float)0;
protected float _base_ba_x_00 = (float)0;
protected float _base_ba_y_00 = (float)0;
protected float _base_ba_z_00 = (float)0;
protected float _base_temp_00 = (float)0;

      public temp_cali_data_00_2195(ConvertDat convertDat) {
           super(convertDat, 2195, 84);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

_start_flag_00 = record.getUnsignedByte(0);
 _state_00 = record.getByte(1);;
_cali_cnt_00 = record.getUnsignedByte(2);
_temp_ready_00 = record.getUnsignedByte(3);
_step_00 = record.getUnsignedByte(4);
_cali_type_00 = record.getUnsignedByte(5);
 _tick_00 = record.getUnsignedShort(6);
 _grav_acc_x_00 = record.getByte(8);;
 _grav_acc_y_00 = record.getByte(9);;
 _grav_acc_z_00 = record.getByte(10);;
 _dst_cali_temp_00 = record.getByte(11);;
 _dst_cali_temp_00_1 = record.getFloat(12);
 _temp_min_00 = record.getFloat(16);
 _temp_max_00 = record.getFloat(20);
_temp_cali_status_00 = record.getUnsignedByte(24);
_base_cali_status_00 = record.getUnsignedByte(25);
_cfg_temp_cali_fw_version_00 = record.getUnsignedByte(26);
_cur_temp_cali_fw_version_00 = record.getUnsignedByte(27);
 _temp_bw_x_00 = record.getFloat(28);
 _temp_bw_y_00 = record.getFloat(32);
 _temp_bw_z_00 = record.getFloat(36);
 _temp_ba_x_00 = record.getFloat(40);
 _temp_ba_y_00 = record.getFloat(44);
 _temp_ba_z_00 = record.getFloat(48);
 _temp_temp_00 = record.getFloat(52);
 _base_bw_x_00 = record.getFloat(56);
 _base_bw_y_00 = record.getFloat(60);
 _base_bw_z_00 = record.getFloat(64);
 _base_ba_x_00 = record.getFloat(68);
 _base_ba_y_00 = record.getFloat(72);
 _base_ba_z_00 = record.getFloat(76);
 _base_temp_00 = record.getFloat(80);
} catch (Exception e) {RecordException(e);}}


    protected static Signal temp_cali_data_00IntSig = Signal
.SeriesInt("temp_cali_data_00", "", null, Units.noUnits);
    protected static Signal temp_cali_data_00FloatSig = Signal
.SeriesFloat("temp_cali_data_00", "", null, Units.noUnits);
    protected static Signal temp_cali_data_00DoubleSig = Signal
.SeriesDouble("temp_cali_data_00", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(_start_flag_00, temp_cali_data_00IntSig, "_start_flag_00",lineT, valid);
 printCSVValue(_state_00, temp_cali_data_00IntSig, "_state_00",lineT, valid);
 printCSVValue(_cali_cnt_00, temp_cali_data_00IntSig, "_cali_cnt_00",lineT, valid);
 printCSVValue(_temp_ready_00, temp_cali_data_00IntSig, "_temp_ready_00",lineT, valid);
 printCSVValue(_step_00, temp_cali_data_00IntSig, "_step_00",lineT, valid);
 printCSVValue(_cali_type_00, temp_cali_data_00IntSig, "_cali_type_00",lineT, valid);
 printCSVValue(_tick_00, temp_cali_data_00IntSig, "_tick_00",lineT, valid);
 printCSVValue(_grav_acc_x_00, temp_cali_data_00IntSig, "_grav_acc_x_00",lineT, valid);
 printCSVValue(_grav_acc_y_00, temp_cali_data_00IntSig, "_grav_acc_y_00",lineT, valid);
 printCSVValue(_grav_acc_z_00, temp_cali_data_00IntSig, "_grav_acc_z_00",lineT, valid);
 printCSVValue(_dst_cali_temp_00, temp_cali_data_00IntSig, "_dst_cali_temp_00",lineT, valid);
 printCSVValue(_dst_cali_temp_00_1, temp_cali_data_00FloatSig, "_dst_cali_temp_00_1",lineT, valid);
 printCSVValue(_temp_min_00, temp_cali_data_00FloatSig, "_temp_min_00",lineT, valid);
 printCSVValue(_temp_max_00, temp_cali_data_00FloatSig, "_temp_max_00",lineT, valid);
 printCSVValue(_temp_cali_status_00, temp_cali_data_00IntSig, "_temp_cali_status_00",lineT, valid);
 printCSVValue(_base_cali_status_00, temp_cali_data_00IntSig, "_base_cali_status_00",lineT, valid);
 printCSVValue(_cfg_temp_cali_fw_version_00, temp_cali_data_00IntSig, "_cfg_temp_cali_fw_version_00",lineT, valid);
 printCSVValue(_cur_temp_cali_fw_version_00, temp_cali_data_00IntSig, "_cur_temp_cali_fw_version_00",lineT, valid);
 printCSVValue(_temp_bw_x_00, temp_cali_data_00FloatSig, "_temp_bw_x_00",lineT, valid);
 printCSVValue(_temp_bw_y_00, temp_cali_data_00FloatSig, "_temp_bw_y_00",lineT, valid);
 printCSVValue(_temp_bw_z_00, temp_cali_data_00FloatSig, "_temp_bw_z_00",lineT, valid);
 printCSVValue(_temp_ba_x_00, temp_cali_data_00FloatSig, "_temp_ba_x_00",lineT, valid);
 printCSVValue(_temp_ba_y_00, temp_cali_data_00FloatSig, "_temp_ba_y_00",lineT, valid);
 printCSVValue(_temp_ba_z_00, temp_cali_data_00FloatSig, "_temp_ba_z_00",lineT, valid);
 printCSVValue(_temp_temp_00, temp_cali_data_00FloatSig, "_temp_temp_00",lineT, valid);
 printCSVValue(_base_bw_x_00, temp_cali_data_00FloatSig, "_base_bw_x_00",lineT, valid);
 printCSVValue(_base_bw_y_00, temp_cali_data_00FloatSig, "_base_bw_y_00",lineT, valid);
 printCSVValue(_base_bw_z_00, temp_cali_data_00FloatSig, "_base_bw_z_00",lineT, valid);
 printCSVValue(_base_ba_x_00, temp_cali_data_00FloatSig, "_base_ba_x_00",lineT, valid);
 printCSVValue(_base_ba_y_00, temp_cali_data_00FloatSig, "_base_ba_y_00",lineT, valid);
 printCSVValue(_base_ba_z_00, temp_cali_data_00FloatSig, "_base_ba_z_00",lineT, valid);
 printCSVValue(_base_temp_00, temp_cali_data_00FloatSig, "_base_temp_00",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
