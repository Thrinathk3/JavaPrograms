package s_basics;

import java.util.ArrayList;

public class P {

	public static void main(String[] args) {
//		int[]a= {1,2,3,4,5};
//		System.out.println(a.length);
//		a[2]=0;
//		for(int n:a) {
//			System.out.println(n);
//		}
	ArrayList<Object>l1 = new ArrayList<>();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	l1.add(40);
	l1.add(50);
	for(int i=0;i<l1.size();i++) {
		System.out.println(l1.get(i));
		l1.add(5);
		
	}
		
	}
}
