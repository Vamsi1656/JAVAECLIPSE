package com.exceptionhandling1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo {

	public static void main(String[] args) {
		
		
		System.out.println("HEllo");
		int a=4;
		int b=0;
		int result=0;
		try {
		result=a/b;
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.toString());
			
		}
		finally{
			System.out.println("Final method");
		}
		System.out.println(result);
		
		System.out.println("Hii");
	}

}
