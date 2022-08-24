package first_java;

public class StaticPractice {
	public static String name;// static variable or class level variable
	private String name1;//instance variable 
	int num=20;

	public void test() {
		int a = 10;
		name = "Mou";
		name1 = "Mahmud";
		System.out.println(name+" "+name1);

	}

	public static void test1() {
		name = "Sumi";
		System.out.println(name);

	}
	public static void main(String[] args) {
		StaticPractice obj = new StaticPractice();
		obj.test();
		test1();
		
	}
	public boolean test2() {
		
		return true;
		
	}
	
}
