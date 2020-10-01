package Utilities;


import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.Map;
import java.util.HashMap;


public class CsvReader {
    public static String readCSV(String element) {

        Map<String,String> csvValues = new HashMap<String,String>();

        try {
            String csvFilename = "data/Japanese/translation.csv";
            CSVReader csvReader = new CSVReader(new FileReader(csvFilename));
            String[] col = null;
            while ((col = csvReader.readNext()) != null)
            {
                csvValues.put(col[0],col[1]);
            }
            csvReader.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return csvValues.get(element);
    }
}
