package DatConRecs.FromViewer;
import DatConRecs.*;
import DatConRecs.Record;
import files.ConvertDat;
import files.ConvertDat.lineType;
import files.DatConLog;
import files.Signal;
import files.Units;


public class GPS_SNR_11 extends Record {
protected boolean valid = false;

protected short gps_snr1 = (short)0;
protected short gps_snr2 = (short)0;
protected short gps_snr3 = (short)0;
protected short gps_snr4 = (short)0;
protected short gps_snr5 = (short)0;
protected short gps_snr6 = (short)0;
protected short gps_snr7 = (short)0;
protected short gps_snr8 = (short)0;
protected short gps_snr9 = (short)0;
protected short gps_snr10 = (short)0;
protected short gps_snr11 = (short)0;
protected short gps_snr12 = (short)0;
protected short gps_snr13 = (short)0;
protected short gps_snr14 = (short)0;
protected short gps_snr15 = (short)0;
protected short gps_snr16 = (short)0;
protected short gps_snr17 = (short)0;
protected short gps_snr18 = (short)0;
protected short gps_snr19 = (short)0;
protected short gps_snr20 = (short)0;
protected short gps_snr21 = (short)0;
protected short gps_snr22 = (short)0;
protected short gps_snr23 = (short)0;
protected short gps_snr24 = (short)0;
protected short gps_snr25 = (short)0;
protected short gps_snr26 = (short)0;
protected short gps_snr27 = (short)0;
protected short gps_snr28 = (short)0;
protected short gps_snr29 = (short)0;
protected short gps_snr30 = (short)0;
protected short gps_snr31 = (short)0;
protected short gps_snr32 = (short)0;
protected short gln_snr1 = (short)0;
protected short gln_snr2 = (short)0;
protected short gln_snr3 = (short)0;
protected short gln_snr4 = (short)0;
protected short gln_snr5 = (short)0;
protected short gln_snr6 = (short)0;
protected short gln_snr7 = (short)0;
protected short gln_snr8 = (short)0;
protected short gln_snr9 = (short)0;
protected short gln_snr10 = (short)0;
protected short gln_snr11 = (short)0;
protected short gln_snr12 = (short)0;
protected short gln_snr13 = (short)0;
protected short gln_snr14 = (short)0;
protected short gln_snr15 = (short)0;
protected short gln_snr16 = (short)0;
protected short gln_snr17 = (short)0;
protected short gln_snr18 = (short)0;
protected short gln_snr19 = (short)0;
protected short gln_snr20 = (short)0;
protected short gln_snr21 = (short)0;
protected short gln_snr22 = (short)0;
protected short gln_snr23 = (short)0;
protected short gln_snr24 = (short)0;
protected short gln_snr25 = (short)0;
protected short gln_snr26 = (short)0;
protected short gln_snr27 = (short)0;
protected short gln_snr28 = (short)0;
protected short gln_snr29 = (short)0;
protected short gln_snr30 = (short)0;
protected short gln_snr31 = (short)0;
protected short gln_snr32 = (short)0;
protected short gln_cnt = (short)0;

