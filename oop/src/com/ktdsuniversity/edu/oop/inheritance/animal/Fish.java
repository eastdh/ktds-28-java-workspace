package com.ktdsuniversity.edu.oop.inheritance.animal;

public class Fish extends Animal {

  private String fin;
  private String scale;
  private String gill;

  /**
   * @param name
   * @param age
   * @param sex
   * @param weight
   * @param height
   * @param species
   * @param fin
   * @param scale
   * @param gill
   */
  public Fish(String name, int age, String sex, float weight, float height, String species,
      String fin, String scale, String gill) {
    super(name, age, sex, weight, height, species);
    this.fin = fin;
    this.scale = scale;
    this.gill = gill;
  }

  @Override
  public void breathe() {
    super.breathe();
    System.out.println("\t" + super.getName() + " breathes through " + this.gill);
  }

  public void swim() {
    super.move();
    System.out.println("\t" + super.getName() + " moves by swimming, using it's " + this.fin
        + " and " + this.scale);
  }

}
