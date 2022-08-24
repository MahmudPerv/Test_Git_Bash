package first_java;

public class SwapTesting {

	public static void getSwap(int a, int b) {

		
		System.out.println("Before SWAP A Value IS: " + a);
		System.out.println("Before SWAP B Value IS: " + b);
		System.out.println("******************************");
		a = a + b;// ==30 a
		b = a - b;// 20 b
		a = a - b;// 10 a
		
		System.out.println("After SWAP A Value IS: " + a);
		System.out.println("After SWAP b Value IS: " + b);

	}

}
