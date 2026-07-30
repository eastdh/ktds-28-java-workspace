package com.ktdsuniversity.edu.oop.inheritance.animal;

public class Fish extends Animal {

  /**
   * 아가미
   */
  private boolean haveGill;
  private int diveMinutes;

  public Fish(String name, int age, String sex, float weight, int tall, int speed,
      int personality) {
    this(name, age, sex, weight, tall, speed, personality, true, Integer.MAX_VALUE);
  }

  public Fish(String name, int age, String sex, float weight, int tall, int speed, int personality,
      boolean haveGill, int diveMinutes) {
    super(name, age, sex, weight, tall, speed, personality);
    this.haveGill = haveGill;
    this.diveMinutes = diveMinutes;
  }

  public void swim() {
    if (this.haveGill) {
      System.out.printf("%s가 %dkm/h의 속도로 아가미 호흡하며 헤엄칩니다.\n", super.getName(), super.getSpeed());
    } else {
      System.out.printf("%s가 %dkm/h의 속도로 헤엄칩니다. 아가미가 없어 %d분마다 호흡하러 수면으로 나옵니다.\n", super.getName(),
          super.getSpeed(), this.diveMinutes);
    }
  }

}
