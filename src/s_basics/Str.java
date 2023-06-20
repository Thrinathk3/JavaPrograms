package s_basics;

public class Str {

	public static void main(String[] args) {
   String s1="java";
   String s2="java";
   String s3=new String("java");
   String s4=new String("java");
   System.out.println(s3==s4);
   System.out.println(s1==s2);
   System.out.println(s1.equals(s2));
   System.out.println(s1.equals(s3));
   System.out.println(s1==s3);
  
  // String s="java";
   //String builder s1="JAVA";
   int n=10;
  // String e1="6";
   char a=5;
   System.out.println(a+n);
   System.out.println(a);
   
	}

}
