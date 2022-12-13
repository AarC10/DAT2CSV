package apps;

import Files.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Objects;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class DATConZipProcessor {
    private static void processDATFile(File file) throws NotDatFile, IOException, FileEnd {
        System.out.println("Processing: " + file.getAbsolutePath());
        DatFile datFile = DatFile.createDatFile(file.getAbsolutePath());
        datFile.reset();
        datFile.preAnalyze();

        ConvertDat convertDat = datFile.createConVertDat();

        String csvFilename = file.getAbsolutePath() + ".csv";
        System.out.println("Writing: " + csvFilename);
        convertDat.csvWriter = new CsvWriter(csvFilename);
        convertDat.createRecordParsers();

        datFile.reset();
        AnalyzeDatResults results = convertDat.analyze(true);
    }

    public static void main(String[] args) throws NotDatFile, IOException, FileEnd {
        String datFolderLocation = args[0];
        File datFolder = new File(datFolderLocation);


        File[] datFiles = datFolder.listFiles((dir, name) -> name.endsWith(".DAT"));
        for (File datFile : Objects.requireNonNull(datFiles)) {
            System.out.println("Processing: " + datFile.getAbsolutePath());
            processDATFile(datFile);
        }
    }
}
