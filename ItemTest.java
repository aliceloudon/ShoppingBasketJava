import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ItemTest {

  Item item;

  @Before
  public void before() {
    item = new Item("bananas", 50, false);
  }

  @Test
  public void testItemHasName() {
    assertEquals( "bananas", item.getName() );
  }

  @Test
  public void testItemHasPrice() {
    assertEquals( 50, item.getPrice() );
  }

  @Test
  public void testGetBogof() {
    assertEquals( false, item.getBogof() );
  }

}
