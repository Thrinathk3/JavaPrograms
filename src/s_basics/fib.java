package s_basics;

import java.util.Scanner;

public class fib {

	public static void main(String[] args) {
		      @SuppressWarnings("resource")
			Scanner scn = new Scanner(System.in);
		      System.out.println("Enter number");
				int n=scn.nextInt();
				int a=0,b=1,c;
				for(int i=1;i<=n;i++) {
					System.out.print(a+" ");
					c=a+b;
					a=b;
					b=c;
				}

	}

}
