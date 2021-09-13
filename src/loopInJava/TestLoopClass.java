package loopInJava;

public class TestLoopClass {

	public static void main(String[] args) {
//		forLoop();
//		whileloop();
		doWhile();

	}
	
	public static void forLoop() {
		for (int i=0; i<5; i++) {
			System.out.println("For loop The value of i : "+i);
		}
	}
	
	
	public static void whileloop() {
		int i = 0;
		while (i < 5) {
		  System.out.println("While loop the value of i : "+i);
		  i++;
		}
		
	}
	
	public static void doWhile() {
		
		int i = 0;
		do {
		  System.out.println("DoWhile loop the value of i : "+i);
		  i++;
		}
		while (i < 5);
	}

}


