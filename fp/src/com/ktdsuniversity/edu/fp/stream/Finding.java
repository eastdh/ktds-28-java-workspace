package com.ktdsuniversity.edu.fp.stream;

import java.util.ArrayList;
import java.util.List;
import com.ktdsuniversity.edu.fp.objects.Dish;
import com.ktdsuniversity.edu.fp.objects.DishList;
import com.ktdsuniversity.edu.fp.objects.enums.DishType;

/**
 * 스트림에서 하나의 값만 찾아 가져온다.
 */
public class Finding {

  public static void printHeavyCaloryDish() {
    // 칼로리가 1000 이상인 첫 번째 Dish 출력
    // 없으면 null 반환
    List<Dish> dishes = DishList.makeDishList();
    Dish heavyDish = dishes.stream() // Stream<Dish>
        .filter(dish -> dish.getCalories() >= 1000) // Stream<Dish>
        .findFirst() // Optional<Dish>
        .orElse(null) // Dish
    ;

    System.out.println(heavyDish);
  }

  public static void printFirstFishDish() {
    List<Dish> dishes = DishList.makeDishList();
    Dish fishDish = dishes.stream() // Stream<Dish>
        .filter(dish -> dish.getDishType() == DishType.FISH) // Stream<Dish>
        .findFirst() // Optional<Dish>
        .orElse(null);
    System.out.println(fishDish);
  }

  public static void printAnyNumber() {
    // 난수 생성 -> 1_000_000개의 1 ~ 100_000 사이 수
    List<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < 100_000_000; i++) {
      numbers.add((int) (Math.random() * 100_000) + 1);
    }

    for (int i = 0; i < 10; i++) {
      System.out.println(numbers.get(i));
    }

    int num = numbers.parallelStream() // Stream<Integer>
        .findAny() // Optional<Integer>
        .orElse(-1) // Integer
    ;
    System.out.println("findAny 결과: (" + numbers.indexOf(num) + ") " + num);

  }

  public static void printFirstMultipleRandomNumber() {
    // 난수 생성 -> 1_000_000개의 1 ~ 100_000 사이 수
    List<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < 1_000_000; i++) {
      numbers.add((int) (Math.random() * 100_000) + 1);
    }

    System.out.println(numbers);

    // 찾으려는 난수
    int random = (int) (Math.random() * 1_000_000) + 1;
    System.out.println("찾으려는 배수: " + random);
    int firstNum = numbers.stream() // Steam<Integer>
        .filter(n -> n % random == 0) // Stream<Integer>
        .findFirst() // Optional<Integer>
        .orElse(-1) // Integer
    ;
    System.out.println(numbers.indexOf(firstNum) + ": " + firstNum);

  }

  public static void printFirstMultipleSevenNumber() {
    // 난수 생성 -> 1_000_000개의 1 ~ 100_000 사이 수
    List<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < 1_000_000; i++) {
      numbers.add((int) (Math.random() * 100_000) + 1);
    }

    System.out.println(numbers);
    int firstNum = numbers.stream() // Stream<Integer>
        .filter(num -> num % 7 == 0) // Stream<Integer>
        .findFirst() // Optional<Integer>
        .get() // Integer
    ;
    System.out.println(numbers.indexOf(firstNum) + ": " + firstNum);
  }

  public static void printFirstElement() {
    List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    int firstNum = numbers.stream() // Stream<Integer>
        .findFirst() // Optional<Integer>
        .get() // Integer
    ;
    System.out.println(firstNum);
  }

  public static void main(String[] args) {
    // printFirstElement();
    // System.out.println("=".repeat(60));

    // printFirstMultipleSevenNumber();
    // System.out.println("=".repeat(60));

    // printFirstMultipleRandomNumber();
    // System.out.println("=".repeat(60));

    printAnyNumber();
    System.out.println("=".repeat(60));

    printFirstFishDish();
    System.out.println("=".repeat(60));

    printHeavyCaloryDish();
    System.out.println("=".repeat(60));

  }
}
