package Strings;

import java.util.LinkedHashSet;
import java.util.Set;

   public class Panagram {
	public static void main(String[] args) {
		String s="abcd efghij klmnopqrst uvwxyz";
		Set<Character>s1=new LinkedHashSet<>();
		int i=0;
		while(i<s.length()) {
	     char c=s.charAt(i++);
			if(c!=' ')s1.add(c);
		}
		System.out.println(s1.size());
		if(s1.size()!=26)System.out.println("not panagram");
		else System.out.println("panagram");
	}
}
