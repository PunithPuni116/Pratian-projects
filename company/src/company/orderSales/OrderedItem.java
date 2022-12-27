package company.orderSales;

public class OrderedItem {
	private int OrderedItemQty;
	private Item item;
	
	public OrderedItem(int orderedItemQty, Item item) {
		super();
		this.OrderedItemQty = orderedItemQty;
		this.item = item;
	}
	public int getOrderedItemQty() {
		return OrderedItemQty;
	}
	public void setOrderedItemQty(int orderedItemQty) {
		this.OrderedItemQty = orderedItemQty;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public double getItemRate() {
		return item.getItem_rate();
	}
	
}
