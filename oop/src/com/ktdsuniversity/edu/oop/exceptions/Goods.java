package com.ktdsuniversity.edu.oop.exceptions;

public class Goods {
  private String name;
  private int price;

  public Goods(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return this.name;
  }

  public int getPrice() {
    return this.price;
  }

  @Override
  public String toString() {
    return "Goods [name=" + name + ", price=" + price + "]";
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Goods otherGoods) {
      return this.name.equals(otherGoods.name) && this.price == otherGoods.price;
    }
    return false;
  }


}
