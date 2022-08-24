package first_java;

import java.util.Base64;
import java.util.Base64.Encoder;

public class EncodeDecode {
	static String password= "Mahmud@Day19";
	public static void main(String[] args) {
		String encoder = Base64.getEncoder().encodeToString(password.getBytes());
		//String getencoder = password;
		//String strEncode = encoder.encodeToString(getencoder.getBytes());
		System.out.println(encoder);
		
		byte[] decode = Base64.getDecoder().decode(encoder.getBytes());
		String getDecode= new String(decode);
		System.out.println(getDecode);
		
	}

}
