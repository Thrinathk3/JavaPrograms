    package Strings;

    public class Duplicatespractice {
	public static void main(String[] args) {
     String s1="a4b3b1d2";
     for(int i=0;i<s1.length();i++) {
    	 char c=s1.charAt(i);
    	 if(c>='0'  && c<='9') {
    		 int value=(c-'0');
    		for(int j=1;j<=value;j++) {
    			System.out.print(s1.charAt(i-1));
    		}		 	 
    	 }
     }
	}
}
