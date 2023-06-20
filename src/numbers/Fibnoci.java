package numbers;

import java.util.Scanner;

public class Fibnoci {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number");
        int n=scn.nextInt();
        int a=0,b=1,c=0;
        for(int i=1;i<=n;i++) {
        	System.out.print(a+" ");
        	c=a+b;
        	a=b;
        	b=c;
        }
	}

}
