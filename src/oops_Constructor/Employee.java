package oops_Constructor;

/* 
 Constructor :-
               -->Constructor is having same name as class name
               -->Constructor is a block similar to method
               -->Constructor does not have any return type, not even void
               -->Constructor are used to initialize object
               
               1 - Parameterized Constructor
               2 - Default Constructor
 */

public class Employee {
	
	String name;
	int emp_Id;
	
	Employee(String empname, int empid){ // Parameterized constructor
		this.name = empname;
		this.emp_Id = empid;
		
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee("Nitish", 101);
		Employee e2 = new Employee("Rohit", 102);
		
		System.out.println("For e1 " +e1.name+ " " +e1.emp_Id);
		
	}

}
