package com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.dto;

import java.util.ArrayList;
import java.util.List;
import com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.entity.Book;
import com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.entity.Library;
import com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.entity.Rental;
import com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.entity.User;

public class UserDto {

  private User user;
  private List<Book> borrowedBooks;

  public UserDto(User user) {
    this.user = user;
  }

  public UserDto(User user, Library library) {
    this.user = user;
    this.borrowedBooks = new ArrayList<>();

    for (Rental r : library.getRentalList()) {
      if (r.getUserId() == this.user.getUserId()) {
        Book borrowed = library.getBookList().stream() // Stream<Book>
            .filter(b -> r.getBookManagementNumber() == b.getManagementNumber()) // Stream<Book>
            .findFirst() // Optional<Book>
            .orElse(null); // Book
        this.borrowedBooks.add(borrowed);
      }
    }

  }

  public User getUser() {
    return this.user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public List<Book> getBorrowedBooks() {
    return this.borrowedBooks;
  }

  public void setBorrowedBooks(List<Book> borrowedBooks) {
    this.borrowedBooks = borrowedBooks;
  }

  public void addBorrowedBooks(Book book) {
    this.borrowedBooks.add(book);
  }

  public void returnBorrowedBook(Book book) {
    this.borrowedBooks.remove(book);
  }



}
