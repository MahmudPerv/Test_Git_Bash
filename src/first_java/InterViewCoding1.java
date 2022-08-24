package first_java;

import java.util.Arrays;

public class InterViewCoding1 {

	public static void main(String[] args) {

		int[] big = { 30, 5, 1, 7, 4, 9, 2, 200 };
		int max = big[0];
		System.out.println(max);//   10 =5+5
		int min = big[0];
		for (int i = 0; i < big.length; i++) {
			// max=Math.max(max, big[i]);
			// min=Math.min(min, big[i]);
			if (big[i] > max) {
				max = big[i];
			}
			if (big[i] < min) {
				min = big[i];
			}
		}
		System.out.println("my max value is: " + max);
		System.out.println("my min value is : " + min);
		System.out.println(max);
	}

}
