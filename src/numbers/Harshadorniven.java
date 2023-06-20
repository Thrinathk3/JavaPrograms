package numbers;

import java.util.Scanner;

public class Harshadorniven {

	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();
    int t=n;
    int sum=0;
    while(n!=0) {
    	sum+=n%10;
    	n/=10;	
    }
    if(t%sum==0)System.out.println("Harshadnumber");
    else System.out.println("Harshadnumber");
	}
}
