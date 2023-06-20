package Strings;

public class Split {

	public static void main(String[] args) {
    String s="He is a very very good boy, isn' t he?";
    s=s.replaceAll("['?@4&,]","");
    String []a=s.split(" ");
    int n=10;
    System.out.println(n);
    for(int i=0;i<a.length;i++) {
    	System.out.println(a[i]);
    }
	}
}
