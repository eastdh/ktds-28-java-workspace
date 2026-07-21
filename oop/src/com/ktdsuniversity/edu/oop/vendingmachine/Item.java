package com.ktdsuniversity.edu.oop.vendingmachine;

/**
 * 자판기에 들어가는 상품
 */
public class Item {

  /**
   * 상품 번호
   */
  String id;

  /**
   * 상품 이름
   */
  String name;

  /**
   * 상품 가격
   */
  int price;

  /**
   * 상품 재고
   */
  int stock;

  /**
   * @param id
   * @param name
   * @param price
   * @param stock
   */
  public Item(String id, String name, int price, int stock) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.stock = stock;
  }


}
