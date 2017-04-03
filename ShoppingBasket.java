import java.util.*;

class ShoppingBasket {

  ArrayList<Item> items;
  Item item;
  ShoppingBasket basket;

  public ShoppingBasket() {
    this.items = new ArrayList<Item>();
    this.basket = basket;
    this.item = item;
  }

  public ArrayList<Item> getItems() {
    return this.items;
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

  public boolean returnBogofState(Item itemToFind) {
    if (getQuantity(itemToFind) >= 2)
    return itemToFind.getBogof();
  else
    return false;
  }


// If getQuantity(itemToFind) % 2 == 1, apply BOGOF discount.
  public int applyBogof(Item itemToFind) {
    int totalValueReduced = totalValue() - itemToFind.getPrice();
      if ( (getQuantity(itemToFind) == 2) && itemToFind.getBogof() == true)
        return totalValueReduced;
      else if ( (getQuantity(itemToFind) % 2 == 1) && itemToFind.getBogof() == true)
        return totalValueReduced;
      else
        return totalValue();
  }

// If totalValue() >= 2000, totalValue now equals totalValue * 0.9
  // public int applyTenPercentDiscount() {
  //   if (totalValue() >= 2000) {
  //     int totalValueWithDiscount = (int) totalValue() * 0.9f;
  //   }
  //   return totalValueWithDiscount;
  // }

}

