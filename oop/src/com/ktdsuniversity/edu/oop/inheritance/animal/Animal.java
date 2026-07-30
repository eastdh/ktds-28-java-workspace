package com.ktdsuniversity.edu.oop.inheritance.animal;

public class Animal {

  public static final int GENTLE = 0;
  public static final int MILD = 1;
  public static final int FEROCITY = 2;

  private String name;
  private int age;
  private String sex;
  private float weight;
  private int tall;
  private int speed;
  /**
   * 성격
   * 0: 온순함
   * 1: 두려움을 느끼면 공격적임
   * 2: 공격적임
   */
  private int personality;

  public Animal(String name, int age, String sex, float weight, int tall, int speed,
      int personality) {
    this.name = name;
    this.age = age;
    this.sex = sex;
    this.weight = weight;
    this.tall = tall;
    this.speed = speed;
    this.personality = personality;
  }

  public void eat(Animal otherAnimal) {
    if (this.personality == 0) {
      System.out.printf("%s는 %s를 공격할 생각이 없습니다.", this.name, otherAnimal.name);
    } else if (this.tall > otherAnimal.tall) {
      System.out.printf("%s가 %s를 사냥합니다.\n", this.name, otherAnimal.name);
    } else {
      System.out.printf("%s는 %s를 사냥할 수 없습니다.\n", this.name, otherAnimal.name);
    }
  }

  public void move() {
    System.out.printf("%s가 %dkm/h의 속도로 이동합니다.\n", this.name, this.speed);
  }

  public void run() {
    System.out.printf("%s가 %dkm/h의 속도로 달립니다.\n", this.name, this.speed * 2);
  }

  public void intruduce() {
    System.out.printf("이름: %s, 나이: %d, 성별: %s, 체중: %.2fkg, 신장: %dcm, 이동속도: %d\n", this.name,
        this.age, this.sex, this.weight, this.tall, this.speed);
  }

  public String getName() {
    return this.name;
  }

  public int getSpeed() {
    return this.speed;
  }

}
