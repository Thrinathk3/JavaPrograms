package s_basics;

public class AramstrongRange {
	public static void main(String[] args) {
		for(int j=1;j<=153;j++) {
			int n=j;
			int t=n;
			int sum=0;
			int count=0;
			while(t!=0) {
				count++;
				t/=10;
			}
			int m=n;
			while(m>0) {   
				int rem=m%10;
				int multi=1;
				for(int i=1;i<=count;i++) {
					multi*=rem;
				}
				sum+=multi;
				m/=10;
			}
			if(sum==n) {
				System.out.println(sum);
			}
		}
	}

}
