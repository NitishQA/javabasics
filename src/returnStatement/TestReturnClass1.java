package returnStatement;

public class TestReturnClass1 {

	public static void main(String[] args) {
		TestReturnClass1 obj1 = new TestReturnClass1();
		
		
		
		int sum = obj1.add(3, 4); // Here the value of a+b is saved in variable sum only because return was there
		System.out.println("The Sum is : "+sum );
		int A = sum+1;
		System.out.println(A);
		
		
		obj1.sub(6, 4);
//		int B = obj1.sub(6, 4);  // Since it's not returning any value, we can't make any further operation from this value
		
		String sent = obj1.sentence("Hello");
		System.out.println(sent);
		
	}
	
   int add(int a, int b) {
		
		return a+b;

	}
   
   void sub(int a, int b) {
	   int sub = a-b;
	   System.out.println("The Substraction is : "+sub);
	   
   }
   
   String sentence(String s) {
	   return s;
	   
	   
   }
   

}
