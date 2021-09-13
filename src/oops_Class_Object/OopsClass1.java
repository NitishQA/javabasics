package oops_Class_Object;

public class OopsClass1 {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		
		
		p1.name = "Roy";
		p1.Age = 25;
		
		p2.name = "Sunny";
		p2.Age = 31;
		
		System.out.println(p1.name + " " +p1.Age);
		System.out.println(p2.name + " " +p2.Age);
		
		p1.eat();
		p2.walk();
		p3.run("Bolt", 68);
		p4.play("Rohit", "Cricket");

	}

}

class Person {
	String name;
	int Age;
	
	void eat() {
		System.out.println(name+ " is eating ");
	}
	
	void walk() {
		System.out.println(name+ " is walking ");
	}
	
	void run(String name, int steps ) {
		System.out.println(name+ " is running " +steps);
	}
	
	void play(String name, String game ) {
		System.out.println(name+ " is playing " +game);
	}
}
