package com.interview.codingPractice;

import java.util.Scanner;

public class PalindromeNumber {
   
	public static void palindromeNumberPractice(){
		
		/*1.Get the number to check for palindrome
		  2.Hold the number in temporary variable
		  3.Reverse the number
		  4.Compare the temporary number with reversed number
		  5.If both numbers are same, print "palindrome number*/
		String original, reverse = ""; // Objects of String class
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string/number to check if it is a palindrome");
		original = in.nextLine();
		int length = original.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		if (original.equals(reverse))
			System.out.println("Entered string/number is a palindrome.");
		else
			System.out.println("Entered string/number isn't a palindrome.");

	}

	public static void main(String[] args) {
		palindromeNumberPractice();

	}
		
	}

