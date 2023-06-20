package Arrays;

public class Words {

	public static void main(String[] args) {
  
//   char [] a=s1.toCharArray();
//   String s2="";
//   int i=0;
//   int j=i;
//   while(i<a.length) {
//	   
//	   while(i<a.length && a[i]!=' ')i++;
//	   int k=j;
//	   String temp="";
//	   while(k<i) {
//		   
//		   temp+=a[k];
//		   k++;
//	   } 
//	  // s2+=temp;
//	   System.out.println(temp);
//	   i++;
//	   j=i;
//	  
//   }
 String s1="java is oops language";
   String s="";
   for(int i=0;i<s1.length();i++) {
	   char c=s1.charAt(i);
	   if(c==' ') {
		   System.out.println(s);
		   s="";
	   }
	   else {
		   s+=c;
	   }
   }  
  System.out.println(s); 
	}

}
