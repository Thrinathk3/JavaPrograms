package Strings;
public class S {
public static void main(String[] args) {
String s1="RajEsh";
String s2="";
int vowelscount=0;
int consonentscount=0;
for(int i=0;i<s1.length();i++) {
	char c=s1.charAt(i);
	if(c>=65 && c<=90) {
		s2=s2+(char)(c+32);
	}
	else {
		s2+=c;
	}
}
System.out.println(s2);
for(int i=0;i<s2.length();i++) {
	char c=s2.charAt(i);
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
		vowelscount++;
	}
	else {
		consonentscount++;
	}
}
System.out.println("vowels"+"->"+vowelscount);
System.out.println("consonents"+"->"+consonentscount);
	}
}
