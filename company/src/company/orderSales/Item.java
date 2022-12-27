package company.orderSales;

public class Item {
	private String item_name;
	private double item_rate;
	
	public Item(String item_name, double item_rate) {
		super();
		this.item_name = item_name;
		this.item_rate = item_rate;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public double getItem_rate() {
		return item_rate;
	}
	public void setItem_rate(double item_rate) {
		this.item_rate = item_rate;
	}
	
	
	
}
