package apps;

import Files.*;

import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.zip.ZipFile;

public class DATConZipProcessor {
    public static void main(String[] args) throws NotDatFile, IOException, FileEnd {
        String datFolder = args[0];
        File folder = new File(datFolder);

        for (File file : Objects.requireNonNull(folder.listFiles())) {
            if (file.isFile() && file.getName().endsWith(".DAT")) {
                processDATFile(file);
            }
        }
    }

    private static void processDATFile(File file) throws NotDatFile, IOException, FileEnd {
        System.out.println("Processing: " + file.getAbsolutePath());
        DatFile datFile = DatFile.createDatFile(file.getAbsolutePath());
        datFile.reset();
        datFile.preAnalyze();

        ConvertDat convertDat = datFile.createConVertDat();

        String csvFilename = file.getAbsolutePath() + ".csv";
        System.out.println("Writing :" + csvFilename);
        convertDat.csvWriter = new CsvWriter(csvFilename);
        convertDat.createRecordParsers();

        datFile.reset();
        AnalyzeDatResults results = convertDat.analyze(true);
    }
}
