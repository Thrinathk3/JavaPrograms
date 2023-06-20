package numbers;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scn.nextInt();
		int t=n;
		int reverse=0;
		while(t!=0) {
			int rem=t%10;
			reverse=(reverse*10)+rem;
			t/=10;
		}
		if(reverse==n)System.out.println("palindrome");
		else System.out.println("Not a palindrome");

	}

}
