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
	 * @param args - command line arguments passed in (includes in file name and 
	 * out file name)
	 */
	public void analyze(String fileName);
}
