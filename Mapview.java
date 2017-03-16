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
 
 
public class Mapview extends Application {
	private Scene scene;
	@Override public void start(Stage stage) {
		// create the scene
		stage.setTitle("Map");
		scene = new Scene(new Browser(),800,600, Color.web("#666970"));
		stage.setScene(scene);
		stage.show();
	}
 
	public static void main(String[] args){
		launch(args);
	}
}

class Browser extends Region {
 
	final WebView browser = new WebView();
	final WebEngine webEngine = browser.getEngine();
	 
	public Browser() {
		// load the web page
		
		webEngine.load(getClass().getResource("map.html").toExternalForm());
		
		//add the web view to the scene
		getChildren().add(browser);
 
	}
	 
}
