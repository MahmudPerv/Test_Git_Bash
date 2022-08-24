package first_java;

public class VoidReturnPractice {

	public static void getVoid(int a, int b) {
		System.out.println(a + b);
	}

	public static String getReturn(String name) {
		
		return new StringBuilder(name).reverse().toString();
	}

	public static void main(String[] args) {
		getVoid(4, 6);
		 String str = getReturn("united state of america");
		System.out.println(str);
	}
}
