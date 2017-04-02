import java.util.*;

public class Checkout {

  ShoppingBasket shoppingBasket;
  int totalValue;
  ArrayList<Item> items;

  public Checkout (ShoppingBasket shoppingBasket) {
    this.shoppingBasket = shoppingBasket;
    this.totalValue = 0;
    this.items = this.shoppingBasket.getItems();
  }

  public ShoppingBasket getShoppingBasket() {
    return this.shoppingBasket;
  }
 
 public int getTotalValue() {
   return this.totalValue;
 }

}

