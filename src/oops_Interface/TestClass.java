package oops_Interface;


interface I1{
	void show();
	
}
interface I2{
	void display();
	
}

public class TestClass implements I1 {
	public void show() {
		System.out.println("Show Program");
	}
	public void display() {
		System.out.println("display Program");
	}
	
	
	public static void main(String[] args) {
		TestClass obj1 = new TestClass();
		obj1.show();
		obj1.display();
		
	}

}
