package com.methodoverriding;

public class Test1 extends Test {

	public void wish() {
		System.out.println("Hello,GA");
	}
	
	public static void main(String[] args) {
		Test1 t1=new Test1();
		t1.wish();
	}
}
