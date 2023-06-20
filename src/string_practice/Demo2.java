package string_practice;

public class Demo2 {

	public static void main(String[] args) {
    String s1="a5b2c2v1";
    
    for(int i=0;i<s1.length();i++) {
    	char c=s1.charAt(i);
    	if(c>='0' && c<='9') {
    		int sum=0;
    		sum+=c-'0';
    	for(int j=1;j<=sum;j++) {
    		System.out.print(s1.charAt(i-1));
    	}
    		
    	}
    }
   
   
	}

}
