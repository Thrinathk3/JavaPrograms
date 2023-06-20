package Arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {

	public static void main(String[] args) {
     int []a= {2,3,4,32,1,19,90,2,4};
//     Arrays.sort(a);
//     for(int i=0;i<a.length;i++) {
//    	 int count=1;
//    	 for(int j=i+1;j<a.length;j++) {
//    		 if(a[i]==a[j]) {
//    			 count++;
//    			 i=j;
//    		 }
//    	 }
//    	 if(count>1)System.out.print(a[i]+" ");
//     }
     
     Set<Object> s = new HashSet<>();
     
     for(int n:a) {
    	 if(s.contains(n)) {
    		 s.remove(n);
    	 }
    	 else {
    		 s.add(n);
    	 }	 
     }
     System.out.println(s);
	}

}
