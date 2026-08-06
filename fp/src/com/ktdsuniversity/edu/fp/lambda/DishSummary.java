package com.ktdsuniversity.edu.fp.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import com.ktdsuniversity.edu.fp.anonymous.inf.Compare;
import com.ktdsuniversity.edu.fp.objects.Dish;
import com.ktdsuniversity.edu.fp.objects.DishList;

public class DishSummary {

  private List<Dish> dishes;

  public DishSummary() {
    this.dishes = DishList.makeDishList();
  }

  public void printAllDishesBy(Predicate<Dish> condition) {

    List<Dish> temp = new ArrayList<>();
    temp.addAll(this.dishes);
    temp.removeIf(condition.negate());

    temp.forEach(System.out::println);
    // for (int i = 0; i < this.dishes.size(); i++) {
    // Dish dish = this.dishes.get(i);
    // if (condition.test(dish)) {
    // System.out.println(dish);
    // }
    // }
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
