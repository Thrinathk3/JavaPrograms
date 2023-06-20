package s_basics;

import java.util.Scanner;

public class Tables {
	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter Number");
    int n=scn.nextInt();
     for(int i=1;i<=10;i++) {
    	 System.out.println(n+"x"+i+"="+n*i);
     }
	}
}
