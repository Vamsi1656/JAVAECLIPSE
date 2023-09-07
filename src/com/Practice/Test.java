package com.Practice;

public class Test {

	public static void main(String[] args) {
		String s1= "Hello";
		String reversedStr = "";

		for (int i = 0; i < s1.length(); i++) {
		  reversedStr = s1.charAt(i) + reversedStr;
		}

		System.out.println("Reversed string: "+ reversedStr);
	}

}
