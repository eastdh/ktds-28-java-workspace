package com.ktdsuniversity.edu.oop.homework.lotto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HW3 {
  static Scanner sc = new Scanner(System.in);

  public static int scanInt(String message) {
    while (true) {
      try {
        System.out.print(message);
        return Integer.parseInt(sc.nextLine());
      } catch (NumberFormatException nfe) {
        System.out.println("숫자만 입력하세요.");
      }
    }
  }

  public static void main(String[] args) {

    Map<Integer, List<Integer>> lottoGames = new HashMap<>();


    int times = scanInt("로또 진행 회차를 입력하세요: ");
    for (int i = 0; i < times; i++) {
      List<Integer> lottoNumbers = new ArrayList<>();
      while (lottoNumbers.size() < 6) {
        int random = (int) (Math.random() * 45) + 1;
        if (!lottoNumbers.contains(random)) {
          lottoNumbers.add(random);
        }
      }
      lottoGames.put(i, lottoNumbers);
    }

    for (int k = 0; k < lottoGames.size(); k++) {
      System.out.print(k + 1 + "회차 => ");
      System.out.println(lottoGames.get(k));
    }

  }
}
