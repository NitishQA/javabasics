package loopInJava;

/**** 
 Loop - Used if we need to repeatedly execute a block of statements
 1 - For Loop
 2 - ForEach loop
 3 - While Loop
 4 - DoWhile loop

 ****/

public class TestLoopClass {

	public static void main(String[] args) {
		forLoop();
//		forEachLoop();
//		whileloop();
//		doWhile();

	}

	public static void forLoop() {
		for (int i=0; i<5; i++) {
			System.out.println("For loop The value of i : "+i);
		}
	}

	public static void forEachLoop() {
		int arr[]={12,23,44,56,78};  

		for(int i:arr){  
			System.out.println("ForEach loop value : "+i);
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


