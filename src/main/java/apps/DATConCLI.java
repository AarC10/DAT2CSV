package apps;

import files.*;

import java.io.File;
import java.io.IOException;

public class DATConCLI {
    public static void main(String[] args) throws NotDatFile, IOException, FileEnd {
        String filename = args[1];

        System.out.println("Processing: " + filename);
        File file = new File(filename);

        DatFile datFile = DatFile.createDatFile(file.getAbsolutePath());
        datFile.reset();
        datFile.preAnalyze();

        ConvertDat convertDat = datFile.createConVertDat();

        String csvFileName = filename.replace(".dat", ".csv");
        System.out.println("Writing to " + csvFileName);
        convertDat.csvWriter = new CsvWriter(csvFileName);
        convertDat.createRecordParsers();

        datFile.reset();
        AnalyzeDatResults results = convertDat.analyze(true);


    }

}
