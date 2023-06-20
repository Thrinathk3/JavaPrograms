package Strings;

public class Str1 {

	public static void main(String[] args) {
  String s="1234A";
  int sum=0;
 for(int i=0;i<s.length();i++) {
	 char c=s.charAt(i);
	 if(c>='0'&&c<='9') {
		 sum+=(c-'0');	 
	 }
	 else if(c>=65&&c<=122) {
		 sum+=c;
	 }
 }
  System.out.println(sum);
	}

}
