package Practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapOperations {

	public static void main(String[] args) {
		// Create a hashmap with key as String & value as integer
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("Alisha", 1);
		map.put("Sid", 2);
		map.put("Neo", 3);
		map.put("Trini", 3);

		// Display the values from a map
		
		  System.out.println("Printing map: "+map);
		  
		  //retrieve value using key 
		  
		  if(map.containsKey("Alisha")) { Integer value =
		  map.get("Alisha"); System.out.println("Key is : "+value);
		  }
		 

		  System.out.println("--------------------------------------");
		  
	  
		  //Getting a set of key-value pairs 
		  Set<Entry<String, Integer>> entrySet = map.entrySet();
		  
		  //Obtaining an iterator 
		  Iterator<Entry<String, Integer>> it = entrySet.iterator(); while(it.hasNext()) { Map.Entry me = it.next();
		  System.out.println("Key is :" +me.getKey() + " & " +
		  "value is : "+me.getValue()); }
		 
	}

}
