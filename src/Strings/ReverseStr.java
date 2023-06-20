package Strings;

public class ReverseStr {
	public static void main(String[] args) {
		String s1="hi hello hi how";
		String []a=s1.split(" ");
		String s="";
		int count=1;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i].equals(a[j])) {
					count++;
					 s=a[i];
				}
			}
		}
		System.out.println(s+" "+count);
	}
}
