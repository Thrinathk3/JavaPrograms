package string_practice;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		System.out.println("enter two number");
		int n=scn.nextInt();
		int t=n;
		int count=0;
		int sum=0;
		while(t!=0) {	
			t/=10;
			count++;
		}
		int m=n;	
		while(m!=0) {
			int rem=m%10;
			int fact=1;
			for(int i=1;i<=count;i++) {
				fact*=rem;
			}
			sum+=fact;
			m/=10;
		}
		if(n==sum) {
			
		 System.out.println("aram");
		      }
		else {
			System.out.println("not");
		    }
	}
}
