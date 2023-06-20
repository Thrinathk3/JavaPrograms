package Strings;

public class Biggestpalindrome {

	public static void main(String[] args) {
     String s1="hi malayalam madam beautiful";
     int length=0;
     String s2="";
     String[]a=s1.split(" ");
     for(int i=0;i<a.length;i++) {
    	 if(ispalindrome(a[i])) {
    		 if(length<=a[i].length()) {
    			 length=a[i].length();
    			 s2=a[i];
    		 }
    	 }
     }
     System.out.println(s2+" "+length);
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
