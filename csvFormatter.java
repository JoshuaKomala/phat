/**
 * @name CSVFormatter
 * @author Jonah Cruz
 * @date 3/13/17
 */
import java.io.IOException;
import java.io.*;

/**
 * CSV Formatter class.
 * 
 * <p>Takes a CSV file name and formats it to have longitude and latitude
 * columns.
 * 
 * @author Jonah Cruz
 * @version 1.0
 * @date 3/13/17
 */
public class CSVFormatter implements DataAnalyzer {

	/**
	 * Entry point method for data control.
	 * @param args - command line arguments passed in (includes in file name and 
	 * out file name)
	 */
	public void analyze(String fileName) {
		format(args);
	}

	/**
	 * Runs a python script that outputs a properly formatted CSV. CSV will 
	 * contain latitude and longitude.
	 * @param args - command line arguments passed in (includes in file name and 
	 * out file name)
	 */
	private void format(String fileName) {
		// Runs geocoder.py and passes in args to to the python script  
		try {
			String cmd = "python geocoder.py " + fileName + " " + "Formatted" + fileName; 
			Process p = Runtime.getRuntime().exec(cmd);
			BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
		} catch (IOException e) {
			System.out.println("Failed to read file.");
		}
	}
}