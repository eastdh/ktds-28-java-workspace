package com.ktdsuniversity.edu.oop.collection.list.zoo;

import java.util.ArrayList;
import java.util.List;
import com.ktdsuniversity.edu.oop.inheritance.animal.Animal;
import com.ktdsuniversity.edu.oop.inheritance.animal.Bird;
import com.ktdsuniversity.edu.oop.inheritance.animal.Fish;

public class Zoo {

  private List<Animal> animals;

  public Zoo() {
    this.animals = new ArrayList<>();
  }

  public void addAnimal() {
    animals.add(new Animal("호랑이", 7, "수컷", 150, 103, 30, Animal.FEROCITY));
    animals.add(new Animal("사자", 2, "암컷", 100, 109, 25, Animal.FEROCITY));
    animals.add(new Animal("사슴", 5, "수컷", 70, 90, 3, Animal.GENTLE));
    animals.add(new Bird("닭", 2, "수컷", 5, 37, 10, Animal.MILD, false, 7));
    animals.add(new Bird("오리", 1, "암컷", 7, 59, 18, Animal.MILD, false, 7));
    animals.add(new Bird("독수리", 8, "수컷", 19, 97, 20, Animal.MILD));
    animals.add(new Fish("범고래", 29, "수컷", 378, 180, 90, Animal.MILD, true, 40));
  }

  public void seeAnimals() {
    // 0: 평화로움
    // 1. 사냥 함
    // 2. 움직임
    // 3. 달림
    int nowStatus = (int) (Math.random() * 4);
    if (nowStatus == 0) {
      for (int i = 0; i < this.animals.size(); i++) {
        this.animals.get(i).intruduce();
      }
    } else if (nowStatus == 1) {
      int hunter = (int) (Math.random() * this.animals.size());
      int target = (int) (Math.random() * this.animals.size());

      while (hunter == target) {
        target = (int) (Math.random() * this.animals.size());
      }

      this.animals.get(hunter).eat(this.animals.get(target));

    } else if (nowStatus == 2) {
      for (int i = 0; i < this.animals.size(); i++) {
        if (this.animals.get(i) instanceof Bird bird) {
          bird.fly();
        } else if (this.animals.get(i) instanceof Fish fish) {
          fish.swim();
        } else {
          this.animals.get(i).move();
        }
      }
    } else if (nowStatus == 3) {
      for (int i = 0; i < this.animals.size(); i++) {
        if (this.animals.get(i) instanceof Bird bird) {
          bird.fly();
        } else if (this.animals.get(i) instanceof Fish fish) {
          fish.swim();
        } else {
          this.animals.get(i).run();
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
