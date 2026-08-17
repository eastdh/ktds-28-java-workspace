package com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.utils;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CsvUtils {

  private CsvUtils() {}

  public static String toCsvLine(Object obj) {
    Field[] fields = obj.getClass().getDeclaredFields();

    return Arrays.stream(fields) // Stream<Field>
        .peek(f -> f.setAccessible(true)) // Stream<Field>
        .map(f -> {
          try {
            Object value = f.get(obj);
            return value != null ? value.toString() : "";
          } catch (IllegalAccessException iae) {
            return "";
          }
        }) // Stream<String>
        .collect(Collectors.joining(",")); // String
  }

}
