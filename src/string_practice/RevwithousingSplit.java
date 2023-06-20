package string_practice;

public class RevwithousingSplit {

	public static void main(String[] args) {
    String s1="java is oops lang";
    String s2="";
    char [] a=s1.toCharArray();
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
    	s2+=temp;
    	if(i>-1)s2+=" ";
    	i--;
    	j=i;
    }
    System.out.println(s2);
	}

}
