package first_java;

import java.util.ArrayList;

public class Hello {

	public static void main(String[] args) {
		findPrimes(1, 100);

	}

	public static ArrayList<Integer> findPrimes(int start, int end) {
		//ArrayList<Integer> primes = new ArrayList<>();
		int n = 20;
		boolean prime = true;
		int i=2;
		while(i<=n/2) {
			System.out.println("Checking if "+i+ " is multiple");
			if(n%i==0) {
				System.out.println("Yes I found a multiple "+i);
				prime=false;
			}
			i++;
		}
		System.out.println(prime);
		return null;

	}

}
