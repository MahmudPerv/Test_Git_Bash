package first_java;

public interface TestInterface extends A,B {
     String name = "Mahmud";
	public void getName();
	public void getCell();
	public void getAddress();
	public void gets();
	public void getDob();
	public static void getCar() {
		System.out.println("im from testInterface");
	}
	
}
