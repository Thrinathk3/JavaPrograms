package numbers;

import java.util.ArrayList;

public class Nprrime {

	public static void main(String[] args) {
	  int n=8;
	  int i=2;
      int count=1;
      ArrayList<Integer>l1= new ArrayList<>();
      while(count<=n) {
    	  boolean flag=true;
    	  for(int j=2;j<=i/2;j++) {
    		  if(i%j==0) {
    			  flag=false;
    			  break;
    		  }
    	  }
    	  if(flag) {
    		  l1.add(i);
    		  count++;
    	  }
    	  i++;
      }
      System.out.println(l1);
      System.out.println(l1.get(1)+" "+l1.get(l1.size()-2));
	}

}
