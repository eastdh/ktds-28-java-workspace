package com.ktdsuniversity.edu.oop.homework.restaurant;

public class Drink {

  private String name;
  private int fullnessPoint;
  private int drunkPoint;

  /**
   * @param name
   * @param fullnessPoint
   * @param drunkPoint
   */
  public Drink(String name, int fullnessPoint, int drunkPoint) {
    this.name = name;
    this.fullnessPoint = fullnessPoint;
    this.drunkPoint = drunkPoint;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getFullnessPoint() {
    return fullnessPoint;
  }

  public int getDrunkPoint() {
    return drunkPoint;
  }


}
