package com.ktdsuniversity.edu.oop.interfaces.homework.mart.customers;

import com.ktdsuniversity.edu.oop.interfaces.homework.mart.goods.Item;

public interface Customer {

  String getName();

  int getAge();

  int getCash();

  Item[] getCartItems();

  void addToCart(Item item);

  void buyItem(Item item);
}
