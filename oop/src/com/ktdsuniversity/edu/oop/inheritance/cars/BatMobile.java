package com.ktdsuniversity.edu.oop.inheritance.cars;

public class BatMobile extends SportsCar {

  /**
   * @param modelName
   */
  public BatMobile(String modelName) {
    super(modelName);
  }

  public void ejectBatpod() {
    System.out.println(super.getName() + " 배트포드 분리");
  }


}
