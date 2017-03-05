import java.util.List;

/**
 * File Reader Interface.
 * 
 * <p>Outlines methods/behaviors required of classes that are created for 
 * reading data files.
 * 
 * @author Jonah Cruz
 * @version 1.0
 * @date 3/2/17
 */
public interface FileParser {

	/**
	 * Required read method.
	 * 
	 * <p> Reads the file for the specified reader and converts it to a
	 * java object
	 */
	public List<String[]> read(String fileName);
}
