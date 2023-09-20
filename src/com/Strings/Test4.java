package com.Strings;

public class Test4 {

	public static void main(String[] args) {
		String s2=new String("Hi");
		String s3=new String("Hi");
		
		System.out.println(s2==s3);
		
		String s=new String("Hi").intern();
		String s1=new String("Hi").intern();
		
		System.out.println(s==s1);
		
		String s4=new String("Hi");
		String s5=new String("Good Evening");
		
		String s6=String.format("%s%s",s4,s5);
		System.out.println(s6);
		
		String s7=String.join(",",s4,s5);
		System.out.println(s7);

	}

}
