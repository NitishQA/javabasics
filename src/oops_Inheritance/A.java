package oops_Inheritance;
/*
   Inheritance :- 
                  -->Uses - Inheritance allows reusability of code 
                  -->It is the procedure in which, one object acquires all the behavior and properties 
                  of it's parent object
                  -->We achieve inheritance through word "extends"
                  -->Types:- Suppose A is super class, and B , C are child class then,
                     1 - Single Inheritance - B extends A
                     2 - Multilevel inheritance - C extends B, B Extends A
                     3 - Hierarchical inheritance - C extends A, B Extends A
                     
                     

 */

public class A {

	void showA() {
		System.out.println("A Class method show");
	}
	void runA() {
		System.out.println("A Class method run");
	}
	
	public static void main(String[] args) {
		
		A obj1 = new A();
		B obj2 = new B();
		C obj3 = new C();
		D obj4 = new D();
		
		obj1.showA();
		System.out.println();
		
		obj2.showB();
		obj2.showA();
		System.out.println();
		
		obj3.showC();
		obj3.showA();
		System.out.println();
		
		obj4.runA();
		
	} 
		
}

class B extends A{
	void showB(){
		System.out.println("B Class method show");
	}
}

class C extends A{
	void showC(){
		System.out.println("C Class method show");

	}

}

class D extends C{
	void showD(){
		System.out.println("D Class method show");

	}

}


