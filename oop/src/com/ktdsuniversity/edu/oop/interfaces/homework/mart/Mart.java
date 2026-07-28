package com.ktdsuniversity.edu.oop.interfaces.homework.mart;

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
