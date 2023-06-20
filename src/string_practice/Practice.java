package string_practice;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
   @SuppressWarnings("resource")
Scanner scn = new Scanner(System.in);
   System.out.println("welcome to Marks card");
   System.out.println("Enter name");
   String s=scn.next();
   
   System.out.println("Telugu marks");
   int telugu=scn.nextInt();
       
   System.out.println("Mathematics marks");
   int maths=scn.nextInt();	
   
   System.out.println("science marks");
   int sci=scn.nextInt();
   
   int total=telugu+maths+sci;
   int avg=total/3;
   
   if(telugu>=35 && sci>=35 && maths>=35) {
   System.out.println(total);
   System.out.println(avg);
   
  if(avg>=75) {
	  System.out.println(s+"first class with distnction");
  }
  else if(avg<75 && avg>=60) 
	  {
	  System.out.println(s+"first class");
	  }
  else if(avg<60 && avg>=50) 
	  {
	  System.out.println(s+"second class");
	  }
  else if(avg<50 && avg>=40) {
	  System.out.println(s+"Third class");  
  }
	 
  else if(avg<50 && avg>=40)
	  {
	  System.out.println(s+"Third class");
	  }
  else {
	  System.out.println("just pass");
  }
   }
   else {
   System.out.println(s+"fail");
   }
	}

}
