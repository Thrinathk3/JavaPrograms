package Strings;



public class RepetingMaximum {
	
 public static void main(String[] args) {
  int[]a= {2,3,4,7,2,3,4,5,5,3,2,5,3,3,7,3};
  int max=0;
  int n = 0;
     for(int i=0;i<a.length;i++) {
    	 int count=1;
    	 for(int j=i+1;j<a.length;j++) {
    		 if(a[i]==a[j]) {
    			 count++;
    		 }
    	 }
    	 if(max<=count) {
    		 max=count;
    		 n=a[i];	 
    	 }
     }
  System.out.println(n+" "+max+"times");
  
	}
}
