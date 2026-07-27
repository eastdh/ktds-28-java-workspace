package com.ktdsuniversity.edu.oop.inheritance.cars;

public class Vehicle {

  private String modelName;

  /**
   * @param modelName
   */
  public Vehicle(String modelName) {
    this.modelName = modelName;
  }

  public String getName() {
    return this.modelName;
  }

  public void startEngine() {
    System.out.println(this.modelName + " start engine");
  }

}
