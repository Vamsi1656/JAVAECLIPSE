package com.methodoverloading;

public class Test {
	
//	public void add(int a ,int b) {}
//	public void add(int a,int b) {}   not allowed in java
// public void add (int b,int a){}

	public void add(int a,int b) {}
	
	public void add(int a,int b,int c) {}
    

	public static void main(String[] args) {
		Test t1=new Test();
		t1.add(20, 30);
	    t1.add(20, 30, 40);
		
		System.out.println();

	}

}
