package com.ktdsuniversity.edu.oop.collection.list.cafe;

import java.util.ArrayList;
import java.util.List;
import com.ktdsuniversity.edu.oop.cafe.ComicBook;

public class ComicBookCafe {

  private List<ComicBook> comicBooks;
  private int cash = 0;

  /**
   * @param comicBooks
   */
  public ComicBookCafe() {
    this.comicBooks = new ArrayList<>();
  }

  public List<ComicBook> getComicBooks() {
    return comicBooks;
  }

  public void addBook(ComicBook book) {
    this.comicBooks.add(book);
  }

  public int getCash() {
    return cash;
  }

  public void printAllBooks() {
    System.out.println("===== 만화책 목록 =====");
    for (int i = 0; i < comicBooks.size(); i++) {
      System.out.println(comicBooks.get(i).toString());
    }
  }

  public boolean canBorrow(ComicBook book) {
    if (book.isBorrowed()) {
      System.out.println(book.getTitle() + " 이미 대여됨.");
    }
    return !book.isBorrowed();
  }

  public void borrowBook(ComicBook book) {
    if (!book.isBorrowed()) {
      book.setBorrowed(true);
      this.cash += book.getRentalFee();
      System.out.println(book.getTitle() + " 빌려줌 - 총 매출액: " + this.cash);

    }
  }

  public void returnBook(ComicBook book) {
    if (book.isBorrowed()) {
      book.setBorrowed(false);
      System.out.println(book.getTitle() + " 이용자로부터 돌려받음");
    }
  }



}
