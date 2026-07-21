package com.ktdsuniversity.edu.oop.vendingmachine;

/**
 * 자판기
 * 음료가 들어있는 자판기에 돈을 넣고 음료의 번호를 입력하면 음료가 추출된다.
 * 거스름돈이 남았을 경우 사용자에게 돌려준다.
 */
public class VendingMachine {

  ItemHolder holder;

  /**
   * @param holder
   */
  public VendingMachine(ItemHolder holder) {
    this.holder = holder;
  }

  // 자판기에 새로운 라면을 추가한다.
  public void addNewItem(int index, Item newItem) {
    this.holder.items[index] = newItem;
  }

  public static void main(String[] args) {

    Item ramen = new Item("1", "라면", 1000, 5);
    Item snack = new Item("2", "과자", 2000, 7);
    Item coke = new Item("3", "콜라", 3000, 10);
    Item beer = new Item("4", "맥주", 4000, 20);
    Item[] items = {ramen, snack, coke, beer};
    Item[] newItems = new Item[10];
    newItems[0] = ramen;
    newItems[1] = snack;
    newItems[2] = coke;
    newItems[3] = beer;

    ItemHolder itemHolder = new ItemHolder(newItems);
    VendingMachine machine = new VendingMachine(itemHolder);
    machine.addNewItem(3, new Item("5", "치킨", 6000, 30));

    VendingMachine machine2 = new VendingMachine(itemHolder);
    // 동일한 ItemHolder
    machine2.addNewItem(4, new Item("6", "피자", 7000, 4));
    // 여기서 this의 id는? ==> machine2의 id

    System.out.println(machine);
    System.out.println(machine2);
  }
}
