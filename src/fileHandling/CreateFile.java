package fileHandling;

import java.io.File;
import java.io.IOException;

/**
 File handling implies how to read from and write to in file. java.io package allows to do all input and output task in java.
 */
public class CreateFile {

	public static void main(String[] args) {
		try {
			File obj1 = new File("C:\\Nitish PC\\My Practice Workspace for Java\\Project For Practice\\src\\fileHandling\\File1.txt");

			if(obj1.createNewFile()) {
				System.out.println("File created : "+obj1.getName());
			}
			else {
				System.out.println("File already exist");

			}
		}
		catch (IOException e) {
			System.out.println("An Error occured due to : "+e.getMessage() );
			e.printStackTrace();
		}
	}

}


