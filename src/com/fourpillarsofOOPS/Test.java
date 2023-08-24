package com.fourpillarsofOOPS;

public class Test {

	public static void main(String[] args) {
		SavingAcc sa=new SavingAcc();
		
		sa.setAcc_id(101);
		sa.setAcc_name("Vamsi");
		sa.setAcc_bal(45000);
		sa.setMin_bal(500);
		
		System.out.println("AccId:"+ sa.getAcc_id());
		System.out.println("AccName:"+ sa.getAcc_name());
		System.out.println("AccBal:"+ sa.getAcc_bal());
		System.out.println("MiBal:"+ sa.getMin_bal());
		
//		System.out.println(sa.cal_bal());

	}

}
