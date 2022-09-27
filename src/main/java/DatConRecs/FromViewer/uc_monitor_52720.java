package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class uc_monitor_52720 extends Record {
protected boolean valid = false;

protected int cpu_usage_pcnt = (int)0;
protected int cpu_usage_task_b_pcnt = (int)0;
protected int cpu_usage_task_a_pcnt = (int)0;
protected int uc_resv0 = (int)0;
protected int max_time_workqueue = (int)0;
protected int max_time_task_b = (int)0;
protected int max_time_task_a = (int)0;
protected int max_time_task_c = (int)0;
protected int max_time_task_d = (int)0;
protected int uc_resv1 = (int)0;
protected int stack_usage_irq_pcnt = (int)0;
protected int stack_usage_workqueue_pcnt = (int)0;
protected int stack_usage_b_pcnt = (int)0;
protected int stack_usage_a_pcnt = (int)0;
protected int stack_usage_c_pcnt = (int)0;
protected int stack_usage_d_pcnt = (int)0;
protected int uc_resv2 = (int)0;
protected int pend_cnt_a = (int)0;
protected int pend_cnt_b = (int)0;
protected int pend_cnt_c = (int)0;
protected int pend_cnt_d = (int)0;

      public uc_monitor_52720(ConvertDat convertDat) {
           super(convertDat, 52720, 42);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

 cpu_usage_pcnt = record.getUnsignedShort(0);
 cpu_usage_task_b_pcnt = record.getUnsignedShort(2);
 cpu_usage_task_a_pcnt = record.getUnsignedShort(4);
 uc_resv0 = record.getUnsignedShort(6);
 max_time_workqueue = record.getUnsignedShort(8);
 max_time_task_b = record.getUnsignedShort(10);
 max_time_task_a = record.getUnsignedShort(12);
 max_time_task_c = record.getUnsignedShort(14);
 max_time_task_d = record.getUnsignedShort(16);
 uc_resv1 = record.getUnsignedShort(18);
 stack_usage_irq_pcnt = record.getUnsignedShort(20);
 stack_usage_workqueue_pcnt = record.getUnsignedShort(22);
 stack_usage_b_pcnt = record.getUnsignedShort(24);
 stack_usage_a_pcnt = record.getUnsignedShort(26);
 stack_usage_c_pcnt = record.getUnsignedShort(28);
 stack_usage_d_pcnt = record.getUnsignedShort(30);
 uc_resv2 = record.getUnsignedShort(32);
 pend_cnt_a = record.getUnsignedShort(34);
 pend_cnt_b = record.getUnsignedShort(36);
 pend_cnt_c = record.getUnsignedShort(38);
 pend_cnt_d = record.getUnsignedShort(40);
} catch (Exception e) {RecordException(e);}}


    protected static Signal uc_monitorIntSig = Signal
.SeriesInt("uc_monitor", "", null, Units.noUnits);
    protected static Signal uc_monitorFloatSig = Signal
.SeriesFloat("uc_monitor", "", null, Units.noUnits);
    protected static Signal uc_monitorDoubleSig = Signal
.SeriesDouble("uc_monitor", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(cpu_usage_pcnt, uc_monitorIntSig, "cpu_usage_pcnt",lineT, valid);
 printCSVValue(cpu_usage_task_b_pcnt, uc_monitorIntSig, "cpu_usage_task_b_pcnt",lineT, valid);
 printCSVValue(cpu_usage_task_a_pcnt, uc_monitorIntSig, "cpu_usage_task_a_pcnt",lineT, valid);
 printCSVValue(uc_resv0, uc_monitorIntSig, "uc_resv0",lineT, valid);
 printCSVValue(max_time_workqueue, uc_monitorIntSig, "max_time_workqueue",lineT, valid);
 printCSVValue(max_time_task_b, uc_monitorIntSig, "max_time_task_b",lineT, valid);
 printCSVValue(max_time_task_a, uc_monitorIntSig, "max_time_task_a",lineT, valid);
 printCSVValue(max_time_task_c, uc_monitorIntSig, "max_time_task_c",lineT, valid);
 printCSVValue(max_time_task_d, uc_monitorIntSig, "max_time_task_d",lineT, valid);
 printCSVValue(uc_resv1, uc_monitorIntSig, "uc_resv1",lineT, valid);
 printCSVValue(stack_usage_irq_pcnt, uc_monitorIntSig, "stack_usage_irq_pcnt",lineT, valid);
 printCSVValue(stack_usage_workqueue_pcnt, uc_monitorIntSig, "stack_usage_workqueue_pcnt",lineT, valid);
 printCSVValue(stack_usage_b_pcnt, uc_monitorIntSig, "stack_usage_b_pcnt",lineT, valid);
 printCSVValue(stack_usage_a_pcnt, uc_monitorIntSig, "stack_usage_a_pcnt",lineT, valid);
 printCSVValue(stack_usage_c_pcnt, uc_monitorIntSig, "stack_usage_c_pcnt",lineT, valid);
 printCSVValue(stack_usage_d_pcnt, uc_monitorIntSig, "stack_usage_d_pcnt",lineT, valid);
 printCSVValue(uc_resv2, uc_monitorIntSig, "uc_resv2",lineT, valid);
 printCSVValue(pend_cnt_a, uc_monitorIntSig, "pend_cnt_a",lineT, valid);
 printCSVValue(pend_cnt_b, uc_monitorIntSig, "pend_cnt_b",lineT, valid);
 printCSVValue(pend_cnt_c, uc_monitorIntSig, "pend_cnt_c",lineT, valid);
 printCSVValue(pend_cnt_d, uc_monitorIntSig, "pend_cnt_d",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
