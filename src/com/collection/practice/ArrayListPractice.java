package com.collection.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListPractice {

	public static void main(String[] args) {

		int[] arr = { 10, 25, 5,5, 250, 18,18 };
		//int [] arr = {20,30,10,25,45,45,10};
		for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j]) {  
                    System.out.println(arr[i]);  
            }  
        } } 
		/*
		 * int max=Arrays.stream(arr).min().getAsInt(); System.out.println(max);
		 */
		/*
		 * System.out.println("before sort " + Arrays.toString(arr));
		 * 
		 * Arrays.sort(arr); System.out.println("After sort " + Arrays.toString(arr));
		 * System.out.println(arr.length); int max = arr[arr.length - 1];
		 * System.out.println(max);
		 */

		// List<Object> list = Arrays.asList(arr);
		/*
		 * List <Integer> list = new ArrayList<>(); for (int i = 0; i < arr.length; i++)
		 * { list.add(arr[i]);
		 * 
		 * } System.out.println(Collections.max(list));
		 */
		/*
		 * int max=arr[0]; for(int i =0; i<arr.length; i++) {
		 * 
		 * if(arr[i]>max) { max=arr[i]; } } System.out.println(max);
		 */
		// toRevers();
		//findSecondHighestValue();
		//findSecondValueinCollection();
		//findDuplicate();
		//findDuplicateWithLoop();

	}

	static void toRevers() {

		String country = "United State Of America";
		String rev = "";
		/*
		 * StringBuilder obj = new StringBuilder(country); obj.reverse().toString();
		 * System.out.println(obj);
		 */
		/*
		 * String country="United State Of America";String rev =""; char ch;
		 * System.out.println("Original Word: "+country); for(int i = 0;
		 * i<country.length(); i++) { ch=country.charAt(i); rev =ch+rev; }
		 * System.out.println("Reverse Word: "+rev);
		 */
		char[] charr = country.toCharArray();
		for (int i = charr.length - 1; i >= 0; i--)

			System.out.print(charr[i]);

	}

	static void findSecondHighestValue() {

		int arry[] = { 4, 23, 55, 234, 222, 1000, 44 };
		Arrays.sort(arry);
		int secondvalue = arry[arry.length - 2];
		System.out.println(secondvalue);

	}

	static void findSecondValueinCollection() {
		List<Integer> list = Arrays.asList(2, 50, 85, 67, 100, 75, 250);
		Collections.sort(list);
		int secondValue = list.get(list.size() - 2);
		System.out.println(secondValue);

	}

	static void findDuplicate() {

		Integer[] num = { 20, 30, 10, 40, 25, 45, 45, 10 };
		Set<Integer> set = new HashSet<>();
		for (Integer dup : num) {
			if (set.add(dup) == false) {
				System.out.println(dup);

			}

		}

	}

	static void findDuplicateWithLoop() {
		// Initialize array
		int[] arr ={ 1, 2, 3, 4, 2, 7, 8, 8, 3 };

		System.out.println("Duplicate elements in given array: ");
		// Searches for duplicate element
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[j]);
			}
		}

	}

}
