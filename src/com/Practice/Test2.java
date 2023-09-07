package com.Practice;


public class Test2 {
	
	private static Test2 contactdao=null;
	
	private static void add() {
	}
	
	public static Test2 getInstance() {
		if(contactdao==null) {
			contactdao=new Test2();
		}
		return contactdao;
	}
	
	public static Test2 getdetails() {
		System.out.println("GM");
		return contactdao;
	}

	public static void main(String[] args) {
		
		Test2 t2=Test2.getInstance();
		System.out.println(t2);
		
		Test2 t3=Test2.getdetails();
		
		System.out.println(t3);
		

	}

}
