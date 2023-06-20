package string_practice;

public class Reverse {
	
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
	public static void main(String[] args) {
		String s1="kerala language is malayalam";
		String []a=s1.split(" ");
		int max=0;
		String s2="";
		for(int i=0;i<a.length;i++) {
			if(ispalindrome(a[i])) {
				if(max<=a[i].length()) {
					max=a[i].length();
					s2=a[i];
				}
			}	
		}
	System.out.println(s2);	
	}
}
