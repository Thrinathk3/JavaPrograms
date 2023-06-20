package numbers;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
	    int n=scn.nextInt();
	    for(int i=1;i<=n;i++) {
	    	if(i<=1)continue;
	    	boolean flag=true;
	    	for(int j=2;j<=i/2;j++) {
	    		if(i%j==0) {
	    			flag=false;
	    		}
	    	}
	    	if(flag)System.out.println(i);
	}

}
}