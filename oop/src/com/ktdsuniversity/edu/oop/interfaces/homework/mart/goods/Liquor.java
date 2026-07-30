package com.ktdsuniversity.edu.oop.interfaces.homework.mart.goods;

public class Liquor extends Item {

  private float storageTemperature;
  private int ageRestriction;
  private float abv;

  /**
   * @param itemName
   * @param itemPrice
   * @param storageTemperature
   * @param ageRestriction
   * @param aBV
   */
  public Liquor(String itemName, int itemPrice, float storageTemperature, int ageRestriction,
      float abv) {
    super(itemName, itemPrice);
    this.storageTemperature = storageTemperature;
    this.ageRestriction = ageRestriction;
    this.abv = abv;
  }

  public float getStorageTemperature() {
    return this.storageTemperature;
  }

  public int getAgeRestriction() {
    return this.ageRestriction;
  }

  public float getABV() {
    return this.abv;
  }
}
