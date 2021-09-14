package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) {
		try {
			File obj1 = new File("C:\\Nitish PC\\My Practice Workspace for Java\\Project For Practice\\src\\fileHandling\\File1.txt");
					Scanner objRead = new Scanner(obj1);
			while (objRead.hasNextLine()) {
				String data = objRead.nextLine();
				System.out.println("The data is : "+data);
			}
			objRead.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("Exception came : "+e.getMessage());
			e.getStackTrace();
		}

	}

}
