package Practice;

public class Matrix {

	public static void main(String[] args) {
int [][]a= {{1,2,3},
		    {4,8,9},
		    {7,4,3}};
for(int i=0;i<a.length;i++) {
	for(int j=0;j<a[i].length;j++) {
		System.out.print(a[j][i]+"\t");
	}
	System.out.println();
}
}
	

}
