package s_basics;

public class Patterns1 {

	public static void main(String[] args) {
 
	int n=5;
	int  star=1;
	int space=n/2;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=space;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=star;j++) {
			System.out.print("*");
		}
	 	System.out.println();
		if(i<=n/2) {
			space--;
			star+=2;
		}
		else {
			space++;
			star-=2;
		}
	}		
	}
 
	
}
