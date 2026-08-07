package com.ktdsuniversity.edu.fp.stream;

import java.util.List;
import com.ktdsuniversity.edu.fp.objects.Dish;
import com.ktdsuniversity.edu.fp.objects.DishList;
import com.ktdsuniversity.edu.fp.objects.enums.DishType;

public class Reducing {

  public static void printMaxCalory() {
    // 가장 높은 칼로리를 출력
    List<Dish> dishes = DishList.makeDishList();
    int maxCalory = dishes.stream() // Stream<Dish>
        .map(Dish::getCalories) // Stream<Integer>
        .reduce(Integer.MIN_VALUE, Math::max); // Integer
    System.out.println("가장 높은 칼로리: " + maxCalory);
  }

  public static void printMinCaloryOtherDishes() {
    // OTHER Dish 중에 가장 낮은 칼로리 출력
    List<Dish> dishes = DishList.makeDishList();
    int minCalory = dishes.stream() // Stream<dish>
        .filter(dish -> dish.getDishType() == DishType.OTHER) // Stream<Dish>
        .map(Dish::getCalories) // Stream<Integer>
        .reduce(Integer.MAX_VALUE, Math::min); // Integer
    System.out.println("OTHER중에 가장 낮은 칼로리: " + minCalory);
  }

  public static void printLongestNameDish() {
    // 이름이 가장 긴 Dish 출력
    List<Dish> dishes = DishList.makeDishList();
    Dish longestName = dishes.stream() // Stream<Dish>
        .reduce(new Dish("", null, 0, null), (longest, dish) -> {
          if (longest.getName().length() > dish.getName().length()) {
            return longest;
          } else {
            return dish;
          }
        });
    System.out.println(longestName);

  }

  public static void printMinNumberWithReference() {
    List<Integer> numbers = List.of(789, 5795, 78, 467, 123, 412, 42, 4213, 52, 3521, 51, 512, 352,
        521, 52, 521, 52, 135, 215, 2135, 123, 5213, -1345, -12351, -1262, -4574, -45745);

    int minNum = numbers.stream() // Stream<Integer>
        .reduce(Integer.MAX_VALUE, Math::min);
    System.out.println(minNum);

  }

  public static void printMaxNumberWithReference() {
    List<Integer> numbers = List.of(789, 5795, 78, 467, 123, 412, 42, 4213, 52, 3521, 51, 512, 352,
        521, 52, 521, 52, 135, 215, 2135, 123, 5213, -1345, -12351, -1262, -4574, -45745);

    int maxNum = numbers.stream() // Stream<Integer>
        .reduce(Integer.MIN_VALUE, Math::max);
    System.out.println(maxNum);

  }

  public static void printMaxNumber() {
    List<Integer> numbers = List.of(789, 5795, 78, 467, 123, 412, 42, 4213, 52, 3521, 51, 512, 352,
        521, 52, 521, 52, 135, 215, 2135, 123, 5213, -1345, -12351, -1262, -4574, -45745);

    int maxNum = numbers.stream() // Stream<Integer>
        .reduce(Integer.MIN_VALUE, (max, eachNumber) -> {
          if (max < eachNumber) {
            return eachNumber;
          } else {
            return max;
          }
        });
    System.out.println(maxNum);

  }

  public static void printSumNumbers() {
    List<Integer> numbers = List.of(123, 412, 42, 4213, 52, 3521, 51, 512, 352, 521, 52, 521, 52,
        135, 215, 2135, 123, 5213);

    int sum = numbers.stream() // Stream<Integer>
        .reduce(0, (total, eachNumber) -> total + eachNumber);
    System.out.println(sum);
  }

  public static void main(String[] args) {

    printSumNumbers();
    System.out.println("=".repeat(60));

    printMaxNumber();
    System.out.println("=".repeat(60));

    printMaxNumberWithReference();
    System.out.println("=".repeat(60));

    printMinNumberWithReference();
    System.out.println("=".repeat(60));

    printMaxCalory();
    System.out.println("=".repeat(60));

    printMinCaloryOtherDishes();
    System.out.println("=".repeat(60));

    printLongestNameDish();
    System.out.println("=".repeat(60));

  }

}
