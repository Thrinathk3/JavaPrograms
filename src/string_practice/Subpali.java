package string_practice;

public class Subpali {
	public static boolean ispalindrome(String s) {
		int i=0,j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j))return false;
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
  String s1="lkjhgfmalayalamssssdffgg";
  int max=0;
  String maximum="";
  for(int i=0;i<s1.length()-1;i++) {
	  for(int j=i+2;j<=s1.length();j++) {
		  String s2=s1.substring(i,j);
		  if(ispalindrome(s2)) {
			 if(max<s2.length()) {
				 max=s2.length();
				 maximum=s2;
			 }
		  }
	  }
  }
  System.out.println(maximum);
	}
}
