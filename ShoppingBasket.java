import java.util.*;

class ShoppingBasket {

  public ArrayList<Item> items;
  Item item = new Item("milk", 50, false);

  public ShoppingBasket() {
    this.items = new ArrayList<Item>();
  }

  public int countItems() {
    return items.size();
  }

  public void addItem(Item item) {
    items.add(item);
  }

  public void removeItem(Item item) {
    items.remove(item);
  }

  public void emptyBasket() {
    items.clear();
  }

  public int totalValue() {
    int count = 0;
      for (Item item : items) {
        count = count + item.getPrice();
      }
    return count;
  }

  public int getQuantity(Item itemToFind) {
    int count = 0;
      for (Item item : items) {
        if (itemToFind.getName() == item.getName() )
          count = count + 1;
      }
      return count;
  }

}

