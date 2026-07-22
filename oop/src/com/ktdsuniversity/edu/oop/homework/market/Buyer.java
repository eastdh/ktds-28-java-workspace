package com.ktdsuniversity.edu.oop.homework.market;

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

  public boolean canBuy(int price, int number) {
    if (price * number > cash) {
      System.out.println(buyerId + ", 잔액 없음");
      return false;
    } else {
      return true;
    }
  }

  public void buy(int price, int number) {
    cart += number;
    cash -= price * number;
    System.out
        .println(buyerId + ", " + price + "원 " + number + "개 구매. 잔액: " + cash + " 장바구니: " + cart);
  }
}
