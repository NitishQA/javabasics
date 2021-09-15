package collectionInJava;

import java.util.Stack;

//Stack - For Last in first out data structure - https://prnt.sc/1s961kx

public class LearnStack {

	public static void main(String[] args) {
		pushElements();

	}
	
	public static void pushElements() {
		Stack<String> obj1 = new Stack<>();
		obj1.push("Animal 1"); //Used to push elements in stack
		obj1.push("Animal 2");
		obj1.push("Animal 3");
		obj1.push("Animal 4");
		
		System.out.println("Stack : "+obj1);
		
		System.out.println("Check the top element: "+obj1.peek()); //For checking the top element pushed
		
		obj1.pop(); //Used to remove/pop top element
		System.out.println("Stack : "+obj1);
		System.out.println("Check the top element: "+obj1.peek()); //For checking the top element pushed
	}
}
