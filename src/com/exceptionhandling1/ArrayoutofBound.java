package com.exceptionhandling1;

//import java.util.ArrayList;

public class ArrayoutofBound {

	public static void main(String[] args) {
		
		String[] s= {"Virat","Rohit","Dhoni"};
		
		try {
			for(int i=0;i<=s.length;i++){
				
				System.out.println(s[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException aiobe) {
			
			
			
		}
		

	}

}
