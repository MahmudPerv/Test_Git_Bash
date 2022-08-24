package first_java;

import java.util.Arrays;

public class ConvertTest {
	public static void main(String[] agrs) {
		getSplit();
		getChar();
		reverse();
		findContains();
	}

	public static void getSplit() {
		String coun = "United states Of Ameirica";
		String[] split = coun.split(" ");
		System.out.println(Arrays.toString(split));
		System.out.println("*********After Loop***********");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
	}

	public static void getChar() {
		String con = "United State Of America ";
		int count = 0;
		for (int i = 0; i < con.length(); i++) {
			if (con.charAt(i) == 'e') {
				System.out.println(con.charAt(i) + ": :" + count);
				System.out.println("Index of e :: " + i);
				count++;
			}

		}
		System.out.println(count);

	}

	public static void reverse() {
		String country = "United State of";
		String temp = "";
		for (int i = country.length() - 1; i >= 0; i--) {
			temp = temp + country.charAt(i);
		}
		System.out.println(temp);
	}

	public static void findContains() {
		int n= 30;
		for(int i =0;i<n; i++) {
			if(String.valueOf(i).contains("3")) {
				System.out.println(i);
			}
		}

	}
}
