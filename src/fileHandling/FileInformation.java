package fileHandling;

import java.io.File;

public class FileInformation {

	public static void main(String[] args) {
		File obj1 = new File("C:\\Nitish PC\\My Practice Workspace for Java\\Project For Practice\\src\\fileHandling\\File1.txt");
		
		if(obj1.exists()) {
			System.out.println("File name is : "+obj1.getName());
			System.out.println("File path is : "+obj1.getAbsolutePath());
			System.out.println("File is writeable : "+obj1.canWrite());
			System.out.println("File is Redeable : "+obj1.canRead());
			System.out.println("File size in bytes :"+obj1.length());
		}
		else {
			System.out.println("File doesnot exist");
		}

	}

}
