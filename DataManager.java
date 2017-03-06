/**
 * @name DataManager
 * @author Jonah Cruz
 * @date 3/2/17
 */

import java.util.List;

/**
 * Data Manager Interface.
 * 
 * <p>Outlines methods/behaviors required of classes that are created for 
 * managing either persistent data or runtime data.
 * 
 * <p>This interface will allow for implementation of database interaction.
 * 
 * @author Jonah Cruz
 * @version 1.0
 * @date 3/2/17
 */
public interface DataManager {
	/**
	 * Takes the data parsed from file and stores either in runtime objects 
	 * or database
	 * @param data - data to be stored
	 */
	public void setData(List<String[]> data);
	
	/**
	 * Returns the data held be DataManager for analysis or displaying
	 * @return - data to be either analyzed or displayed
	 */
	public List<String[]> getData();
	
	/**
	 * Takes in data in order to edit the already existing data
	 * @param editedData - data that will be inputed to edit the existing data
	 */
	public void editData(List<String[]> editedData);
}
