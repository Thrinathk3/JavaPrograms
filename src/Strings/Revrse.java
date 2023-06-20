package Strings;

import java.util.Scanner;

public class Revrse {
	public static String reverse(String s) 
	{
		String s2="";
		for(int i=s.length()-1;i>=0;i--) {
			s2=s2+s.charAt(i)+"*";	
		}
		return s2;	
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter String");
		String s=scn.nextLine();
		
		System.out.println(reverse(s));
	}	
}
