package Arrays;
public class Practice {
	public static void main(String[] args) {
	 String s1="aaabbbcccaa";
	 char[]a=s1.toCharArray();
	 String s2="";
	 int i=0;
	 while(i<a.length) {
		 char c=a[i];
		 int count=1;
		 while(true) {
			 i++;
			 if(i<a.length && a[i]==c)count++;
			 else break;
		 }
		 s2+=c+""+count;
	 }
	 System.out.print(s2);
		
		}
	
}
