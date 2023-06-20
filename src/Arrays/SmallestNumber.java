package Arrays;

public class SmallestNumber {
	public static void main(String[] args) {
		int []a= {3,4,2,9,2,1};
		int smallest=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<smallest) {
				smallest=a[i];
			}
		}
		System.out.println(smallest);

	}
}
