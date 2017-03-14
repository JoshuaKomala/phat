/**
 * @name DataAnalyzer
 * @author Jonah Cruz
 * @date 3/2/17
 */

import java.util.List;

/**
 * Data Analyzer Interface.
 * 
 * <p>Outlines methods/behaviors required of classes that are created for 
 * analyzing data.
 * 
 * @author Jonah Cruz
 * @version 1.0
 * @date 3/2/17
 */
public interface DataAnalyzer {

	/**
	 * Analyzes the data passed in to be displayed.
	 * @param data - The data to be analyzed for display
	 * @param filters - Filters to specify how to analyze data
	 * @return - The formated data ready to be displayed
	 */
	public List<String[]> analyze(List<String[]> data, List<String> filters);
}
