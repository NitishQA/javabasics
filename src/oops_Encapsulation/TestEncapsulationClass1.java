package oops_Encapsulation;
/*
 
 The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.
 To achieve this, you must:

declare class variables/attributes as private
provide public get and set methods to access and update the value of a private variable
 */

class TestEncapsulationClass1 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
//		System.out.println(e1.empid);
		e1.setEmployid(24);
		System.out.println("The employee id is : "+e1.getEmployid());

	}
	
}

class Employee{
	private int empid; //This is called data hiding
	
	public void setEmployid(int emp_id) {
		empid = emp_id;
		
	}
	
	public int getEmployid() {
		return empid;
	}
	
}
