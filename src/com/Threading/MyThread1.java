package com.Threading;

//Using the Thread Class: Thread(Runnable r, String name)

public class MyThread1 implements Runnable {
	
	public void run() {
		System.out.println("Thread is Running......");
	}

	public static void main(String[] args) {
		Runnable r=new MyThread1();
		
		Thread t=new Thread(r,"New Thread");
		
		t.start();
		
		String str=t.getName();
		System.out.println(str);

	}

}
