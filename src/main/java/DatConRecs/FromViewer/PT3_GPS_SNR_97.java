package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class PT3_GPS_SNR_97 extends Record {
protected boolean valid = false;

protected short pt3_gps_snr1 = (short)0;
protected short pt3_gps_snr2 = (short)0;
protected short pt3_gps_snr3 = (short)0;
protected short pt3_gps_snr4 = (short)0;
protected short pt3_gps_snr5 = (short)0;
protected short pt3_gps_snr6 = (short)0;
protected short pt3_gps_snr7 = (short)0;
protected short pt3_gps_snr8 = (short)0;
protected short pt3_gps_snr9 = (short)0;
protected short pt3_gps_snr10 = (short)0;
protected short pt3_gps_snr11 = (short)0;
protected short pt3_gps_snr12 = (short)0;
protected short pt3_gps_snr13 = (short)0;
protected short pt3_gps_snr14 = (short)0;
protected short pt3_gps_snr15 = (short)0;
protected short pt3_gps_snr16 = (short)0;
protected short pt3_gps_snr17 = (short)0;
protected short pt3_gps_snr18 = (short)0;
protected short pt3_gps_snr19 = (short)0;
protected short pt3_gps_snr20 = (short)0;
protected short pt3_gps_snr21 = (short)0;
protected short pt3_gps_snr22 = (short)0;
protected short pt3_gps_snr23 = (short)0;
protected short pt3_gps_snr24 = (short)0;
protected short pt3_gps_snr25 = (short)0;
protected short pt3_gps_snr26 = (short)0;
protected short pt3_gps_snr27 = (short)0;
protected short pt3_gps_snr28 = (short)0;
protected short pt3_gps_snr29 = (short)0;
protected short pt3_gps_snr30 = (short)0;
protected short pt3_gps_snr31 = (short)0;
protected short pt3_gps_snr32 = (short)0;
protected short pt3_gln_snr1 = (short)0;
protected short pt3_gln_snr2 = (short)0;
protected short pt3_gln_snr3 = (short)0;
protected short pt3_gln_snr4 = (short)0;
protected short pt3_gln_snr5 = (short)0;
protected short pt3_gln_snr6 = (short)0;
protected short pt3_gln_snr7 = (short)0;
protected short pt3_gln_snr8 = (short)0;
protected short pt3_gln_snr9 = (short)0;
protected short pt3_gln_snr10 = (short)0;
protected short pt3_gln_snr11 = (short)0;
protected short pt3_gln_snr12 = (short)0;
protected short pt3_gln_snr13 = (short)0;
protected short pt3_gln_snr14 = (short)0;
protected short pt3_gln_snr15 = (short)0;
protected short pt3_gln_snr16 = (short)0;
protected short pt3_gln_snr17 = (short)0;
protected short pt3_gln_snr18 = (short)0;
protected short pt3_gln_snr19 = (short)0;
protected short pt3_gln_snr20 = (short)0;
protected short pt3_gln_snr21 = (short)0;
protected short pt3_gln_snr22 = (short)0;
protected short pt3_gln_snr23 = (short)0;
protected short pt3_gln_snr24 = (short)0;
protected short pt3_gln_snr25 = (short)0;
protected short pt3_gln_snr26 = (short)0;
protected short pt3_gln_snr27 = (short)0;
protected short pt3_gln_snr28 = (short)0;
protected short pt3_gln_snr29 = (short)0;
protected short pt3_gln_snr30 = (short)0;
protected short pt3_gln_snr31 = (short)0;
protected short pt3_gln_snr32 = (short)0;
protected int pt3_gln_cnt = (int)0;

      public PT3_GPS_SNR_97(ConvertDat convertDat) {
           super(convertDat, 97, 66);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

pt3_gps_snr1 = record.getUnsignedByte(0);
pt3_gps_snr2 = record.getUnsignedByte(1);
pt3_gps_snr3 = record.getUnsignedByte(2);
pt3_gps_snr4 = record.getUnsignedByte(3);
pt3_gps_snr5 = record.getUnsignedByte(4);
pt3_gps_snr6 = record.getUnsignedByte(5);
pt3_gps_snr7 = record.getUnsignedByte(6);
pt3_gps_snr8 = record.getUnsignedByte(7);
pt3_gps_snr9 = record.getUnsignedByte(8);
pt3_gps_snr10 = record.getUnsignedByte(9);
pt3_gps_snr11 = record.getUnsignedByte(10);
pt3_gps_snr12 = record.getUnsignedByte(11);
pt3_gps_snr13 = record.getUnsignedByte(12);
pt3_gps_snr14 = record.getUnsignedByte(13);
pt3_gps_snr15 = record.getUnsignedByte(14);
pt3_gps_snr16 = record.getUnsignedByte(15);
pt3_gps_snr17 = record.getUnsignedByte(16);
pt3_gps_snr18 = record.getUnsignedByte(17);
pt3_gps_snr19 = record.getUnsignedByte(18);
pt3_gps_snr20 = record.getUnsignedByte(19);
pt3_gps_snr21 = record.getUnsignedByte(20);
pt3_gps_snr22 = record.getUnsignedByte(21);
pt3_gps_snr23 = record.getUnsignedByte(22);
pt3_gps_snr24 = record.getUnsignedByte(23);
pt3_gps_snr25 = record.getUnsignedByte(24);
pt3_gps_snr26 = record.getUnsignedByte(25);
pt3_gps_snr27 = record.getUnsignedByte(26);
pt3_gps_snr28 = record.getUnsignedByte(27);
pt3_gps_snr29 = record.getUnsignedByte(28);
pt3_gps_snr30 = record.getUnsignedByte(29);
pt3_gps_snr31 = record.getUnsignedByte(30);
pt3_gps_snr32 = record.getUnsignedByte(31);
pt3_gln_snr1 = record.getUnsignedByte(32);
pt3_gln_snr2 = record.getUnsignedByte(33);
pt3_gln_snr3 = record.getUnsignedByte(34);
pt3_gln_snr4 = record.getUnsignedByte(35);
pt3_gln_snr5 = record.getUnsignedByte(36);
pt3_gln_snr6 = record.getUnsignedByte(37);
pt3_gln_snr7 = record.getUnsignedByte(38);
pt3_gln_snr8 = record.getUnsignedByte(39);
pt3_gln_snr9 = record.getUnsignedByte(40);
pt3_gln_snr10 = record.getUnsignedByte(41);
pt3_gln_snr11 = record.getUnsignedByte(42);
pt3_gln_snr12 = record.getUnsignedByte(43);
pt3_gln_snr13 = record.getUnsignedByte(44);
pt3_gln_snr14 = record.getUnsignedByte(45);
pt3_gln_snr15 = record.getUnsignedByte(46);
pt3_gln_snr16 = record.getUnsignedByte(47);
pt3_gln_snr17 = record.getUnsignedByte(48);
pt3_gln_snr18 = record.getUnsignedByte(49);
pt3_gln_snr19 = record.getUnsignedByte(50);
pt3_gln_snr20 = record.getUnsignedByte(51);
pt3_gln_snr21 = record.getUnsignedByte(52);
pt3_gln_snr22 = record.getUnsignedByte(53);
pt3_gln_snr23 = record.getUnsignedByte(54);
pt3_gln_snr24 = record.getUnsignedByte(55);
pt3_gln_snr25 = record.getUnsignedByte(56);
pt3_gln_snr26 = record.getUnsignedByte(57);
pt3_gln_snr27 = record.getUnsignedByte(58);
pt3_gln_snr28 = record.getUnsignedByte(59);
pt3_gln_snr29 = record.getUnsignedByte(60);
pt3_gln_snr30 = record.getUnsignedByte(61);
pt3_gln_snr31 = record.getUnsignedByte(62);
pt3_gln_snr32 = record.getUnsignedByte(63);
 pt3_gln_cnt = record.getUnsignedShort(64);
} catch (Exception e) {RecordException(e);}}


    protected static Signal PT3_GPS_SNRIntSig = Signal
