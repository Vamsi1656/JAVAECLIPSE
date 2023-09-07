package com.Exceptions;

public class Test1 {
	
//	public static String convert (String s) {
//		return s.toUpperCase(); // It shows NullpointerException.
//								// Because we don't give any value to the method.
//	}
	
	int n=50;
	
	public static Test1 number() {
		return null;
	}

	public static void main(String[] args) {
		
		Test1 t1=Test1.number();
		
		System.out.println(t1.n);
		

	}

}
;