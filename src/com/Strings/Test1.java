package com.Strings;

public class Test1 {

	public static void main(String[] args) {
		String s1="Hello";
		String s2=new String("Vamsi");
		String s3="Hello";
		String s4=new String("Hii");
//		System.out.println(s1);
//		System.out.println(s2);
		
		
		System.out.println(s1==s2); // It shows false  because two addresses of the two strings in different.
									// One is stored in heap memory and one is stored in string pool.
		
		System.out.println(s1==s3); // It shows true because the two variables stored in string pool only with 
									// the same address because we directly access the value.
		
		System.out.println(s2==s4); // It shows false because the two variables create the different objects in the
								    // heap memory it has two different addresses.
		
		
		
	}

}
