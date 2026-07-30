package com.ktdsuniversity.edu.oop.collection.list.mart.impl;

import java.util.List;
import com.ktdsuniversity.edu.oop.collection.list.mart.MemberCustomer;
import com.ktdsuniversity.edu.oop.interfaces.homework.mart.goods.Item;
import com.ktdsuniversity.edu.oop.interfaces.homework.mart.goods.Liquor;

public class MemberCustomerImpl extends CustomerImpl implements MemberCustomer {

  @Override
  public int gift(List<Item> items, int amount) {
    int giftPrice = Integer.MAX_VALUE;

    Item item = null;
    for (int i = 0; i < items.size(); i++) {
      item = items.get(i);

      if (item instanceof Liquor alcohol) {
        if (alcohol.getAgeRestriction() <= super.getAge()) {
          if (giftPrice > item.getPrice()) {
            giftPrice = item.getPrice();
          }
        }
      } else {
        if (giftPrice > item.getPrice()) {
          giftPrice = item.getPrice();
        }
      }
    }

    System.out.println("서비스 제공 상품 가격: " + giftPrice);
    return amount - giftPrice;
  }

}
