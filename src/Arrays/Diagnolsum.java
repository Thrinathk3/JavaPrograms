package Arrays;

public class Diagnolsum {

	public static void main(String[] args) {
		int [][]a= {{1,2,3},{4,7,8},{2,10,9}};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i][i];
		}
      System.out.println(sum);
	}

}
