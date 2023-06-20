package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		 @SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
			System.out.println("Enter number");
			int n=scn.nextInt();
			
			ArrayList<Object> l = new ArrayList<>();
			int count=0;
			int i=2;
			while(count<n) {
				boolean flag=true;
				for(int j=2;j<=i/2;j++) {
					if(i%j==0) {
						flag=false;
						break;
					}
				}
				if(flag) {
					//System.out.print(i+" ");
					if(count%3==0)
					System.out.print(i+" ");
					l.add(i);
					count++;
					
				}
				i++;
			}
			//System.out.println(l.get(0)+" "+l.get(l.size()-1));
	}

}//2 3 5 7 11 13 17 19 23 29 
