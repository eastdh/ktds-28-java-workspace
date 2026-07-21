package com.ktdsuniversity.edu.oop.homework;

public class Market {

  public static void main(String[] args) {

    Seller sellerA = new Seller(0, 5, 1000);
    Seller sellerB = new Seller(1, 6, 2000);
    Seller sellerC = new Seller(2, 7, 3000);
    Seller sellerD = new Seller(3, 8, 4000);
    Seller[] sellers = {sellerA, sellerB, sellerC, sellerD};

    Buyer buyerA = new Buyer(0, 10000);
    Buyer buyerB = new Buyer(1, 20000);
    Buyer buyerC = new Buyer(2, 30000);
    Buyer buyerD = new Buyer(3, 40000);
    Buyer[] buyers = {buyerA, buyerB, buyerC, buyerD};


    for (int i = 0; i < 10; i++) {
      int sellerIndex = (int) (Math.random() * 4);
      int buyerIndex = (int) (Math.random() * 4);

      buyers[buyerIndex].buy(sellers[sellerIndex].price, sellers[sellerIndex].sell(i));
    }

  }
}
