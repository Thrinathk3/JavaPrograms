package Strings;

public class practice {

	public static void main(String[] args) {
//		String s1="aaabbccaann";
//		char [] a=s1.toCharArray();
//		int i=0;
//		String s2="";
//		while(i<a.length) {
//			char c=a[i];
//			int count=1;
//			while(true) {
//				i++;
//				if(i<a.length && c==a[i])count++;
//				else break;
//			}
//			s2=s2+c+""+count;
//		}
//		System.out.println(s2);
		
	String s1="a2b3c1a2";
	for(int i=0;i<s1.length();i++) {
		char c=s1.charAt(i);
		int count=0;
		if(c>='0' && c<='9') {
			 count=(c-'0');
		}
		for(int j=1;j<=count;j++) {
			System.out.print(s1.charAt(i-1));
		}
		
		
	}
		
		

	}

}
