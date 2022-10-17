package apps;

import Files.*;

import java.io.File;
import java.io.IOException;

public class DATConCLI {
    public static void main(String[] args) throws NotDatFile, IOException, FileEnd {
//        String datFilename = args[0];

        for (int i = 10; i < 32; i++) {
           String datFilename = "/home/aaron/Downloads/djiDatData/FLY0" + i + ".DAT";
            System.out.println("Processing: " + datFilename);
            File file = new File(datFilename);

            DatFile datFile = DatFile.createDatFile(file.getAbsolutePath());
            datFile.reset();
            datFile.preAnalyze();

            ConvertDat convertDat = datFile.createConVertDat();

            String csvFilename = datFilename + ".csv";
            System.out.println("Writing :" + csvFilename);
            convertDat.csvWriter = new CsvWriter(csvFilename);
            convertDat.createRecordParsers();

            datFile.reset();
            AnalyzeDatResults results = convertDat.analyze(true);
        }
    }

}
