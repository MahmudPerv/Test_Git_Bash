package first_java;

import java.util.Arrays;

public class ReverseString {
	
	public static void main(String[] args) {
		findMax();
		//sortArray();
		// printNumWithoutLoop(0, 100);

//		for(int i=0; i<2;System.out.println("hello Java")) {
//			i++;
//		}
		String country = "United State Of America";
		int size = country.length();
		String temp = "";
		for (int i = size-1; i >= 0; i--) {
			temp = temp + country.charAt(i);
			
		}
		System.out.println(temp);
	}

	public static void findMax() {
		int maximum[] = { 13, 40, 20, 25 };

		int max = maximum[0];
		int min = maximum[0];
		for(int i=0; i<maximum.length; i++) {
//			if(maximum[i]>max) 
//				max=maximum[i];
//			if(maximum[i]<min) 
//				min=maximum[i];
			max=Math.max(max, maximum[i]);
			min=Math.min(min, maximum[i]);	
		}
		
		System.out.println(max);
		System.out.println(min);
	}
	// How to sort an Array using function?

	public static void sortArray() {
		int[] arr = { 2, 9, 3, 5, 4, 7, 1, 8, 6 };
		Arrays.sort(arr);
		int x = arr[arr.length - 2];
		System.out.println(x);
		

	}

	public static void printNumWithoutLoop(int start, int end) {
		if (start <= end) {
			System.out.println(start);
			start++;
			printNumWithoutLoop(start, end);
		}
	}
	
}
