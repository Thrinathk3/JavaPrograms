package Strings;

public class Strdupli {

	public static void main(String[] args) {
	//	String s1="aaabbccab";
//		int i=0;
//		char[]a=s.toCharArray();
//		String s2="";
//		while(i<a.length) {
//			char c=a[i];
//			int count=1;
//			while(true) {
//				i++;
//				if(i<a.length && a[i]==c)count++;
//				else break;
//			}
//			s2+=c+""+count;
//		}
////		System.out.println(s2);
//		while(s1.length()>0) {
//			char c=s1.charAt(0);
//			String s2=s1.replace(c+"","");
//			int count=s1.length()-s2.length();
//			System.out.print(c+""+count);
//			s1=s2;
//		}
	String s1="A7B6C5D4";
	for(int i=0;i<s1.length();i++) {
		char c=s1.charAt(i);
		if(c>='0'&& c<='9') {
			int sum=0;
			sum+=(c-'0');
			for(int j=1;j<=sum;j++) {
				System.out.print(s1.charAt(i-1));
				
			}
		}
	
		
		}
		
	}

}
