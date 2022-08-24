package first_java;

import java.util.ArrayList;

public class FindPrimeNumber {
	public static ArrayList<Integer> findPrimeValue(int start, int end) {

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = start; i <= end; i++) {
			boolean prime = true;
			int n = 2;
			while (n <= i / 2) {
				if (i % n == 0) {
					prime = false;
					break;
				}
				n++;
			}
			if (prime) {
				list.add(i);
			}
		}

		return list;
	}
public static void main(String[] args) {
	System.out.println(findPrimeValue(10, 500));
}
}
