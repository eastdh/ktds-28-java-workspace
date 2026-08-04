package com.ktdsuniversity.edu.oop.enums;

public enum CalcType {

  ADD("덧셈"), SUB("뺄셈"), MUL("곱셈"), DIV("나눗셈");

  private String name;

  // 접근제어자 생략!
  CalcType(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

}
