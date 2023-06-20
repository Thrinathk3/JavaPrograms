package Strings;

public class Dupli {

	public static void main(String[] args) {
		String s1="siva";
		String s2="uday";
		for(int i=0;i<s1.length();i++) {
			char c1=s1.charAt(i);
			for(int j=0;j<s2.length();j++) {
				char c2=s2.charAt(j);
				if(c1==c2) {
					s1=s1.replace(c1+"","");
					s2=s2.replace(c2+"","");
				}
			}
		}
		s2=s1+s2;
		System.out.println(s2);
		int count=0;
		for(int i=0;i<s2.length();i++) {
			char c=s2.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')count++;
		}
		System.out.println(count);
	}
}
