package array;

public class TestClass1 {

	public static void main(String[] args) {
	  arraymethod1();

	}
	
	public static void arraymethod1() {
		
		
		int a[]={33,3,4,5};//declaration, instantiation and initialization  
		//printing array  
		try {
		System.out.println(a[4]);
		for(int i=0;i<a.length;i++)//length is the property of array  
		System.out.println(a[i]);
		}
		catch (Exception e) {
			System.out.println("The e is : "+e);
		}
		
		
		System.out.println("Rest of the code");
	}

}