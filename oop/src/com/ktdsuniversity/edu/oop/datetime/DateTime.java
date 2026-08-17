package com.ktdsuniversity.edu.oop.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTime {


  public static void printNowDate() {
    LocalDate now = LocalDate.now();
    System.out.println(now);
  }

  public static void printNowTime() {
    LocalTime now = LocalTime.now();
    System.out.println(now);
  }

  public static void printNowDateTime() {
    LocalDateTime now = LocalDateTime.now();
    System.out.println(now);
  }

  public static void setAndPrintDate(int year, int month, int day) {
    LocalDate anniversaryDate = LocalDate.of(year, month, day);
    System.out.println(anniversaryDate);
  }

  public static void setAndPrintTime(int hour, int minute, int second) {
    LocalTime alarm = LocalTime.of(hour, minute, second);
    System.out.println(alarm);
  }

  public static void setAndPrintDateTime(int year, int month, int day, int hour, int minute,
      int second) {
    LocalDateTime reservation = LocalDateTime.of(year, month, day, hour, minute, second);
    System.out.println(reservation);
  }

  public static void setAndPrintDate(String date) {
    LocalDate anniversaryDate = LocalDate.parse(date);
    System.out.println(anniversaryDate);
  }

  public static void setAndPrintTime(String time) {
    LocalTime alarm = LocalTime.parse(time);
    System.out.println(alarm);
  }

  public static void setAndPrintDateTime(String dateTime) {
    LocalDateTime reservation = LocalDateTime.parse(dateTime);
    System.out.println(reservation);
  }

  public static void printNowDateWithFormat() {
    LocalDate now = LocalDate.now();

    // formatter 지정
    // y => 연, M => 월, d => 일
    DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
    String dateString = now.format(format);
    System.out.println("변환 전: " + now);
    System.out.println("변환 후: " + dateString);
  }

  public static void printNowTimeWithFomat() {
    LocalTime now = LocalTime.now();

    // H => 시, m => 분, s => 초
    DateTimeFormatter format = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
    String timeString = now.format(format);
    System.out.println("변환 전: " + now);
    System.out.println("변환 후: " + timeString);
  }

  public static void printNowDateTimeWithFormat() {
    LocalDateTime now = LocalDateTime.now();

    DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 EEEE a hh시 mm분 ss.SSS초");
    String dateTimeString = now.format(format);
    System.out.println("변환 전: " + now);
    System.out.println("변환 후: " + dateTimeString);
  }

  public static void setAndPrintDateWithFormat(String date, String format) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
    LocalDate localDate = LocalDate.parse(date, formatter);
    System.out.println(localDate);

  }

  public static void setAndPrintTimeWithFormat(String time, String format) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
    LocalTime localTime = LocalTime.parse(time, formatter);
    System.out.println(localTime);
  }

  public static void setAndPrintDateTimeWithFormat(String dateTime, String format) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
    LocalDateTime localDateTime = LocalDateTime.parse(dateTime, formatter);
    System.out.println(localDateTime);
  }

  public static void plusYearAndPrintDateFromNow() {
    LocalDate now = LocalDate.now();
    LocalDate future = now.plusYears(7);
    System.out.println("현재: " + now);
    System.out.println("7년 후: " + future);
  }


  public static void plusDaysAndPrintDateFromNow() {
    LocalDate now = LocalDate.now();
    LocalDate past = now.plusDays(-70);
    System.out.println("현재: " + now);
    System.out.println("70일 전: " + past);

  }

  public static void printPeriodFromTo(LocalDate from, LocalDate to) {
    Period period = Period.between(from, to);
    System.out.println(period);

    System.out.printf("%s부터 %s까지 %d년 %d개월 %d일 지났습니다.\n", from, to, period.getYears(),
        period.getMonths(), period.getDays());
  }

  public static void printBetweenDaysFromTo(LocalDate from, LocalDate to) {
    long days = ChronoUnit.DAYS.between(from, to);
    System.out.printf("%s부터 %s까지 %d일 지났습니다.\n", from, to, days);
  }

  public static void printIsAfter(LocalDate date) {
    // 현재 날짜가 date보다 미래인지 확인한다.
    LocalDate now = LocalDate.now();
    System.out.printf("%s는 %s보다 ", now, date);
    boolean isFuture = now.isAfter(date);
    if (isFuture) {
      System.out.println("미래입니다.");
    } else {
      System.out.println("과거입니다.");
    }

  }

  public static void printIsBefore(LocalDate date) {
    // 현재 날짜가 date보다 과거인지 확인한다.
    LocalDate now = LocalDate.now();
    System.out.printf("%s는 %s보다 ", now, date);
    boolean isBefore = now.isBefore(date);
    if (isBefore) {
      System.out.println("과거입니다.");
    } else {
      System.out.println("미래입니다.");
    }
  }

  public static void printIsToday(LocalDate date) {
    // 현재 날짜가 date와 동일한지 확인한다.
    LocalDate now = LocalDate.now();
    System.out.printf("%s는 %s과 ", now, date);
    boolean isToday = now.isEqual(date);
    if (isToday) {
      System.out.println("같은 날짜입니다.");
    } else {
      System.out.println("다른 날짜입니다.");
    }
  }

  public static void printChangeYears() {
    LocalDate now = LocalDate.now();
    System.out.println(now.withYear(2012));
  }

  public static void main(String[] args) {
    printNowDate();
    printNowTime();
    printNowDateTime();

    setAndPrintDate(2026, 2, 28);
    // setAndPrintDate(2026, 2, 29);
    // java.time.DateTimeException: Invalid date 'February 29' as '2026' is not a leap year

    setAndPrintTime(9, 30, 11);
    setAndPrintTime(13, 8, 35);
    // setAndPrintTime(25, 1, 15);
    // java.time.DateTimeException: Invalid value for HourOfDay (valid values 0 - 23): 25

    setAndPrintDateTime(2026, 7, 1, 14, 30, 25);

    setAndPrintDate("2026-02-28");

    setAndPrintTime("17:45:24");
    // setAndPrintTime("25:45:24");

    setAndPrintDateTime("2026-08-04T12:34:56.789");

    printNowDateWithFormat();
    printNowTimeWithFomat();
    printNowDateTimeWithFormat();

    setAndPrintDateWithFormat("2026-08-04", "yyyy-MM-dd");
    setAndPrintDateWithFormat("1234년 05월 06일", "yyyy년 MM월 dd일");

    setAndPrintTimeWithFormat("12시 34분 56초", "HH시 mm분 ss초");

    setAndPrintDateTimeWithFormat("1234년 5월 6일 12시 34분 56초", "yyyy년 M월 d일 HH시 mm분 ss초");

    plusYearAndPrintDateFromNow();
    plusDaysAndPrintDateFromNow();

    printPeriodFromTo(LocalDate.parse("1998-10-28"), LocalDate.now());

    System.out.println();
    printBetweenDaysFromTo(LocalDate.parse("1998-10-28"), LocalDate.now());
    printBetweenDaysFromTo(LocalDate.now(), LocalDate.parse("1998-10-28"));
    System.out.println();

    printIsAfter(LocalDate.parse("2026-08-03"));
    printIsAfter(LocalDate.parse("2026-08-04"));
    printIsAfter(LocalDate.parse("2026-08-05"));

    printIsBefore(LocalDate.parse("2026-08-03"));
    printIsBefore(LocalDate.parse("2026-08-04"));
    printIsBefore(LocalDate.parse("2026-08-05"));

    printIsToday(LocalDate.parse("2026-08-03"));
    printIsToday(LocalDate.parse("2026-08-04"));
    printIsToday(LocalDate.parse("2026-08-05"));

    printChangeYears();
  }
}
