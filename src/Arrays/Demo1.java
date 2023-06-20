package Arrays;


public class Demo1 {

	public static void main(String[] args) {
    String s1="aaabbccda";
    String s2="";
    char[]a=s1.toCharArray();
    int i=0;
    while(i<s1.length()){
    	char c=a[i];
    	int count=1;
    	while(true) {
          i++;
    	if(i<a.length && a[i]==c)count++;
    	else break;
    	}
    	 s2+=c+""+count;
    }
   System.out.println(s2);
    
	}

}
