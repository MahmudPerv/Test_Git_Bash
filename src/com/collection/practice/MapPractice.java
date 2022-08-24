package com.collection.practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapPractice {
	public static void main(String[] args) {
		
	
	Map<Integer,String> map = new HashMap<>();
	map.put(101, "Sonda");//EntrySet>>key+value
	map.put(102, "sultana");
	map.put(103, "Sonda");
	map.put(104, "Fatema");
	map.put(105, "Mahmud");
	map.put(105, "Sonda");
	System.out.println(map);
	
	Set<Integer> key = map.keySet();
	Collection<String> myValue = map.values();
	System.out.println(key);
	System.out.println(myValue);
	map.get("Sonda");
	
	for(Map.Entry<Integer,String> myEntry:map.entrySet()) {
		
		System.out.println(myEntry.getKey()+" "+myEntry.getValue());
		
	}
	
	
	}
	
}
