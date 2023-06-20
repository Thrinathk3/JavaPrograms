package numbers;

import java.util.Arrays;

public class Arrayduplicate {

	public static void main(String[] args) {
    int[]a= {3,6,3,7,7,2,2};
    Arrays.sort(a);
    for(int i=0;i<a.length-1;i++) {
    	int count=1;
    	for(int j=i+1;j<a.length;j++) {
    		if(a[i]==a[j]) {
    			count++;
    			i=j;
    		}
    		
    	}
    	if(count>1) {
    		System.out.println(a[i]);
    	}
    }
	}

}
