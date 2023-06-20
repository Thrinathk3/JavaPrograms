package Practice;

import java.util.Scanner;

public class Markscard {
	
	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		System.out.println("Welcome to Marks calculation");
		System.out.println("****************************");
	
		System.out.println("Enter name");
		 String s=scn.next();
		 
		 System.out.println("Telugu Marks");
		 int t=scn.nextInt();
		 
		 System.out.println("Hindi Marks");
		 int h=scn.nextInt();
		 
		 System.out.println("English Marks");
		 int e=scn.nextInt();
		 
		 System.out.println("Mathamatics Marks");
		 int m=scn.nextInt();
		 
		 System.out.println("Physics Marks");
		 int p=scn.nextInt();
		 
		 int total=t+h+e+m+p; 
		 int avg=total/5;
		 
		 if(t>=35 && h>=35 && e>=35 && m>=35 && p>=35) {
			System.out.println("total"+total); 
			System.out.println("*********************");
			System.out.println("percentage"+avg); 
			
			if(avg>=75) {
				System.out.println(s+" "+"you secured Distrinction");
			}
			else if(avg>=60 && avg<75) {
				System.out.println(s+" "+"You secured First class");
			}
			else if(avg>=50 && avg<60) {
				System.out.println(s+" "+"You secured second class");
			}
			else if(avg>=40 && avg<50) {
				System.out.println(s+" "+"You secured third class");
			}
			else {
				System.out.println(s+" "+"you secured just pass");
			}
		 }
		 else {
			 System.out.println("Sorry You Failed");
		 }
		 
	}

}
