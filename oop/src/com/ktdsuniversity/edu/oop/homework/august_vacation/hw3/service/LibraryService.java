package com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.service;

import com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.dto.UserDto;
import com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.entity.Book;
import com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.entity.User;

public interface LibraryService {

  void inbound();

  void discard();

  void getNotReturned();

  void getBookRanking();

  void getLateCountRanking();

  void borrowAction(UserDto userDto, Book book);

  void returnAction(UserDto userDto, Book book);

  void addNewMember(String name, String phoneNumber);

  User memberLogin(String name, String phoneNumber);

}
