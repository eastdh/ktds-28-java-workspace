package com.ktdsuniversity.edu.oop.collection.list.mart;

import java.util.List;
import com.ktdsuniversity.edu.oop.interfaces.homework.mart.goods.Item;

public interface Customer {

  String getName();

  int getAge();

  int getCash();

  List<Item> getCartItems();

  void addToCart(Item item);

  void buyItem(Item item);
}
