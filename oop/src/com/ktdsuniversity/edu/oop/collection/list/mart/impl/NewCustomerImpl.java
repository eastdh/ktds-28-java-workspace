package com.ktdsuniversity.edu.oop.collection.list.mart.impl;

import com.ktdsuniversity.edu.oop.collection.list.mart.NewCustomer;

public class NewCustomerImpl extends CustomerImpl implements NewCustomer {

  @Override
  public int discount(float discountRatio, int amount) {
    System.out.println("결제 금액: " + amount);
    return (int) (amount * discountRatio);
  }

}
