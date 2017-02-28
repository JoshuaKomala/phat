import java.io.*;
import java.util.*;
public class CSVReader{
	String fileToRead;

	public CSVReader(String file){
		fileToRead = file;
	}




    public void convertToList(){
    	String csvFile = this.fileToRead;
        String line = "";
        String cvsSplitBy = ",";
        ArrayList<String[]> csv = new ArrayList<String[]>();
        String[] row = null;

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

        for(String[] r : csv){
        	System.out.println(Arrays.toString(r));
        }
    }


    public static void main(String[] args) {
    	CSVReader reader = new CSVReader(args[0]);
    	reader.convertToList();

        
    }

}