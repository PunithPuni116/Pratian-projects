package company.orderSales;

import java.util.ArrayList;

public class Company {
	
	private ArrayList<Item>item=new ArrayList<>();//one to
	
	private ArrayList<RegCustomer>customer=new ArrayList<>();//
	

	public ArrayList<Item> getItem() {
		return item;
	}
	public void setItem(ArrayList<Item> item) {
		this.item = item;
	}
	public ArrayList<RegCustomer> getCustomer() {
		return customer;
	}
	public void setCustomer(ArrayList<RegCustomer> customer) {
		this.customer = customer;
	}
	
	public double getTotalWorthOfOrdersPlaced() {
		double totalWorth=0;
		for(RegCustomer customers:customer) {
			for(Order orders: customers.getOrders()) {
				for(OrderedItem orderedItem: orders.getOrderedItem()) {
					double temp=0;
					if(customers.getDiscount()!=0) {
						double d=0;
						d=orderedItem.getOrderedItemQty()*orderedItem.getItemRate()*customers.getDiscount();
						temp=orderedItem.getOrderedItemQty()*orderedItem.getItemRate()-d;
					}
					else
						temp=orderedItem.getOrderedItemQty()*orderedItem.getItemRate();
					
					totalWorth+=temp;
				}
			}
		}
		return totalWorth;
		
	}
}




//private ArrayList<OrderedItem>orderedItems=new ArrayList<>();

//public ArrayList<OrderedItem> getOrderedItems() {
//		return orderedItems;
//	}
//	public void setOrderedItems(ArrayList<OrderedItem> orderedItems) {
//		this.orderedItems = orderedItems;
//	}
	//	public Company(ArrayList<Item> item, ArrayList<RegCustomer> customer) {
//		super();
//		this.item = item;
//		this.customer = customer;
//	}
