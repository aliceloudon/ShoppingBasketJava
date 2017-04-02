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

  // public boolean returnBogofState(Item itemToFind) {
  //   if (getQuantity(itemToFind) >= 2)
  //   return itemToFind.getBogof();
  // else
  //   return false;
  // }

  // public int applyBogof(Item itemToFind) {
  //   int totalValueReduced = totalValue() - itemToFind.getPrice();
  //     if (getQuantity(itemToFind) >= 2 && itemToFind.getBogof() == true)
  //       return totalValueReduced;
  //     else
  //       return totalValue();
  // }

  // If getQuantity(itemToFind) % 2 == 1, apply BOGOF discount.
  public int applyBogof(Item itemToFind) {
      if ( (getQuantity(itemToFind) % 2 == 1) && itemToFind.getBogof() == true)
        return totalValue();
      else
        return 0;
  }

}

