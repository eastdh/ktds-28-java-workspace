package com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.service;

import com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.entity.User;

public interface UserService {

  void register();

  User login();

  void searchBook();

  void borrowBook();

  void returnBook();
}
