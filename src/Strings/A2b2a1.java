package Strings;

public class A2b2a1 {

	public static void main(String[] args) {
		String s1="aaabbccaab";
		String s2="";
		 char[] a=s1.toCharArray();
		 int i=0;
		 while(i<a.length) {
			 char c=a[i];
			 int count=1;
			 while(true) {
				 i++;
				 if(i<a.length && c==a[i])count++;
				 else break;
			 }
			 s2+=c+""+count;
		 }
			System.out.println(s2);	

	}

}
