package com.ktdsuniversity.edu.oop.homework.lotto;

public class HW2 {
  public static void main(String[] args) {
    int[] lottoNumbers = new int[6];
    int index = 0;
    boolean isExist = false;
    while (index < 6) {
      isExist = false;
      int random = (int) (Math.random() * 45) + 1;
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
    System.out.println(lottoNumbers);
  }
}
