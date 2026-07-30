package com.ktdsuniversity.edu.oop.inheritance.animal;

public class Zoo {

  private Animal[] animals;

  public Zoo() {
    this.animals = new Animal[7];
  }

  public void addAnimal() {
    this.animals[0] = new Animal("호랑이", 7, "수컷", 150, 103, 30, Animal.FEROCITY);
    this.animals[1] = new Animal("사자", 2, "암컷", 100, 109, 25, Animal.FEROCITY);
    this.animals[2] = new Animal("사슴", 5, "수컷", 70, 90, 3, Animal.GENTLE);
    this.animals[3] = new Bird("닭", 2, "수컷", 5, 37, 10, Animal.MILD, false, 7);
    this.animals[4] = new Bird("오리", 1, "암컷", 7, 59, 18, Animal.MILD, false, 7);
    this.animals[5] = new Bird("독수리", 8, "수컷", 19, 97, 20, Animal.MILD);
    this.animals[6] = new Fish("범고래", 29, "수컷", 378, 180, 90, Animal.MILD, true, 40);
  }

  public void seeAnimals() {
    // 0: 평화로움
    // 1. 사냥 함
    // 2. 움직임
    // 3. 달림
    int nowStatus = (int) (Math.random() * 4);
    if (nowStatus == 0) {
      for (int i = 0; i < this.animals.length; i++) {
        this.animals[i].intruduce();
      }
    } else if (nowStatus == 1) {
      int hunter = (int) (Math.random() * this.animals.length);
      int target = (int) (Math.random() * this.animals.length);

      while (hunter == target) {
        target = (int) (Math.random() * this.animals.length);
      }

      this.animals[hunter].eat(this.animals[target]);

    } else if (nowStatus == 2) {
      for (int i = 0; i < this.animals.length; i++) {
        if (this.animals[i] instanceof Bird bird) {
          bird.fly();
        } else if (this.animals[i] instanceof Fish fish) {
          fish.swim();
        } else {
          this.animals[i].move();
        }
      }
    } else if (nowStatus == 3) {
      for (int i = 0; i < this.animals.length; i++) {
        if (this.animals[i] instanceof Bird bird) {
          bird.fly();
        } else if (this.animals[i] instanceof Fish fish) {
          fish.swim();
        } else {
          this.animals[i].run();
        }
      }
    }
  }

  public static void main(String[] args) {
    Zoo safari = new Zoo();
    safari.addAnimal();

    safari.seeAnimals();
  }

}