      public GPS_SNR_11(ConvertDat convertDat) {
           super(convertDat, 11, 65);
       }

@Override
  public void process(Payload record) {
      super.process(record);
        try {
      valid = true;

gps_snr1 = record.getUnsignedByte(0);
gps_snr2 = record.getUnsignedByte(1);
gps_snr3 = record.getUnsignedByte(2);
gps_snr4 = record.getUnsignedByte(3);
gps_snr5 = record.getUnsignedByte(4);
gps_snr6 = record.getUnsignedByte(5);
gps_snr7 = record.getUnsignedByte(6);
gps_snr8 = record.getUnsignedByte(7);
gps_snr9 = record.getUnsignedByte(8);
gps_snr10 = record.getUnsignedByte(9);
gps_snr11 = record.getUnsignedByte(10);
gps_snr12 = record.getUnsignedByte(11);
gps_snr13 = record.getUnsignedByte(12);
gps_snr14 = record.getUnsignedByte(13);
gps_snr15 = record.getUnsignedByte(14);
gps_snr16 = record.getUnsignedByte(15);
gps_snr17 = record.getUnsignedByte(16);
gps_snr18 = record.getUnsignedByte(17);
gps_snr19 = record.getUnsignedByte(18);
gps_snr20 = record.getUnsignedByte(19);
gps_snr21 = record.getUnsignedByte(20);
gps_snr22 = record.getUnsignedByte(21);
gps_snr23 = record.getUnsignedByte(22);
gps_snr24 = record.getUnsignedByte(23);
gps_snr25 = record.getUnsignedByte(24);
gps_snr26 = record.getUnsignedByte(25);
gps_snr27 = record.getUnsignedByte(26);
gps_snr28 = record.getUnsignedByte(27);
gps_snr29 = record.getUnsignedByte(28);
gps_snr30 = record.getUnsignedByte(29);
gps_snr31 = record.getUnsignedByte(30);
gps_snr32 = record.getUnsignedByte(31);
gln_snr1 = record.getUnsignedByte(32);
gln_snr2 = record.getUnsignedByte(33);
gln_snr3 = record.getUnsignedByte(34);
gln_snr4 = record.getUnsignedByte(35);
gln_snr5 = record.getUnsignedByte(36);
gln_snr6 = record.getUnsignedByte(37);
gln_snr7 = record.getUnsignedByte(38);
gln_snr8 = record.getUnsignedByte(39);
gln_snr9 = record.getUnsignedByte(40);
gln_snr10 = record.getUnsignedByte(41);
gln_snr11 = record.getUnsignedByte(42);
gln_snr12 = record.getUnsignedByte(43);
gln_snr13 = record.getUnsignedByte(44);
gln_snr14 = record.getUnsignedByte(45);
gln_snr15 = record.getUnsignedByte(46);
gln_snr16 = record.getUnsignedByte(47);
gln_snr17 = record.getUnsignedByte(48);
gln_snr18 = record.getUnsignedByte(49);
gln_snr19 = record.getUnsignedByte(50);
gln_snr20 = record.getUnsignedByte(51);
gln_snr21 = record.getUnsignedByte(52);
gln_snr22 = record.getUnsignedByte(53);
gln_snr23 = record.getUnsignedByte(54);
gln_snr24 = record.getUnsignedByte(55);
gln_snr25 = record.getUnsignedByte(56);
gln_snr26 = record.getUnsignedByte(57);
gln_snr27 = record.getUnsignedByte(58);
gln_snr28 = record.getUnsignedByte(59);
gln_snr29 = record.getUnsignedByte(60);
gln_snr30 = record.getUnsignedByte(61);
gln_snr31 = record.getUnsignedByte(62);
gln_snr32 = record.getUnsignedByte(63);
gln_cnt = record.getUnsignedByte(64);
} catch (Exception e) {RecordException(e);}}


    protected static Signal GPS_SNRIntSig = Signal
.SeriesInt("GPS_SNR", "", null, Units.noUnits);
    protected static Signal GPS_SNRFloatSig = Signal
.SeriesFloat("GPS_SNR", "", null, Units.noUnits);
    protected static Signal GPS_SNRDoubleSig = Signal
.SeriesDouble("GPS_SNR", "", null, Units.noUnits);

