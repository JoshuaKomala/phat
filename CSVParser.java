import java.io.*;
import java.util.*;

public class CSVParser implements FileParser {
	
	/**
	 * Constructor 
	 */
	public CSVParser(){}
	
	/**
	 * Reads the file and converts to ArrayList 
	 * 
	 * @param fileName - The name of the file to read
	 * @return ArrayList<String[]> - List for other parts of the program to use
	 */
	@Override
    public List<String[]> read(String fileName){
    	String csvFile = fileName;
        String line = "";
        String cvsSplitBy = ",";
        String[] row = null;

        ArrayList<String[]> csv = new ArrayList<String[]>();
        
        // Read through file and place into ArrayList to be returned
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                // use comma as separator
                row = line.split(cvsSplitBy);
               	csv.add(row);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return csv;
    }
}
