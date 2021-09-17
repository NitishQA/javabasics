package oops_Polymorphism_Abstraction;

/*
   -->Abstraction is detail hiding (Implementation hiding)
   -->If any class is having abstract method, then it's compulsory to make that class as abstract class. 
   -->Abstract method don't have body
 
 */

	abstract class TestClassVehicle {

		 abstract void start(); //Abstract Method

	}

	class Scooter extends TestClassVehicle{

		void start() {
			System.out.println("Scooter start with Kick");
		}
		
		
		
		
	}

	class Car extends TestClassVehicle{

		void start() {
			System.out.println("Car start with Key");
		}
		public static void main(String[] args) {
			
			Car obj1 = new Car();
			obj1.start();
			
			Scooter obj2 = new Scooter();
			obj2.start();
			
			
		}


	}
