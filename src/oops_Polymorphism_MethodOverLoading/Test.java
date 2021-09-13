package oops_Polymorphism_MethodOverLoading;

/*
 Method over loading - 
     1-->More than one method should be of Same name
     2-->All the method should belong to same class
     3-->All the methods should have different arguments
         a-->Number of arguments
         b-->Sequence of arguments
         c-->Type of arguments
     If all the 3 conditions are satisfied,then method overloading can be achieved    
    
 */

public class Test {
	
	void show(int x) {
		System.out.println("Show1 method with int x ");
	}
	
    void show() {
    	System.out.println("show2 method");
		
	}
    
    void show(String x) {
    	System.out.println("show3 method of String");
		
	}
    
    void show(int a, String x) {
    	System.out.println("show4 method of int a , String x");
		
	}
    
    void show(String a, int x) {
    	System.out.println("show5 method of String a, int x");
		
	}

	public static void main(String[] args) {
		Test obj = new Test();
		obj.show("hello", 2);
    
	}

}
