package company.orderSales;

import java.util.ArrayList;

public class Customer {
	private int customer_id;
	private String customer_name;
	ArrayList<Order>orders=new ArrayList<>();
	
	public Customer(int customer_id, String customer_name) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;

	}
	public ArrayList<Order> getOrders() {
		return orders;
	}
	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	
}
