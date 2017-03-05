/**
 * @name Client
 * @author Jonah Cruz
 * @date 3/2/17
 */

/**
 * Client.
 * 
 * <p>A temporary class that will be the entry point for the rest of the code.
 * 
 * @author Jonah Cruz
 * @version 1.0
 * @date 3/2/17
 */
public class Client {

	public static void main(String[] args) {
		MasterControl control = new MasterControl();
		control.run(args[0]);
	}

}
