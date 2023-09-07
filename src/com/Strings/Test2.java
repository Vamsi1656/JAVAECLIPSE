package com.Strings;

public class Test2 {

	public static void main(String[] args) {
		String s1="Hello GM";
		
		String s2=new String("Hello");
//		System.out.println(s2);
		
		String s3="GN";
		
//		System.out.println(s1==s2); 
//		
//		System.out.println(s1.equals(s2)); // It shows to true because the data is same.Irrespective of it's 
										   // memory address it compares content.
		
//		System.out.println(s1.substring(2,8));
		
		String s=s1.concat(s3);
		System.out.println(s);

	}

}
