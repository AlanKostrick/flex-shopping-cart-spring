package shopping.cart;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CartTest {

	Cart underTest = new Cart();
	Item shirt = new Item("shirt", 2, 10);
	Item sunglasses = new Item("sunglasses", 1, 25);

	@Test
	public void shouldIncreaseSizeOfCartFrom0To1UponAddingAnItem() {
		underTest.add(shirt);
		int cartSize = underTest.getSize();
		assertThat(cartSize, is(1));
	}

	@Test
	public void shouldIncreaseSizeOfCartFrom0To2UponAdding2Items() {
		underTest.add(shirt);
		underTest.add(sunglasses);
		int cartSize = underTest.getSize();
		assertThat(cartSize, is(2));
	}

	@Test
	public void shouldHaveAQuantityOf3With2ShirtsAnd1Sunglasses() {
		underTest.add(shirt);
		underTest.add(sunglasses);
		int totalQuantity = underTest.getTotalQuantity();
		assertThat(totalQuantity, is(3));
	}

	@Test
	public void shouldHaveATotalPriceOf45UponOrder() {
		underTest.add(shirt);
		underTest.add(sunglasses);
		int totalPrice = underTest.getTotalPrice();
		assertThat(totalPrice, is(45));
	}

	@Test
	public void shouldDecreaseSizeFrom2DownTo1UponRemoval() {
		underTest.add(shirt);
		underTest.add(sunglasses);
		underTest.remove("sunglasses");
		int cartSize = underTest.getSize();
		assertThat(cartSize, is(1));
	}

}
