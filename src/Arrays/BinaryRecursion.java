package Arrays;
public class BinaryRecursion {
	static int search(int[]a,int s,int start,int end) {
		if(start>=end)return-1;
		int mid=(start+end)/2;
		if(s==a[mid])return mid;
		else if(s<a[mid]) return search(a,s,start,mid-1);
		else return search(a,s,mid+1,end);	
	   }
	public static void main(String[] args) {
	int []a= {5,10,19,6,7};
	System.out.println(search(a,7,0,a.length-1));
	}
}
