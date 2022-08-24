package first_java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaseChange {

	public static String removeUpperCase(String name) {

		// String regEx= "[a-z]";
		String regEx = "[A-Z]";
		Pattern pattern = Pattern.compile(regEx);
		Matcher match = pattern.matcher(name);
		String s = match.replaceAll("");
		System.out.println(s);
		return s;
	}

	public static void main(String[] args) {
		removeUpperCase("SsaYyaaANNn");

	}

}
