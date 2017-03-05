import java.io.*;
import java.util.*;

public class CSVReader implements FileParser {
	
	/**
	 * Constructor 
	 */
	public CSVReader(){}
	
	/**
	 * Reads the file and converts to ArrayList
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

                // System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Testing output
        /*for(String[] r : csv){
        	System.out.println(Arrays.toString(r));
        }*/
        return csv;
    }
}
