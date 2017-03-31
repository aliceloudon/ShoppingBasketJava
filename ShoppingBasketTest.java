import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ShoppingBasketTest {

  ShoppingBasket shoppingBasket;
  Item milk;
  Item eggs;

  @Before
  public void before() {
    shoppingBasket = new ShoppingBasket();
    milk = new Item("milk", 50);
    eggs = new Item("eggs", 120);
  }

  @Test
  public void testBasketStartsEmpty() {
    assertEquals( 0, shoppingBasket.countItems() );
  }

  @Test
  public void testCanAddItem() {
    shoppingBasket.addItem(milk);
    assertEquals( 1, shoppingBasket.countItems() );
  }

  @Test
  public void testCanRemoveItem() {
   shoppingBasket.addItem(milk);
   shoppingBasket.removeItem(milk);
   assertEquals( 0, shoppingBasket.countItems() ); 
  }

  @Test
  public void testCanEmptyBasket() {
    shoppingBasket.addItem(milk);
    shoppingBasket.addItem(eggs);
    shoppingBasket.emptyBasket();
    assertEquals( 0, shoppingBasket.countItems() );
  }

  @Test
  public void testTotalValue() {
    shoppingBasket.addItem(milk);
    assertEquals( 50, shoppingBasket.totalValue() );
  }

}

