package s_basics;

import java.util.Scanner;

public class Agecalculation {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
      
		Scanner scn = new Scanner(System.in);
		System.out.println("enter birth date");
		int b=scn.nextInt();
		
		
		System.out.println("enter birth month");
		int m=scn.nextInt();
		
		System.out.println("enter birth year");
		int y=scn.nextInt();
		
		System.out.println("********************");
		
		System.out.println("enter current date");
		int cd=scn.nextInt();
		
		System.out.println("enter current month");
		int cm=scn.nextInt();
		
		System.out.println("enter current year");
		int cy=scn.nextInt();
		
		System.out.println(Math.abs(cy-y)+"years");
		System.out.println(Math.abs(cm-m)+"month");
		System.out.println(Math.abs(cd-b)+"days");	
		
	}

}
