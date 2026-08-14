package com.ktdsuniversity.edu.oop.homework.august_vacation.hw1;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

  public static void schedule() {
    schedule(LocalTime.now());
  }

  public static void schedule(LocalTime time) {
    if (time.isAfter(LocalTime.parse("23:00"))) {
      System.out.println("프로그램 13");
    } else if (time.isAfter(LocalTime.parse("21:00"))) {
      System.out.println("프로그램 12");
    } else if (time.isAfter(LocalTime.parse("18:00"))) {
      System.out.println("프로그램 11");
    } else if (time.isAfter(LocalTime.parse("17:00"))) {
      System.out.println("프로그램 10");
    } else if (time.isAfter(LocalTime.parse("15:00"))) {
      System.out.println("프로그램 9");
    } else if (time.isAfter(LocalTime.parse("13:30"))) {
      System.out.println("프로그램 8");
    } else if (time.isAfter(LocalTime.parse("12:00"))) {
      System.out.println("프로그램 7");
    } else if (time.isAfter(LocalTime.parse("10:00"))) {
      System.out.println("프로그램 6");
    } else if (time.isAfter(LocalTime.parse("09:00"))) {
      System.out.println("프로그램 5");
    } else if (time.isAfter(LocalTime.parse("08:00"))) {
      System.out.println("프로그램 4");
    } else if (time.isAfter(LocalTime.parse("06:30"))) {
      System.out.println("프로그램 3");
    } else if (time.isAfter(LocalTime.parse("05:00"))) {
      System.out.println("프로그램 2");
    } else if (time.isAfter(LocalTime.parse("02:59"))) {
      System.out.println("프로그램 1");
    } else {
      System.out.println("방영중인 시간이 아닙니다.");
    }
  }

  public static boolean isTimeFormat(String time) {
    try {
      LocalTime.parse(time);
      return true;
    } catch (DateTimeParseException dtpe) {
      return false;
    }
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("시간 입력 (미입력시 현재 시각) (hh:mm): ");
    String time = sc.nextLine();

    if (time == null || time.isBlank() || !isTimeFormat(time)) {
      schedule();
    } else {
      schedule(LocalTime.parse(time));
    }

    sc.close();
  }

}
