package basic;

public class Polidrome {

	public static void main(String[] args) {
		int num =11;
		if(isPolidrome(num)) {
			System.out.println(num+" given number is polidrome");
		}
		else {
			System.out.println("given number not a polidrome");
		}
	}
	private static boolean isPolidrome(int num) {
		int original = num;
		int reverse = 0;
		
		while(num>0) {
			int digit = num%10;
			reverse = reverse * 10 + digit;
			num/=10;
		}
		return original==reverse;
	}

}
