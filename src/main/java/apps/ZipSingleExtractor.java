package apps;

import java.io.IOException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ZipSingleExtractor {
    public static void main(String[] args) throws IOException {
        ZipFile zipFile = new ZipFile("/home/aaron/Downloads/DJIData.zip");
        String parentFolder = zipFile.getName().substring(0, zipFile.getName().lastIndexOf("/"));
        System.out.println("Parent folder: " + parentFolder);
        Enumeration<? extends ZipEntry> entries = zipFile.entries();

        while (entries.hasMoreElements()) {
            ZipEntry zipEntry = entries.nextElement();

        }
    }
}
