package numbers;

import java.util.Scanner;

public class PalindromeNext {

	public static void main(String[] args) {
     @SuppressWarnings("resource")
	Scanner scn = new Scanner(System.in);
     System.out.println("Enter number");
		int n=scn.nextInt();
		n++;
		while(true) {
			int t=n;
			int reverse=0;
			while(t!=0) {
				int rem=t%10;
				reverse=(reverse*10)+rem;
				t/=10;	
			}
			if(n==reverse) {
				System.out.println(reverse);break;	
			}
			else n++;
		}	
	}
}
