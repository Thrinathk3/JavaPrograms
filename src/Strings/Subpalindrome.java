package Strings;

public class Subpalindrome {

	public static void main(String[] args) {
     String s1="malayammadam";
     int length=0;
     String biggest="";
     for(int i=0;i<s1.length()-1;i++) {
    	 for(int j=i+2;j<=s1.length();j++) {
    		 String s2=s1.substring(i,j);
    		 if(ispalindrome(s2)) {
    			 if(length<=s2.length()) {
    				 length=s2.length();
    				 biggest=s2;
    			 }
    			
    		 }
    	 }
     }
     System.out.println(biggest+" "+length);
	}
	public static boolean ispalindrome(String s) {
		s=s.toLowerCase();
		int i=0,j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j))return false;
			i++;
			j--;
		}
		return true;
	}	

}
