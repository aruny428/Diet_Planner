package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UnderWeight {
	
	public UnderWeight() {
		
		try {
		      File myObj = new File("UnderWeight.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
}
