package com.ktdsuniversity.edu.oop.enums.food;

public class Dishes {

  public static void main(String[] args) {
    Food bigmac = new Food("빅맥", 900, FoodType.FASTFOOD);
    Food tomato = new Food("토마토", 90, FoodType.VEGETABLE);
    Food orange = new Food("오렌지", 110, FoodType.FRUIT);
    Food pork = new Food("돼지고기", 300, FoodType.MEAT);
    Food tuna = new Food("참치", 200, FoodType.FISH);

    System.out.println(bigmac);
    System.out.println(tomato);
    System.out.println(orange);
    System.out.println(pork);
    System.out.println(tuna);

  }

}
