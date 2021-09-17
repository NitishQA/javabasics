package collectionInJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 Map is basically a interface, so we can't create the object of it.
 Hashmap - It's a class which implements interface map.

 *  Key       :    Value

     "red"      :    "apple" 
     "yellow"   :    "banana" 
     "white"    :    "radish" 
     "green"    :    "apple" 
     "yellow"   :    "apple"  //can't add this, because key should be unique, i.e. it should not be duplicate.
     "pink"     :    "apple"  //But can add this, since key is unique but value can be duplicate.

     Map Properties:-
     1 - They contains values based on keys
     2 - They are not ordered
     3 - "KEY" should be unique
     4 - "VALUE" can be duplicate

 */

public class LearnHashMap {

	public static void main(String[] args) {
		hashMapEntryMethod();
//		hashMapWithoutEntryMethod();

	}

	public static void hashMapEntryMethod() {
		Map<String, String> fruits = new HashMap<>();
		

//		fruits.put("red", "apple");
//		fruits.put("yellow", "banana");
//		fruits.put("white", "radish");
//		fruits.put("green", "apple");
		
		fruits.put("A", "apple");
		fruits.put("E", "banana");
		fruits.put("C", "radish");
		fruits.put("D", "apple");

		System.out.println(fruits);
		System.out.println(fruits.get("white"));

		for (Map.Entry pairEntry: fruits.entrySet()) {
			System.out.println(pairEntry.getKey() + " : " +pairEntry.getValue() );
		}


		System.out.println(fruits.containsKey("red"));      //Returns true if that key is present
		System.out.println(fruits.containsValue("banana")); //Returns true is that value is present
		System.out.println(fruits.size());                  //Returns Size of map

		System.out.println(fruits.remove("red"));   //Removes element whose key is red
		for (Map.Entry pairEntry: fruits.entrySet()) {  //entrySet mean we will get all the entry from hashmap
			System.out.println(pairEntry.getKey() + " : " +pairEntry.getValue() );
		}

		fruits.clear();  //will delete all the records
		for (Map.Entry pairEntry: fruits.entrySet()) { //entrySet mean we will get all the entry from hashmap
			System.out.println(pairEntry.getKey() + " : " +pairEntry.getValue() );
		}

		System.out.println("List is clear");

		fruits.put("newgreen", "apple");
		for (Map.Entry pairEntry: fruits.entrySet()) { //entryset mean we will get all the entry from hashmap
			System.out.println(pairEntry.getKey() + " : " +pairEntry.getValue() );
		}
	}

	// 2nd method to return keys and values	

	public static void hashMapWithoutEntryMethod() {
		Map<String, String> fruits = new HashMap<>();

		fruits.put("red", "apple");
		fruits.put("yellow", "banana");
		fruits.put("white", "radish");
		fruits.put("green", "apple");

		System.out.println(fruits);
		System.out.println(fruits.get("white"));


		System.out.println("New way");	


		System.out.println(fruits.keySet());  //Return Keys in the form of Array
		System.out.println(fruits.values()); //Return values in the form of Array

		for(Object i:fruits.keySet()) {   //Return keys but not in form of array
			System.out.println(i);
		}

		System.out.println();

		for (Object i:fruits.values()) { //Return values but not in form of array
			System.out.println(i);
		}

		System.out.println();

		for (Object i:fruits.keySet()) {
			System.out.println(i + " : " + fruits.get(i));

		}

	}

}
