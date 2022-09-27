package apps;

import files.*;

import java.io.IOException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class DATConZipProcessor {
    public static void main(String[] args) throws NotDatFile, IOException, FileEnd {
        String filePath = "/home/aaron/Downloads/2683__July15to19DAT_DJI_Matrice600.zip";
        ZipFile zipFile = new ZipFile(filePath);
//        ZipFile convertedZIP = new ZipFile("/home/aaron/Downloads/2683__July15to19DAT_DJI_Matrice600CSV.zip");
        Enumeration<? extends ZipEntry> entries = zipFile.entries();

        while (entries.hasMoreElements()) {
            ZipEntry entry = entries.nextElement();


            System.out.println(filePath + "/" + entry.getName());

//            File iFile = new File(stream);
//            DatCon datCon = new DatCon();
//
//
//            DatFile datFile = DatFile.createDatFile(iFile.getAbsolutePath(), datCon);
//            datFile.reset();
//            datFile.preAnalyze();
//
//            ConvertDat convertDat = datFile.createConVertDat();
//            convertDat.csvWriter = new CsvWriter("/home/aaron/Downloads/djiDatData/FLY019.csv");
//            convertDat.createRecordParsers();
//
//            datFile.reset();
//            AnalyzeDatResults results = convertDat.analyze(true);


        }


    }
}
