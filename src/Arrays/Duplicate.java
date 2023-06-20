package Arrays;

import java.util.Arrays;

public class Duplicate {

	public static void main(String[] args) {
   int []a= {3,5,2,7,9,8,10,3,3,2,8};
   Arrays.sort(a);
   for(int i=0;i<a.length;i++) {
	   int count=1;
	   for(int j=i+1;j<a.length;j++) {
		   if(a[i]==a[j]) {
			   count++;
			   i=j;
		   }
	   }
	   if(count>1)System.out.println(a[i]);
   }
   
	}

}
