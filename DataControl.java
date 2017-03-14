/**
 * @name DataControl
 * @author Jonah Cruz
 * @date 3/2/17
 */

import java.util.List;


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
	
	/** 
	 * Default Constructor (DataAnalyzer is left blank for 
	 * now until default one is created) 
	 */
	public DataControl () {
		 fileParser = new CSVParser();		// Temporary Default Parser
		 dataManager = new ListManager();	// Temporary Default data manager
		 dataAnalyzer = new CSVFormatter();
	}
	
	/**
	 * Processes data from a particular file.
	 * @param fileName - name of file to process data from
	 */
	public void processData(String fileName) {
		//dataManager.setData(fileParser.read(fileName));
		dataManager.analyze(fileName);
	}
	
	/**
	 * Retrieves the data in the form ready to be displayed 
	 * @return
	 */
	public List<String[]> getData () {
		return dataManager.getData();
	}
}
