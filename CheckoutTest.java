import static org.junit.Assert.assertEquals;
import org.junit.*;

public class CheckoutTest {

  ShoppingBasket basket;
  Checkout checkout;
  Item milk;
  Item eggs;
  Item chocolate;

  @Before
  public void before() {
    checkout = new Checkout();
    basket = new ShoppingBasket();
    milk = new Item("milk", 50);
    eggs = new Item("eggs", 120);
    chocolate = new Item("Green & Blacks", 150);
  }

  @Test
  public void testCanAddItem(){
    basket.addItem(chocolate);
    assertEquals( 1, basket.countItems() );
  }

  @Test
  public void testBuyOneGetOneFree() {
    checkout.buyOneGetOneFree(chocolate);
    assertEquals( 0, basket.countItems() );
  }

}