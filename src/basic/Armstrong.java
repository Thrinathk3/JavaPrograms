package basic;

public class Armstrong {

	public static void main(String[] args) {
		
		for (int num=0; num<=10000;num++) {
			int act = num;
			int exp = armstrong(num);
			int exp2 = armstrong1(num);
			if(act==exp && act==exp2) {
				System.out.println(act);
			}
		}
	}
	
	private static int armstrong(int num) {
		int results = 0;
		int len = String.valueOf(num).length();
		while(num!=0) {
			int digit = num %10;
			int a = digit;
			for(int i =1; i<len;i++) {
				digit = digit * a;
			}
			results +=digit;
			num/=10;
		}
		
		return results;
	}
	
	private static int armstrong1(int num) {
		int sum = 0;
		int numOfDigits = String.valueOf(num).length();
        while (num != 0) {
            int remainder = num % 10;
            sum += Math.pow(remainder, numOfDigits);
            num /= 10;
        }
        return sum;
	}

}
