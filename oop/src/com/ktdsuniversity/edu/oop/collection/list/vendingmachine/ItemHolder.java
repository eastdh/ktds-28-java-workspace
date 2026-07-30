package com.ktdsuniversity.edu.oop.collection.list.vendingmachine;

import java.util.List;
import com.ktdsuniversity.edu.oop.vendingmachine.Item;

/**
 * 자판기에 상품을 고정시키기 위한 홀더
 */
public class ItemHolder {

  List<Item> items;

  /**
   * @param items
   */
  public ItemHolder(List<Item> items) {
    this.items = items;
  }


}
