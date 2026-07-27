package com.ktdsuniversity.edu.oop.inheritance.animal;

public class Animal {

  private String name;
  private int age;
  private String sex;
  private float weight;
  private float height;
  private String species;

  /**
   * @param name
   * @param age
   * @param sex
   * @param weight
   * @param height
   * @param species
   */
  public Animal(String name, int age, String sex, float weight, float height, String species) {
    this.name = name;
    this.age = age;
    this.sex = sex;
    this.weight = weight;
    this.height = height;
    this.species = species;
    System.out.println(this.name + "is Animal.");
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getSex() {
    return sex;
  }

  public float getWeight() {
    return weight;
  }

  public float getHeight() {
    return height;
  }

  public String getSpecies() {
    return species;
  }


  public void breathe() {
    System.out.println(this.name + " breathes.");
  }

  public void move() {
    System.out.println(this.name + " moves.");
  }

  public void eat() {
    System.out.println(this.name + " eats.");
  }

  public void sleep() {
    System.out.println(this.name + " sleeps.");
  }

  public void makeSound() {
    System.out.print(this.name + " makes a sound: ");
  }



}
