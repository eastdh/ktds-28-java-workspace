package com.ktdsuniversity.edu.fp.lambda;

import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReference {

  public static void main(String[] args) {

    // 문자를 숫자로 변경해본다
    // Lambda
    String numberFormatString = "1234";
    Function<String, Integer> toNumber = (str) -> Integer.parseInt(str);
    int num = toNumber.apply(numberFormatString);
    System.out.println(num);

    // Method Reference
    Function<String, Integer> toNumberRef = Integer::parseInt;
    int num2 = toNumberRef.apply(numberFormatString);
    System.out.println(num2);

    // 문자를 문자의 길이로 변경해본다
    // Lambda
    Function<String, Integer> toLength = (str) -> str.length();
    int len = toLength.apply("ABC");
    System.out.println(len);

    len = toLength.apply("aaaaaaaa");
    System.out.println(len);

    // Method Reference
    Function<String, Integer> toLengthRef = String::length;
    len = toLengthRef.apply("ABC");
    System.out.println(len);

    len = toLengthRef.apply("aaaaaa");
    System.out.println(len);


    Consumer<String> printer = (str) -> System.out.println(str);
    printer.accept("asdfasdfasdf");

    Consumer<String> printerRef = System.out::println;
    printerRef.accept("qsdfdsfqwefadgqwrsd");
  }

}
