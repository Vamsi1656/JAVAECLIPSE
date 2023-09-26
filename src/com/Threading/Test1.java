package com.Threading;

// Thread example by implementing the Runnable interface

public class Test1 implements Runnable {
	
	public void run() {
		System.out.println("Child Thread");
	}


	public static void main(String[] args) {
		
		Test1 t1=new Test1();
		
		Thread t=new Thread(t1);
		t.start();
		
	}

}
