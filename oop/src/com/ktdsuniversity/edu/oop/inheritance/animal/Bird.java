package com.ktdsuniversity.edu.oop.inheritance.animal;

public class Bird extends Animal {

  private String feather;
  private String wings;
  private String beak;

  /**
   * @param name
   * @param age
   * @param sex
   * @param weight
   * @param height
   * @param species
   * @param feather
   * @param wings
   * @param beak
   */
  public Bird(String name, int age, String sex, float weight, float height, String species,
      String feather, String wings, String beak) {
    super(name, age, sex, weight, height, species);
    this.feather = feather;
    this.wings = wings;
    this.beak = beak;
    System.out.println(super.getName() + "is Bird.");
  }

  @Override
  public void eat() {
    super.eat();
    System.out.println("\t" + super.getName() + "eats with it's" + this.beak);
  }

  public void fly() {
    super.move();
    System.out.println("\t" + super.getName() + "moves by flying using it's " + this.wings + " and "
        + this.feather);

  }
}
