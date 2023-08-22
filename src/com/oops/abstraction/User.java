package com.oops.abstraction;

public class User {

	public static void main(String[] args) {
        Monitor  dell=new Dell(); // It does not show any implementation in Interface level.
		dell.mypc();
		dell.recyclebin();
		dell.keyboard();
		
		SimpleAb hp=new HP(); // But here we give implementation in abstract class so it shows implementation.
		
		hp.mypc();
		hp.recyclebin();
		hp.keyboard();

	}

}
