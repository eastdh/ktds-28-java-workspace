package com.ktdsuniversity.edu.oop.interfaces;

// SomeInterface를 구현한 '구현 클래스'
// 인터페이스를 구현한 클래스는 인터페이스 내부의 메소드(추상 메소드)를 구현할 의무가 있다.
public class SomeClass implements SomeInterface {

  @Override
  public void doSomething1() {
    System.out.println("do something 1");
  }

  @Override
  public void doSomething2() {
    System.out.println("do something 2");
  }

  @Override
  public void doSomething3() {
    System.out.println("do something 3");
  }

  @Override
  public int getSomething() {
    return 1112220;
  }

  @Override
  public String getString() {
    return "안녕하세요";
  }

}
