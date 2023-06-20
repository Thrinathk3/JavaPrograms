package s_basics;

import java.util.Scanner;

public class Recursionfib {
  static int a=0,b=1,c;
  static void printfib(int n) {
	  if(n>0) {
	  System.out.print(a+" ");
	  c=a+b;
	  a=b;
	  b=c;
	  printfib(n-1);
  }
  }
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number");
		int n=scn.nextInt();
		printfib(n);
	}
	

}
