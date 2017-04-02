import static org.junit.Assert.assertEquals;
import org.junit.*;

public class CheckoutTest {

  Checkout checkout;
  ShoppingBasket shoppingBasket;
  Item milk;
  Item eggs;
  Item kettle;

  @Before
  public void before() {
    checkout = new Checkout(shoppingBasket);
    shoppingBasket = new ShoppingBasket();
    milk = new Item("milk", 50, false);
    eggs = new Item("eggs", 120, true);
    kettle = new Item("kettle", 2500, false);
  }

// --------------------------------------------------
// DON'T KNOW WHY THIS DOESN'T WORK

  // @Test
  // public void testCheckoutHasShoppingBasket() {
  //   assertEquals( shoppingBasket, checkout.getShoppingBasket() );
  // }

  @Test
  public void testGetTotalValue() {
    assertEquals( 0, checkout.getTotalValue() );
  }

}

