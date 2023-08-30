package com.oops.inheritance;



 public class Demo{
	 
	 
	 int eid;
	 String ename;
	 double eprice;
	 
	public void details(int id,String name,double price) {
		
		eid=id;
		ename=name;
		eprice=price;
		
	}
	public void display() {
		
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(eprice);
	}
	
	public static void main(String[] args) {
		
		Demo d1=new Demo();
		d1.details(1, "Nani", 45000.00);
		d1.display();
		
	}
	
 }