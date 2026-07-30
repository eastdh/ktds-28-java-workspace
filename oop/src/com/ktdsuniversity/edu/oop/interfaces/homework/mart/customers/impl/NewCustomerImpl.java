package com.ktdsuniversity.edu.oop.interfaces.homework.mart.customers.impl;

import com.ktdsuniversity.edu.oop.interfaces.homework.mart.customers.NewCustomer;

public class NewCustomerImpl extends CustomerImpl implements NewCustomer {

  @Override
  public int discount(float discountRatio, int amount) {
    System.out.println("결제 금액: " + amount);
    return (int) (amount * discountRatio);
  }

}
