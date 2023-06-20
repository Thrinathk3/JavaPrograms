package s_basics;

public class A {

	public static void main(String[] args) {
		String s1="HELLO W@OR!L^&D";
//		for(int i=0;i<s1.length();i++) {
//			char c=s1.charAt(i);
//				if(c=='@'||c=='!'||c=='^'||c=='&'||c=='$') {
//					s1=s1.replace(c+"","");
//				}
//			}
//		System.out.println(s1);
		String s2=s1.replaceAll("[!@$^&]","");
		System.out.println(s2);
		
		
		}
}
