package com.collection.practice;

import java.io.File;
import java.util.Arrays;

public class SetPractice {
	static String name;

	public static void main() {

		  try {  
			  
			  System.out.println(10/0);
		  }catch(Exception e) {
			  
		  }
		  finally {
			  System.out.println("finally block is working");
		  }
            

	}

	public static void main(String[] args) {
		
		main();
		System.out.println(name);
		
	}
}
