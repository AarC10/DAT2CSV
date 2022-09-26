package apps;

import Files.*;

import java.io.File;
import java.io.IOException;

public class DATConCLI {
    public static void main(String[] args) throws NotDatFile, IOException, FileEnd {
        File iFile = new File("/home/aaron/Downloads/djiDatData/FLY019.DAT");
        DatCon datCon = new DatCon();


        DatFile datFile = DatFile.createDatFile(iFile.getAbsolutePath(), datCon);
        datFile.reset();
        datFile.preAnalyze();

        ConvertDat convertDat = datFile.createConVertDat();
        convertDat.csvWriter = new CsvWriter("/home/aaron/Downloads/djiDatData/FLY019.csv");
        convertDat.createRecordParsers();

        datFile.reset();
        AnalyzeDatResults results = convertDat.analyze(true);


    }

}
