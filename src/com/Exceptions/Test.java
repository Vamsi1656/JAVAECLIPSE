package com.Exceptions;

public class Test {

	public static void main(String[] args) {
		System.out.println("Execution starts");
		
//		int a=Integer.parseInt("hello"); // It shows NumberFormatException.
										 // We cannot convert string into a numeric value
		
		try {
			int a=Integer.parseInt("hello");
		}
		catch(java.lang.NumberFormatException nf) {
			System.out.println("Number");
		}
		
		System.out.println("Execution Ends");
	}

}
