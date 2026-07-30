package com.ktdsuniversity.edu.oop.interfaces.homework.mart.goods;

public class FrozenItem extends FreshItem {

  /**
   * @param itemName
   * @param itemPrice
   * @param expireDate
   * @param storageTemperature
   */
  public FrozenItem(String itemName, int itemPrice, String expireDate, float storageTemperature) {
    super(itemName, itemPrice, expireDate, storageTemperature);
  }
}
