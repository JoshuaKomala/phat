/**
 * @name MapManager
 * @author Ting Yu
 * @date 3/9/17
 */

//import java.util.List;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;


/**
 * Display MapManager Interface.
 *
 * <p>Display the data on a map
 *
 * @author Ting Yu
 * @version 1.0
 * @date 3/9/17
 */
public class MapManager implements DisplayManager {


	/**
	 * Required Display Method
	 *
	 * <p> Displays the data
	 */
	public void display (String[] args) {
		Mapview.run(args);


	}
}
