package com.oops.isa.generalization;

public class RegCustomer extends Customer{
	private double discount;
	
	public RegCustomer(long Customer_id,String name,double discount) {
		super(Customer_id,name);
		this.discount=discount;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	
}
