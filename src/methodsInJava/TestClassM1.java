package methodsInJava;

/*****
       method in Java is a collection of instructions that performs a specific task. It provides the re usability of code.
       
       1 - Static Method  - Can be called directly in other static method
       2 - Non Static Method - Need to create object for calling it in under any static method
 */


public class TestClassM1 {

	public static void main(String[] args) {
		additionStaticMethod(2, 5);            //Static Method can be called directly within a class

		TestClassM1.additionStaticMethod(34, 6); //Static method can be called by class name within a class

		TestClassM1 obj1 = new TestClassM1(); //For Calling non static method within a class, object should get created of class.
		obj1.additionNonStaticMethod(4, 6);
		

		TestClassM2.multipliStaticMethod(4, 5); //For Calling static method outside a class, it can be done by classname
		
		TestClassM2 obj2 = new TestClassM2();
		obj2.nonstaticmethodofotherClass();  //For Calling Nonstatic method outside a class, it can be done by creating object of that class
		


	}

	public void additionNonStaticMethod(int x, int y) {
		int z = x+y;
		System.out.println("Nonstatic Method addition of number is : "+z);
	}

	public static void additionStaticMethod(int x, int y) {
		int z = x+y;
		System.out.println("static Method addition of number is : "+z);
	}



}

class TestClassM2{
	public static void multipliStaticMethod(int x, int y) {
		int z = x*y;
		System.out.println("static Method of other class multiplication of number is : "+z);
	}
	
	public void nonstaticmethodofotherClass() {
		
		System.out.println("non static Method of other class ");
	}


}
