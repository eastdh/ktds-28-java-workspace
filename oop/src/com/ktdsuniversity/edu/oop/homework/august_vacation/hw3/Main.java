package com.ktdsuniversity.edu.oop.homework.august_vacation.hw3;

import com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.entity.Library;
import com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.entity.User;
import com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.service.LibraryService;
import com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.service.UserService;
import com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.service.impl.LibraryServiceImpl;
import com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.service.impl.UserServiceImpl;
import com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.utils.ScannerUtils;

public class Main {

  public static Library library = new Library();
  public static LibraryService libraryService = new LibraryServiceImpl(library);
  public static UserService userService = new UserServiceImpl(library);
  public static User loginUser = null;

  public static void mainMenu() {
    while (true) {

      System.out.println("=".repeat(15) + " 메인 메뉴 " + "=".repeat(15));
      System.out.println(loginUser == null ? "로그인하세요." : "로그인 유저: " + loginUser.getName());
      System.out.println("1. 도서관 관리");
      System.out.println("2. 회원 가입");
      System.out.println("3. 회원 로그인");
      System.out.println("4. 회원 로그아웃");
      System.out.println("99. 종료");

      int menuSelect = ScannerUtils.scanInt("메뉴를 선택하세요: ");
      if (menuSelect == 1) {
        libraryMenu();
      } else if (menuSelect == 2) {
        userService.register();
      } else if (menuSelect == 3) {
        loginUser = userService.login();
        if (loginUser != null) {
          System.out.println("로그인 되었습니다.");
          userService = new UserServiceImpl(library, loginUser);
          userMenu();
        }
      } else if (menuSelect == 4) {
        loginUser = null;
        userService = new UserServiceImpl(library);
      } else if (menuSelect == 99) {
        System.out.println("종료합니다.");
        return;
      } else {
        System.out.println("잘못된 입력입니다.");
      }
      ScannerUtils.scanString("(계속하려면 엔터를 입력하세요.)");
    }
  }

  public static void libraryMenu() {
    while (true) {
      System.out.println("=".repeat(15) + " 도서관 관리 메뉴 " + "=".repeat(15));
      System.out.println("1. 신규 책 입고");
      System.out.println("2. 오래된 책 폐기");
      System.out.println("3. 반납 대상 회원 조회");
      System.out.println("4. 인기 도서 조회");
      System.out.println("5. 상습 미반납 회원 조회");
      System.out.println("99. 상위 메뉴로 돌아가기");
      int menuSelect = ScannerUtils.scanInt("메뉴를 선택하세요: ");

      if (menuSelect == 1) {
        libraryService.inbound();

      } else if (menuSelect == 2) {
        libraryService.discard();
      } else if (menuSelect == 3) {
        libraryService.getNotReturned();
      } else if (menuSelect == 4) {
        libraryService.getBookRanking();
      } else if (menuSelect == 5) {
        libraryService.getLateCountRanking();
      } else if (menuSelect == 99) {
        return;
      } else {
        System.out.println("잘못된 입력입니다.");
      }
      ScannerUtils.scanString("(계속하려면 엔터를 입력하세요.)");

    }
  }

  public static void userMenu() {
    while (true) {
      System.out.println("=".repeat(15) + " 유저 메뉴 " + "=".repeat(15));
      System.out.println("1. 책 검색하기");
      System.out.println("2. 책 대여하기");
      System.out.println("3. 책 반납하기");
      System.out.println("99. 상위 메뉴로 돌아가기");
      int menuSelect = ScannerUtils.scanInt("메뉴를 선택하세요: ");

      if (menuSelect == 1) {
        userService.searchBook();
      } else if (menuSelect == 2) {
        userService.borrowBook();
      } else if (menuSelect == 3) {
        userService.returnBook();
      } else if (menuSelect == 99) {
        return;
      } else {
        System.out.println("잘못된 입력입니다.");
      }
      ScannerUtils.scanString("(계속하려면 엔터를 입력하세요.)");

    }
  }

  public static void main(String[] args) {

    mainMenu();
  }

}
