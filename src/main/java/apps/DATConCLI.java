package apps;

import files.*;

import java.io.File;
import java.io.IOException;

public class DATConCLI {
    public static void main(String[] args) throws NotDatFile, IOException {
        String datFilename = args[0];

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
