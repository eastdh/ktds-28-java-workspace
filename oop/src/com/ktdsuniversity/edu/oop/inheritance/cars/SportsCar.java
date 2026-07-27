package com.ktdsuniversity.edu.oop.inheritance.cars;

public class SportsCar extends Vehicle {

  public SportsCar(String modelName) {
    super(modelName);
  }

  public void turboMode() {
    System.out.println(super.getName() + " 터보 모드");
  }


}
