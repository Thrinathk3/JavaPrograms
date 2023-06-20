package Arrays;

public class Linearsearch {
	static int search(int[]a,int s) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==s)return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[]a= {7,8,2,20,4};
    System.out.println(search(a,7));

	}

}
