package Practice;

import java.util.Arrays;

public class Duplicate {
public static void main(String[] args) {
    int []a= {1,4,3,4,4,6,4,6,6,7,2,7,7,7,7};
    int max=0;
    int n=0;
    Arrays.sort(a);
    for(int i=0;i<a.length-1;i++) {
    	int count=1;
    	for(int j=i+1;j<a.length;j++) {
    		if(a[i]==a[j]) {
    			count++;
    			//i=j;
    			}
    	}
    	if(count>max) {
    		max=count;
    		n=a[i];
    		
    	}
    } 
    System.out.println(n+" "+max+"timesrepeating");
}
}