.SeriesInt("PT3_GPS_SNR", "", null, Units.noUnits);
    protected static Signal PT3_GPS_SNRFloatSig = Signal
.SeriesFloat("PT3_GPS_SNR", "", null, Units.noUnits);
    protected static Signal PT3_GPS_SNRDoubleSig = Signal
.SeriesDouble("PT3_GPS_SNR", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(pt3_gps_snr1, PT3_GPS_SNRIntSig, "pt3_gps_snr1",lineT, valid);
 printCSVValue(pt3_gps_snr2, PT3_GPS_SNRIntSig, "pt3_gps_snr2",lineT, valid);
 printCSVValue(pt3_gps_snr3, PT3_GPS_SNRIntSig, "pt3_gps_snr3",lineT, valid);
 printCSVValue(pt3_gps_snr4, PT3_GPS_SNRIntSig, "pt3_gps_snr4",lineT, valid);
 printCSVValue(pt3_gps_snr5, PT3_GPS_SNRIntSig, "pt3_gps_snr5",lineT, valid);
 printCSVValue(pt3_gps_snr6, PT3_GPS_SNRIntSig, "pt3_gps_snr6",lineT, valid);
 printCSVValue(pt3_gps_snr7, PT3_GPS_SNRIntSig, "pt3_gps_snr7",lineT, valid);
 printCSVValue(pt3_gps_snr8, PT3_GPS_SNRIntSig, "pt3_gps_snr8",lineT, valid);
 printCSVValue(pt3_gps_snr9, PT3_GPS_SNRIntSig, "pt3_gps_snr9",lineT, valid);
 printCSVValue(pt3_gps_snr10, PT3_GPS_SNRIntSig, "pt3_gps_snr10",lineT, valid);
 printCSVValue(pt3_gps_snr11, PT3_GPS_SNRIntSig, "pt3_gps_snr11",lineT, valid);
 printCSVValue(pt3_gps_snr12, PT3_GPS_SNRIntSig, "pt3_gps_snr12",lineT, valid);
 printCSVValue(pt3_gps_snr13, PT3_GPS_SNRIntSig, "pt3_gps_snr13",lineT, valid);
 printCSVValue(pt3_gps_snr14, PT3_GPS_SNRIntSig, "pt3_gps_snr14",lineT, valid);
 printCSVValue(pt3_gps_snr15, PT3_GPS_SNRIntSig, "pt3_gps_snr15",lineT, valid);
 printCSVValue(pt3_gps_snr16, PT3_GPS_SNRIntSig, "pt3_gps_snr16",lineT, valid);
 printCSVValue(pt3_gps_snr17, PT3_GPS_SNRIntSig, "pt3_gps_snr17",lineT, valid);
 printCSVValue(pt3_gps_snr18, PT3_GPS_SNRIntSig, "pt3_gps_snr18",lineT, valid);
 printCSVValue(pt3_gps_snr19, PT3_GPS_SNRIntSig, "pt3_gps_snr19",lineT, valid);
 printCSVValue(pt3_gps_snr20, PT3_GPS_SNRIntSig, "pt3_gps_snr20",lineT, valid);
 printCSVValue(pt3_gps_snr21, PT3_GPS_SNRIntSig, "pt3_gps_snr21",lineT, valid);
 printCSVValue(pt3_gps_snr22, PT3_GPS_SNRIntSig, "pt3_gps_snr22",lineT, valid);
 printCSVValue(pt3_gps_snr23, PT3_GPS_SNRIntSig, "pt3_gps_snr23",lineT, valid);
 printCSVValue(pt3_gps_snr24, PT3_GPS_SNRIntSig, "pt3_gps_snr24",lineT, valid);
 printCSVValue(pt3_gps_snr25, PT3_GPS_SNRIntSig, "pt3_gps_snr25",lineT, valid);
 printCSVValue(pt3_gps_snr26, PT3_GPS_SNRIntSig, "pt3_gps_snr26",lineT, valid);
 printCSVValue(pt3_gps_snr27, PT3_GPS_SNRIntSig, "pt3_gps_snr27",lineT, valid);
 printCSVValue(pt3_gps_snr28, PT3_GPS_SNRIntSig, "pt3_gps_snr28",lineT, valid);
 printCSVValue(pt3_gps_snr29, PT3_GPS_SNRIntSig, "pt3_gps_snr29",lineT, valid);
 printCSVValue(pt3_gps_snr30, PT3_GPS_SNRIntSig, "pt3_gps_snr30",lineT, valid);
 printCSVValue(pt3_gps_snr31, PT3_GPS_SNRIntSig, "pt3_gps_snr31",lineT, valid);
 printCSVValue(pt3_gps_snr32, PT3_GPS_SNRIntSig, "pt3_gps_snr32",lineT, valid);
 printCSVValue(pt3_gln_snr1, PT3_GPS_SNRIntSig, "pt3_gln_snr1",lineT, valid);
 printCSVValue(pt3_gln_snr2, PT3_GPS_SNRIntSig, "pt3_gln_snr2",lineT, valid);
 printCSVValue(pt3_gln_snr3, PT3_GPS_SNRIntSig, "pt3_gln_snr3",lineT, valid);
 printCSVValue(pt3_gln_snr4, PT3_GPS_SNRIntSig, "pt3_gln_snr4",lineT, valid);
 printCSVValue(pt3_gln_snr5, PT3_GPS_SNRIntSig, "pt3_gln_snr5",lineT, valid);
 printCSVValue(pt3_gln_snr6, PT3_GPS_SNRIntSig, "pt3_gln_snr6",lineT, valid);
 printCSVValue(pt3_gln_snr7, PT3_GPS_SNRIntSig, "pt3_gln_snr7",lineT, valid);
 printCSVValue(pt3_gln_snr8, PT3_GPS_SNRIntSig, "pt3_gln_snr8",lineT, valid);
 printCSVValue(pt3_gln_snr9, PT3_GPS_SNRIntSig, "pt3_gln_snr9",lineT, valid);
 printCSVValue(pt3_gln_snr10, PT3_GPS_SNRIntSig, "pt3_gln_snr10",lineT, valid);
 printCSVValue(pt3_gln_snr11, PT3_GPS_SNRIntSig, "pt3_gln_snr11",lineT, valid);
 printCSVValue(pt3_gln_snr12, PT3_GPS_SNRIntSig, "pt3_gln_snr12",lineT, valid);
 printCSVValue(pt3_gln_snr13, PT3_GPS_SNRIntSig, "pt3_gln_snr13",lineT, valid);
 printCSVValue(pt3_gln_snr14, PT3_GPS_SNRIntSig, "pt3_gln_snr14",lineT, valid);
 printCSVValue(pt3_gln_snr15, PT3_GPS_SNRIntSig, "pt3_gln_snr15",lineT, valid);
 printCSVValue(pt3_gln_snr16, PT3_GPS_SNRIntSig, "pt3_gln_snr16",lineT, valid);
 printCSVValue(pt3_gln_snr17, PT3_GPS_SNRIntSig, "pt3_gln_snr17",lineT, valid);
 printCSVValue(pt3_gln_snr18, PT3_GPS_SNRIntSig, "pt3_gln_snr18",lineT, valid);
 printCSVValue(pt3_gln_snr19, PT3_GPS_SNRIntSig, "pt3_gln_snr19",lineT, valid);
 printCSVValue(pt3_gln_snr20, PT3_GPS_SNRIntSig, "pt3_gln_snr20",lineT, valid);
 printCSVValue(pt3_gln_snr21, PT3_GPS_SNRIntSig, "pt3_gln_snr21",lineT, valid);
 printCSVValue(pt3_gln_snr22, PT3_GPS_SNRIntSig, "pt3_gln_snr22",lineT, valid);
 printCSVValue(pt3_gln_snr23, PT3_GPS_SNRIntSig, "pt3_gln_snr23",lineT, valid);
 printCSVValue(pt3_gln_snr24, PT3_GPS_SNRIntSig, "pt3_gln_snr24",lineT, valid);
 printCSVValue(pt3_gln_snr25, PT3_GPS_SNRIntSig, "pt3_gln_snr25",lineT, valid);
 printCSVValue(pt3_gln_snr26, PT3_GPS_SNRIntSig, "pt3_gln_snr26",lineT, valid);
 printCSVValue(pt3_gln_snr27, PT3_GPS_SNRIntSig, "pt3_gln_snr27",lineT, valid);
 printCSVValue(pt3_gln_snr28, PT3_GPS_SNRIntSig, "pt3_gln_snr28",lineT, valid);
 printCSVValue(pt3_gln_snr29, PT3_GPS_SNRIntSig, "pt3_gln_snr29",lineT, valid);
 printCSVValue(pt3_gln_snr30, PT3_GPS_SNRIntSig, "pt3_gln_snr30",lineT, valid);
 printCSVValue(pt3_gln_snr31, PT3_GPS_SNRIntSig, "pt3_gln_snr31",lineT, valid);
 printCSVValue(pt3_gln_snr32, PT3_GPS_SNRIntSig, "pt3_gln_snr32",lineT, valid);
 printCSVValue(pt3_gln_cnt, PT3_GPS_SNRIntSig, "pt3_gln_cnt",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
