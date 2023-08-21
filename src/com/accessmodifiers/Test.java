// Public Access modifier : Used any where in java project.
// Private Access modifier : Access only inside the class.
// Protected Access modifier : Access inside the package and outside the package by using child reference.
// Default Access Modifier : Access only inside the package



package com.accessmodifiers;

public class Test {
	
	public static int a=100;
	
	private static void wish() {
		System.out.println("Hello");
	}
	
	protected void demo() {
		System.out.println("Demo");
	}
	
	void test() {
		System.out.println("Test");
	}

	public static void main(String[] args) {
		System.out.println(a);
		wish();

	}

}
