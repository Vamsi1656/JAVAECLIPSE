package com.Strings;

public class Test5 {

	public static void main(String[] args) {
		String s1=new String("NANI");
		String reverse="";
		
		for(int i=s1.length()-1;i>=0;i--) {
			reverse=reverse+s1.charAt(i);
		}
		System.out.println(reverse);

	}

}
