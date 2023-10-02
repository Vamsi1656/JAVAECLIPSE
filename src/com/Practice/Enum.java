package com.Practice;

import java.util.Scanner;

public class Enum {

	public static void main(String[] args) {
		
		// reverse a number
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int n=s.nextInt();
		
		int r;
		int rev=0;
//		String str="";
		
		while(n!=0) {
			r=n%10;
			rev=rev*10+r;
			n=n/10;
//			str=str+r;
		}
		
		System.out.println(rev);

	}

}
