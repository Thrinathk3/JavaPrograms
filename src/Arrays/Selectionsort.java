package Arrays;

public class Selectionsort {
	static void sort(int[]a) {
		for(int i=0;i<a.length-1;i++) {
			int minindex=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[minindex]>a[j]) minindex=j;
			}
			if(i!=minindex) {
				int temp=a[minindex];
				a[minindex]=a[i];
				a[i]=temp;
			}
		}
	}

	public static void main(String[] args) {
		int[]a= {2,10,1,6,3,8,7};
		sort(a);
		for(int n:a) {
			System.out.print(n+" ");
		}

	}

}
