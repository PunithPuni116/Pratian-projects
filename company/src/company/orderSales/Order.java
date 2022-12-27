package company.orderSales;

import java.util.ArrayList;

public class Order {	
	private Customer customer;
	
	ArrayList<OrderedItem> orderedItem=new ArrayList<OrderedItem>();
	
	public Order(Customer customer) {
		super();
		this.customer = customer;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public ArrayList<OrderedItem> getOrderedItem() {
		return orderedItem;
	}
	public void setOrderedItem(ArrayList<OrderedItem> orderedItem) {
		this.orderedItem = orderedItem;
	}
	

}
