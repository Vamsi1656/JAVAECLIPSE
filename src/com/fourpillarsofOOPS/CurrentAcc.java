package com.fourpillarsofOOPS;

public class CurrentAcc extends Account {
	
	private double min_bal;
	

	public double getMin_bal() {
		return min_bal;
	}


	public void setMin_bal(double min_bal) {
		this.min_bal = min_bal;
	}
	

	public double cal_age() {
		return this.getAcc_bal()-min_bal;
		
	}

	
	

}
