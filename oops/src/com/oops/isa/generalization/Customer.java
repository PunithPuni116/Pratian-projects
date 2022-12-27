package com.oops.isa.generalization;

public class Customer {
	
	private long customer_id;
	private String name;
	
	public Customer(long customer_id,String name) {
		this.customer_id=customer_id;
		this.name=name;
	}
	public long getCutomer_id() {
		return customer_id;
	}
	public void setCutomer_id(long cutomer_id) {
		this.customer_id = cutomer_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
