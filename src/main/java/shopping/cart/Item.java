package shopping.cart;

public class Item {

	private Integer itemId;
	private String itemName;
	private int quantity;
	private int price;

	//primary key needed for the map
	public Integer getItemId() {
		return itemId;
	}

	public String getName() {
		return itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getPrice() {
		return price;
	}

	public Item(Integer itemId, String itemName, int quantity, int price) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
	}

}
