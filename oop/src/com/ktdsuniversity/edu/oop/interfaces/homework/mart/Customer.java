package com.ktdsuniversity.edu.oop.interfaces.homework.mart;

public interface Customer {

  String getName();

  int getAge();

  int getCash();

  Item[] getCartItems();

  void addToCart(Item item);

  void buyItem(Item item);
}
