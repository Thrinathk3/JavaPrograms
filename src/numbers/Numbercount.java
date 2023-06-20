package numbers;

public class Numbercount {

	public static void main(String[] args) {
    int n=1001;
    int onecount=0;
    int zerocount=0;
    while(n>0) {
    	int d=n%10;
    	if(d==1) {
    		onecount++;
    	}
    	else if(d==0) {
    		zerocount++;
    	}
    	n/=10;
    }
    System.out.println("one="+onecount);
	System.out.println("zero="+zerocount);
	}

}
