package com.ktdsuniversity.edu.oop.interfaces;

public class SomeClass2 implements SomeInterface {

  @Override
  public void doSomething1() {
    System.out.println("아무거나1");
  }

  @Override
  public void doSomething2() {
    System.out.println("아무거나2");
  }

  @Override
  public void doSomething3() {
    System.out.println("아무거나3".repeat(3));
  }

  @Override
  public int getSomething() {
    return 987654321;
  }

  @Override
  public String getString() {
    return "안녕".repeat(3);
  }



}
