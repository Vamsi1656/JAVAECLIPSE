package com.Stringbuilder;

public class Test {

	public static void main(String[] args) {
		
		
		StringBuilder sb=new StringBuilder("Today is 31st of August");
		
		sb.append("Time is 10.20");
		
		sb.insert(9, "Hello"); //Based on index number the data is inserted.
		
		sb.replace(9, 17, "Hii"); // It can replace based on starting and ending index values.
		
		sb.delete(9, 17); // It deletes the data based on starting and ending index values.
		
//		sb.reverse(); // It can reverse the string.
		
		System.out.println(sb.capacity()); //  The capacity() method of StringBuilder class returns the current capacity of the Builder. 
		                                   //The default capacity of the Builder is 16. 
		                                   //If the number of character increases from its current capacity, 
		                                   //  it increases the capacity by (oldcapacity*2)+2.
		
		
		sb.charAt(1);  // It is used to identify the character at particular index.
		
	    System.out.println(sb.length()); // Finds the total number of characters.
	    
	    System.out.println(sb.substring(5, 7)); // It finds the character between two indexes.s
		
		System.out.println(sb);

	}

}
