package collectionInJava;

import java.util.ArrayDeque;

//Can be used if we need to add/remove element from 1st or last position

public class LearnArrayDeQue {

	public static void main(String[] args) {
		deQue();

	}
	
	public static void deQue() {
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		
		adq.offer(23); //Add element in queue
		adq.offer(12);
		adq.offer(13);
		adq.offer(24);
		adq.offer(45);
		System.out.println(adq);
		
		adq.offerFirst(100); //Add element in 1st position in queue
		System.out.println(adq);
		
		adq.offerLast(101); //Add element in last position in queue
		System.out.println(adq);
		
		adq.offer(50);
		System.out.println(adq);
		
		System.out.println(adq.peek()); //Return 1st element
		System.out.println(adq);
		
		adq.offerFirst(55);
		System.out.println(adq);
		
		System.out.println(adq.peekFirst());//Return 1st element
		System.out.println(adq);
		
		System.out.println(adq.peekLast());//Return 1st element
		System.out.println(adq);
		
		
		System.out.println(adq.pollFirst());//Remove 1st element 
		System.out.println(adq);
		
		System.out.println(adq.pollLast()); //Remove last element 
		System.out.println(adq);
	}

}
