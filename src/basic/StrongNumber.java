package basic;

public class StrongNumber {

	public static void main(String[] args) {
		int num;
		for(num=0;num<=1000000;num++) {
			int act = num;
			int exp = number(num);
			int exp1 = isStrong(num);
			if(act==exp && act==exp1) {
				System.out.println(act);
			}
		}

	}

	private static int number(int num) {
		int f=0, sum=0;
		while(num!=0) {
			int digit = num %10;
			f = fact(digit);
			sum+=f;
			num/=10;
		}
		return sum;
	}

	private static int fact(int num) {
		int factorial = 1;
		int i=1;
		while(i<=num) {
			factorial *=i;
			i++;
		}
		return factorial;
	}
	
	private static int isStrong(int num) {
		int sum=0;
		int[] factorial = new int[10];
		factorial[1]=factorial[0]=1;
		for(int i =2;i<10;i++) {
			factorial[i] = factorial[i-1]*i;
		}
		while(num>0) {
			sum+=factorial[num%10];
			num/=10;
		}
		return sum;
	}

}
