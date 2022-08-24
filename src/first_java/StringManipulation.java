package first_java;

public class StringManipulation {
	public static void main(String[] args) {
		String str = "United";
		String str1= "United";
		String str2= new String("United");
		str2.concat("State");
		System.out.println(str2);
		System.out.println(str==str1);//true
		System.out.println(str==str2);//false
		System.out.println(str.equals(str2));//true
		System.out.println(str.equals(str2));//true
		str.concat("New York");
		System.out.println(str);
		
		/*
		 * //United //The result should be assigned to a new reference variable (or same
		 * //variable) can be reused. String concat = str.concat("New York");
		 * str.trim(); System.out.println(concat); //value1value2
		 * 
		 * //-----------------------String methods-------------------------------------
		 * char charAt(int paramInt) System.out.println(str1.charAt(2)); //prints a char
		 * - c String concat(String paramString) System.out.println(str1.concat("lmn"));
		 * abcdefghijklmn
		 * 
		 * System.out.println("ABC".equalsIgnoreCase("abc")); true
		 * System.out.println("ABCDEFGH".length()); 8
		 * 
		 * String replace(char paramChar1, char paramChar2)
		 * System.out.println("012301230123".replace('0', '4')); 412341234123
		 * 
		 * String replace(CharSequence paramCharSequence1, CharSequence
		 * paramCharSequence2) System.out.println("012301230123".replace("01", "45"));
		 * 452345234523
		 * System.out.println("abcdefghij".substring(3)); defghij 0123456789
		 * 
		 * All characters from index 3 to 6 System.out.println("abcdefghij".substring(3,
		 * 7)); defg 0123456789
		 */


	}

}
