package com.ktdsuniversity.edu.oop.homework.restaurant;

public class Customer {

  private int customerId;
  private int fullness;
  private int drunk;
  private int age;

  /**
   * @param customerId
   * @param age
   */
  public Customer(int customerId, int age) {
    this.customerId = customerId;
    this.age = age;
  }

  public int getCustomerId() {
    return customerId;
  }

  public int getFullness() {
    return fullness;
  }

  public int getDrunk() {
    return drunk;
  }

  public int getAge() {
    return age;
  }

  public boolean isAdult() {
    return age > 19;
  }

  public boolean canEat() {
    return this.fullness <= 100;
  }

  public boolean canDrink(boolean withAdult) {
    return (withAdult || this.isAdult()) && this.drunk <= 60;
  }

  public void eatFood(Food food) {
    if (canEat()) {
      this.fullness += food.getFullnessPoint();
      this.drunk += food.getDrunkPoint();
      if (this.drunk < 0) {
        this.drunk = 0;
      }
      System.out.println(this.customerId + ", " + food.getName() + " 먹음 - 포만감: " + this.fullness
          + " 취기: " + this.drunk);
    } else {
      System.out.println(this.customerId + ", 포만감 100 초과!");
    }
  }

  public void eatDrink(Drink drink, boolean withAdult) {
    if (canDrink(withAdult)) {
      this.fullness += drink.getFullnessPoint();
      this.drunk += drink.getDrunkPoint();
      if (this.fullness < 0) {
        this.fullness = 0;
      }
      System.out.println(this.customerId + ", " + drink.getName() + " 먹음 - 포만감: " + this.fullness
          + " 취기: " + this.drunk);
    } else if (!(this.isAdult() || withAdult)) {
      System.out.println(this.customerId + ", 미성년자입니다.");
    } else {
      System.out.println(this.customerId + ", 취기 60 초과!");
    }
  }


}
