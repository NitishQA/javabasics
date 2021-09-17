package oops_Polymorphism_Abstraction;
/*
 polymorphism in allows us to perform the same action in many different ways
-->Abstraction is detail hiding (Implementation hiding)
-->If any class is having abstract method, then it's compulsory to make that class as abstract class. 
-->Abstract method don't have body
-->Can't create the object of abstract class

*/


public class ABDemo {

	public static void main(String[] args) {
		SureshPhone obj = new SureshPhone();
		obj.call();
		obj.camera();
		obj.radio();
		obj.torch();


	}
}

abstract class MaheshPhone{ //abstract class
	public void call() {
		System.out.println("Calling");
	}

	public abstract void camera(); //abstract method
	public abstract void radio(); //abstract method
	public abstract void torch(); //abstract method
}

abstract class RameshPhone extends MaheshPhone{ //Here Ramesh will have abstract methods also i.e. radio,torch , so it should be abstract class

	public void camera() {
		System.out.println("Camera is there");
	}

}

class SureshPhone extends RameshPhone{ //Concrete Class
	public void torch() {
		System.out.println("Torch is present");

	}

	public void radio() {
		System.out.println("Radio is present");

	}
}




