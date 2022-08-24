package first_java;


public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder name= new StringBuilder("United");
		name.append(" State");
		System.out.println(name);//MahmudSayaan
		//System.out.println("ABCD".equalsIgnoreCase("abcd"));
		//System.out.println("Abcd".charAt(1));
		//System.out.println("1234567894".replace("7", "6"));
		//System.out.println("ABCDEFGHIJ".toLowerCase()); // abcdefghij
        //System.out.println("abcdefghij".toUpperCase()); // ABCDEFGHIJ
        //System.out.println("abcdefghij".toString()); // abcdefghij
        // trim removes leading and trailings spaces
        //System.out.println(" abcd  ".trim()); // abcd
	}

}