   public void printCols(lineType lineT) {
try {

 printCSVValue(gps_snr1, GPS_SNRIntSig, "gps_snr1",lineT, valid);
 printCSVValue(gps_snr2, GPS_SNRIntSig, "gps_snr2",lineT, valid);
 printCSVValue(gps_snr3, GPS_SNRIntSig, "gps_snr3",lineT, valid);
 printCSVValue(gps_snr4, GPS_SNRIntSig, "gps_snr4",lineT, valid);
 printCSVValue(gps_snr5, GPS_SNRIntSig, "gps_snr5",lineT, valid);
 printCSVValue(gps_snr6, GPS_SNRIntSig, "gps_snr6",lineT, valid);
 printCSVValue(gps_snr7, GPS_SNRIntSig, "gps_snr7",lineT, valid);
 printCSVValue(gps_snr8, GPS_SNRIntSig, "gps_snr8",lineT, valid);
 printCSVValue(gps_snr9, GPS_SNRIntSig, "gps_snr9",lineT, valid);
 printCSVValue(gps_snr10, GPS_SNRIntSig, "gps_snr10",lineT, valid);
 printCSVValue(gps_snr11, GPS_SNRIntSig, "gps_snr11",lineT, valid);
 printCSVValue(gps_snr12, GPS_SNRIntSig, "gps_snr12",lineT, valid);
 printCSVValue(gps_snr13, GPS_SNRIntSig, "gps_snr13",lineT, valid);
 printCSVValue(gps_snr14, GPS_SNRIntSig, "gps_snr14",lineT, valid);
 printCSVValue(gps_snr15, GPS_SNRIntSig, "gps_snr15",lineT, valid);
 printCSVValue(gps_snr16, GPS_SNRIntSig, "gps_snr16",lineT, valid);
 printCSVValue(gps_snr17, GPS_SNRIntSig, "gps_snr17",lineT, valid);
 printCSVValue(gps_snr18, GPS_SNRIntSig, "gps_snr18",lineT, valid);
 printCSVValue(gps_snr19, GPS_SNRIntSig, "gps_snr19",lineT, valid);
 printCSVValue(gps_snr20, GPS_SNRIntSig, "gps_snr20",lineT, valid);
 printCSVValue(gps_snr21, GPS_SNRIntSig, "gps_snr21",lineT, valid);
 printCSVValue(gps_snr22, GPS_SNRIntSig, "gps_snr22",lineT, valid);
 printCSVValue(gps_snr23, GPS_SNRIntSig, "gps_snr23",lineT, valid);
 printCSVValue(gps_snr24, GPS_SNRIntSig, "gps_snr24",lineT, valid);
 printCSVValue(gps_snr25, GPS_SNRIntSig, "gps_snr25",lineT, valid);
 printCSVValue(gps_snr26, GPS_SNRIntSig, "gps_snr26",lineT, valid);
 printCSVValue(gps_snr27, GPS_SNRIntSig, "gps_snr27",lineT, valid);
 printCSVValue(gps_snr28, GPS_SNRIntSig, "gps_snr28",lineT, valid);
 printCSVValue(gps_snr29, GPS_SNRIntSig, "gps_snr29",lineT, valid);
 printCSVValue(gps_snr30, GPS_SNRIntSig, "gps_snr30",lineT, valid);
 printCSVValue(gps_snr31, GPS_SNRIntSig, "gps_snr31",lineT, valid);
 printCSVValue(gps_snr32, GPS_SNRIntSig, "gps_snr32",lineT, valid);
 printCSVValue(gln_snr1, GPS_SNRIntSig, "gln_snr1",lineT, valid);
 printCSVValue(gln_snr2, GPS_SNRIntSig, "gln_snr2",lineT, valid);
 printCSVValue(gln_snr3, GPS_SNRIntSig, "gln_snr3",lineT, valid);
 printCSVValue(gln_snr4, GPS_SNRIntSig, "gln_snr4",lineT, valid);
 printCSVValue(gln_snr5, GPS_SNRIntSig, "gln_snr5",lineT, valid);
 printCSVValue(gln_snr6, GPS_SNRIntSig, "gln_snr6",lineT, valid);
 printCSVValue(gln_snr7, GPS_SNRIntSig, "gln_snr7",lineT, valid);
 printCSVValue(gln_snr8, GPS_SNRIntSig, "gln_snr8",lineT, valid);
 printCSVValue(gln_snr9, GPS_SNRIntSig, "gln_snr9",lineT, valid);
 printCSVValue(gln_snr10, GPS_SNRIntSig, "gln_snr10",lineT, valid);
 printCSVValue(gln_snr11, GPS_SNRIntSig, "gln_snr11",lineT, valid);
 printCSVValue(gln_snr12, GPS_SNRIntSig, "gln_snr12",lineT, valid);
 printCSVValue(gln_snr13, GPS_SNRIntSig, "gln_snr13",lineT, valid);
 printCSVValue(gln_snr14, GPS_SNRIntSig, "gln_snr14",lineT, valid);
 printCSVValue(gln_snr15, GPS_SNRIntSig, "gln_snr15",lineT, valid);
 printCSVValue(gln_snr16, GPS_SNRIntSig, "gln_snr16",lineT, valid);
 printCSVValue(gln_snr17, GPS_SNRIntSig, "gln_snr17",lineT, valid);
 printCSVValue(gln_snr18, GPS_SNRIntSig, "gln_snr18",lineT, valid);
 printCSVValue(gln_snr19, GPS_SNRIntSig, "gln_snr19",lineT, valid);
 printCSVValue(gln_snr20, GPS_SNRIntSig, "gln_snr20",lineT, valid);
 printCSVValue(gln_snr21, GPS_SNRIntSig, "gln_snr21",lineT, valid);
 printCSVValue(gln_snr22, GPS_SNRIntSig, "gln_snr22",lineT, valid);
 printCSVValue(gln_snr23, GPS_SNRIntSig, "gln_snr23",lineT, valid);
 printCSVValue(gln_snr24, GPS_SNRIntSig, "gln_snr24",lineT, valid);
 printCSVValue(gln_snr25, GPS_SNRIntSig, "gln_snr25",lineT, valid);
 printCSVValue(gln_snr26, GPS_SNRIntSig, "gln_snr26",lineT, valid);
 printCSVValue(gln_snr27, GPS_SNRIntSig, "gln_snr27",lineT, valid);
 printCSVValue(gln_snr28, GPS_SNRIntSig, "gln_snr28",lineT, valid);
 printCSVValue(gln_snr29, GPS_SNRIntSig, "gln_snr29",lineT, valid);
 printCSVValue(gln_snr30, GPS_SNRIntSig, "gln_snr30",lineT, valid);
 printCSVValue(gln_snr31, GPS_SNRIntSig, "gln_snr31",lineT, valid);
 printCSVValue(gln_snr32, GPS_SNRIntSig, "gln_snr32",lineT, valid);
 printCSVValue(gln_cnt, GPS_SNRIntSig, "gln_cnt",lineT, valid);
 } catch (Exception e) {
DatConLog.Exception(e);
}
}

   }
