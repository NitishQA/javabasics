package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		try {
			FileWriter obj1 = new FileWriter("C:\\Nitish PC\\My Practice Workspace for Java\\Project For Practice\\src\\fileHandling\\File1.txt");
			obj1.write("This is Dummy sentence from FileWriter.");
			obj1.write("\n");
			obj1.write("This is second line");
			obj1.close();  //if it will not get closed, then text will not be written - checked once and text was not written
			System.out.println("Successfully wrote in file");
			}
		catch(IOException e) {
			System.out.println("An error occured : "+e.getMessage());
			e.printStackTrace();
		}

	}

}
