package first_java;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InterviewCoding {
	public static void main(String[] args) {
		removeDuplicatStream();
		HashMapPratice();
	}

	public static void removeDuplicatStream() {
		List<Integer> list = Arrays.asList(5, 3, 3, 6, 9, 30, 2);
		list = list.stream().distinct().collect(Collectors.toList());
		Collections.sort(list);
		System.out.println(list);
	}

	public static void HashMapPratice() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Z1", 100);
		map.put("Z2", 101);
		map.put("Z3", 102);
		map.put("Z4", 103);
		System.out.println(map.entrySet());
		System.out.println(map.containsKey("Z1"));
		System.out.println(map.containsValue(1000));
		// map.remove("Z2", 101);
		// map.clear();
		//map.remove("Z1");
		// map.replace("Z1", 200);
		for (Map.Entry<String, Integer> m1 : map.entrySet()) {
			System.out.println(m1);
			m1.getKey();
			m1.getValue();

		}

	}
}