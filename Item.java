class Item {

  private String name;
  private int price;
  private boolean isBogof;

  public Item(String name, int price, boolean bogof) {
    this.name = name;
    this.price = price;
    this.isBogof = isBogof;
  }

  public String getName() {
    return this.name;
  }

  public int getPrice() {
    return this.price;
  }

  public boolean getBogof() {
    return this.isBogof;
  }

}
