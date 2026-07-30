package com.ktdsuniversity.edu.oop.interfaces.homework.mart.customers;

import com.ktdsuniversity.edu.oop.interfaces.homework.mart.goods.Item;

public interface MemberCustomer extends Customer {

  int gift(Item[] items, int amount);

}
