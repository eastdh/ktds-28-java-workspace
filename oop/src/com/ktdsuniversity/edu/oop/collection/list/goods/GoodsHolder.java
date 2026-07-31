package com.ktdsuniversity.edu.oop.collection.list.goods;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import com.ktdsuniversity.edu.oop.exceptions.Goods;

public class GoodsHolder {

  private List<Goods> goods;

  public GoodsHolder() {
    this.goods = new ArrayList<>();
    this.loadGoods();
  }

  private void loadGoods() {
    File database = new File("C:/Java Exam", "goods.txt");

    if (database.exists() && database.isFile()) {
      List<String> goodsList = null;
      try {
        goodsList = Files.readAllLines(database.toPath());
      } catch (IOException ioe) {
        ioe.printStackTrace();
      }

      if (goodsList != null) {
        String[] goodsInfo = null;
        for (int i = 0; i < goodsList.size(); i++) {
          goodsInfo = goodsList.get(i).split(", ");
          this.addGoods(goodsInfo[0], goodsInfo[1]);
        }
      }

    }
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

    this.goods.add(new Goods(name, price));
  }

  public void addGoods(String name, int price, boolean addToFile) {
    addGoods(name, price);
    if (addToFile) {
      File database = new File("C:/Java Exam", "goods.txt");

      if (database.getParentFile().exists()) {
        database.getParentFile().mkdirs();
      }

      List<String> data = new ArrayList<String>();
      data.add("%s, %d".formatted(name, price));

      try {
        Files.write(database.toPath(), data, StandardOpenOption.APPEND);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

  }

  public void removeGoods(int goodsIndex) {
    if (goodsIndex >= 0 && goodsIndex < this.goods.size()) {
      this.goods.remove(goodsIndex);
    }
  }

  public void printGoodsAt(int index) {
    if (index >= 0 && index < this.goods.size()) {
      Goods goods = this.goods.get(index);
      if (goods != null) {
        String message = "%d. %s(%d)".formatted(index + 1, goods.getName(), goods.getPrice());
        System.out.println(message);
      }
    }
  }

  public void printGoods() {
    for (int i = 0; i < this.goods.size(); i++) {
      this.printGoodsAt(i);
    }
  }

}
