package basic;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		System.out.println("enter number to find odd or even");
		@SuppressWarnings("resource")
		Scanner  s= new Scanner(System.in);
		int num = s.nextInt();
		find(num);
	}
	
	static void find(int num) {
		if(num%2 ==0) {
			System.out.println("The inputed number is EVEN ");
		}
		else {
			System.out.println("The inputed number is ODD");
		}
	}

}
