package com.oops.encapsulation1;

public class Student {
	
	int rollno;
	String name;
	boolean isattended;
	
	
	public void setStudentAttandence() {
		System.out.println("Teacher allocated attendance to students");
	}
	
	public boolean getStudentAttandence(boolean flag) {
		System.out.println("Tecaher access attandance to students");
		return flag;
	}
}
