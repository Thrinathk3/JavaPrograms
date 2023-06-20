package numbers;

import java.util.Scanner;

public class Automorphoic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
	    int n=scn.nextInt();
	    int t=n;
	    int sqr=(int)Math.pow(n, 2);
	    System.out.println(sqr);
	    int length=0;
	    while(t!=0) {
	    	length++;
	    	t/=10;	
	    }
	   int result=sqr%(int)Math.pow(10, length) ;
	   if(n==result)System.out.println("Automorphoicnumber");
	   else System.out.println("Not Automorphoicnumber");

	}

}
