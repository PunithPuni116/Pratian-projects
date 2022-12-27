package company.orderSales;

import java.util.ArrayList;

public class RegCustomer extends Customer {
	private double discount=0;
	public RegCustomer(int customer_id, String customer_name) {
		super(customer_id, customer_name);
		
	}
	public double getDiscount() {
		return (discount/100);
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
}
