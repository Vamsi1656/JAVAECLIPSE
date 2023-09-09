package com.Practice;

public class Exam12 {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		int result=0;
		
		try {
		result=a/b;
		}
		
		
		catch(ArithmeticException ae) {
			System.out.println(ae.toString());
		}
		catch(Exception e) {
			System.out.println("Hii");
		}
		
		System.out.println(result);
	}

}
