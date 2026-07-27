package com.ktdsuniversity.edu.oop.inheritance.animal;

public class Mammal extends Animal {

  public Mammal(String name, int age, String sex, float weight, float height, String species) {
    super(name, age, sex, weight, height, species);
    System.out.println(super.getName() + " is Mammal.");
  }



}
