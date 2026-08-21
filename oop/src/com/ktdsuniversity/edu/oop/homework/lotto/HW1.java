package com.ktdsuniversity.edu.oop.homework.lotto;

import java.util.ArrayList;
import java.util.List;

public class HW1 {
  public static void main(String[] args) {
    List<Integer> lottos = new ArrayList<>();
    while (lottos.size() < 6) {
      int random = (int) (Math.random() * 45) + 1;
      if (lottos.indexOf(random) == -1) {
        lottos.add(random);
      }
    }
    System.out.println(lottos);

  }
}
