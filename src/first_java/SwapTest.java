package first_java;

public class SwapTest {
	
	public void getSwap(int a, int b) {
		//a+b, a-b,a-b;
		
		
		System.out.println("before swap a: "+a);
		System.out.println("before swap b: "+b);
		
		a = a+b;//a=2+b=10=30now a=30;
		b = a-b; //30-10; b==20
		a = a-b; //a===10; 
		System.out.println("      ************      ");
		System.out.println("after swap a: "+a);
		System.out.println("after swap b: "+b);

	}

}
