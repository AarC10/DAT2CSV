package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class smart_battery_info_18 extends Record {
protected boolean valid = false;

protected int rest_time = (int)0;
protected int need_time_for_gohome = (int)0;
protected int need_time_for_land = (int)0;
protected int gohome_battery_level = (int)0;
protected int land_battery_level = (int)0;
protected float radius_for_gohome = (float)0;
protected int request_gohome = (int)0;
protected float bat_dec_speed = (float)0;
protected long smart_battery_state = (long)0;
protected short level1_over_current = (short)0;
protected short level2_over_current = (short)0;
protected short level1_over_temp = (short)0;
protected short level2_under_temp = (short)0;
protected short level1_low_temp = (short)0;
protected short level2_low_temp = (short)0;
protected short short_cir = (short)0;
protected short low_vol_cells = (short)0;
protected short damage_cells = (short)0;
protected short exchange_cells = (short)0;
protected short user_gohome_level = (short)0;
protected short user_land_level = (short)0;
protected short user_action_for_gohome = (short)0;
protected short user_action_for_land = (short)0;
protected short user_use_smart_bat = (short)0;
protected short flag_main_vol_low_gohome = (short)0;
protected short flag_main_vol_low_land = (short)0;
protected short flag_user_gohome = (short)0;
protected short flag_user_land = (short)0;
protected short flag_smart_bat_gohome = (short)0;
protected short flag_smart_bat_land = (short)0;
protected short flag_cell_err = (short)0;
protected short flag_communite_err = (short)0;
protected float real_desc_speed = (float)0;
protected short flag_vol_very_low = (short)0;
protected short flag_temp_and_vol_low = (short)0;
protected short flag_first_charge_not_full = (short)0;
protected float g_filter_vol = (float)0;
protected float g_filter_I = (float)0;
protected float g_evl_vol = (float)0;
protected float g_delt_I = (float)0;

      public smart_battery_info_18(ConvertDat convertDat) {
           super(convertDat, 18, 70);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

 rest_time = record.getUnsignedShort(0);
 need_time_for_gohome = record.getUnsignedShort(2);
 need_time_for_land = record.getUnsignedShort(4);
 gohome_battery_level = record.getUnsignedShort(6);
 land_battery_level = record.getUnsignedShort(8);
 radius_for_gohome = record.getFloat(10);
 request_gohome = record.getUnsignedShort(14);
 bat_dec_speed = record.getFloat(16);
 smart_battery_state = record.getUnsignedInt(20);
level1_over_current = record.getUnsignedByte(24);
level2_over_current = record.getUnsignedByte(25);
level1_over_temp = record.getUnsignedByte(26);
level2_under_temp = record.getUnsignedByte(27);
level1_low_temp = record.getUnsignedByte(28);
level2_low_temp = record.getUnsignedByte(29);
short_cir = record.getUnsignedByte(30);
low_vol_cells = record.getUnsignedByte(31);
damage_cells = record.getUnsignedByte(32);
exchange_cells = record.getUnsignedByte(33);
user_gohome_level = record.getUnsignedByte(34);
user_land_level = record.getUnsignedByte(35);
user_action_for_gohome = record.getUnsignedByte(36);
user_action_for_land = record.getUnsignedByte(37);
user_use_smart_bat = record.getUnsignedByte(38);
flag_main_vol_low_gohome = record.getUnsignedByte(39);
flag_main_vol_low_land = record.getUnsignedByte(40);
flag_user_gohome = record.getUnsignedByte(41);
flag_user_land = record.getUnsignedByte(42);
flag_smart_bat_gohome = record.getUnsignedByte(43);
flag_smart_bat_land = record.getUnsignedByte(44);
flag_cell_err = record.getUnsignedByte(45);
flag_communite_err = record.getUnsignedByte(46);
 real_desc_speed = record.getFloat(47);
flag_vol_very_low = record.getUnsignedByte(51);
flag_temp_and_vol_low = record.getUnsignedByte(52);
flag_first_charge_not_full = record.getUnsignedByte(53);
 g_filter_vol = record.getFloat(54);
 g_filter_I = record.getFloat(58);
 g_evl_vol = record.getFloat(62);
 g_delt_I = record.getFloat(66);
} catch (Exception e) {RecordException(e);}}


    protected static Signal smart_battery_infoIntSig = Signal
.SeriesInt("smart_battery_info", "", null, Units.noUnits);
    protected static Signal smart_battery_infoFloatSig = Signal
.SeriesFloat("smart_battery_info", "", null, Units.noUnits);
    protected static Signal smart_battery_infoDoubleSig = Signal
