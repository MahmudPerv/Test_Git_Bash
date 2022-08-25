package com.practice.interveiw;

import java.util.Arrays;

public class InterviewCode {

	static void splits() {
		//How to split String
		String country = "United State Of America";
		String[] split = country.split(" ");
		System.out.println(Arrays.toString(split));
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}

	}
	static void reversWithMethod()
	{
		String country = "United State Of America";
		/*
		 * String rev = new StringBuffer(country ).reverse().toString();
		 * System.out.println(rev);
		 */
		System.out.println("Total length of country: "+country.length());
		String revers="";
		for(int i = country.length()-1; i>=0 ; i--) {
			char ch = country.charAt(i);
			//System.out.print(ch);
			revers = revers+ch;
		}
		System.out.println(revers);
	}
	// how to find any specific number or character>
	static void findAnyNumber(){
		
		int num = 50;
		for(int i = 0; i <num; i++) {
			
			if(String.valueOf(i).contains("3")) {
				System.out.println(i);
				
			}
		}
		
	}

	public static void main(String[] args) 
	{
		//splits();
		//reversWithMethod();
		findAnyNumber();

	}
}
