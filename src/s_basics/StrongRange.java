package s_basics;

public class StrongRange {
	public static void main(String[] args) {
   for(int j=1;j<=40585;j++) {
	    int n=j;
		int t=n;
		int sum=0;
		while(t>0) {
			int rem=t%10;
			int fact=1;
			for(int i=1;i<=rem;i++) {
				fact*=i;
			}
			sum+=fact;
			t/=10;
		}
		if(sum==n) {
			System.out.println(sum);
		}
}
	}
}