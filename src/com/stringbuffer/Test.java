// String buffer is used to change the string values because in String we cannot change values because it is immutable.
// But String buffer is mutable we change the values.To over come the immutable in Strings we use String Buffer.

package com.stringbuffer;

public class Test {

	public static void main(String[] args) {
		
		String s1=new String("Hello Good Morning");
		
//		s1.concat("Today is Thursday");
//		
//		String s=s1.concat("Today is Thursday");
//		
//		System.out.println(s);
//		
		
		
		StringBuffer sb=new StringBuffer("Hello Hi Good Morning");
		
		sb.append("Good morning from Banglore");
		
		sb.insert(5, "Vamsi");
		
//		sb.reverse();
		
		System.out.println(sb);
		
		

	}

}
