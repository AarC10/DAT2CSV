package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class battery_info_17 extends Record {
protected boolean valid = false;

protected int design_capacity = (int)0;
protected int full_charge_capacity = (int)0;
protected int remaining_capacity = (int)0;
protected int pack_voltage = (int)0;
protected short current = (short)0;
protected short life_percentage = (short)0;
protected short capacity_percentage = (short)0;
protected short temperature = (short)0;
protected int cycle_count = (int)0;
protected int serial_number = (int)0;
protected int cell1 = (int)0;
protected int cell2 = (int)0;
protected int cell3 = (int)0;
protected int cell4 = (int)0;
protected int cell5 = (int)0;
protected int cell6 = (int)0;
protected short average_current = (short)0;
protected short right = (short)0;
protected long error_count = (long)0;
protected long n_discharge_times = (long)0;
protected long current_status = (long)0;
protected int vol_main = (int)0;

      public battery_info_17(ConvertDat convertDat) {
           super(convertDat, 17, 47);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

 design_capacity = record.getUnsignedShort(0);
 full_charge_capacity = record.getUnsignedShort(2);
 remaining_capacity = record.getUnsignedShort(4);
 pack_voltage = record.getUnsignedShort(6);
 current = record.getShort(8);
life_percentage = record.getUnsignedByte(10);
capacity_percentage = record.getUnsignedByte(11);
 temperature = record.getShort(12);
 cycle_count = record.getUnsignedShort(14);
 serial_number = record.getUnsignedShort(16);
 cell1 = record.getUnsignedShort(18);
 cell2 = record.getUnsignedShort(20);
 cell3 = record.getUnsignedShort(22);
 cell4 = record.getUnsignedShort(24);
 cell5 = record.getUnsignedShort(26);
 cell6 = record.getUnsignedShort(28);
 average_current = record.getShort(30);
right = record.getUnsignedByte(32);
 error_count = record.getUnsignedInt(33);
 n_discharge_times = record.getUnsignedInt(37);
 current_status = record.getUnsignedInt(41);
 vol_main = record.getUnsignedShort(45);
} catch (Exception e) {RecordException(e);}}


    protected static Signal battery_infoIntSig = Signal
.SeriesInt("battery_info", "", null, Units.noUnits);
    protected static Signal battery_infoFloatSig = Signal
.SeriesFloat("battery_info", "", null, Units.noUnits);
    protected static Signal battery_infoDoubleSig = Signal
.SeriesDouble("battery_info", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(design_capacity, battery_infoIntSig, "design_capacity",lineT, valid);
 printCSVValue(full_charge_capacity, battery_infoIntSig, "full_charge_capacity",lineT, valid);
 printCSVValue(remaining_capacity, battery_infoIntSig, "remaining_capacity",lineT, valid);
 printCSVValue(pack_voltage, battery_infoIntSig, "pack_voltage",lineT, valid);
 printCSVValue(current, battery_infoIntSig, "current",lineT, valid);
 printCSVValue(life_percentage, battery_infoIntSig, "life_percentage",lineT, valid);
 printCSVValue(capacity_percentage, battery_infoIntSig, "capacity_percentage",lineT, valid);
 printCSVValue(temperature, battery_infoIntSig, "temperature",lineT, valid);
 printCSVValue(cycle_count, battery_infoIntSig, "cycle_count",lineT, valid);
 printCSVValue(serial_number, battery_infoIntSig, "serial_number",lineT, valid);
 printCSVValue(cell1, battery_infoIntSig, "cell1",lineT, valid);
 printCSVValue(cell2, battery_infoIntSig, "cell2",lineT, valid);
 printCSVValue(cell3, battery_infoIntSig, "cell3",lineT, valid);
 printCSVValue(cell4, battery_infoIntSig, "cell4",lineT, valid);
 printCSVValue(cell5, battery_infoIntSig, "cell5",lineT, valid);
 printCSVValue(cell6, battery_infoIntSig, "cell6",lineT, valid);
 printCSVValue(average_current, battery_infoIntSig, "average_current",lineT, valid);
 printCSVValue(right, battery_infoIntSig, "right",lineT, valid);
 printCSVValue(error_count, battery_infoIntSig, "error_count",lineT, valid);
 printCSVValue(n_discharge_times, battery_infoIntSig, "n_discharge_times",lineT, valid);
 printCSVValue(current_status, battery_infoIntSig, "current_status",lineT, valid);
 printCSVValue(vol_main, battery_infoIntSig, "vol_main",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
