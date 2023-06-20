package numbers;

public class Fibrecursion {
	static int a=0,b=1,c;
	static void printf(int n) {
		if(n>0) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
			printf(n-1);
		}
	}
	public static void main(String[] args) {
		printf(8);
	}
	

}
