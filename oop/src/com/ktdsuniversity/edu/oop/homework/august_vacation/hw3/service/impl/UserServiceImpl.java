package com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.service.impl;

import com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.dto.UserDto;
import com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.entity.Book;
import com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.entity.Library;
import com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.entity.User;
import com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.service.LibraryService;
import com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.service.UserService;
import com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.utils.ScannerUtils;

public class UserServiceImpl implements UserService {

  private UserDto userDto;
  private Library library;
  private LibraryService libraryService;

  public UserServiceImpl(Library library, User user) {
    this.library = library;
    this.libraryService = new LibraryServiceImpl(library);
    this.userDto = library.getUserDtoList().stream() // Stream<UserDto>
        .filter(ud -> user.equals(ud.getUser())) // Stream<UserDto>
        .findFirst() // Optional<UserDto>
        .orElse(null);

  }


  @Override
  public void register() {
    String name = ScannerUtils.scanString("이름을 입력하세요: ");
    String phoneNumber = ScannerUtils.scanPhone("전화번호를 입력하세요: ");
    this.libraryService.addNewMember(name, phoneNumber);

  }

  @Override
  public User login() {
    String name = ScannerUtils.scanString("이름을 입력하세요: ");
    String phoneNumber = ScannerUtils.scanPhone("전화번호를 입력하세요: ");
    User user = this.libraryService.memberLogin(name, phoneNumber);
    if (user == null) {
      System.out.println("가입되지 않은 유저입니다.");
    }
    return user;

  }


  @Override
  public void searchBook() {
    this.library.getBookList().stream() // Stream<Book>
        .filter(b -> isThisTheBook(b)) // Stream<Book>
        .forEach(b -> System.out.printf("관리 번호: %d\t%s (%s) 저자: %s 출판사: %s\t대여 중: %B 반납 완료: %B\n",
            b.getManagementNumber(), b.getTitle(), b.getGenre(), b.getWriter(), b.getPublisher(),
            b.isBorrowed(), b.isReturned()));

  }

  private boolean isThisTheBook(Book book) {
    String keyword = ScannerUtils.scanString("검색할 키워드를 입력하세요: ");
    return book.getTitle().contains(keyword) || book.getPublisher().contains(keyword)
        || book.getWriter().contains(keyword) || book.getGenre().contains(keyword);
  }

  @Override
  public void borrowBook() {
    long bookNumber = ScannerUtils.scanLong("빌릴 책의 관리 번호를 입력하세요: ");

    Book book = this.library.getBookList().stream() // Stream<book>
        .filter(b -> b.getManagementNumber() == bookNumber) // Stream<book>
        .findFirst() // Optional<Book>
        .orElse(null); // Book

    if (book == null) {
      System.out.println("책이 존재하지 않습니다.");
    } else if (book.isBorrowed() && !book.isReturned()) {
      System.out.println("책이 대여중입니다. ");
    } else {
      this.libraryService.borrowAction(this.userDto, book);
    }

  }


  @Override
  public void returnBook() {
    long bookNumber = ScannerUtils.scanLong("반납할 책의 관리 번호를 입력하세요: ");
    Book book = this.library.getBookList().stream() // Stream<book>
        .filter(b -> b.getManagementNumber() == bookNumber) // Stream<book>
        .findFirst() // Optional<Book>
        .orElse(null); // Book
    if (book == null) {
      System.out.println("책이 존재하지 않습니다.");
    } else {
      this.libraryService.returnAction(this.userDto, book);
    }
  }


}
