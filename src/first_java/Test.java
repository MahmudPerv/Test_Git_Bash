package first_java;

public class Test {
	
	public static void main(String[] args) {
		String name = "fatema";
		name = "Mou";
		String fName = name.concat("zohra");//String is Immutable...
		System.out.println(fName);
		
		StringBuilder sb = new StringBuilder(name);
		sb.append("zohra");
		System.out.println(sb);
		
	}


}
