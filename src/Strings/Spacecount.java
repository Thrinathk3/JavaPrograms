package Strings;

public class Spacecount {

	public static void main(String[] args) {
    String s1="java is oops lang";
    int count=0;
    for(int i=0;i<s1.length();i++) {
    	char c=s1.charAt(i);
    	if(c==' ')count++;
    }
    System.out.println(count);
	}

}
