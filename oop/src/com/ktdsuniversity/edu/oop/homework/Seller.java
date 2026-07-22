package com.ktdsuniversity.edu.oop.homework;

public class Seller {

  int sellerId;
  int stock;
  int price;
  int cash;

  /**
   * @param sellerId
   * @param stock
   * @param price
   */
  public Seller(int sellerId, int stock, int price) {
    this.sellerId = sellerId;
    this.stock = stock;
    this.price = price;
  }

  public boolean canSell() {
    if (stock <= 0) {
      System.out.println(sellerId + ", 재고 없음");
      return false;
    } else {
      return true;
    }
  }

  public int sell(int number) {
    if (number > stock) {
      number = stock;
    }

    stock -= number;
    cash += price * number;
    System.out.println(sellerId + ", " + price + "원 " + number + "개 판매. 매출: " + cash);
    return number;
  }


}
