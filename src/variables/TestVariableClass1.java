package variables;

/* 
-->Variable is the name of memory location

Variables are of 3 types:-
1 - Local variables
2 - Instance variables
3 - Static variables

1 - Local variables:-
Declaration - Within Method/Constructor/blocks
Scope       - Within Method/Constructor/blocks not outside

2 - Instance Variables:-
Declaration - Inside class, but outside methods/constructors/blocks
Scope       - Inside methods/blocks/Constructors within a class

3 - Static Variables:-
Declaration - When static keyword in class, but outside methods/constructors/blocks
Scope       - Similar to instance variable i.e. Inside methods/blocks/Constructors within a class
 */


public class TestVariableClass1 {

	int instanceVariable = 10;          // Instance variable
	static int staticVariable = 20;   // Static variable





	public static void main(String[] args) {
		TestVariableClass1 obj1 = new TestVariableClass1();

		obj1.method1();

		int localVariableOfMainMethod = 50; 
		System.out.println("Local variable of main method :"+localVariableOfMainMethod);

		/* System.out.println(Instancevariable); // This cant be run as Instancevariable is non static, 
	  so for this object should get created in order to call in on Statis method*/

		System.out.println("Instance variable is :"+obj1.instanceVariable);
		System.out.println("Static variable is :" +staticVariable);
	}

	void method1() {

		int localVariableOfMethod1 = 30;      //Local variable
		System.out.println("Local variable is :"+localVariableOfMethod1);
	}

}
