package com.ktdsuniversity.edu.fp.stream;

import java.util.List;
import java.util.Scanner;
import com.ktdsuniversity.edu.fp.objects.Dish;
import com.ktdsuniversity.edu.fp.objects.DishList;
import com.ktdsuniversity.edu.fp.objects.enums.DishType;

/**
 * 스트림의 데이터를 변경시키는 Map 실습
 */
public class Mapping {

  public static void compareString() {
    String a = "이름";
    String b = "이름";
    System.out.println(a == b); // true

    Scanner sc = new Scanner(System.in);
    String c = sc.nextLine(); // 이름
    String d = sc.nextLine(); // 이름
    System.out.println(c == d); // false
  }

  public static void printDishesUniqueFoodType() {
    // DishList에 있는 FoodType을 중복없이 출력한다.
    List<Dish> dishes = DishList.makeDishList();
    dishes.stream() // Stream<Dish>
        .map(Dish::getFoodType) // Stream<FoodType>
        .distinct() // 중복 제거 Stream<FoodType>
        .forEach(System.out::println); // void
  }

  public static void printFishDishesName() {
    List<Dish> dishes = DishList.makeDishList();
    dishes.stream() // Stream<Dish>
        .filter(dish -> dish.getDishType() == DishType.FISH) // Stream<Dish>
        .map(Dish::getName) // Stream<String>
        .forEach(System.out::println); // void
  }

  public static void printMultipleThreeNumbers() {
    List<String> strings = List.of("1", "2", "A", "3", "99", "ABC", "100", "", "11", "12", "-9999",
        "33-33", "-----9999", "168181414411677112871248712437682");
    // 숫자 형태의 문자들을 숫자로 변경하고 3의 배수만 골라서 출력한다.
    strings.stream() // Stream<String>
        .filter(Mapping::isIntFormat) // Stream<String>
        .map(Integer::parseInt) // Stream<Integer>
        .filter(num -> num % 3 == 0) // Stream<Integer>
        .forEach(System.out::println); // void
  }

  public static void printStringToNumber2() {
    // 모든 문자열들을 숫자로 변경해서 출력한다.
    List<String> strings = List.of("1", "2", "A", "3", "99", "ABC", "100", "", "11", "12", "-9999",
        "33-33", "-----9999", "168181414411677112871248712437682");

    // 숫자 형태의 문자들만 숫자로 변경해서 출력한다.
    strings.stream() // stream<String>
        // .filter(str -> str.matches("^-{0,1}[0-9]+$")) // Stream<String>
        .filter(Mapping::isIntFormat) // Stream<String>
        .map(Integer::parseInt) // Stream<Integer>
        .forEach(System.out::println); // void
    ;

  }

  public static boolean isIntFormat(String string) {
    try {
      Integer.parseInt(string);
      return true;
    } catch (NumberFormatException nfe) {
      return false;
    }
  }

  public static void printStringToNumber() {
    // 모든 문자열들을 숫자로 변경해서 출력한다.
    List<String> strings = List.of("1234", "234", "364", "1231234", "567578975", "34234", "241312",
        "463463", "12312", "4634643");

    strings.stream() // Stream<String>
        .map(Integer::parseInt) // Stream<Integer>
        .forEach(System.out::println); // void
    ;
  }

  public static void printOddToEven() {
    List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    // 모든 숫자들에 2를 곱해서 짝수로 만들어 출력한다.
    numbers.stream() // Stream<Integer>
        .map(n -> n * 2) // Stream<Integer>
        .forEach(System.out::println); // void
  }

  public static void main(String[] args) {
    printOddToEven();
    System.out.println("=".repeat(60));
    printStringToNumber();
    System.out.println("=".repeat(60));
    printStringToNumber2();
    System.out.println("=".repeat(60));
    printMultipleThreeNumbers();
    System.out.println("=".repeat(60));
    printDishesUniqueFoodType();
    System.out.println("=".repeat(60));
    printFishDishesName();
    System.out.println("=".repeat(60));
    compareString();
  }
}
