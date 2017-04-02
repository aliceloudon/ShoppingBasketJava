import static org.junit.Assert.assertEquals;
import org.junit.*;

public class CheckoutTest {

  Checkout checkout;
  // ShoppingBasket shoppingBasket;

  @Before
  public void before() {
    checkout = new Checkout();
    // shoppingBasket = new ShoppingBasket();
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

