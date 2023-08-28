package com.Strings;

public class Test3 {

	public static void main(String[] args) {
		String s1="HeLlo";
		String s2="hello";
		String s3="HELLO";
		
		System.out.println(s1.equals(s2)); // It is false because it compares as it is String including case sensitive. 
		System.out.println(s1.equalsIgnoreCase(s2)); // It is true because if it data is same irrespective of cases 
													 // it give true.
		
		System.out.println(s3.contains("HE")); // It is true because it contains the text if any character changes it 
		                                       // cases it shows false.
//		
//		System.out.println(s3.contains("he")); // Here HE is there but upper case we give lower case that's why it shows 
//											   // false.
		
//		System.out.println(s1.startsWith("He"));
//		
//		System.out.println(s1.endsWith("Llo"));
	}

}