.SeriesDouble("smart_battery_info", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(rest_time, smart_battery_infoIntSig, "rest_time",lineT, valid);
 printCSVValue(need_time_for_gohome, smart_battery_infoIntSig, "need_time_for_gohome",lineT, valid);
 printCSVValue(need_time_for_land, smart_battery_infoIntSig, "need_time_for_land",lineT, valid);
 printCSVValue(gohome_battery_level, smart_battery_infoIntSig, "gohome_battery_level",lineT, valid);
 printCSVValue(land_battery_level, smart_battery_infoIntSig, "land_battery_level",lineT, valid);
 printCSVValue(radius_for_gohome, smart_battery_infoFloatSig, "radius_for_gohome",lineT, valid);
 printCSVValue(request_gohome, smart_battery_infoIntSig, "request_gohome",lineT, valid);
 printCSVValue(bat_dec_speed, smart_battery_infoFloatSig, "bat_dec_speed",lineT, valid);
 printCSVValue(smart_battery_state, smart_battery_infoIntSig, "smart_battery_state",lineT, valid);
 printCSVValue(level1_over_current, smart_battery_infoIntSig, "level1_over_current",lineT, valid);
 printCSVValue(level2_over_current, smart_battery_infoIntSig, "level2_over_current",lineT, valid);
 printCSVValue(level1_over_temp, smart_battery_infoIntSig, "level1_over_temp",lineT, valid);
 printCSVValue(level2_under_temp, smart_battery_infoIntSig, "level2_under_temp",lineT, valid);
 printCSVValue(level1_low_temp, smart_battery_infoIntSig, "level1_low_temp",lineT, valid);
 printCSVValue(level2_low_temp, smart_battery_infoIntSig, "level2_low_temp",lineT, valid);
 printCSVValue(short_cir, smart_battery_infoIntSig, "short_cir",lineT, valid);
 printCSVValue(low_vol_cells, smart_battery_infoIntSig, "low_vol_cells",lineT, valid);
 printCSVValue(damage_cells, smart_battery_infoIntSig, "damage_cells",lineT, valid);
 printCSVValue(exchange_cells, smart_battery_infoIntSig, "exchange_cells",lineT, valid);
 printCSVValue(user_gohome_level, smart_battery_infoIntSig, "user_gohome_level",lineT, valid);
 printCSVValue(user_land_level, smart_battery_infoIntSig, "user_land_level",lineT, valid);
 printCSVValue(user_action_for_gohome, smart_battery_infoIntSig, "user_action_for_gohome",lineT, valid);
 printCSVValue(user_action_for_land, smart_battery_infoIntSig, "user_action_for_land",lineT, valid);
 printCSVValue(user_use_smart_bat, smart_battery_infoIntSig, "user_use_smart_bat",lineT, valid);
 printCSVValue(flag_main_vol_low_gohome, smart_battery_infoIntSig, "flag_main_vol_low_gohome",lineT, valid);
 printCSVValue(flag_main_vol_low_land, smart_battery_infoIntSig, "flag_main_vol_low_land",lineT, valid);
 printCSVValue(flag_user_gohome, smart_battery_infoIntSig, "flag_user_gohome",lineT, valid);
 printCSVValue(flag_user_land, smart_battery_infoIntSig, "flag_user_land",lineT, valid);
 printCSVValue(flag_smart_bat_gohome, smart_battery_infoIntSig, "flag_smart_bat_gohome",lineT, valid);
 printCSVValue(flag_smart_bat_land, smart_battery_infoIntSig, "flag_smart_bat_land",lineT, valid);
 printCSVValue(flag_cell_err, smart_battery_infoIntSig, "flag_cell_err",lineT, valid);
 printCSVValue(flag_communite_err, smart_battery_infoIntSig, "flag_communite_err",lineT, valid);
 printCSVValue(real_desc_speed, smart_battery_infoFloatSig, "real_desc_speed",lineT, valid);
 printCSVValue(flag_vol_very_low, smart_battery_infoIntSig, "flag_vol_very_low",lineT, valid);
 printCSVValue(flag_temp_and_vol_low, smart_battery_infoIntSig, "flag_temp_and_vol_low",lineT, valid);
 printCSVValue(flag_first_charge_not_full, smart_battery_infoIntSig, "flag_first_charge_not_full",lineT, valid);
 printCSVValue(g_filter_vol, smart_battery_infoFloatSig, "g_filter_vol",lineT, valid);
 printCSVValue(g_filter_I, smart_battery_infoFloatSig, "g_filter_I",lineT, valid);
 printCSVValue(g_evl_vol, smart_battery_infoFloatSig, "g_evl_vol",lineT, valid);
 printCSVValue(g_delt_I, smart_battery_infoFloatSig, "g_delt_I",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
