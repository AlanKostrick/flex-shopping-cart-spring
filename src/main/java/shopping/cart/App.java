package shopping.cart;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Cart myCart = new Cart();

		String userChoice;

		do {
			System.out.println("Welcome to the WCCI Shopping Cart");
			System.out.println("Press 1 to add an item to your cart");
			System.out.println("Press 2 to remove an item from your cart");
			System.out.println("Press 3 to see the total price of your cart");
			System.out.println("Press 4 to show all items in your cart");
			System.out.println("Press 5 to exit");
			userChoice = input.nextLine();

			if (userChoice.equals("1")) {
				System.out.println("You are going to add an item");
				// add fancier verification...like are your sure???
				System.out.println("Enter the item's id");
				int itemId = input.nextInt();
				input.nextLine();
				System.out.println("Enter the name of the item");
				String itemName = input.nextLine();
				System.out.println("Enter the quantity");
				int quantity = input.nextInt();
				System.out.println("Enter the price");
				int price = input.nextInt();
				Item createdItem = new Item(itemId,itemName, quantity, price);
				myCart.add(createdItem);
				input.nextLine();
			} else if (userChoice.equals("4")) {
				myCart.showItems();
			}
		} while (!userChoice.equals("5"));

		System.out.println("Thanks for shopping with us! Have a nice day!");
		input.close();
	}

}
