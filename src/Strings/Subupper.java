package Strings;

public class Subupper {
	public static void main(String[] args) {
   String s1="java is easy";
   String s="";
   for(int i=0;i<s1.length();i++) {
	   char c=s1.charAt(i);
	   if(c==' ') {
		 
		  
		  System.out.println(s); 
		  s="";
	   }
	   else {
		   s+=c;
	   }
   }
   System.out.println(s);
	}
}
