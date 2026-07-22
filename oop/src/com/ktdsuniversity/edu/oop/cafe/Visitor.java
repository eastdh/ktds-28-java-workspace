package com.ktdsuniversity.edu.oop.cafe;

public class Visitor {

  private int visitorId;
  private int cash;
  private ComicBook[] borrowedBooks = new ComicBook[5];

  /**
   * @param visitorId
   * @param cash
   */
  public Visitor(int visitorId, int cash) {
    this.visitorId = visitorId;
    this.cash = cash;
  }

  public int getVisitorId() {
    return visitorId;
  }

  public int getCash() {
    return cash;
  }

  public ComicBook[] getBorrowedBooks() {
    return borrowedBooks;
  }

  public void addBorrowedArray(ComicBook book) {
    for (int i = 0; i < this.borrowedBooks.length; i++) {
      if (this.borrowedBooks[i] == null) {
        this.borrowedBooks[i] = book;
        return;
      }
    }
  }

  public boolean canBorrow(ComicBook book) {
    boolean isArrayEmpty = false;
    for (int i = 0; i < this.borrowedBooks.length; i++) {
      if (this.borrowedBooks[i] == null) {
        isArrayEmpty = true;
        break;
      }
    }
    if (!isArrayEmpty) {
      System.out.println(this.visitorId + " 더 이상 대여 못 함");
    }
    if (this.cash < book.getRentalFee()) {
      System.out.println(this.visitorId + " 돈 부족");
    }
    return (this.cash >= book.getRentalFee()) && isArrayEmpty;
  }

  public void borrowBook(ComicBook book) {
    this.cash -= book.getRentalFee();
    addBorrowedArray(book);
  }

}
