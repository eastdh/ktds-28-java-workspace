package com.ktdsuniversity.edu.fp.stream;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import com.ktdsuniversity.edu.fp.objects.Dish;
import com.ktdsuniversity.edu.fp.objects.DishList;

public class PrimitiveStream {

  public static void printSummaryStatisticsofDishes() {
    // 모든 Dish의 Calory를 가진 intStream으로 변환해서
    // summaryStatistics()를 호출한 결과를 출력해본다.
    List<Dish> dishes = DishList.makeDishList();

    IntSummaryStatistics statistics = dishes.stream() // Stream<Dish>
        .map(Dish::getCalories) // Stream<Integer>
        .mapToInt(Integer::intValue) // IntStream
        .summaryStatistics();

    System.out.println(statistics);
    int min = statistics.getMin();
    System.out.println("min: " + min);
    int max = statistics.getMax();
    System.out.println("max: " + max);
    

  }

  public static void printDishesAverageCalory() {
    // 모든 Dish의 평균 Calory를 출력한다.
    List<Dish> dishes = DishList.makeDishList();

    double avg = dishes.stream() // Stream<Dish>
        .map(Dish::getCalories) // Stream<Integer>
        .mapToInt(n -> n) // IntStream
        .average() // OptionalDouble
        .orElse(0);
    System.out.println(avg);
  }

  public static void printMinNumbers() {
    // 난수 생성 -> 500개의 1 ~ 100_000 사이 수
    List<String> numbers = new ArrayList<>();
    for (int i = 0; i < 500; i++) {
      numbers.add(String.valueOf((int) (Math.random() * 100_000) + 1));
    }

    // List<String> numbers = List.of("1243", "155", "57648", "12412", "537332", "3421");
    System.out.println(numbers);

    int min = numbers.stream() // Stream<String>
        // .filter(PrimitiveStream::isIntString) // Stream<String>
        .mapToInt(Integer::parseInt) // IntStream
        .min().orElse(-1);
    System.out.println(min);

  }

  public static boolean isIntString(String s) {
    try {
      Integer.parseInt(s);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }

  public static void printMaxNumbers() {
    List<Integer> numbers =
        List.of(1, 6, 17, 38, 458, 6, 8, 3251, 5, 58, 569, 7, 523, 124, 36, 23, 12, 34, 421, 4, 41);
    int max = numbers.stream() // Stream<Integer>
        .mapToInt(n -> n) // IntStream
        .max() // OptionalInt
        .orElse(-1);
    System.out.println(max);
  }

  public static void printSumNumbers() {
    List<Integer> numbers =
        List.of(1, 6, 17, 38, 458, 6, 8, 3251, 5, 58, 569, 7, 523, 124, 36, 23, 12, 34, 421, 4, 41);

    int sum = numbers.stream() // Stream<Integer>
        .mapToInt(num -> num) // Intstream
        .sum(); // int
    System.out.println(sum);
  }

  public static void main(String[] args) {

    printSumNumbers();
    System.out.println("=".repeat(60));

    printMaxNumbers();
    System.out.println("=".repeat(60));

    printMinNumbers();
    System.out.println("=".repeat(60));

    printDishesAverageCalory();
    System.out.println("=".repeat(60));

    printSummaryStatisticsofDishes();
    System.out.println("=".repeat(60));

  }

}
