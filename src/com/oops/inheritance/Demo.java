package com.oops.inheritance;



 class Test{
	 
	 int a;
	 int b;
	 
	 public void vasu() {
		 System.out.println(a+b);
	 }
	
}
 
 class Hii{
	 int c;
	 int d;
	 
	 public void add() {
		 System.out.println(c+d);
	 }
 }

public class Demo {

	public static void main(String[] args) {
		
		Test t1=new Test();
		
		t1.a=100;
		t1.b=200;
		t1.vasu();
		
		
		
		
		

	}

}
