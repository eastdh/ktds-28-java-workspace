package com.ktdsuniversity.edu.oop.homework.restaurant;

public class Restaurant {

  public static void main(String[] args) {
    Food meat = new Food("고기", 25, 0);
    Food vegetable = new Food("채소", 13, -5);
    Food fruit = new Food("과일", 13, -5);
    Food fish = new Food("생선", 7, 0);
    Food[] foods = {meat, vegetable, fruit, fish};

    Drink soju = new Drink("소주", -7, 17);
    Drink beer = new Drink("맥주", 8, 6);
    Drink whiskey = new Drink("위스키", -7, 40);
    Drink cognac = new Drink("꼬냑", -7, 40);
    Drink[] drinks = {soju, beer, whiskey, cognac};

    boolean withAdult = false;
    Customer[] customers = new Customer[4];
    System.out.print("손님 목록(ID:나이) -  ");
    for (int i = 0; i < customers.length; i++) {
      int age = (int) (Math.random() * 60 + 1);
      customers[i] = new Customer(i, age);
      System.out.print(i + ":" + age + " ");
      if (age > 19) {
        withAdult = true;
      }
    }
    System.out.println();

    // 20번의 랜덤 주문
    for (int i = 0; i < 20; i++) {
      int category = (int) (Math.random() * 2); // 0 => food, 1 => drink
      int customerIndex = (int) (Math.random() * 4);
      int order = (int) (Math.random() * 4);

      Customer c = customers[customerIndex];
      // food
      if (category == 0) {
        c.eatFood(foods[order]);
      } else {
        c.eatDrink(drinks[order], withAdult);
      }

    }


  }
}
