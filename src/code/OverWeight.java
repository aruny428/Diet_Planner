package code;

import java.io.*;
import java.util.*;
public class OverWeight {
	
	public OverWeight() {
		
		try {
		      File myObj = new File("OverWeight.txt");
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
