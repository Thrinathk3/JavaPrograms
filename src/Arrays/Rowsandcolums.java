package Arrays;

public class Rowsandcolums {

	public static void main(String[] args) {
		int [][]a= {{1,2,3},{4,7,8},{2,10,9}};
		for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			System.out.print(a[j][i]+" ");
		}
		System.out.println();
		}

	}

}
