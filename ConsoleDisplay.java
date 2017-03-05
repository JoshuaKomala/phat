import java.util.List;

public class ConsoleDisplay implements DisplayManager {

	@Override
	public void display(List<String[]> data) {		
		// Loop through data and print in console
		for(String[] r : data){
    		for(int i = 0 ; i < data.get(0).length; i++){

	        	System.out.print(r[i] + " \t ");
    		}
    		System.out.println();
		}
	}
}
