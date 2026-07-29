package com.ktdsuniversity.edu.oop.exceptions;

public class GoodsMain {

  public static void main(String[] args) {
    GoodsHolder capsuleHolder = null;
    while (capsuleHolder == null) {
      int randomCount = (int) (Math.random() * 1000) - 700;
      try {
        capsuleHolder = new GoodsHolder(randomCount);
      } catch (HolderInitiateException hie) {
        System.out.println(hie.getMessage());
      }
    }
    // GoodsHolder capsuleHolder = new GoodsHolder(-1);
    capsuleHolder.addGoods("네스프레소", null);
    capsuleHolder.addGoods(null, " ");
    capsuleHolder.addGoods("", "3000000000");
    capsuleHolder.addGoods("      ", "8_000");
    capsuleHolder.addGoods("일리 에스프레소", "7_900");
    capsuleHolder.addGoods("카누 에스프레소", "8_900");

    capsuleHolder.printGoods();

    capsuleHolder.printGoodsAt(-1);
    capsuleHolder.printGoodsAt(0);
    capsuleHolder.printGoodsAt(1);
    capsuleHolder.printGoodsAt(2);
    capsuleHolder.printGoodsAt(3);
    capsuleHolder.printGoodsAt(99);

    capsuleHolder.removeGoods(0);
    capsuleHolder.removeGoods(1);
    capsuleHolder.removeGoods(2);
    capsuleHolder.removeGoods(3);
    capsuleHolder.removeGoods(-1);
    capsuleHolder.removeGoods(99);

    capsuleHolder.printGoods();

    System.out.println("작동 종료");
  }

}
