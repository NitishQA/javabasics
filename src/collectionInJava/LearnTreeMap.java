package collectionInJava;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
Map is basically a interface, so we can't create the object of it.
TreeMap - (Similar to HashMap) - It's a class which implements interface map.

 *  Key       :    Value

    "A"      :    "apple" 
    "B"      :    "banana" 
    "D"      :    "radish" 
    "C"      :    "apple" 
    "G"      :    "apple"  //can't add this, because key should be unique, i.e. it should not be duplicate.
    "E"      :    "apple"  //But can add this, since key is unique but value can be duplicate.

    Map Properties:-
    1 - They contains values based on keys
    2 - They are ordered
    3 - "KEY" should be unique
    4 - "VALUE" can be duplicate

 */

public class LearnTreeMap {

	public static void main(String[] args) {
		treeMapEntryMethod();


	}

	public static void treeMapEntryMethod() {
		Map<String, String> fruits = new TreeMap<>();


		fruits.put("A", "apple");
		fruits.put("E", "banana");
		fruits.put("C", "radish");
		fruits.put("D", "apple");
//		fruits.put("D", "ss"); //It will override
		
		
		for(Map.Entry i:fruits.entrySet()) {
			System.out.println(i);
		}

	}
	
	
}
