package com.ktdsuniversity.edu.fp.anonymous;

import java.util.List;
import com.ktdsuniversity.edu.fp.anonymous.inf.Compare;
import com.ktdsuniversity.edu.fp.objects.Dish;
import com.ktdsuniversity.edu.fp.objects.DishList;

public class DishSummary {

  private List<Dish> dishes;

  public DishSummary() {
    this.dishes = DishList.makeDishList();
  }

  public <T> void printAllDishesBy(Compare<T> compare, T type) {
    for (int i = 0; i < this.dishes.size(); i++) {
      Dish dish = this.dishes.get(i);
      if (compare.compareType(dish, type)) {
        System.out.println(dish);
      }
    }
  }

  public <T> void printTotalCaloriesBy(Compare<T> compare, T type) {
    int totalCalories = 0;

    for (int i = 0; i < this.dishes.size(); i++) {
      Dish dish = this.dishes.get(i);
      if (compare.compareType(dish, type)) {
        totalCalories += dish.getCalories();
      }
    }
    System.out.println(totalCalories);
  }

  public <T> void printAverageCaloriesBy(Compare<T> compare, T type) {
    int totalCalories = 0;
    int size = 0;

    for (int i = 0; i < this.dishes.size(); i++) {
      Dish dish = this.dishes.get(i);
      if (compare.compareType(dish, type)) {
        totalCalories += dish.getCalories();
        size++;
      }
    }
    System.out.println(totalCalories / (double) size);
  }

}
