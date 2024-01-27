package MyCollections;

import java.util.Map; //key-val pairs, all keys unique
import java.util.HashMap;//unordered map
import java.util.LinkedHashMap; //ordered map
import java.util.TreeMap; //maintain sorted order of pairs by there keys

// put,remove, getKey, getValue, keySet, values, containsKey, containsValue, size, isEmpty, clear

public class MyMaps {

	public static void main(String[] args) {
		
		//Map<Integer, String> mp = new LinkedHashMap<>(); //ordered map
		Map<Integer, String> mp = new HashMap<>(); //unordered map
		
		mp.put(1,"One");
		mp.put(4,"Four");
		mp.put(2,"Two");
		mp.put(3,"Three");
		System.out.println(mp);
		
		//override the values by default
		mp.put(1, "Oneeee");
		
		//if dont want to override=> put in map only if it absent
		mp.putIfAbsent(3, "Three");
		mp.putIfAbsent(5, "Five");
		
		if(!mp.containsKey(5)) {
			mp.put(5,"Five");
		}
		
		mp.remove(4);
		System.out.println(mp);
		
		System.out.println(mp.keySet());
		System.out.println(mp.values());
		
		System.out.println(mp.containsKey(3));
		System.out.println(mp.containsValue("Five"));
		System.out.println(mp.size());
		
	
		//Traversing Map
		
		//Map.Entry<Integer, String> specifies the type of entries in the map (key-value pairs).
		//mp.entrySet() returns a set view of the map, containing all its entries.
		for (Map.Entry<Integer, String> entry : mp.entrySet()) {
			
			Integer key = entry.getKey();
			String val = entry.getValue();
			
			System.out.println(key+"->"+val);
		}
		 
		//----------------------------------------------------------//
		System.out.println("TreeMap----->>>>>>");
		TreeMap<Integer, String> tmp = new TreeMap<>(); //sorted ordered map
		
		tmp.put(1,"One");
		tmp.put(4,"Four");
		tmp.put(2,"Two");
		tmp.put(3,"Three");
		
		//all above methods used here....extra methods are
		System.out.println(tmp.firstKey());
		System.out.println(tmp.lastKey());
		
		Map.Entry<Integer, String> entry1 = tmp.firstEntry();
		System.out.println(entry1.getKey()+"->"+entry1.getValue());
		
		Map.Entry<Integer, String> entry2 = tmp.lastEntry();
		System.out.println(entry2.getKey()+"->"+entry2.getValue());
		
		System.out.println(tmp.higherKey(2));//Returns the least key strictly greater than the given key
		System.out.println(tmp.lowerKey(8)); //Returns the greatest key strictly less than the given key
		
	}

}
