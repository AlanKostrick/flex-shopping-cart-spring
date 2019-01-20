package shopping.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

	private Map<Integer, Item> items = new HashMap<>();

	public void add(Item anItem) {
		items.put(anItem.getItemId(), anItem);
	}
 
	public int getSize() {
		return items.size();
	}

	public int getTotalQuantity() {
		int total = 0;
		for (Item anItem : items.values()) {
			total += anItem.getQuantity();
		}
		return total;
	}

	public int getTotalPrice() {
		int total = 0;
		for (Item anItem : items.values()) {
			total += anItem.getPrice() * anItem.getQuantity();
		}
		return total;
	}

	public void remove(Integer itemId) {
		items.remove(itemId);
	}

	public void showItems() {
		//demonstrates how to talk to all items in the collection
		for (Item anItem : items.values()) {
			System.out.println("Item name: " + anItem.getName() + " Quantity: " + anItem.getQuantity() + " Price: "
					+ anItem.getPrice());
			System.out.println("");
		}
	}

}
