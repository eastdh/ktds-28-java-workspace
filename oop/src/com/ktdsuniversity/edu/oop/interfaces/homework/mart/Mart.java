package com.ktdsuniversity.edu.oop.interfaces.homework.mart;

import com.ktdsuniversity.edu.oop.interfaces.homework.mart.customers.Customer;
import com.ktdsuniversity.edu.oop.interfaces.homework.mart.goods.Item;

public class Mart {

  private Item[] storageItems;

  /**
   * @param storageItems
   */
  public Mart(Item[] storageItems) {
    this.storageItems = storageItems;
  }

  public Item[] getStorageItems() {
    return storageItems;
  }


  public void sellItemsInCart(Customer customer) {



  }
}
