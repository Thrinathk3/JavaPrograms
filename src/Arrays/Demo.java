package Arrays;


public class Demo {	
public static void main(String[] args) {
	String s="amsterdem";
	char []a=s.toCharArray();
	for(int i=0;i<a.length;i++) {
		int count=1;
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				count++;
			}
		}
		if(count>1)System.out.print(a[i]+" ");
	}	
}
}
