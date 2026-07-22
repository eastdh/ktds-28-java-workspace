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
    }
  }

  public void returnBook(ComicBook book) {
    if (book.isBorrowed()) {
      book.setBorrowed(false);
    }
  }



}
