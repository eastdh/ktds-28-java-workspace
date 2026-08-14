package com.ktdsuniversity.edu.oop.homework.august_vacation.hw2;

import java.time.LocalTime;
import java.util.List;

public class Station {

  String name;
  List<Broadcast> broadcasts;

  public Station(String name, List<Broadcast> broadcasts) {
    this.name = name;
    this.broadcasts = broadcasts;
  }

  public void printNowOnAir(LocalTime time) {
    Broadcast nowOnAir = this.broadcasts.stream() // Stream<Broadcast>
        .filter(b -> b.isOnAir(time)) // Stream<Broadcast>
        .findFirst() // Optional<Broadcast>
        .orElse(null); // Broadcast

    if (nowOnAir == null) {
      System.out.println(this.name + "\t방영중인 시간이 아닙니다.");
    } else {
      System.out.println(this.name + "\t\"" + nowOnAir.getName() + "\" 이(가) 방영중입니다.");
    }
  }


}
