import static org.junit.Assert.assertEquals;
import org.junit.*;

public class CheckoutTest {

  ShoppingBasket shoppingBasket;
  Checkout checkout;
  Item milk;
  Item eggs;

  @Before
  public void before() {
    shoppingBasket = new ShoppingBasket();
    milk = new Item("milk", 50);
    eggs = new Item("eggs", 120);
    chocolate = new Item("Green & Blacks", 150);
  }

  @Test
  public void testBuyOneGetOneFree() {
    checkout.buyOneGetOneFree(chocolate);
    assertEquals( 0, ShoppingBasket.countItems() );
  }


}