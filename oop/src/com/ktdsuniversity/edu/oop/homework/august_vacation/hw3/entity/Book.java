package com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Book {

  private String title;
  private String subtitle;
  private String genre;
  private String publisher;
  private String writer;
  private LocalDate releaseDate;
  private int printing;
  private LocalDate stockDate;
  private int price;
  private String isbn;
  private long managementNumber;
  private int rentalCount;
  private boolean borrowed;
  private LocalDate borrowDate;
  private boolean returned;
  private LocalDate returnDate;
  private long borrowUser;



  public Book(String title, String subtitle, String genre, String publisher, String writer,
      LocalDate releaseDate, int printing, int price, String isbn, long managementNumber) {
    this.title = title;
    this.subtitle = subtitle;
    this.genre = genre;
    this.publisher = publisher;
    this.writer = writer;
    this.releaseDate = releaseDate;
    this.printing = printing;
    this.price = price;
    this.isbn = isbn;
    this.managementNumber = managementNumber;
    this.stockDate = LocalDate.now();
  }



  public Book(String[] tokens) {
    this.title = tokens[0];
    this.subtitle = tokens[1];
    this.genre = tokens[2];
    this.publisher = tokens[3];
    this.writer = tokens[4];
    this.releaseDate = LocalDate.parse(tokens[5]);
    this.printing = Integer.parseInt(tokens[6]);
    this.stockDate = LocalDate.parse(tokens[7]);
    this.price = Integer.parseInt(tokens[8]);
    this.isbn = tokens[9];
    this.managementNumber = Long.parseLong(tokens[10]);
    this.rentalCount = Integer.parseInt(tokens[11]);
    this.borrowed = Boolean.parseBoolean(tokens[12]);
    this.borrowDate = LocalDate.parse(tokens[13]);
    this.returned = Boolean.parseBoolean(tokens[14]);
    this.returnDate = LocalDate.parse(tokens[15]);
    this.borrowUser = Long.parseLong(tokens[16]);
  }



  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getSubtitle() {
    return this.subtitle;
  }

  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }

  public String getGenre() {
    return this.genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String getPublisher() {
    return this.publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public String getWriter() {
    return this.writer;
  }

  public void setWriter(String writer) {
    this.writer = writer;
  }

  public LocalDate getReleaseDate() {
    return this.releaseDate;
  }

  public void setReleaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
  }

  public int getPrinting() {
    return this.printing;
  }

  public void setPrinting(int printing) {
    this.printing = printing;
  }

  public LocalDate getStockDate() {
    return this.stockDate;
  }

  public void setStockDate(LocalDate stockDate) {
    this.stockDate = stockDate;
  }

  public int getPrice() {
    return this.price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getIsbn() {
    return this.isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public long getManagementNumber() {
    return this.managementNumber;
  }

  public void setManagementNumber(long managementNumber) {
    this.managementNumber = managementNumber;
  }

  public int getRentalCount() {
    return this.rentalCount;
  }


  public boolean isBorrowed() {
    return this.borrowed;
  }

  public void setBorrowed() {
    this.borrowed = true;
    this.returned = false;
    this.rentalCount++;
  }

  public LocalDate getBorrowDate() {
    return this.borrowDate;
  }

  public void setBorrowDate(LocalDate borrowDate) {
    this.borrowDate = borrowDate;
  }

  public boolean isReturned() {
    return this.returned;
  }

  public void setReturned() {
    this.borrowed = false;
    this.returned = true;
  }

  public LocalDate getReturnDate() {
    return this.returnDate;
  }

  public void setReturnDate(LocalDate returnDate) {
    this.returnDate = returnDate;
  }

  public long getBorrowUser() {
    return this.borrowUser;
  }

  public void setBorrowUser(long borrowUser) {
    this.borrowUser = borrowUser;
  }

  @Override
  public String toString() {
    return "Book [title=" + this.title + ", subtitle=" + this.subtitle + ", genre=" + this.genre
        + ", publisher=" + this.publisher + ", writer=" + this.writer + ", releaseDate="
        + this.releaseDate + ", printing=" + this.printing + ", stockDate=" + this.stockDate
        + ", price=" + this.price + ", isbn=" + this.isbn + ", managementNumber="
        + this.managementNumber + ", rentalCount=" + this.rentalCount + ", borrowed="
        + this.borrowed + ", borrowDate=" + this.borrowDate + ", returned=" + this.returned
        + ", returnDate=" + this.returnDate + ", borrowUser=" + this.borrowUser + "]";
  }

  @Override
  public int hashCode() {
    return Objects.hash(Long.valueOf(this.managementNumber));
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Book other = (Book) obj;
    return this.managementNumber == other.managementNumber;
  }



}
