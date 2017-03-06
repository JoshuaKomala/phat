/**
 * @name ListManager
 * @author Jonah Cruz
 * @date 3/6/17
 */

import java.util.List;


/**
 * List Manager class.
 * 
 * <p>Implements the DataManager class.
 * 
 * <p>Handles storing, reading, and editing the data parsed from files in a 
 * List
 * 
 * @author Jonah Cruz
 * @version 1.0
 * @date 3/6/17
 */
public class ListManager implements DataManager {
	private List<String[]> table;
	
	/**
	 * Takes the data parsed from file and stores in runtime object
	 * @param data - data to be stored for runtime access in the from of a list
	 */
	public void setData(List<String[]> data) {
		table = data;
	}
	
	/**
	 * Returns the data held be DataManager for analysis or displaying
	 * @return - data to be either analyzed or displayed
	 */
	public List<String[]> getData() {
		return table;
	}
	
	/**
	 * Takes in data in order to edit the already existing data
	 * @param editedData - data that will be inputed to edit the existing data
	 */
	public void editData(List<String[]> editedData) {
		// TODO: Implement how to edit the data based on passed in list
	}
}
