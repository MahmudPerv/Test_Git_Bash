package first_java;

public class AllKindOfTest {

	public static void main(String[] args) {
		getValueWithoutLoop(0, 100);

	}

	public static void getValueWithoutLoop(int start, int end) {

		if (start <= end) {
			System.out.println(start);
			start+=3;
			getValueWithoutLoop(start, end);
		}
	}
}
