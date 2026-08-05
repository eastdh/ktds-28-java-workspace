package com.ktdsuniversity.edu.fp.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import com.ktdsuniversity.edu.fp.objects.enums.DishType;

public class NativeFunction {

  public static void main(String[] args) {

    // Predicate<T> => T를 받아서 boolean 반환
    Predicate<String> isEmpty = (str) -> str == null || str.isBlank();
    System.out.println(isEmpty.test(null));
    System.out.println(isEmpty.test("           "));
    System.out.println(isEmpty.test("adfasdfasdf"));

    // Consumer<T> => T를 받아서 void 반환
    Consumer<String> print = (str) -> System.out.println(str);
    // println은 void 반환이기 때문에 중괄호 생략 가능!

    print.accept("2142343214");


    // Function<T, R> => T를 받아서 R 반환
    // String을 파라미터로 전달해서 문자열의 길이를 반환
    Function<String, Integer> getLength = (str) -> str.length();
    int len = getLength.apply("dadfadfasdfasdf");
    System.out.println(len);

    // String을 파라미터로 전달해서 숫자로 변경해주는 함수
    Function<String, Integer> parseInt = (str) -> Integer.parseInt(str);
    int parsed = parseInt.apply("3415123");
    System.out.println(parsed);

    // Integer을 파라미터로 전달해서 문자로 변경해주는 함수
    Function<Integer, String> intToString = (value) -> String.valueOf(value);
    String valueOfString = intToString.apply(1423143214);
    System.out.println(valueOfString);

    // Integer을 파라미터로 전달해서 2의 배수만 true를 반환
    Function<Integer, Boolean> isEven = (value) -> value % 2 == 0;
    boolean isEvenInteger = isEven.apply(1432);
    System.out.println(isEvenInteger);


    DishSummary summary = new DishSummary();
    summary.printAllDishesBy((dish) -> dish.getDishType() == DishType.MEAT);
  }
}
