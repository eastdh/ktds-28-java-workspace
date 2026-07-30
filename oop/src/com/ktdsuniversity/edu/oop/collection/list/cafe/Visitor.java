package com.ktdsuniversity.edu.oop.collection.list.cafe;

import java.util.ArrayList;
import java.util.List;
import com.ktdsuniversity.edu.oop.cafe.ComicBook;

public class Visitor {

  private int visitorId;
  private int cash;
  private List<ComicBook> borrowedBooks;

  /**
   * @param visitorId
   * @param cash
   */
  public Visitor(int visitorId, int cash) {
    this.visitorId = visitorId;
    this.cash = cash;
    borrowedBooks = new ArrayList<>();
  }

  public int getVisitorId() {
    return this.visitorId;
  }

  public int getCash() {
    return this.cash;
  }

  public List<ComicBook> getBorrowedBooks() {
    return this.borrowedBooks;
  }

  public void printBorrowedBooks() {
    for (int j = 0; j < this.borrowedBooks.size(); j++) {
      System.out.print(this.borrowedBooks.get(j).getTitle() + " ");
    }
    System.out.println();
  }

  public void addBorrowedArray(ComicBook book) {
    this.borrowedBooks.add(book);
  }

  public boolean canBorrow(ComicBook book) {
    if (this.cash < book.getRentalFee()) {
      System.out.println(this.visitorId + " 돈 부족");
    }
    return (this.cash >= book.getRentalFee());
  }

  public void borrowBook(ComicBook book) {
    this.cash -= book.getRentalFee();
    addBorrowedArray(book);
    System.out
        .print(this.visitorId + ", " + book.getTitle() + "빌림 - 소지금: " + this.cash + " 대여 목록: ");
  }

  public void returnBook(ComicBook book) {

    this.borrowedBooks.remove(book);
    System.out.println(book.getTitle() + " 반납함.");

  }

  @Override
  public String toString() {
    return "Visitor [visitorId=" + visitorId + ", cash=" + cash + ", borrowedBooks=" + borrowedBooks
        + "]";
  }



}
