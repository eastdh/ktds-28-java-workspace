package com.ktdsuniversity.edu.oop.exam;

public class CraneGameMachine {

  boolean isCoinInserted;
  int dolls;

  /**
   * 인형 뽑기 기계에 코인을 넣는다. 인형이 1개 이상 있을 때만 동전이 들어간다.
   */
  public void insertCoin() {
    isCoinInserted = dolls > 0;
  }

  /**
   * 인형 뽑기 게임을 한다.
   * 
   * @return 인형을 뽑으면 1, 못 뽑으면 0
   */
  public int doGame() {
    if (!isCoinInserted) {
      return 0;
    }

    // 인형을 뽑으면 1, 못 뽑으면 0
    int isDollOut = (int) (Math.random() * 2);
    dolls -= isDollOut;
    isCoinInserted = false;
    return isDollOut;
  }

  public static void main(String[] args) {

    CraneGameMachine machine = new CraneGameMachine();

    machine.dolls = 5;
    while (machine.dolls > 0) {
      machine.insertCoin();
      System.out.println(machine.doGame());

    }
  }
}
