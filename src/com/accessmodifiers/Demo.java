package com.accessmodifiers;

public class Demo {
		
	 int a=12;
	 
	 
	public static void main(String[] args) {
             Demo d=new Demo();
             System.out.println(d.a);
             
           Test t1=new Test();
           t1.demo(); // Protected
           t1.test(); // Default
           System.out.println(t1.a); // public
//         t1.wish();   Here it is private we cannot access outside the class.
	}
	

}
