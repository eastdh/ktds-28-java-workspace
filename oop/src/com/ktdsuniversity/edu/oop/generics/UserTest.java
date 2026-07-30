package com.ktdsuniversity.edu.oop.generics;

public class UserTest {

  public static void main(String[] args) {
    User<Integer, String> user01 = new User<>(1, "장민창");
    int id = user01.getId();
    String name = user01.getName();
    System.out.println("user01: " + id + " " + name);

    User<Integer, Long> user02 = new User<>(2, 1L);
    int id2 = user02.getId();
    long name2 = user02.getName();
    System.out.println("user02: " + id2 + " " + name2);
  }
}
