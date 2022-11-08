package prob1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class MartianManagerWrite {

	public static void main(String[] args) {
		// Change the package name if yours is different
		String outFileName = "src/prob1/outMartians.txt";

		testWriteMartians(outFileName);
		
		// To test that you have written in the proper format, obviously open the output
		// file and scan it. But, then to really test go back to MartianManagerRead.java
		// and test reading in the file you just wrote.
	}

	// Do not alter this method.
	public static void testWriteMartians(String fileName) {
		MartianManager mm = new MartianManager();
		mm.addMartian(new GreenMartian(1, 2));
		mm.addMartian(new RedMartian(2, 3, 4));
		mm.addMartian(new RedMartian(3, 4, 5));
		mm.addMartian(new GreenMartian(4, 5));
		mm.addMartian(new RedMartian(5, 6, 7));
		
		writeMartians(fileName, mm);
	}

	/**
	 *  YOU WILL WRITE THIS METHOD.
	 *  
	 *  Write the martians in the MartianManager to the file. The format is exactly the same
	 *  as specified in the HW 7 document for reading valid data: G I V or R I V T.
	 *  In addition, it should display a report to the console stating the name of the file
	 *  and how many martians were added. For example: File: out3.txt, Num Martianws ritten:5
	 */
	public static void writeMartians(String fileName, MartianManager mm) {
		
    	// YOU WILL WRITE CODE HERE, or possibly write a helper method, 
    	// e.g. writeMartiansFile(File file, MartianManager mm)
	    try {
	    	File file = new File(fileName);
	        if (file.createNewFile()) {
	        	  FileWriter myWriter = new FileWriter(fileName);
	              myWriter.write(martianRep(mm));
	              myWriter.close();
	        } else {
	          System.out.println("File already exists.");
	        }
	      } catch (Exception e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	}
	
	public static String martianRep(MartianManager mm) {
		String s = "";
		for(int i = 0; i < mm.getNumMartians(); i++) {
			Martian m = mm.getMartianAt(i); 
			if(m instanceof GreenMartian) {
				s += "G " + m.getId() + " " + m.getVolume() + "\n";
			}
			else if(m instanceof RedMartian) {
				s += "R " + m.getId() + " " + m.getVolume() + " "+ ((RedMartian) (m)).getTenacity() + "\n";
			}
			else {
				System.out.println("invalid martian found");
			}
		}
		return s;
	}
}
