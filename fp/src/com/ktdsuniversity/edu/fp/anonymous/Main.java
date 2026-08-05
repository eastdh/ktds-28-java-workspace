package com.ktdsuniversity.edu.fp.anonymous;

import com.ktdsuniversity.edu.fp.anonymous.inf.Compare;
import com.ktdsuniversity.edu.fp.objects.Dish;
import com.ktdsuniversity.edu.fp.objects.enums.DishType;
import com.ktdsuniversity.edu.fp.objects.enums.FoodType;

public class Main {

  public static void main(String[] args) {
    DishSummary summary = new DishSummary();

    Compare<DishType> dishCompare = new Compare<>() {

      @Override
      public boolean compareType(Dish dish, DishType type) {
        return dish.getDishType() == type;
      }
    };

    Compare<FoodType> foodCompare = new Compare<>() {

      @Override
      public boolean compareType(Dish dish, FoodType type) {
        return dish.getFoodType() == type;
      }
    };

    // DishType의 MEAT만 출력해라.
    summary.printAllDishesBy(dishCompare, DishType.MEAT);
    summary.printAllDishesBy(dishCompare, DishType.FISH);
    summary.printAllDishesBy(dishCompare, DishType.OTHER);

    // FoodType의 MEAT만 출력해라.
    summary.printAllDishesBy(foodCompare, FoodType.MEAT);
    summary.printAllDishesBy(foodCompare, FoodType.VEGETABLES);


    // Void? void의 ReferenceType
    Compare<Void> voidCompare = new Compare<>() {

      @Override
      public boolean compareType(Dish dish, Void type) {
        return true;
      }
    };

    System.out.println("=".repeat(50));

    // 모든 메뉴 출력
    summary.printAllDishesBy(voidCompare, null);



  }

}
