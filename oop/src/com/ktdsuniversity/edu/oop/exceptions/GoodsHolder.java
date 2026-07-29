package com.ktdsuniversity.edu.oop.exceptions;

public class GoodsHolder {

  private Goods[] goods;
  private int goodsIndex;

  public GoodsHolder(int goodsCount) {
    if (goodsCount <= 0) {
      throw new HolderInitiateException("잘못된 인덱스의 개수입니다. 0보다 큰 값을 입력하세요.");
    }
    this.goods = new Goods[goodsCount];
  }

  public void addGoods(String name, String price) {
    if (price == null) {
      return;
    }

    int intPrice = 0;
    try {
      intPrice = Integer.parseInt(price);
    } catch (NumberFormatException nfe) {
      System.out.println("숫자 변환 실패: " + nfe.getMessage());
    }
    this.addGoods(name, intPrice);

  }

  public void addGoods(String name, int price) {
    if (name == null || name.isBlank()) {
      return;
    }
    if (this.goodsIndex < this.goods.length) {
      this.goods[this.goodsIndex++] = new Goods(name, price);
    }
  }

  public void removeGoods(int goodsIndex) {
    if (goodsIndex >= 0 && goodsIndex < this.goods.length) {
      this.goods[goodsIndex] = null;
    }
  }

  public void printGoodsAt(int index) {
    if (index >= 0 && index < this.goods.length) {
      Goods goods = this.goods[index];
      if (goods != null) {
        String message = "%d. %s(%d)".formatted(index + 1, goods.getName(), goods.getPrice());
        System.out.println(message);
      }
    }
  }

  public void printGoods() {
    for (int i = 0; i < this.goods.length; i++) {
      this.printGoodsAt(i);
    }
  }

}
