package com.ktdsuniversity.edu.fp.stream;

import java.util.List;
import com.ktdsuniversity.edu.fp.objects.Dish;
import com.ktdsuniversity.edu.fp.objects.DishList;
import com.ktdsuniversity.edu.fp.objects.enums.DishType;
import com.ktdsuniversity.edu.fp.objects.enums.FoodType;

/**
 * 리스트 인스턴스를 스트림 인스턴스로 변환해
 * 필요한 데이터만 추출해내는 실습
 */
public class Filtering {

  public static List<Dish> dishes;

  public static void printLowCaloryFishDishes() {
    // dishes.stream() // Stream<Dish>
    // .filter(dish -> dish.getDishType() == DishType.FISH && dish.getCalories() <= 400) //
    // Stream<Dish>
    // .forEach(System.out::println);

    dishes.stream() // Stream<Dish>
        .filter(dish -> dish.getDishType() == DishType.FISH) // Stream<Dish>
        .filter(dish -> dish.getCalories() <= 400) // Stream<Dish>
        .forEach(System.out::println);
  }

  public static void printFishDishes() {
    dishes.stream().filter(dish -> dish.getDishType() == DishType.FISH)
        .forEach(System.out::println);
  }

  public static void printHighCaloryDishes() {
    dishes.stream().filter(dish -> dish.getCalories() >= 800).forEach(System.out::println);

  }

  public static void printLowCaloryDishes() {
    dishes.stream().filter(dish -> dish.getCalories() <= 400).forEach(System.out::println);
  }

  public static void printMeatDishes() {

    // List<Dish> dishes = DishList.makeDishList();
    dishes.stream().filter(dish -> dish.getFoodType() == FoodType.MEAT)
        .forEach(System.out::println);
  }

  public static void printVegetableDishes() {
    // List<Dish> dishes = DishList.makeDishList();
    dishes.stream() // Stream<Dish>
        // .peek((dish) -> {
        // System.out.println("필터링 수행 전");
        // System.out.println(dish);
        // }) // Stream<Dish>
        .filter((dish) -> dish.getFoodType() == FoodType.VEGETABLES) // Stream<Dish>
        // .peek((dish) -> {
        // System.out.println("필터링 수행 후");
        // System.out.println(dish);
        // }) // Stream<Dish>
        .forEach(System.out::println) // void
    ;

  }

  public static void main(String[] args) {

    dishes = DishList.makeDishList();
    printVegetableDishes();
    System.out.println();
    printMeatDishes();
    System.out.println();
    printLowCaloryDishes();
    System.out.println();
    printHighCaloryDishes();
    System.out.println();
    printFishDishes();
    System.out.println();
    printLowCaloryFishDishes();
  }
}
