package collectionInJava;
//ArrayList -  uses a dynamic array for storing the elements

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {
		//		addArrayListString();
		addArrayListInteger();

	}

	public static void addArrayListString() {
		//		String[] studentName = new String[2]; //Since we already defined it for [2], so the 3rd student we can't add.
		//		studentName[0] = "Name1";
		//		studentName[1] = "Name2";
		////		studentName[3] = "Name3"; //Since we already defined it for [2], so the 3rd student we can's add so commented this line.
		//		
		//		System.out.println("The Students are : "+studentName[0]+ " and " +studentName[1]);

		//		ArrayList<String> studentName = new ArrayList<>(); //Can be also written instead of below line
		List<String> studentName = new ArrayList<>();

		studentName.add("Name1");
		studentName.add("Name2");
		System.out.println("The Students are : "+studentName);

	}
	public static void addArrayListInteger() {
		List<Integer> studentNoList = new ArrayList<>();
		studentNoList.add(11);  //Used to add new element 
		studentNoList.add(12);  //Used to add new element 
		System.out.println("The Students numbers are : "+studentNoList );

		studentNoList.add(13);  //Used to add new element 
		System.out.println("The Students numbers are : "+studentNoList );

		studentNoList.add(2, 56); //Adding element in index 2
		System.out.println("The Students numbers are : "+studentNoList );

		List<Integer> studentNoList1 = new ArrayList<>();
		studentNoList1.add(28);
		studentNoList1.add(25);

		studentNoList.addAll(studentNoList1); //Is used to add new list to previous list
		System.out.println("The newly list of Students numbers are : "+studentNoList );

		System.out.println(studentNoList.get(4)); //Is used to get the value for particular index

		int index = 2;
		studentNoList.remove(index); //Is used to remove element
		System.out.println("The Index "+index+ " is removed" );
		System.out.println("The Students numbers are : "+studentNoList );

		studentNoList.remove(1); //Is used to remove element
		System.out.println("The Students numbers are : "+studentNoList );

		studentNoList.remove(Integer.valueOf(25)); //Will remove the value by just providing the value , 25 is value here
		System.out.println("The Students numbers are : "+studentNoList );

		//		studentNoList.clear(); //Removes all the elements from list
		//		System.out.println("The Students numbers are : "+studentNoList );

		studentNoList.set(1, 1000); //Used to update the element by providing it's index
		System.out.println("The Students numbers are : "+studentNoList );

		//		boolean s = studentNoList.contains(28); //The above code can also be written in below format
		//		System.out.println(s);

		System.out.println(studentNoList.contains(28)); //Used to search a particular element in list




	}


}
