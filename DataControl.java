import java.util.List;

/**
 * @name DataControl
 * @author Jonah Cruz
 * @date 3/2/17
 */

/**
 * Data Control Class.
 * 
 * <p>Handles the flow of data between the different data interfaces.
 * 
 * <p>Relays packaged data to be to the MasterControl to be displayed.
 * 
 * @author Jonah Cruz
 * @version 1.0
 * @date 3/2/17
 */
public class DataControl {
	private DataAnalyzer dataAnalyzer;
	private DataManager dataManager;
	private FileParser fileParser;
	private List<String[]> data; // Temporary while DataManager is implemented
	
	/** 
	 * Default Constructor (DataAnalyzer and DataManager is left blank for 
	 * now until default ones are created) 
	 */
	public DataControl () {
		 fileParser = new CSVReader();
	}
	
	/**
	 * Processes data from a particular file
	 * @param fileName - name of file to process data from
	 */
	public void processData(String fileName) {
		data = fileParser.read(fileName);
	}
	
	/**
	 * Retrieves the data in the form ready to be displayed
	 * @return
	 */
	public List<String[]> getData () {
		return data; // Temporary until DataManager is implemented
	}
}
