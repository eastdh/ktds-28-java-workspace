package com.ktdsuniversity.edu.oop.collection.list.mart.impl;

import java.util.List;
import com.ktdsuniversity.edu.oop.collection.list.mart.Customer;
import com.ktdsuniversity.edu.oop.interfaces.homework.mart.goods.Item;

public class CustomerImpl implements Customer {

  private String customerName;
  private int customerAge;
  private int customerCash;
  private List<Item> customerCart;

  @Override
  public String getName() {
    return this.customerName;
  }

  @Override
  public int getAge() {
    return this.customerAge;
  }

  @Override
  public int getCash() {
    return this.customerCash;
  }

  @Override
  public List<Item> getCartItems() {
    return this.customerCart;
  }

  /**
   * 카트의 빈 자리를 찾아 물건을 넣고 종료
   */
  @Override
  public void addToCart(Item item) {
    this.customerCart.add(item);
  }

  @Override
  public void buyItem(Item item) {
    if (this.customerCash < item.getPrice()) {
      System.out.println("잔액이 부족합니다. " + item.getName() + " 상품 가격: " + item.getPrice() + ", 잔액: "
          + this.customerCash);
      return;
    }

    this.customerCash -= item.getPrice();
    System.out.println(
        "구매: " + item.getName() + " 가격: " + item.getPrice() + ", 잔액: " + this.customerCash);


  }


}
