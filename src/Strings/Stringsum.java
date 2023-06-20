package Strings;

public class Stringsum {

	public static void main(String[] args) {
    String s1="siva123sankar181";
    int sum=0;
    int count=0;
    for(int i=0;i<s1.length();i++) {
    	char c=s1.charAt(i);
    	if(c>='0'&&c<='9') {
    		count++;
    		sum+=(c-'0');
    	}
    }
    System.out.println(count+" "+sum);
	}

}
