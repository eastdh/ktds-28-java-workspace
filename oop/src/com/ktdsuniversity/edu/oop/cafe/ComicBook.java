package com.ktdsuniversity.edu.oop.cafe;

public class ComicBook {

  private String title;
  private boolean isBorrowed = false;
  private int rentalFee;

  /**
   * @param title
   * @param rentalFee
   */
  public ComicBook(String title, int rentalFee) {
    this.title = title;
    this.rentalFee = rentalFee;
  }

  public String getTitle() {
    return title;
  }

  @Override
  public String toString() {
    return "ComicBook [title=" + title + ", isBorrowed=" + isBorrowed + ", rentalFee=" + rentalFee
        + "]";
  }

  public boolean isBorrowed() {
    return isBorrowed;
  }

  public void setBorrowed(boolean isBorrowed) {
    this.isBorrowed = isBorrowed;

  }

  public int getRentalFee() {
    return rentalFee;
  }

}
