package Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		System.out.println("enter phonenumber");
		String phn=scn.next();
		Pattern p=Pattern.compile("[6-9][0-9]{9}");
		Matcher m=p.matcher(phn);
		if(m.matches())System.out.println("valid");
		else System.out.println("Notvalid");
	
	}		
	
}
