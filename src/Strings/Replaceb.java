package Strings;

public class Replaceb {

	public static void main(String[] args) {
   //String s1="javadeveloper";
   //String s1=s.replace("a", "@");
   //System.out.println(s1);
   
   //String s2=s1.replace("e","");
   // int count=s1.length()-s2.length();
   // System.out.println(count);
   String s1="banana";
   while(s1.length()>0) {
	   char c=s1.charAt(0);
	   String s2=s1.replace(c+"","");
	   int count=s1.length()-s2.length();
	   System.out.println(c+"->"+count);
	   s1=s2;
   }
   
	}

}
