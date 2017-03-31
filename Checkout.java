public class Checkout {
  ShoppingBasket basket = new ShoppingBasket();
  Item item = new Item("milk", 50);

  public void buyOneGetOneFree(Item item) {
    String name = item.getName();
    if (name == "Green & Blacks") {
      basket.addItem(item);
    }
  }

}