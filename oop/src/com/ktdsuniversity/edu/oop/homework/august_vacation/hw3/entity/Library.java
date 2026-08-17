package com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.entity;

import java.util.ArrayList;
import java.util.List;
import com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.dto.UserDto;
import com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.utils.FileUtils;

public class Library {

  private List<Book> bookList;
  private List<User> userList;
  private List<UserDto> userDtoList;
  private List<Rental> rentalList;


  public Library() {

    this.bookList = FileUtils.parseCsv(Book.class, Book::new);
    this.userList = FileUtils.parseCsv(User.class, User::new);
    this.rentalList = FileUtils.parseCsv(Rental.class, Rental::new);
    this.userDtoList = new ArrayList<>();

    this.userList.stream() // Stream<User>
        .map(u -> new UserDto(u, this)) // Stream<UserDto>
        .forEach(ud -> this.userDtoList.add(ud));

  }


  public List<Book> getBookList() {
    return this.bookList;
  }


  public void setBookList(List<Book> bookList) {
    this.bookList = bookList;
  }

  public List<User> getUserList() {
    return this.userList;
  }


  public void setUserList(List<User> userList) {
    this.userList = userList;
  }


  public List<UserDto> getUserDtoList() {
    return this.userDtoList;
  }


  public void setUserDtoList(List<UserDto> userDtoList) {
    this.userDtoList = userDtoList;
  }


  public List<Rental> getRentalList() {
    return this.rentalList;
  }


  public void setRentalList(List<Rental> rentalList) {
    this.rentalList = rentalList;
  }



}
