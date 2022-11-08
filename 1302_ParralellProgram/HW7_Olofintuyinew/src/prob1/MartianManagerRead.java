package prob1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MartianManagerRead {

	public static void main(String[] args) {
		// Change the package name if yours is different
		String path = "src/prob1/";
		String[] inFileNames = {"inMartians1.txt", "inMartians2.txt", "inMartians3.txt",
				"inMartians4.txt", "inMartians5.txt", "inMartians6.txt"};
		
		// You will probably want to comment all these out except the first. Then, when it
		// works correctly for the first file, then uncomment the second, etc.
		testReadMartians(path + inFileNames[0]);
		testReadMartians(path + inFileNames[1]);
		testReadMartians(path + inFileNames[2]);
		testReadMartians(path + inFileNames[3]);
		testReadMartians(path + inFileNames[4]);
		testReadMartians(path + inFileNames[5]);
		
		// UNCOMMENT when ready to test reading output file from MartianManagerWriteSolution.java
		// testReadMartians(path + "outMartians.txt");
	}

	// Do not alter this method.
	public static void testReadMartians(String fileName) {
		MartianManager mm = new MartianManager();
		readMartians(fileName, mm);
	}

	/**
	 *  YOU WILL WRITE THIS METHOD.
	 *  
	 *  This method should (a) read martians from "file" in the format
	 *  shown in the problem statement, (b) build the corresponding
	 *  martian objects (c) and it should display a report to the console.
	 *  The format of the report is found in the HW 7 document in the 
	 *  Requirements section.
	 */
	public static void readMartians(String fileName, MartianManager mm) {
    	// YOU WILL WRITE CODE HERE, or possibly write a helper method, 
    	// e.g. readMartiansFile(File file, MartianManager mm)
		int num = 0;
	    try {
	    	File file = new File(fileName);
	      Scanner myReader = new Scanner(file);
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        String [] m = data.split(" ");
	        if(m[0].equals("G") ) {
	        	GreenMartian g = new GreenMartian(Integer.parseInt(m[1]) , Integer.parseInt(m[2]));
	        	mm.addMartian(g);
	        	num++;
	        }
	        else if(m[0].equals("R")){
	        	RedMartian r = new RedMartian(Integer.parseInt(m[1]), Integer.parseInt(m[2]), Integer.parseInt(m[3]));
	        	mm.addMartian(r);
	        	num++;
	        }
	        else {
	        	System.out.println("invalid line found");
	        }
	      }
	      myReader.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	    System.out.println("File: " + fileName + ", Num Martians written:" + num);
	    
			
	}
	
}
