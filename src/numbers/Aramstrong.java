package numbers;

import java.util.Scanner;

public class Aramstrong {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int t=n;
		int length=0;
		int sum=0;
		while(t>0) {
			t/=10;
			length++;
		}
		int m=n;
		while(m!=0) {
			int multi=1;
			int rem=m%10;
			for(int i=1;i<=length;i++) {
				multi*=rem;
			}
			sum+=multi;
			m/=10;
		}
		if(sum==n)System.out.println("AramStrongnumber");
		else System.out.println("Not AramStrongnumber");
	}

}
