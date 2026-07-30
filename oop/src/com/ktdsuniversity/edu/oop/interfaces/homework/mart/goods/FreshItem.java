package com.ktdsuniversity.edu.oop.interfaces.homework.mart.goods;

public class FreshItem extends Item {

  private String expireDate;
  private float storageTemperature;

  /**
   * @param itemName
   * @param itemPrice
   * @param expireDate
   * @param storageTemperature
   */
  public FreshItem(String itemName, int itemPrice, String expireDate, float storageTemperature) {
    super(itemName, itemPrice);
    this.expireDate = expireDate;
    this.storageTemperature = storageTemperature;
  }

  public String getExpireDate() {
    return this.expireDate;
  }

  public float getStorageTemperature() {
    return this.storageTemperature;
  }

}
