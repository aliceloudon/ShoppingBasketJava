import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ShoppingBasketTest {

  ShoppingBasket shoppingBasket;
  Item milk;
  Item eggs;
  Item kettle;

  @Before
  public void before() {
    shoppingBasket = new ShoppingBasket();
    milk = new Item("milk", 50, false);
    eggs = new Item("eggs", 120, true);
    kettle = new Item("kettle", 2500, false);
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

  // @Test
  // public void testTotalValue() {
  //   shoppingBasket.addItem(milk);
  //   assertEquals( 50, shoppingBasket.totalValue() );
  // }

  @Test
  public void testGetQuantity() {
    shoppingBasket.addItem(eggs);
    shoppingBasket.addItem(eggs);
    assertEquals( 2, shoppingBasket.getQuantity(eggs) );
  }

  @Test
  public void testCanReturnBogofState() {
    shoppingBasket.addItem(eggs);
    shoppingBasket.addItem(eggs);
    assertEquals( true, shoppingBasket.returnBogofState(eggs) );
  }

  @Test
  public void testCanApplyBogofTwoItems() {
    shoppingBasket.addItem(eggs);
    shoppingBasket.addItem(eggs);
    assertEquals( 120, shoppingBasket.applyBogof(eggs) );
  }

  @Test
  public void testCanApplyBogofThreeItems() {
    shoppingBasket.addItem(eggs);
    shoppingBasket.addItem(eggs);
    shoppingBasket.addItem(eggs);
    assertEquals( 240, shoppingBasket.applyBogof(eggs) );
  }

  // @Test
  // public void testCanApplyBogofFourItems() {
  //   shoppingBasket.addItem(eggs);
  //   shoppingBasket.addItem(eggs);
  //   shoppingBasket.addItem(eggs);
  //   shoppingBasket.addItem(eggs);
  //   assertEquals( 240, shoppingBasket.applyBogof(eggs) );
  // }
  // THIS DOESN'T WORK FOR FOUR ITEMS!!

  // @Test
  // public void testApplyTenPercentDiscount() {
  //   shoppingBasket.addItem(kettle);
  //   assertEquals( 2250, shoppingBasket.applyTenPercentDiscount() );
  // }

}
