package first_java;

public class FinalAccessModifire {

	final int age = 20;
	
	public void finalPractice() {
		
		System.out.println(age);
	}
	public static void main(String[] args) {
		
		FinalAccessModifire obj = new FinalAccessModifire();
		obj.finalPractice();
	}
	
}
