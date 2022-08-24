package first_java;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Main {

	public static void findSecondValue() {
		int[] arr = { 20, 35, 2, 5, 6 };
		Arrays.sort(arr);
		int sValue = arr[arr.length - 2];
		System.out.println(sValue);
		List<Integer> list = Arrays.asList(5, 3, 1, 5, 3, 6, 9, 3);
		Collections.sort(list);
		int s = list.size();
		int y = list.get(s - 2);
		System.out.println("Second high Value in collections : " + y);
	}

	public static void findMaximam() {
		int[] num = { 20, 10, 30, 13, 35 };
		int max = num[0];
		int min = num[0];
		for (int i = 0; i < num.length; i++) {

			if (num[i] < min) {
				min = num[i];
			}
			if (num[i] > max) {
				max = num[i];
			}
		}
		System.out.println("My min Value: " + min);
		System.out.println("My max Value: " + max);
	}

	public static void findMaxMinMath() {
		int[] maximum = { 6, 3, 5, 6, 21, 38, 7 };
		int max = maximum[0];
		int min = maximum[0];
		for (int i = 0; i < maximum.length; i++) {
			max = Math.max(max, maximum[i]);
			min = Math.min(min, maximum[i]);
		}
		System.out.println(max);
		System.out.println(min);
	}

	public static void mapPractice() {
		Map<Integer, String> map = new Hashtable<>();
		Map<String, String> hMap = new HashMap<>();
		map.put(1, "Mahmud");// hashtable no null alow and remove duplicate key but value can duplicate
		map.put(4, "Mahmud");
		map.put(2, "Sayaan");
		map.put(1, "Mahmud");
		map.put(1, "Mahmud");
		System.out.println(map);
		hMap.put("NY", null);// hashMap no null key but value can be null and  
		hMap.put("NH", "Mah");
		hMap.put("NJ","Mah");
		hMap.put("NY", null);
		System.out.println(hMap);
	}

	public static void main(String[] args) {
		// findSecondValue();
		// findMaximam();
		// findMaxMinMath();
		mapPractice();
	}
}
