package com.ktdsuniversity.edu.oop.collection.list.mart;

import java.util.List;
import com.ktdsuniversity.edu.oop.interfaces.homework.mart.goods.Item;

public interface MemberCustomer extends Customer {

  int gift(List<Item> items, int amount);

}
