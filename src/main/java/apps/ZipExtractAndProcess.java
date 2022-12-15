package apps;

import Files.*;

import java.io.*;
import java.net.URI;
import java.nio.file.*;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public class ZipExtractAndProcess {
    private static void placeInZip(String file, String zipFileName) throws IOException {
        System.out.println("Placing " + file + " in zip");

        Map<String, String> env = new HashMap<>();
        env.put("create", "true");

        Path filePath = Paths.get(file);
        Path path = Paths.get(filePath.getParent() + "/" + zipFileName);

        URI uri = URI.create("jar:" + path.toUri());
        try (FileSystem fileSystem = FileSystems.newFileSystem(uri, env)) {
            Path fileSystemPath = fileSystem.getPath(file.substring(file.lastIndexOf("/") + 1));
            Files.write(fileSystemPath, Files.readAllBytes(filePath), StandardOpenOption.CREATE);
        }
    }

    private static File processDATFile(File file) throws NotDatFile, IOException, FileEnd {
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
        System.out.println(datFile.getFile().getAbsolutePath());
        return datFile.getFile();
    }

    public static void main(String[] args) throws IOException, NotDatFile, FileEnd {
        ZipFile zipFile = new ZipFile("/home/aaron/Downloads/DJIData.zip");
        String parentFolder = zipFile.getName().substring(0, zipFile.getName().lastIndexOf("/"));
        System.out.println("Parent folder: " + parentFolder);
        Enumeration<? extends ZipEntry> entries = zipFile.entries();

        double start = System.currentTimeMillis();

        while (entries.hasMoreElements()) {
            ZipEntry zipEntry = entries.nextElement();
            System.out.println("Name: " + zipEntry.getName());

            String zipName = zipEntry.getName().substring(zipEntry.getName().lastIndexOf("/"));
            File file = new File(parentFolder, zipName);

            try (InputStream inputStream = zipFile.getInputStream(zipEntry); FileOutputStream fileOutputStream = new FileOutputStream(file)) {
                int len;
                byte[] buffer = new byte[1024];

                while ((len = inputStream.read(buffer)) > 0) {
                    fileOutputStream.write(buffer, 0, len);
                }
            }

            File datFile = processDATFile(file);
            File csvFile = new File(datFile.getAbsolutePath() + ".csv");
            placeInZip(csvFile.getAbsolutePath(), zipFile.getName().substring(zipFile.getName().lastIndexOf("/") + 1));
            csvFile.delete();
            file.delete();
        }

        double end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start) / 1000);
    }
}
