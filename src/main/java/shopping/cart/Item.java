package shopping.cart;

public class Item {

	private String itemName;
	private int quantity;
	private int price;

	public String getName() {
		return itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getPrice() {
		return price;
	}

	public Item(String itemName, int quantity, int price) {
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
	}

}
