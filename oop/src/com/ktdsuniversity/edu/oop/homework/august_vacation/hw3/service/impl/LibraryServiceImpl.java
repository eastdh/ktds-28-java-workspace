package com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.service.impl;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.dto.UserDto;
import com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.entity.Book;
import com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.entity.Library;
import com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.entity.Rental;
import com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.entity.User;
import com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.service.LibraryService;
import com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.utils.FileUtils;
import com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.utils.ScannerUtils;

public class LibraryServiceImpl implements LibraryService {

  private Library library;
  private long userId;
  private long managementNumber;

  public LibraryServiceImpl(Library library) {

    this.library = library;

    this.userId = this.library.getUserList().stream() // Stream<User>
        .mapToLong(User::getUserId) // LongStream
        .max().orElse(-1);
    this.managementNumber = this.library.getBookList().stream() // Stream<Book>
        .mapToLong(Book::getManagementNumber) // LongStream
        .max().orElse(-1);

  }

  @Override
  public void inbound() {
    Book newBook = inputNewBook();
    FileUtils.createRow(this.library.getBookList(), newBook);
  }

  private Book inputNewBook() {
    String title = ScannerUtils.scanString("제목을 입력하세요: ");
    String subtitle = ScannerUtils.scanString("부제목을 입력하세요: ");
    String genre = ScannerUtils.scanString("장르를 입력하세요: ");
    String publisher = ScannerUtils.scanString("출판사명을 입력하세요: ");
    String writer = ScannerUtils.scanString("작가명을 입력하세요: ");
    LocalDate releaseDate = ScannerUtils.scanDate("출판일을 입력하세요: ");
    int printing = ScannerUtils.scanInt("인쇄 회차를 입력하세요: ");
    int price = ScannerUtils.scanInt("가격을 입력하세요: ");
    String isbn = ScannerUtils.scanString("ISBN을 입력하세요: ");

    return new Book(title, subtitle, genre, publisher, writer, releaseDate, printing, price, isbn,
        ++this.managementNumber);
  }

  @Override
  public void discard() {
    this.library.setBookList(this.library.getBookList().stream() // Stream<Book>
        .filter(b -> !isExpired(b)) // Stream<Book>
        .toList());
    FileUtils.writeFile(this.library.getBookList());
    System.out.println("출판된지 10년이 지난 책을 폐기했습니다.");
  }

  private boolean isExpired(Book book) {
    return ChronoUnit.YEARS.between(book.getReleaseDate(), LocalDate.now()) > 10;
  }

  @Override
  public void getNotReturned() {
    System.out.println("반납 대상자 목록");
    this.library.getUserDtoList().stream() // Stream<UserDto>
        .filter(u -> {
          if (u.getBorrowedBooks().isEmpty()) {
            return false;
          }
          return !u.getBorrowedBooks().stream() // Stream<Book>
              .filter(b -> hasTheDayCome(b) && !isExpired(b)) // Stream<Book>
              .toList() // List<Book>
              .isEmpty(); // boolean
        }) // Stream<UserDto>
        .map(UserDto::getUser) // Stream<User>
        .forEach(System.out::println);
  }

  /** 책이 반납되지 않았고 반납일이 2일 이하이면 true */
  private boolean hasTheDayCome(Book book) {
    return !book.isReturned()
        && ChronoUnit.DAYS.between(LocalDate.now(), book.getReturnDate()) <= 2;
  }

  @Override
  public void getBookRanking() {
    System.out.println("최고 인기 도서 Top 5");
    this.library.getBookList().stream() // Stream<Book>
        .sorted((b1, b2) -> b2.getRentalCount() - b1.getRentalCount()) // Stream<Book>
        .limit(5) // Stream<Book>
        .forEach(b -> System.out.printf("%s : %d회\n", b.getTitle(), b.getRentalCount()));

    System.out.println("비인기 도서 Top 5");
    this.library.getBookList().stream() // Stream<Book>
        .sorted((b1, b2) -> b1.getRentalCount() - b2.getRentalCount()) // Stream<Book>
        .limit(5) // Stream<Book>
        .forEach(b -> System.out.printf("%s : %d회\n", b.getTitle(), b.getRentalCount()));
  }

  @Override
  public void getLateCountRanking() {
    System.out.println("반납 기간 초과 횟수 Top 5");
    this.library.getUserDtoList().stream() // Stream<UserDto>
        .map(UserDto::getUser) // Stream<User>
        .sorted((u1, u2) -> u2.getLateCount() - u1.getLateCount()).limit(5)
        .forEach(u -> System.out.printf("%s : %d회\n", u.getName(), u.getLateCount()));
  }

  @Override
  public void borrowAction(UserDto userDto, Book book) {
    if (userDto.getUser().getLateCount() >= 3) {
      System.out.println("대여 불가: 반납 기간 초과 횟수가 3회 이상입니다.");
      return;
    }
    book.setBorrowed();
    book.setBorrowDate(LocalDate.now());
    book.setReturnDate(LocalDate.now().plusDays(7));
    book.setBorrowUser(userDto.getUser().getUserId());
    FileUtils.updateRow(this.library.getBookList(), book);
    FileUtils.createRow(this.library.getRentalList(),
        new Rental(userDto.getUser().getUserId(), book.getManagementNumber()));
  }

  @Override
  public void returnAction(UserDto userDto, Book book) {
    if (!isExpired(book) && LocalDate.now().isAfter(book.getReturnDate())) {
      userDto.getUser().addLateCount();
      userDto.getUser().addFee(calculateFee(book.getReturnDate()));
      FileUtils.updateRow(this.library.getUserList(), userDto.getUser());
    }
    book.setReturned();
    book.setBorrowDate(LocalDate.now());
    book.setReturnDate(LocalDate.now());
    book.setBorrowUser(-1);
    FileUtils.updateRow(this.library.getBookList(), book);
    FileUtils.deleteRow(this.library.getRentalList(),
        new Rental(userDto.getUser().getUserId(), book.getManagementNumber()));
  }

  private int calculateFee(LocalDate returnDate) {
    return (int) (500 * ChronoUnit.DAYS.between(LocalDate.now(), returnDate));
  }

  @Override
  public void addNewMember(String name, String phoneNumber) {
    User newMember = new User(++this.userId, name, phoneNumber);
    this.library.getUserDtoList().add(new UserDto(newMember));
    FileUtils.createRow(this.library.getUserList(), newMember);
  }

  @Override
  public User memberLogin(String name, String phoneNumber) {
    return this.library.getUserList().stream() // Stream<User>
        .filter(u -> u.getName().equals(name) && u.getPhone().equals(phoneNumber)) // Stream<User>
        .findFirst() // Optional<User>
        .orElse(null);
  }



}
