package com.exception;

// Exception: It is an event which is occurs at the time of execution of program that disrupts the
//            normal flow of instructions.
// By default exception is done by java it stops the execution when exception happens.
// It cannot move to next line after exception is happen.


public class Test {

	public static void main(String[] args) {
		System.out.println("Execution starts");
		
		int a =5;
		int b=0; 
		int result;
		
		result=a/b; // Here is the exception.
		
		System.out.println("Output is:"+ result);
		
		System.out.println("Execution ends");

	}

}
