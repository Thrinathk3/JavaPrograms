package string_practice;

import java.util.Scanner;

public class Demo {	
	   
   public static void main(String[] args) {
    @SuppressWarnings("resource")
	Scanner scn = new Scanner(System.in);
    System.out.println("Enter amount");
    int a=scn.nextInt();
    if(a%100!=0) {
    	System.out.println("Failed:Amount should be multiple of hundread");
    }
    else {
    	if(a>=2000) {
    		System.out.println("2000 *"+a/2000);
    		a%=2000;
    	}
    	if(a>=500) {
    		System.out.println("500 *"+a/500);
    		a%=500;
    	}
    	if(a>=200) {
    		System.out.println("200 *"+a/200);
    		a%=200;
    	}
    	if(a>=100) {
    		System.out.println("100 *"+a/100);
    		a%=100;
    	}
    	
    } 
     }
   }
