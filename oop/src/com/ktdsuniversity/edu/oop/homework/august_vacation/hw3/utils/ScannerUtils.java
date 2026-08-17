package com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.utils;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ScannerUtils {

  private static final Scanner sc;

  static {
    sc = new Scanner(System.in);
  }

  private ScannerUtils() {}

  public static String scanString() {
    return sc.nextLine().trim();
  }

  public static String scanString(String message) {
    System.out.print(message);
    return scanString();
  }

  public static LocalDate scanDate() {
    return scanDate("");
  }

  public static LocalDate scanDate(String message) {
    while (true) {
      try {
        return LocalDate.parse(scanString(message));
      } catch (DateTimeParseException dtpe) {
        System.out.println("날짜 형식만 입력하세요. (YYYY-MM-DD)");
      }
    }
  }

  public static int scanInt() {
    return scanInt("");
  }

  public static int scanInt(String message) {
    while (true) {
      try {
        return Integer.parseInt(scanString(message));
      } catch (NumberFormatException nfe) {
        System.out.println("숫자만 입력하세요.");
      }
    }
  }

  public static long scanLong() {
    return scanLong("");
  }

  public static long scanLong(String message) {
    while (true) {
      try {
        return Long.parseLong(scanString(message));
      } catch (NumberFormatException nfe) {
        System.out.println("숫자만 입력하세요.");
      }
    }
  }

  public static String scanPhone(String message) {
    String phoneNumber = null;
    while (true) {
      phoneNumber = scanString(message);
      if (phoneNumber.matches("^01\\d{1}-?\\d{3,4}-?\\d{4}$")) {
        return phoneNumber;
      }
      System.out.println("전화번호 형식에 맞지않습니다. (000-0000-0000)");
    }
  }


}
