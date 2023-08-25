package com.fourpillarsofOOPS;

public class CA extends Account {
	
	private double min_bal;
	
	public double getMin_bal() {
		return min_bal;
	}



	public void setMin_bal(double min_bal) {
		this.min_bal = min_bal;
	}



	public double cal_bal() {
		double bal=getAcc_bal()-getMin_bal();
		return bal;
	}

}
