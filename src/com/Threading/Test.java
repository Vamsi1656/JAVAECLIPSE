package com.Threading;


// Thread example by extending the thread class.
public class Test extends Thread {
	
	public void run() {
		System.out.println("Child Thread running..........");
	}

	public static void main(String[] args) {
		Test t1=new Test();
		t1.run();

	}

}
