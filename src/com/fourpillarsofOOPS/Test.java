package com.fourpillarsofOOPS;

public class Test {

	public static void main(String[] args) {
		SA s1=new SA();
		
		s1.setAcc_id(101);
		s1.setAcc_name("Bhai");
		s1.setAcc_bal(100000);
		s1.setMin_bal(10000);

		System.out.println("AccId:"+s1.getAcc_id());
		System.out.println("AccName:"+s1.getAcc_name());
		System.out.println("AccBal:"+s1.getAcc_bal());
		System.out.println("AccMinBal:"+s1.getMin_bal());
		System.out.println("Balance:"+s1.cal_bal());
		
		CA c1=new CA();
		c1.setAcc_id(102);
		c1.setAcc_name("AA");
		c1.setAcc_bal(200000);
		c1.setMin_bal(20000);
		
		
		System.out.println("AccId:"+c1.getAcc_id());
		System.out.println("AccName:"+c1.getAcc_name());
		System.out.println("AccBal:"+c1.getAcc_bal());
		System.out.println("AccMinBal:"+c1.getMin_bal());
		System.out.println("Balance:"+c1.cal_bal());
		
		Account a1=new Account();
		
		a1.cal_bal();		
	}
	

}
