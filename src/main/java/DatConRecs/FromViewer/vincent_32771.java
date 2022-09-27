package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class vincent_32771 extends Record {
protected boolean valid = false;

protected float vincent_debug_data0 = (float)0;
protected float vincent_debug_data1 = (float)0;
protected float vincent_debug_data2 = (float)0;
protected float vincent_debug_data3 = (float)0;
protected float vincent_debug_data4 = (float)0;
protected float vincent_debug_data5 = (float)0;
protected float vincent_debug_data6 = (float)0;
protected float vincent_debug_data7 = (float)0;
protected float vincent_debug_data8 = (float)0;
protected float vincent_debug_data9 = (float)0;
protected float vincent_debug_data10 = (float)0;
protected float vincent_debug_data11 = (float)0;
protected float vincent_debug_data12 = (float)0;
protected float vincent_debug_data13 = (float)0;
protected float vincent_debug_data14 = (float)0;
protected float vincent_debug_data15 = (float)0;
protected float vincent_debug_data16 = (float)0;
protected float vincent_debug_data17 = (float)0;
protected float vincent_debug_data18 = (float)0;
protected float vincent_debug_data19 = (float)0;
protected float vincent_debug_data20 = (float)0;
protected float vincent_debug_data21 = (float)0;
protected float vincent_debug_data22 = (float)0;
protected float vincent_debug_data23 = (float)0;
protected float vincent_debug_data24 = (float)0;
protected float vincent_debug_data25 = (float)0;
protected float vincent_debug_data26 = (float)0;
protected float vincent_debug_data27 = (float)0;
protected float vincent_debug_data28 = (float)0;
protected float vincent_debug_data29 = (float)0;
protected float vincent_debug_data30 = (float)0;
protected float vincent_debug_data31 = (float)0;
protected float vincent_debug_data32 = (float)0;
protected float vincent_debug_data33 = (float)0;
protected float vincent_debug_data34 = (float)0;
protected float vincent_debug_data35 = (float)0;
protected float vincent_debug_data36 = (float)0;
protected float vincent_debug_data37 = (float)0;
protected float vincent_debug_data38 = (float)0;
protected float vincent_debug_data39 = (float)0;
protected float vincent_debug_data40 = (float)0;
protected float vincent_debug_data41 = (float)0;
protected float vincent_debug_data42 = (float)0;
protected float vincent_debug_data43 = (float)0;
protected float vincent_debug_data44 = (float)0;
protected float vincent_debug_data45 = (float)0;
protected float vincent_debug_data46 = (float)0;
protected float vincent_debug_data47 = (float)0;
protected float vincent_debug_data48 = (float)0;
protected float vincent_debug_data49 = (float)0;
protected float vincent_debug_data50 = (float)0;
protected float vincent_debug_data51 = (float)0;
protected float vincent_debug_data52 = (float)0;
protected float vincent_debug_data53 = (float)0;
protected float vincent_debug_data54 = (float)0;
protected float vincent_debug_data55 = (float)0;
protected float vincent_debug_data56 = (float)0;
protected float vincent_debug_data57 = (float)0;
protected float vincent_debug_data58 = (float)0;
protected float vincent_debug_data59 = (float)0;

      public vincent_32771(ConvertDat convertDat) {
           super(convertDat, 32771, 240);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

 vincent_debug_data0 = record.getFloat(0);
 vincent_debug_data1 = record.getFloat(4);
 vincent_debug_data2 = record.getFloat(8);
 vincent_debug_data3 = record.getFloat(12);
 vincent_debug_data4 = record.getFloat(16);
 vincent_debug_data5 = record.getFloat(20);
 vincent_debug_data6 = record.getFloat(24);
 vincent_debug_data7 = record.getFloat(28);
 vincent_debug_data8 = record.getFloat(32);
 vincent_debug_data9 = record.getFloat(36);
 vincent_debug_data10 = record.getFloat(40);
 vincent_debug_data11 = record.getFloat(44);
 vincent_debug_data12 = record.getFloat(48);
 vincent_debug_data13 = record.getFloat(52);
 vincent_debug_data14 = record.getFloat(56);
 vincent_debug_data15 = record.getFloat(60);
 vincent_debug_data16 = record.getFloat(64);
 vincent_debug_data17 = record.getFloat(68);
 vincent_debug_data18 = record.getFloat(72);
 vincent_debug_data19 = record.getFloat(76);
 vincent_debug_data20 = record.getFloat(80);
 vincent_debug_data21 = record.getFloat(84);
 vincent_debug_data22 = record.getFloat(88);
 vincent_debug_data23 = record.getFloat(92);
 vincent_debug_data24 = record.getFloat(96);
 vincent_debug_data25 = record.getFloat(100);
 vincent_debug_data26 = record.getFloat(104);
 vincent_debug_data27 = record.getFloat(108);
 vincent_debug_data28 = record.getFloat(112);
 vincent_debug_data29 = record.getFloat(116);
 vincent_debug_data30 = record.getFloat(120);
 vincent_debug_data31 = record.getFloat(124);
 vincent_debug_data32 = record.getFloat(128);
 vincent_debug_data33 = record.getFloat(132);
 vincent_debug_data34 = record.getFloat(136);
 vincent_debug_data35 = record.getFloat(140);
 vincent_debug_data36 = record.getFloat(144);
 vincent_debug_data37 = record.getFloat(148);
 vincent_debug_data38 = record.getFloat(152);
 vincent_debug_data39 = record.getFloat(156);
 vincent_debug_data40 = record.getFloat(160);
 vincent_debug_data41 = record.getFloat(164);
 vincent_debug_data42 = record.getFloat(168);
 vincent_debug_data43 = record.getFloat(172);
 vincent_debug_data44 = record.getFloat(176);
 vincent_debug_data45 = record.getFloat(180);
 vincent_debug_data46 = record.getFloat(184);
 vincent_debug_data47 = record.getFloat(188);
 vincent_debug_data48 = record.getFloat(192);
 vincent_debug_data49 = record.getFloat(196);
 vincent_debug_data50 = record.getFloat(200);
 vincent_debug_data51 = record.getFloat(204);
 vincent_debug_data52 = record.getFloat(208);
 vincent_debug_data53 = record.getFloat(212);
 vincent_debug_data54 = record.getFloat(216);
 vincent_debug_data55 = record.getFloat(220);
 vincent_debug_data56 = record.getFloat(224);
 vincent_debug_data57 = record.getFloat(228);
 vincent_debug_data58 = record.getFloat(232);
 vincent_debug_data59 = record.getFloat(236);
} catch (Exception e) {RecordException(e);}}


    protected static Signal vincentIntSig = Signal
