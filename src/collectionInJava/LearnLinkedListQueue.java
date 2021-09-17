package collectionInJava;

import java.util.LinkedList;
import java.util.Queue;

//Queue - Having the concept of First in First out - https://prnt.sc/1s97lwo

public class LearnLinkedListQueue {

	public static void main(String[] args) {
		queueElements();
		

	}
	
	public static void queueElements() {
		Queue<Integer> obj = new LinkedList<>();
		obj.offer(5);  //Used to add elements in Queue
		obj.offer(7);
		obj.offer(11);
		obj.offer(13);
		obj.offer(15);
		System.out.println(obj);
		
		System.out.println("Removed element is  : "+obj.poll()); //Used to remove 1st element
		System.out.println(obj);
		
		System.out.println("The 1st element of queue is : "+obj.peek());//Used to return 1st element of queue, return null if queue is empty
		System.out.println(obj);
		
		 int a= obj.remove(); //Removes the Head element of the queue
		 System.out.println(a);
		System.out.println(obj);
		
		System.out.println(obj.element()); ////Used to return 1st element of queue, Throws exception if queue is empty.
		
		
	}

}
