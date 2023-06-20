package Strings;

import java.util.regex.Pattern;

public class Passwordmatches {
	static boolean validatePassword(String pwd) {
		String re="(?=.*[@#$&])(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]){8-20})";
		Pattern p=Pattern.compile(re);
		return p.matcher(pwd).matches();
	}

	public static void main(String[] args) {
		System.out.println(validatePassword("siva@1814"));

	}

}
