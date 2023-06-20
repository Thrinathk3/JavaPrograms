package Strings;

public class ReverseString {

	public static void main(String[] args) {
    String s="java is oops language";
    String []a=s.split(" ");
    String s2="";
    for(int i=a.length-1;i>=0;i--) {
    	s2=s2+" "+a[i];	
    }
    System.out.println(s2);
	}

}
