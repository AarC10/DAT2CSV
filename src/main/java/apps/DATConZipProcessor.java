package apps;

import Files.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public class DATConZipProcessor {
    public static void main(String[] args) throws NotDatFile, IOException, FileEnd {
        String datFolderLocation = args[0];
        File datFolder = new File(datFolderLocation);

        String zipFolderLocation = args[1];
        File zipFolder = new File(zipFolderLocation);
        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(zipFolder));


        for (File file : Objects.requireNonNull(datFolder.listFiles())) {
            if (file.isFile() && file.getName().endsWith(".DAT")) {
                processDATFile(file);
                File convertedFile = new File(file.getAbsolutePath() + ".csv");
                if (convertedFile.exists()) {
                    zipOutputStream.putNextEntry(new ZipEntry(convertedFile.getName()));
                    zipOutputStream.write(convertedFile.getAbsolutePath().getBytes());
                    zipOutputStream.closeEntry();
                }
            }
        }

        zipOutputStream.close();
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
