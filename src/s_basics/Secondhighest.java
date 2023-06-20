package s_basics;

import java.util.Arrays;


public class Secondhighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		char s=65535;
		//		int n=10;
		//		System.out.println(s+n);
		//		String s1="abcdefegh";
		//		System.out.println(s1.substring(0,5));
		int[]a= {5,7,2,3,3,3,5,7,7};
		Arrays.sort(a);//2 3 3 3 5 5 7 7 7 
		int count =1;
		for(int i=1;i<a.length;i++) {
			//
			//int count=1;
			//for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[i-1]) {
				count++;
			}

			if(count>1) {
				System.out.println(a[i-1]);
				count=1;	
			}

		}

	}	
}
