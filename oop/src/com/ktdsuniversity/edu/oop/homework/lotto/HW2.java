package com.ktdsuniversity.edu.oop.homework.lotto;

public class HW2 {
  public static void main(String[] args) {
    int[] lottoNumbers = new int[6];
    boolean isExist = false;
    int index = 0;
    int random = 0;

    while (index < 6) {
      isExist = false;
      random = (int) (Math.random() * 45) + 1;
      for (int l : lottoNumbers) {
        if (l == random) {
          isExist = true;
          break;
        }
      }
      if (!isExist) {
        lottoNumbers[index++] = random;
      }
    }

    System.out.print("[");
    for (int i = 0; i < lottoNumbers.length; i++) {
      System.out.print(lottoNumbers[i]);
      if (i < lottoNumbers.length - 1) {
        System.out.print(", ");
      }
    }
    System.out.print("]");
  }
}
