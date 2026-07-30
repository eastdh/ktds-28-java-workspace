package com.ktdsuniversity.edu.oop.inheritance.animal;

public class Bird extends Animal {

  private boolean isLanded;
  private boolean canFly;
  private int flightDistance;

  public Bird(String name, int age, String sex, float weight, int tall, int walkingSpeed,
      int personality) {
    this(name, age, sex, weight, tall, walkingSpeed, personality, true, Integer.MAX_VALUE);
  }

  public Bird(String name, int age, String sex, float weight, int tall, int walkingSpeed,
      int personality, int flightDistance) {
    this(name, age, sex, weight, tall, walkingSpeed, personality, true, flightDistance);
  }

  public Bird(String name, int age, String sex, float weight, int tall, int walkingSpeed,
      int personality, boolean canFly, int flightDistance) {
    super(name, age, sex, weight, tall, walkingSpeed, personality);
    this.canFly = canFly;
    this.flightDistance = flightDistance;
  }

  public void fly() {
    if (this.canFly) {
      System.out.printf("%s가 %dkm/h속도로 %,dm만큼 날아갑니다.\n", super.getName(), super.getSpeed() * 4,
          this.flightDistance);
      this.isLanded = false;
    } else {
      System.out.printf("%s는 날지 못합니다.\n", super.getName());
    }
  }

  public boolean isFlying() {
    return this.isLanded == false;
  }

}
