package oops_Interface;


interface I1{
	void show();

}
interface I2{
	void display();

}

class Abc implements I1{
	public void show() {
		System.out.println("Show Program");
	}
	
	public void display() {
		System.out.println("Display Program");
	}
	
	
}

public class TestClass  {

	public static void main(String[] args) {
		Abc obj1 = new Abc();
		obj1.show();
		obj1.display();
	

	}

}
