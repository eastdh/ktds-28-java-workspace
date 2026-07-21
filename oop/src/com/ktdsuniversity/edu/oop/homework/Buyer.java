package com.ktdsuniversity.edu.oop.homework;

public class Buyer {

  int buyerId;
  int cash;
  int cart;

  /**
   * @param buyerId;
   * @param cash
   */
  public Buyer(int buyerId, int cash) {
    this.buyerId = buyerId;
    this.cash = cash;
  }

  public void buy(int price, int number) {
    if (price * number > cash) {
      return;
    }
    cart += number;
    cash -= price * number;
    System.out.println(buyerId + ", " + price + "원 " + number + "개 구매. 잔액: " + cash);
  }
}
