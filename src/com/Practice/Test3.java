package com.Practice;

public class Test3 {
	
	public static Test3 contactdao=null;
	
	public static Test3 getInstance() {
		if(contactdao==null) {
			contactdao=new Test3();
		}
		return contactdao;
	}
	
	public static Test3 getdetails() {
		System.out.println("GM");
		return contactdao;
	}
	
	
	public static void main(String[] args) {
		Test3 t4=Test3.getInstance();
		System.out.println(t4);
		
        Test3 t5=Test3.getdetails();
		
		System.out.println(t5);
		
		
		

	}

}
