package com.ktdsuniversity.edu.oop.homework.market;

public class Market {

  public static void main(String[] args) {

    final int PERSON = 10;

    Seller[] sellers = new Seller[PERSON];
    for (int i = 0; i < sellers.length; i++) {
      int stock = (int) (Math.random() * 10) + 5;
      int price = (int) (Math.random() * 10 + 1) * 1000;
      sellers[i] = new Seller(i, stock, price);
    }

    Buyer[] buyers = new Buyer[PERSON];
    for (int i = 0; i < buyers.length; i++) {
      int cash = (int) (Math.random() * 10 + 1) * 10000;
      buyers[i] = new Buyer(i, cash);
    }

    for (int i = 0; i < 10; i++) {
      int sellerIndex = (int) (Math.random() * PERSON);
      int buyerIndex = (int) (Math.random() * PERSON);

      Seller s = sellers[sellerIndex];
      Buyer b = buyers[buyerIndex];

      int order = (int) (Math.random() * 10) + 1;

      if (s.canSell() && b.canBuy(s.price, order)) {
        b.buy(s.price, s.sell(order));
      }
      System.out.println();
    }

  }
}
