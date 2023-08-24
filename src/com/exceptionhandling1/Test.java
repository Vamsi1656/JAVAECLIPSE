package com.exceptionhandling1;

public class Test {

	public static void main(String[] args) {
		System.out.println("Execution starts");
		
		int a=4;
		int b=0;
		int result=0;
		
		
		
		try {
			result=a/b;
		}
		catch(Exception ae) {
			System.out.println(ae);
		}
		finally {
			System.out.println("FInally block");
		}
		System.out.println("Output is:"+ result);
		
		System.out.println("Execution ends");
	}

}
