package first_java;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPractic {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Mahmud");
		map.put(2, "Pervez");
		map.put(3, "Sayaan");
		map.put(4, "Sushmita");
		map.put(5, "Sayfa");
		System.out.println(map);
		/*
		 * map.remove(5); System.out.println(map); Set key = map.keySet();
		 * System.out.println(key); Collection value = map.values();
		 * System.out.println(value); for(Integer i:map.keySet()) {
		 * System.out.println(i+" "+map.get(i)); } for(Map.Entry entry:map.entrySet()) {
		 * 
		 * System.out.println(entry.getKey()+" "+entry.getValue());
		 * 
		 * }
		 */

		//Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();
		Set<Map.Entry<Integer, String>> s = map.entrySet();
		Iterator<Entry<Integer, String>> it = s.iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
			
		}

	}

}
