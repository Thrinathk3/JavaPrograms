package Patterns;

public class C {

	public static void main(String[] args) {
		int n=5;
     int space=n-1;;
     int star=1;
     for(int i=1;i<=n;i++) {
    	 for(int j=1;j<=space;j++) {
    		 System.out.print(" ");
    	 }
    	 for(int j=1;j<=star;j++) {
    		 if(j==1||j==star||i==n)System.out.print("*");
    		 else System.out.print(" ");
    	 }
    	 System.out.println();
    	 star+=2;
    	 space--;
//    	 if(i<=n/2) {
//    	 space--;
//    	 star+=2;
//     }
//    	 else {
//    		 space++;
//    		 star-=2;
//    	 }
     }  	 
	
     }

}
