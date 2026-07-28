package com.ktdsuniversity.edu.oop.interfaces.homework.mart;

public class Item {

  private String itemName;
  private int itemPrice;


  /**
   * @param itemName
   * @param itemPrice
   */
  public Item(String itemName, int itemPrice) {
    this.itemName = itemName;
    this.itemPrice = itemPrice;
  }

  public String getName() {
    return this.itemName;
  }

  public int getPrice() {
    return this.itemPrice;
  }

}
