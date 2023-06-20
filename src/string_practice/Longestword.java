package string_practice;

public class Longestword {
	 public static String longestword(String s) {
		 String[] s1=s.replaceAll("[!1-9A-C&#@]","").split(" "); 
		 int count=0;
		 String s2="";
		 for(int i=0;i<s1.length;i++) {
			 if(s1[i].length()>count) {
				 count=s1[i].length();
				 s2=s1[i];
			 }
		 }
		 return s2;
	 }
	public static void main(String[] args) {
    System.out.println(longestword("I love&#@ dogs")); 
	}
}
