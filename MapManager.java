/**
 * @name MapManager
 * @author Ting Yu
 * @date 3/9/17
 */

import java.util.List;
/*
import jxbrowser.Browser;
import jxbrowser.BrowserFactory;
import jxbrowser.BrowserType;
*/
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.IOException;


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
	public void display () {
		/*
		Browser browser = BrowserFactory.createBrowser(BrowserType.Mozilla);         
		JFrame frame = new JFrame();        
		frame.add(browser.getComponent(), BorderLayout.CENTER);        
		frame.setSize(700, 500);        
		frame.setLocationRelativeTo(null);        
		frame.setVisible(true);         
		browser.navigate("http://www.google.com");  
		*/
		// create the component
		
		// add the component to your GUI
		// display the page
		/*
		System.out.println("Test");
		BrowserPane swingbox = new BrowserPane();
		JFrame frame = new JFrame();        
		frame.add(swingbox, BorderLayout.CENTER);        
		frame.setSize(700, 500);        
		frame.setLocationRelativeTo(null);        
		frame.setVisible(true);
		swingbox.setPage(new URL("http://cssbox.sourceforge.net"));
		*/
		System.out.println("TestTest");
		
		JEditorPane jep = new JEditorPane();
		jep.setEditable(false);   
/*
		try {
		  jep.setPage("http://www.google.com");
		} catch (IOException e) {
		  jep.setContentType("text/html");
		  jep.setText("<html>Could not load</html>");
		} 
*/
		JScrollPane scrollPane = new JScrollPane(jep);     
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().add(scrollPane);
		f.setMinimumSize(new Dimension(800,600));
		f.setVisible(true);
		
	}
}
