/**
 * @name MasterControl
 * @author Jonah Cruz
 * @date 3/2/17
 */

/**
 * Master controller for the model and view.
 * 
 * <p>The Control of the MVC design pattern with the Model being the 
 * DataControl and the View being the DisplayManager.
 * 
 * <p> Client classes will primarily interact with this object and it will 
 * handle the bulk of management and delegation of the application.
 * 
 * @author Jonah Cruz
 * @version 1.0
 * @date 3/2/17
 */
public class MasterControl {
	private DisplayManager displayManager;
	private DataControl dataControl;
	
	/** 
	 * Default Contructor (Temporarily using ConsoleDisplay as default)
	 */
	public MasterControl () {
		displayManager = new ConsoleDisplay();
		dataControl = new DataControl();
	}
	
	/** 
	 * Constructor for specified DisplayManager
	 * @param displayManager
	 */
	public MasterControl (DisplayManager displayManager) {
		this.displayManager = displayManager;
	}
	
	/**
	 * Entry point of client to run the program.
	 * 
	 * <p> Temporarily passes a file to run from client
	 */
	public void run(String fileName) {
		dataControl.processData(fileName);
		displayManager.display(dataControl.getData());
	}
}
