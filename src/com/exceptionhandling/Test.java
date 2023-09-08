package com.exceptionhandling;

// Try: The peace of code which can throws the exception we can place it in the try block.

// Catch(): It can hold the exception when try block throw to it.

// Finally : Whatever it happens wheather the exception is there or not there finally block is 
//           executed.

// Throw : It is used when the user handle the exception by using  try and catch and he is return the exception 
//         to java.It happens with throw keyword.

public class Test {

	public static void main(String[] args) {
		System.out.println("Execution starts");
		
		int a =5;
		int b=0;
	    int result=0;
		
		try {
			result=a/b;
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.toString());
			throw ae;
		}
		finally {
			System.out.println("Hello,Gm");
		}
		System.out.println("Output is:"+ result);
		
		System.out.println("Execution ends");
	}

}
