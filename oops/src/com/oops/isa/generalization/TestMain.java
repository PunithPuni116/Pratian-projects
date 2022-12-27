package com.oops.isa.generalization;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c1=new Customer(01,"abc");
		RegCustomer c2=new RegCustomer(02,"xyz",2500);
		System.out.println(c1.getCutomer_id()+" "+c1.getName());
		System.out.println(c2.getCutomer_id()+" "+c2.getName()+" "+c2.getDiscount());
	}

}
