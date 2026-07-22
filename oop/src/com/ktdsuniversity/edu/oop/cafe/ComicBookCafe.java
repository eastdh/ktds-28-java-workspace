package com.ktdsuniversity.edu.oop.cafe;

public class ComicBookCafe {

  private ComicBook[] comicBooks;
  private int cash = 0;

  /**
   * @param comicBooks
   */
  public ComicBookCafe(ComicBook[] comicBooks) {
    this.comicBooks = comicBooks;
  }

  public ComicBook[] getComicBooks() {
    return comicBooks;
  }

  public void setComicBooks(ComicBook[] comicBooks) {
    this.comicBooks = comicBooks;
  }

  public int getCash() {
    return cash;
  }

  public void printAllBooks() {
    for (int i = 0; i < comicBooks.length; i++) {
      System.out.println(comicBooks[i].toString());
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
