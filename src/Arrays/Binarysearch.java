package Arrays;

public class Binarysearch {
	static int search(int[]a,int s) {
		int start=0;
		int end=a.length-1;
		while(start<=end) {
		int mid=(start+end)/2;
		if(s==a[mid])return mid;
		else if(s<a[mid]) end =mid-1;
		else start=mid+1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[]a= {3,9,2,6,7,4};
		System.out.println(search(a,10));

	}

}
