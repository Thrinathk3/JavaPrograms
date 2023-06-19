package basic;

public class PrimeOrNot {

	public static void main(String[] args) {

		for(int num=0;num<=100;num++) {
			if(isPrime(num)) {
				System.out.println("prime "+num);
			}
			else {
				//System.out.println("not a prime");
			}
		}

	}

	private static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		if(num ==2 || num ==3) {
			return true;
		}
		if(num%2==0 || num%3==0) {
			return false;
		}
		for(int i=5; i * i<=num;i+=6) {
			if(num%i==0 || num%(i+2)==0) {
				return false;
			}
		}

		return true;
	}

}
