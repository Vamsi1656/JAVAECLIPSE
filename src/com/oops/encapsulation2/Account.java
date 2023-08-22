package com.oops.encapsulation2;

public class Account {
	
	private int acc_id;
	
	private String acc_name;
	
	private double acc_bal;
	
	private double min_bal;
	
	
	public int setacc_id(int number) {
		return this.acc_id=number;
	}
	public String setacc_name(String name) {
		return this.acc_name=name;
	}
	public double setacc_bal(double number) {
		return this.acc_bal=number;
	}
	public double setmin_bal(double number) {
		return this.min_bal=number;
	}
	
	public int getacc_id() {
		return this.acc_id;
	}
	public String getacc_name() {
		return this.acc_name;
	}
	public double getacc_bal() {
		return this.acc_bal;
	}
	public double getmin_bal() {
		return this.min_bal;
	}
	
	public double cal_bal() {
		return this.acc_bal=acc_bal-min_bal;
	}

	
	

}
