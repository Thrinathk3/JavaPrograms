package Practice;


public class B {

	public static void main(String[] args) {
//     int n=5;
//     int star=1;
//     int space=n-1;
//     for(int i=1;i<=n;i++) {
//    	 for(int j=1;j<=space;j++) {
//    		 System.out.print(" ");
//    	 }
//    	 for(int j=1;j<=star;j++) {
//    		 System.out.print("*");
//    	 }
//    	 System.out.println();
//    	 star+=2;
//    	 space--;
//    	 
//     }
		
//	int n=5;
//	int result=(int)Math.pow(2, n);
//	System.out.println(result);
//		
		
//	int n=5;
//	int fact=1;
//	for(int i=1;i<=n;i++) {
//		fact=fact*2;
//	}
//	System.out.println(fact);
//		
		
//	List<Object>l = new ArrayList<>();	
//		
//		l.add("A");
//		l.add("B");
//		l.add("C");
//		l.add("D");
//		 System.out.println(l);
//		 for(Object s:l) {
//			 System.out.println(s);
//		 }
//		 String s="hey my name is suraj";
//		 int count=0;
//		 for(int i=0;i<s.length();i++) {
//			 char c=s.charAt(i);
//			 if(c==' ')count++;
//		 }
//		 System.out.println(count);
		
		
	String s1="Rajesh";
     String s2="";
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
	int count=0;
	int length=0;
	for(int i=0;i<s2.length();i++) {
		char c=s2.charAt(i);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')count++;
		else length++;
	}
	System.out.println(count);
	System.out.println(length);
	
		
		
		
		
	}

}
