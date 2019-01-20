package shopping.cart;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	private List<Item> items = new ArrayList<>();

	public void add(Item anItem) {
		items.add(anItem);
	}

	public int getSize() {
		return items.size();
	}

	public int getTotalQuantity() {
		int total = 0;
		for (Item anItem : items) {
			total += anItem.getQuantity();
		}
		return total;
	}

	public int getTotalPrice() {
		int total = 0;
		for (Item anItem : items) {
			total += anItem.getPrice() * anItem.getQuantity();
		}
		return total;
	}

	public void remove(String itemName) {
		for (int i = items.size() - 1; i > 0; i--) {
			if (items.get(i).getName().equals(itemName)) {
				items.remove(i);
			}
		}

	}

}
