package company.orderSales;

import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company c=new Company();
		
		
		
		
		Item i1=new Item("Titaan Watch",5000);
		Item i2=new Item("Mouse",500);
		Item i3=new Item("keyboard",1000);
		Item i4=new Item("Apple Iphone",80000);
		Item i5=new Item("Headphone",2000);
		ArrayList<Item>items=new ArrayList<>();
		items.add(i1);
		items.add(i2);
		items.add(i3);
		items.add(i3);
		items.add(i4);
		items.add(i5);
		
		RegCustomer c1=new RegCustomer(1,"Ramesh");
		RegCustomer c2=new RegCustomer(2,"Roshan");
		RegCustomer c3=new RegCustomer(3,"Rakesh");
		ArrayList<RegCustomer>customers=new ArrayList<>();
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		
		c1.setDiscount(10);
		
		OrderedItem o1=new OrderedItem(1,i1);
		OrderedItem o2=new OrderedItem(2,i2);
		OrderedItem o3=new OrderedItem(2,i3);
		ArrayList<OrderedItem>orderedItems1=new ArrayList<>();
		
		orderedItems1.add(o1);
		orderedItems1.add(o2);
		
		ArrayList<OrderedItem>orderedItems2=new ArrayList<>();
		orderedItems2.add(o3);
		
		Order od1=new Order(c1);
		od1.setOrderedItem(orderedItems1);
		
		Order od2=new Order(c2);
		od2.setOrderedItem(orderedItems2);
		
		ArrayList<Order>order1=new ArrayList<>();
		order1.add(od1);
		ArrayList<Order>order2=new ArrayList<>();
		order2.add(od2);
		
		c1.setOrders(order1);
		c2.setOrders(order2);
		
		c.setCustomer(customers);
		c.setItem(items);
	
		//c.setOrderedItems(orderedItems1);
		//c.setOrderedItems(orderedItems2);
		System.out.println(c.getTotalWorthOfOrdersPlaced());
		
		
		
		
	}

}
