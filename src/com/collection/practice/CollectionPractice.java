package com.collection.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectionPractice {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();//

		list.add("Sonda");
		list.add("Fatema");
		list.add("Sultana");
		list.add("Apple");
		list.add("Mahmud");
		list.add("Fatema");
		list.add(null);
		list.add(null);
		// System.out.println(list);

		List<String> fruit = new LinkedList<>();
		fruit.add(null);
		fruit.add(null);
		fruit.add("Apple");
		fruit.add("Apple");
		fruit.add("Sonda");
		list.addAll(fruit);
//how to remove The Duplicate
		System.out.println("Before Remove Duplicate: " + list);
		List<String> value = list.stream().distinct().collect(Collectors.toList());
		// System.out.println("After Remove Duplicate: "+value);
		
		list.forEach(System.out::println);
		System.out.println("*********************************");
		Set<String> set = new HashSet<>();
		for (String myList : list) {
			if (set.add(myList) == true) {
				//System.out.println("Set Remove Duplicate: " + myList);

			}
		}

	}
}
