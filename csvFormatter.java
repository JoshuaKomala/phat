//import javax.script.*;
import java.io.IOException;
import java.io.*;

public class csvFormatter {

	public static void main(String[] args) {
		
		
		try {
			Process p = Runtime.getRuntime().exec("python geocoder.py");
			BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String ret = in.readLine();
			System.out.println("value is : "+ret);
		} catch (IOException e) {
			System.out.println("haha");
		}
	}
}