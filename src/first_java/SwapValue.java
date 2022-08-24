package first_java;

public class SwapValue {

	public static void getSwap(int a, int b) {
		// a=20
		// b=10
		System.out.println("before swap a: " + a);
		System.out.println("before swap b: " + b);
		a = a + b;// 30==a
		b = a - b;// 20==b
		a = a - b;// 10==a
		System.out.println("after swap a: " + a);
		System.out.println("after swap b: " + b);
	}

	public static void main(String[] args) {
		getSwap(50, 100);
		
	}
}
