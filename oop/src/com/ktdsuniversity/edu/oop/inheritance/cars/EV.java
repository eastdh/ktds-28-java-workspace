package com.ktdsuniversity.edu.oop.inheritance.cars;

public class EV extends Vehicle {

  private float battery;

  public EV(String modelName) {
    this(modelName, 0f);
  }

  public EV(String modelName, float battery) {
    super(modelName);
    this.battery = battery;
  }

  public void checkBattery() {
    System.out.println(super.getName() + " 잔여 배터리: " + battery);
  }

}
