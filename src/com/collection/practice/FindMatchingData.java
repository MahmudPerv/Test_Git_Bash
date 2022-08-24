package com.collection.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class FindMatchingData {
	
	public static void main(String[] args) {
    
		List <String> fruit= new ArrayList<>();
		fruit.add("Apple");
		fruit.add("Banana");
		fruit.add("Oragne");
		fruit.add("Grape");
		
		List <String> fruit1 = new ArrayList<>();
		fruit1.add("Kiwe");
		fruit1.add("Banana");
		fruit1.add("Strwberry");
		fruit1.add("Grape");
		
		fruit.addAll(fruit1);
		System.out.println(fruit); 
		//fruit.removeAll(fruit1);
		fruit.retainAll(fruit1);
		
		System.out.println(fruit);
		
		
	}

}
