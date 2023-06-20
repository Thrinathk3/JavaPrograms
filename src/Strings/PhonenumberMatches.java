package Strings;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PhonenumberMatches {
	 
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter phoneNumber");
		String phn=scn.nextLine();
		 Pattern p=Pattern.compile("[6-9][0-9]{9}");
		 Matcher m=p.matcher(phn);
		 if(m.matches()) {
			 System.out.println("valid");
		 }
		 else {
			 System.out.println("Not valid");
		 }
		
	}
}
