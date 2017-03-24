import java.io.*;
import java.util.*;
public class CSVReader{
	String fileToRead;
	ArrayList<String[]> csv;
	public CSVReader(String file){
		fileToRead = file;
		csv = new ArrayList<String[]>();
	}




    public void convertToList(){
    	String csvFile = this.fileToRead;
        String line = "";
        String cvsSplitBy = ",";
        String[] row = null;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {
     
                // use comma as separator
                row = line.split(cvsSplitBy);
               	csv.add(row);


            }

        } catch (IOException e) {
            e.printStackTrace();
        }
//
//        for(String[] r : csv){
//        	System.out.println(Arrays.toString(r));
//        }
        System.out.println(Arrays.toString(csv.get(0)));
    }

    public void printColumn(String[] cols){
    	String[] titles = csv.get(0);
    	int[] colsIndex = new int[cols.length];
    	for(int i = 0 ; i < cols.length; i++){
    		for(int j = 0; j < titles.length; j++){
	    		if(titles[j].equals(cols[i])){
	    			colsIndex[i] = j;
	    		}
    			
    		}
    	}
    	for(String[] r : csv){
    		for(int i = 0 ; i < colsIndex.length; i++){

	        	System.out.print(r[colsIndex[i]] + " \t  \t  ");
    		}
    		System.out.println();
        }
    }


    public static void main(String[] args) {
    	CSVReader reader = new CSVReader(args[0]);
    	reader.convertToList();
    	//reader.printColumn(Arrays.copyOfRange(args, 1, args.length));
        Scanner in = new Scanner(System.in);
        String input = "";
        System.out.println("List columns you want to print separated by ,");
        System.out.println("---------------------------------------------");
        input = in.nextLine();
        reader.printColumn(input.split(","));
        
    }

}
