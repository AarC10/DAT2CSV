package apps;

import java.io.*;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ZipEntriesExtractor {
    public static void main(String[] args) throws IOException {
        ZipFile zipFile = new ZipFile("/home/aaron/Downloads/DJIData.zip");
        String parentFolder = zipFile.getName().substring(0, zipFile.getName().lastIndexOf("/"));
        System.out.println("Parent folder: " + parentFolder);
        Enumeration<? extends ZipEntry> entries = zipFile.entries();


        while (entries.hasMoreElements()) {
            ZipEntry zipEntry = entries.nextElement();
            System.out.println("Name: " + zipEntry.getName());

            String zipName = zipEntry.getName().substring(zipEntry.getName().lastIndexOf("/"));
            File file = new File(parentFolder, zipName);
            byte[] buffer = new byte[1024];
            InputStream inputStream = zipFile.getInputStream(zipEntry);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            int len;
            while ((len = inputStream.read(buffer)) > 0) {
                fileOutputStream.write(buffer, 0, len);
            }
            fileOutputStream.close();
            inputStream.close();
        }

    }
}
