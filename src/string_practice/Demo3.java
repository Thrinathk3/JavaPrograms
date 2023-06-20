package string_practice;

public class Demo3 {
	public static void main(String[] args) {
     String s1="sivasankar";
     int count=0;
     for(int i=0;i<s1.length();i++) {
    	 char c=s1.charAt(i);
    	 if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')count++;
     }
     System.out.println(count);
	}
}
