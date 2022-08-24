package first_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaTestArray {

	private static final List<Integer> ArryList = null;

	public static void sorting() {
		int[] arr = { 3, 2, 1, 5, 9 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int size = arr[arr.length - 2];
		System.out.println(size);

	}

	public static int findSecond(Integer[] a, int total) {
		List<Integer> list =Arrays.asList(a);
		Collections.sort(list);
		int svalue = list.get(total - 2);
		return svalue;
	}

	public static void findthird() {
		List<Integer> list = Arrays.asList(1, 3, 8, 2, 4);
		Collections.sort(list);
		int secVal = list.get(list.size() - 3);
		System.out.println("find second value in Collections: "+secVal);
	}

	public static void main(String[] args) {
		sorting();
		Integer[] a = { 20, 10, 30, 25, 38 };
		int x = a.length;
		System.out.println(findSecond(a, x));
		findthird();
	}
}