.SeriesInt("vincent", "", null, Units.noUnits);
    protected static Signal vincentFloatSig = Signal
.SeriesFloat("vincent", "", null, Units.noUnits);
    protected static Signal vincentDoubleSig = Signal
.SeriesDouble("vincent", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(vincent_debug_data0, vincentFloatSig, "vincent_debug_data0",lineT, valid);
 printCSVValue(vincent_debug_data1, vincentFloatSig, "vincent_debug_data1",lineT, valid);
 printCSVValue(vincent_debug_data2, vincentFloatSig, "vincent_debug_data2",lineT, valid);
 printCSVValue(vincent_debug_data3, vincentFloatSig, "vincent_debug_data3",lineT, valid);
 printCSVValue(vincent_debug_data4, vincentFloatSig, "vincent_debug_data4",lineT, valid);
 printCSVValue(vincent_debug_data5, vincentFloatSig, "vincent_debug_data5",lineT, valid);
 printCSVValue(vincent_debug_data6, vincentFloatSig, "vincent_debug_data6",lineT, valid);
 printCSVValue(vincent_debug_data7, vincentFloatSig, "vincent_debug_data7",lineT, valid);
 printCSVValue(vincent_debug_data8, vincentFloatSig, "vincent_debug_data8",lineT, valid);
 printCSVValue(vincent_debug_data9, vincentFloatSig, "vincent_debug_data9",lineT, valid);
 printCSVValue(vincent_debug_data10, vincentFloatSig, "vincent_debug_data10",lineT, valid);
 printCSVValue(vincent_debug_data11, vincentFloatSig, "vincent_debug_data11",lineT, valid);
 printCSVValue(vincent_debug_data12, vincentFloatSig, "vincent_debug_data12",lineT, valid);
 printCSVValue(vincent_debug_data13, vincentFloatSig, "vincent_debug_data13",lineT, valid);
 printCSVValue(vincent_debug_data14, vincentFloatSig, "vincent_debug_data14",lineT, valid);
 printCSVValue(vincent_debug_data15, vincentFloatSig, "vincent_debug_data15",lineT, valid);
 printCSVValue(vincent_debug_data16, vincentFloatSig, "vincent_debug_data16",lineT, valid);
 printCSVValue(vincent_debug_data17, vincentFloatSig, "vincent_debug_data17",lineT, valid);
 printCSVValue(vincent_debug_data18, vincentFloatSig, "vincent_debug_data18",lineT, valid);
 printCSVValue(vincent_debug_data19, vincentFloatSig, "vincent_debug_data19",lineT, valid);
 printCSVValue(vincent_debug_data20, vincentFloatSig, "vincent_debug_data20",lineT, valid);
 printCSVValue(vincent_debug_data21, vincentFloatSig, "vincent_debug_data21",lineT, valid);
 printCSVValue(vincent_debug_data22, vincentFloatSig, "vincent_debug_data22",lineT, valid);
 printCSVValue(vincent_debug_data23, vincentFloatSig, "vincent_debug_data23",lineT, valid);
 printCSVValue(vincent_debug_data24, vincentFloatSig, "vincent_debug_data24",lineT, valid);
 printCSVValue(vincent_debug_data25, vincentFloatSig, "vincent_debug_data25",lineT, valid);
 printCSVValue(vincent_debug_data26, vincentFloatSig, "vincent_debug_data26",lineT, valid);
 printCSVValue(vincent_debug_data27, vincentFloatSig, "vincent_debug_data27",lineT, valid);
 printCSVValue(vincent_debug_data28, vincentFloatSig, "vincent_debug_data28",lineT, valid);
 printCSVValue(vincent_debug_data29, vincentFloatSig, "vincent_debug_data29",lineT, valid);
 printCSVValue(vincent_debug_data30, vincentFloatSig, "vincent_debug_data30",lineT, valid);
 printCSVValue(vincent_debug_data31, vincentFloatSig, "vincent_debug_data31",lineT, valid);
 printCSVValue(vincent_debug_data32, vincentFloatSig, "vincent_debug_data32",lineT, valid);
 printCSVValue(vincent_debug_data33, vincentFloatSig, "vincent_debug_data33",lineT, valid);
 printCSVValue(vincent_debug_data34, vincentFloatSig, "vincent_debug_data34",lineT, valid);
 printCSVValue(vincent_debug_data35, vincentFloatSig, "vincent_debug_data35",lineT, valid);
 printCSVValue(vincent_debug_data36, vincentFloatSig, "vincent_debug_data36",lineT, valid);
 printCSVValue(vincent_debug_data37, vincentFloatSig, "vincent_debug_data37",lineT, valid);
 printCSVValue(vincent_debug_data38, vincentFloatSig, "vincent_debug_data38",lineT, valid);
 printCSVValue(vincent_debug_data39, vincentFloatSig, "vincent_debug_data39",lineT, valid);
 printCSVValue(vincent_debug_data40, vincentFloatSig, "vincent_debug_data40",lineT, valid);
 printCSVValue(vincent_debug_data41, vincentFloatSig, "vincent_debug_data41",lineT, valid);
 printCSVValue(vincent_debug_data42, vincentFloatSig, "vincent_debug_data42",lineT, valid);
 printCSVValue(vincent_debug_data43, vincentFloatSig, "vincent_debug_data43",lineT, valid);
 printCSVValue(vincent_debug_data44, vincentFloatSig, "vincent_debug_data44",lineT, valid);
 printCSVValue(vincent_debug_data45, vincentFloatSig, "vincent_debug_data45",lineT, valid);
 printCSVValue(vincent_debug_data46, vincentFloatSig, "vincent_debug_data46",lineT, valid);
 printCSVValue(vincent_debug_data47, vincentFloatSig, "vincent_debug_data47",lineT, valid);
 printCSVValue(vincent_debug_data48, vincentFloatSig, "vincent_debug_data48",lineT, valid);
 printCSVValue(vincent_debug_data49, vincentFloatSig, "vincent_debug_data49",lineT, valid);
 printCSVValue(vincent_debug_data50, vincentFloatSig, "vincent_debug_data50",lineT, valid);
 printCSVValue(vincent_debug_data51, vincentFloatSig, "vincent_debug_data51",lineT, valid);
 printCSVValue(vincent_debug_data52, vincentFloatSig, "vincent_debug_data52",lineT, valid);
 printCSVValue(vincent_debug_data53, vincentFloatSig, "vincent_debug_data53",lineT, valid);
 printCSVValue(vincent_debug_data54, vincentFloatSig, "vincent_debug_data54",lineT, valid);
 printCSVValue(vincent_debug_data55, vincentFloatSig, "vincent_debug_data55",lineT, valid);
 printCSVValue(vincent_debug_data56, vincentFloatSig, "vincent_debug_data56",lineT, valid);
 printCSVValue(vincent_debug_data57, vincentFloatSig, "vincent_debug_data57",lineT, valid);
 printCSVValue(vincent_debug_data58, vincentFloatSig, "vincent_debug_data58",lineT, valid);
 printCSVValue(vincent_debug_data59, vincentFloatSig, "vincent_debug_data59",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
