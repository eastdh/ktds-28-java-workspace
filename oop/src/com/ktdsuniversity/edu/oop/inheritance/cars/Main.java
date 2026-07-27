package com.ktdsuniversity.edu.oop.inheritance.cars;

public class Main {

  public static void startEngine(Vehicle car) {
    car.startEngine();
  }

  public static void startTurboEngine(Vehicle car) {
    if (car instanceof SportsCar sportsCar) {
      sportsCar.turboMode();

    }
  }

  public static void checkBattery(Vehicle car) {
    if (car instanceof EV ev) {
      ev.checkBattery();
    }
  }

  public static void ejectPod(Vehicle car) {
    // car로 전달된 인스턴스의 타입이 BatMobile이라면
    // ejectBatpod을 실행시켜라.
    if (car instanceof BatMobile batMobile) {
      batMobile.ejectBatpod();
    }
  }

  public static void main(String[] args) {
    Vehicle vehicle = new Vehicle("vehicle");

    EV ev = new EV("ev", 100f);
    Vehicle ev2 = new EV("ev2");

    SportsCar sc = new SportsCar("sc");
    Vehicle sc2 = new SportsCar("sc2");

    BatMobile bm = new BatMobile("bm");
    Vehicle bm2 = new BatMobile("bm2");
    SportsCar bm3 = new BatMobile("bm3");

    Vehicle[] vehicles = {vehicle, ev, ev2, sc, sc2, bm, bm2, bm3};

    for (Vehicle v : vehicles) {
      startEngine(v);
      checkBattery(v);
      startTurboEngine(v);
      ejectPod(v);
    }

  }
}
