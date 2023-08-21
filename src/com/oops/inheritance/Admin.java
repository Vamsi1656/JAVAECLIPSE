package com.oops.inheritance;

public class Admin extends Developer {
	
	public void manage() {
		super.read();
		System.out.println("manage code");
		
	}
	
	public void read() {
		System.out.println("Admin read code");
	}

}
