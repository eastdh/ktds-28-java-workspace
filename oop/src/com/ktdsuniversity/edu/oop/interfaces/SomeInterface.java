package com.ktdsuniversity.edu.oop.interfaces;

public interface SomeInterface {

  /* public final */ int PRICE = 300;

  /* public abstract */ void doSomething1(); // Body를 붙이면 error 발생!

  void doSomething2(); // 추상 메소드: 메소드의 정의만 존재하고 바디가 없는 형태

  void doSomething3();

  int getSomething();

  String getString();

}
