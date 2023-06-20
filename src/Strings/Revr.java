package Strings;

public class Revr {

	public static void main(String[] args) {
    String s="java is oops lang";
    String s1="";
    char []a=s.toCharArray();
    int i=a.length-1;
    int j=i;
    while(i>-1) {
    	while(i>-1 && a[i]!=' ')i--;
    	int k=i+1;
    	String temp="";
    	while(k<=j) {
    		temp+=a[k];
    		k++;
    	}
    	s1+=temp;
    	if(i>-1)s1+=" ";
    	i--;
    	j=i;
    }
    System.out.println(s1);
	}

}
