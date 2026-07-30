package com.ktdsuniversity.edu.oop.homework.arrays;

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

  public String getItemName() {
    return itemName;
  }

  public int getItemPrice() {
    return itemPrice;
  }



}
