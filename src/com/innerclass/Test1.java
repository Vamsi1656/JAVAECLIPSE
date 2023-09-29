package com.innerclass;

public class Test1 {
	
	public static int a=10;
	int b=20;
	private int c=30;
	
	class Test2{
		public void display() {
			System.out.println("Outerclass a="+ a);
			
			System.out.println("Outerclass b="+b);
			
			System.out.println("Outerclass c="+c);
			
			int d=100;
			System.out.println("Innerclass d="+d);
		}
	}

	public static void main(String[] args) {
		
		Test1 t=new Test1();
		Test1.Test2 t2=t.new Test2();
		t2.display();
	}

}
