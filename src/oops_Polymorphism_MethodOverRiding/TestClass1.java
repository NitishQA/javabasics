//Method Over Riding
//1 - Method should be of Same name
//2 - Method should belong to Different class
//3 - Have Same argument with any of below conditions:-
//    -->No of  arguments
//    -->Sequence of Arguments
//    -->Type of Argument
//    -->Inheritance Concept should be there

package oops_Polymorphism_MethodOverRiding;

/*
Method over Riding - 
    1-->More than one method should be of Same name
    2-->All the method should belong to different class
    3-->All the methods should have Same arguments
        a-->Number of arguments
        b-->Sequence of arguments
        c-->Type of arguments
    4-->Inheritance concept should be there    
    If all the 4 conditions are satisfied,then method overloading can be achieved  
    
      Object -->Parent class
             |
             |Child Class
   ----------------------------------------------------------          
   String  String buffer Number  character   Boolean   Void
   
   
   In parent class, if return type is parent, then in child class, the return type should be same or should be child
   
   In Parent class the access modifier should be small(accessibility) to it's child class access modifier (accessibility)
*/

class TestClass1 {
	
	void show() {
		System.out.println("Method Show of TestClass1");
	}
	
	
	public static void main(String[] args) {
		TestClass1 obj1 = new TestClass1();
		obj1.show();

		TestClass2 obj2 = new TestClass2();
		obj2.show();
		
		TestClass3 obj3 = new TestClass3();
		obj3.show();
				

	}


}
class TestClass2 extends TestClass1 {
	void show() {
		System.out.println("Method Show of TestClass2");
	}

}	

class TestClass3 extends TestClass1 {
	void show() {
		System.out.println("Method Show of TestClass3");
	}


}	



