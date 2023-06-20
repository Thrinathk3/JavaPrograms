package Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class A {
	public String main(String s1) {
		char []a=s1.toCharArray();
		String s2= "";
		Arrays.sort(a);
		int i=0;
		while(i<s1.length()) {
			char c=a[i];
			int count=1;
			while(true) {
				i++;
				if(i<a.length  && a[i]==c)count++;
				else break;
			}
			s2+=c+""+count;
		}return s2;	
	}
	public static void main(String[] args) {
		//System.out.println(main("babdc"));
		A a=new A();
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String z=a.main(s);
		System.out.println(z);
	}
}
