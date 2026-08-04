package com.ktdsuniversity.edu.oop.enums.food;

public class Food {

  private String name;
  private int calories;

  /**
   * VEGETABLE, FRUIT, MEAT, FISH, FASTFOOD
   */
  private FoodType type;

  /**
   * @param name
   * @param calories
   * @param type
   */
  public Food(String name, int calories, FoodType type) {
    this.name = name;
    this.calories = calories;
    this.type = type;
  }

  public FoodType getType() {
    return this.type;
  }

  @Override
  public String toString() {
    return "Food [name=" + this.name + ", calories=" + this.calories + ", type=" + this.type + "]";
  }



}
