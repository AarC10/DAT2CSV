package apps;

import java.io.*;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipExtractor {
    public static void main(String[] args) throws IOException {
        String zipFolderLocation = "/home/aaron/Downloads/DJIData.zip";
        File destination = new File(zipFolderLocation.substring(0, zipFolderLocation.lastIndexOf("/")));
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFolderLocation));
        ZipEntry zipEntry = zipInputStream.getNextEntry();
        byte[] buffer = new byte[1024];

        while (zipEntry != null) {
            System.out.println("Extracting: " + zipEntry.getName());
            File file = new File(destination, zipEntry.getName());
            if (zipEntry.isDirectory()) {
                if (!file.isDirectory() && !file.mkdirs()) {
                    throw new IOException("Failed to create directory " + file);
                }
            } else {
                // fix for Windows-created archives
                File parent = file.getParentFile();
                if (!parent.isDirectory() && !parent.mkdirs()) {
                    throw new IOException("Failed to create directory " + parent);
                }

                // write file content
                FileOutputStream fos = new FileOutputStream(file);
                int len;
                while ((len = zipInputStream.read(buffer)) > 0) {
                    fos.write(buffer, 0, len);
                    System.out.println(new String(buffer));
                }
                fos.close();

            }
//
            zipEntry = zipInputStream.getNextEntry();
        }
        zipInputStream.closeEntry();
        zipInputStream.close();
    }
}
