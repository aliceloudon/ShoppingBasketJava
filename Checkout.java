import java.util.*;

class Checkout {

  ShoppingBasket basket;
  int totalValue;
  Item item;
  // ArrayList<Item> items;

  public Checkout(ShoppingBasket basket) {
    this.basket = basket;
    this.totalValue = 0;
    this.item = item;
    // this.items = this.shoppingBasket.getItems();
  }

  public ShoppingBasket getBasket() {
    return this.basket;
  }
 
 public int getTotalValue() {
   return this.totalValue;
 }

 public Item getItem() {
  return this.item;
 }



}

