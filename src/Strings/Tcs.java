package Strings;

import java.util.Scanner;

public class Tcs {

	public static void main(String[] args) {

		double n,results;
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		System.out.println("enter number");
		n=scn.nextLong();

		double h=n%10;
		System.out.println(h);
		if(h==n) {
			results = fact(n);
			System.out.println("Fact:"+results);
		}
		else {
			System.out.println("invalid input");
		}  
	}
	public static double fact(double n) {
		double fact =1,s=1;
		if(n==0) {
			return s;
		}
		else if(n>0) 
		{
			
			for(int i=1;i<=n;i++) {
				fact*=i;
			}
			
		}
		return fact;
	}
}




