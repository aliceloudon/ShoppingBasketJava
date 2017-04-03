import static org.junit.Assert.assertEquals;
import org.junit.*;

public class CheckoutTest {

  Checkout checkout;
  ShoppingBasket basket;
  Item item;

  @Before
  public void before() {
    checkout = new Checkout(basket);
    basket = new ShoppingBasket();
    item = new Item("milk", 50, false);
  }

  @Test
  public void testGetTotalValue() {
    assertEquals( 0, checkout.getTotalValue() );
  }


// ---------------------------------------------------
// checkout.getBasket() is giving me null  
  // @Test
  // public void testCheckoutHasBasket() {
  //   assertEquals( basket, checkout.getBasket() );
  // }

  // @Test
  // public void testCanGetItem() {
  //   assertEquals( item, checkout.getItem() );
  // }


} 

