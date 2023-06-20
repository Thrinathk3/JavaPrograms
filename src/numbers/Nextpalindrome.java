package numbers;

import java.util.Scanner;

public class Nextpalindrome {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scn.nextInt();
		n++;
		while(true) {
			int t=n;
			int reverse=0;
			while(t>0) {
				reverse=(reverse*10)+t%10;
				t/=10;
			}
			if(reverse==n) {
				System.out.println(reverse);break;
				}
			else {
				n++;
				}
		}
		
	}

}
