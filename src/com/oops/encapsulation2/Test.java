package com.oops.encapsulation2;

public class Test {

	public static void main(String[] args) {
		Account a1=new Account();
		 a1.setacc_id(101);
		 a1.setacc_name("Virat");
		 a1.setacc_bal(4500);
		 a1.setmin_bal(500);
		 
		 
		 
		 System.out.println("Acc Id:"+ a1.getacc_id());
		 System.out.println("Acc Name:"+ a1.getacc_name());
		 System.out.println("Acc Bal:"+ a1.getacc_bal());
		 System.out.println("Acc MinBal:"+ a1.getmin_bal());
		 System.out.println(a1.cal_bal());
	}
}
