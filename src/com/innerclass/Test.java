package com.innerclass;

public class Test {
	
	public void m1() {
		System.out.println("Hello");
	}
	
	class Test1{
		public void m1() {
			System.out.println("Hii");
		}
	}

	public static void main(String[] args) {
		
		Test t=new Test();
		Test.Test1 t1=t.new Test1();
		t.m1();
		t1.m1();
			

	}

}
