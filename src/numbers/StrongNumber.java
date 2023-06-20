package numbers;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
    @SuppressWarnings("resource")
	Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();
    int t=n;
    int sum=0;
    while(t!=0) {
    	int rem=t%10;
    	int fact=1;
    	for(int i=1;i<=rem;i++) {
    		fact*=i;
    	}
    	sum+=fact;
    	t/=10;
    	
    }
  if(sum==n)System.out.println("Strong number");
  else System.out.println("not strong number");
	}

}
