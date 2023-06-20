package Arrays;

public class Insertionsort {
	static void sort(int[]a) {
		for(int i=1;i<a.length;i++) {
			int key =a[i];
			int j=i-1;
			while(j>-1&&key<a[j]) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;	
		}
	}
	public static void main(String[] args) {
    int[]a= {7,5,10,4,2};
    sort(a);
    for(int n:a) {
    	System.out.print(n+" ");
    }   		
	}

}
