package basic;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter number to calculate factorial: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextInt()) {

			int num = sc.nextInt();
			if(num<0) {
				System.out.println("Invalid input");
			}else {
				double z = fact(num);
				System.out.println("factorial of "+num+ " is: "+z);
			}
		}
		else { 

			System.out.println("Invalid input");
		}
	}

	public static double fact(int a) {
		int i, b=1;
			for(i=1;i<=a;i++){ 
				b*=i; 
			}

			//			while(i<=a) {
			//				b*=i;
			//				i++;
			//			}
		return b;
	}

}
