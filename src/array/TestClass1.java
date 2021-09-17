package array;
//an array is a collection of similar type of elements
//Use - Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
//To declare an array, define the variable type with square brackets:

//1 - 1D array
//2 - Multidimension array - Not covered right now

public class TestClass1 {

	public static void main(String[] args) {
		arraymethod1();
		arraymethod2();
		arrayUsingForEach();

	}

	public static void arraymethod1() {


		int a[]={33,3,4,5};//declaration, instantiation and initialization  
		//printing array  

		for(int i=0;i<a.length;i++)//length is the property of array  
			System.out.println(a[i]);

	}

	public static void arraymethod2() {


		String a[]={"Text1","Text2", "Test3", "Test4"};//declaration, instantiation and initialization/Defining  
		//printing array  

		for(int i=0;i<a.length;i++)//length is the property of array  
			System.out.println(a[i]);

	}

	public static void arrayUsingForEach() {

		System.out.println();
		System.out.println("For Each loop");

		String a[]={"Text1","Text2", "Test3", "Test4"};//declaration,  initialization/Defining 
		for(String b: a) {
			System.out.println(b);
		}
	}

}
