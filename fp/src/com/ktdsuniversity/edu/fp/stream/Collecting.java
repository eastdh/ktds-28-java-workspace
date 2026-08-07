package com.ktdsuniversity.edu.fp.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import com.ktdsuniversity.edu.fp.objects.Dish;
import com.ktdsuniversity.edu.fp.objects.DishList;
import com.ktdsuniversity.edu.fp.objects.enums.DishType;
import com.ktdsuniversity.edu.fp.objects.enums.FoodType;

public class Collecting {


  public static void printCaloryGroups() {
    // 칼로리 구간 별 그룹
    // 400 이하 => "Diet"
    // 700 이하 => "Normal"
    // 700 초과 => "Fat"

    List<Dish> dishes = DishList.makeDishList();

    Map<String, List<Dish>> groupMap = dishes.stream() // Stream<Dish>
        .collect(Collectors.groupingBy(d -> {
          int calory = d.getCalories();
          if (calory <= 400) {
            return "Diet";
          } else if (calory <= 700) {
            return "Normal";
          } else {
            return "Fat";
          }
        })) // Map<String, List<Dish>>
    ;
    
    groupMap.forEach((k, v) -> {
      System.out.println(k + "-".repeat(50));
      v.forEach(System.out::println);
    });
  }

  public static void printFoodTypeGroups() {
    // FoodType별 Dish 목록을 출력
    List<Dish> dishes = DishList.makeDishList();

    Map<FoodType, List<Dish>> groupMap = dishes.stream() // Stream<Dish>
        .collect(Collectors.groupingBy(d -> d.getFoodType())) // Map<FoodType, List<Dish>>
    ;

    groupMap.forEach((key, value) -> {
      System.out.println(key + "-".repeat(50));
      value.forEach(System.out::println);
    });

  }

  public static void printDishTypeGroups() {
    // Dish Type별 Dish 목록을 출력
    List<Dish> dishes = DishList.makeDishList();

    Map<DishType, List<Dish>> groupMap = dishes.stream() // Stream<Dish>
        .collect(Collectors.groupingBy(dish -> dish.getDishType())) // Map<DishType, List<Dish>>
    ;
    System.out.println(groupMap);
    System.out.println("OTHER => " + groupMap.get(DishType.OTHER));
    System.out.println("FISH => " + groupMap.get(DishType.FISH));
    System.out.println("MEAT => " + groupMap.get(DishType.MEAT));

    // map 반복
    groupMap.forEach((key, value) -> {
      System.out.println(key + "-".repeat(50));
      value.forEach(System.out::println);
    });
  }

  public static void printDishNames3() {
    List<Dish> dishes = DishList.makeDishList();
    // 메뉴의 이름들을 칼로리 순으로 내림차순하여 칼로리를 " -> "로 구분해서 출력
    // 800 -> 700 -> ... -> 120
    String calories = dishes.stream() // Stream<Dish>
        .sorted((d1, d2) -> d2.getCalories() - d1.getCalories()) // Stream<Dish>
        .map(d -> String.valueOf(d.getCalories())) // Stream<String>
        .collect(Collectors.joining(" -> "));
    System.out.println(calories);
  }

  public static void printDishNames2() {
    List<Dish> dishes = DishList.makeDishList();
    // 메뉴의 이름들을 칼로리 순으로 오름차순하여 이름들을 " -> "로 구분해서 출력
    // 계절 과일 -> 새우 -> ... -> 돼지고기
    String names = dishes.stream() // Stream<Dish>
        .sorted((d1, d2) -> d1.getCalories() - d2.getCalories()) // Stream<Dish>
        .map(Dish::getName) // Stream<String>
        .collect(Collectors.joining(" -> ")) // String
    ;

    System.out.println(names);
  }

  public static void printDishNames() {
    List<Dish> dishes = DishList.makeDishList();
    // 메뉴의 이름들을 ", "로 구분해서 출력
    // 돼지고기, 소고기, 치킨, ..., 연어
    String names = dishes.stream() // Stream<Dish>
        .map(Dish::getName) // Stream<String>
        .collect(Collectors.joining(", ")); // String
    System.out.println(names);
  }

  public static String concatStrings(List<String> strings, String seperator) {
    return strings.stream() // Stream<String>
        .collect(Collectors.joining(seperator)) // String
    ;

  }

  public static Dish getMinCaloryDish() {
    List<Dish> dishes = DishList.makeDishList();
    return dishes.stream() // Stream<Dish>
        .collect(Collectors.minBy((d1, d2) -> d1.getCalories() - d2.getCalories())) // Optional<Dish>
        .orElse(null);

  }

  public static Dish getMaxCaloryDish() {
    List<Dish> dishes = DishList.makeDishList();
    return dishes.stream() // Stream<Dish>
        .collect(Collectors.maxBy((d1, d2) -> d1.getCalories() - d2.getCalories())) // Optional<Dish>
        .orElse(null) // Dish
    ;

  }

  public static List<Integer> getDescendingOrderedList(List<Integer> intList) {
    return intList.stream() // Stream<Integer>
        .sorted((n1, n2) -> n2 - n1) // Steam<Integer>
        .collect(Collectors.toList()); // List<Integer>
  }

  public static List<Integer> getOrderedList(List<Integer> intList) {
    return intList.stream() // Stream<Integer>
        .sorted() // Steam<Integer>
        .collect(Collectors.toList()); // List<Integer>
  }

  public static List<Integer> getEvenNumberList(List<Integer> intList) {
    return intList.stream() // Stream<Integer>
        .filter(n -> n % 2 == 0) // Stream<Integer>
        .collect(Collectors.toList()) // List<Integer>
    ;
  }

  public static void main(String[] args) {

    List<Integer> evenList = getEvenNumberList(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));
    evenList.forEach(System.out::println);
    System.out.println("=".repeat(60));

    // 오름차순 정렬된 리스트 반환
    List<Integer> orderedList = getOrderedList(List.of(9, 1, 5, 2, 7, 2, 7, 3, 4, 8, 6));
    orderedList.forEach(System.out::println);
    System.out.println("=".repeat(60));

    // 내림차순 정렬된 리스트 반환
    List<Integer> descList = getDescendingOrderedList(List.of(9, 1, 5, 2, 7, 2, 7, 3, 4, 8, 6));
    descList.forEach(System.out::println);
    System.out.println("=".repeat(60));

    Dish dish = getMaxCaloryDish();
    System.out.println(dish);

    Dish minDish = getMinCaloryDish();
    System.out.println(minDish);

    System.out.println("=".repeat(60));
    String result = concatStrings(List.of("A", "B", "C", "D", "E", "F", "G"), ", ");
    System.out.println(result); // A, B, C, D, E, F, G

    result = concatStrings(List.of("A", "B", "C", "D", "E", "F", "G"), "");
    System.out.println(result); // ABCDEFG
    System.out.println("=".repeat(60));

    printDishNames();
    printDishNames2();
    printDishNames3();
    System.out.println("=".repeat(60));

    printDishTypeGroups();
    System.out.println("=".repeat(60));
    printFoodTypeGroups();
    System.out.println("=".repeat(60));
    printCaloryGroups();
    System.out.println("=".repeat(60));

  }
}
