package com.ktdsuniversity.edu.oop.cafe;

public class ComicMain {

  public static void main(String[] args) {

    final int BOOK_COUNT = 10;
    ComicBook[] comicBooks = new ComicBook[BOOK_COUNT];
    for (int i = 0; i < comicBooks.length; i++) {
      int fee = (int) (Math.random() * 20 + 1) * 100;
      comicBooks[i] = new ComicBook(Integer.toString(i).repeat(4), fee);
    }

    ComicBookCafe cafe = new ComicBookCafe(comicBooks);

    final int VISITOR_COUNT = 10;
    Visitor[] visitors = new Visitor[VISITOR_COUNT];
    for (int i = 0; i < visitors.length; i++) {
      int cash = (int) (Math.random() * 10 + 1) * 1000;
      visitors[i] = new Visitor(i, cash);
    }

    cafe.printAllBooks();

    // 10번의 랜덤 대여
    for (int i = 0; i < 10; i++) {
      int bookIndex = (int) (Math.random() * BOOK_COUNT);
      int visitorIndex = (int) (Math.random() * VISITOR_COUNT);

      ComicBook b = cafe.getComicBooks()[bookIndex];
      Visitor v = visitors[visitorIndex];

      if (cafe.canBorrow(b) && v.canBorrow(b)) {
        cafe.borrowBook(b);
        v.borrowBook(b);
        System.out.print(v.getVisitorId() + ", " + b.getTitle() + "빌림 - 대여 목록: ");
        for (int j = 0; j < v.getBorrowedBooks().length; j++) {
          if (v.getBorrowedBooks()[j] == null) {
            continue;
          }
          System.out.print(v.getBorrowedBooks()[j].getTitle() + " ");
        }
        System.out.println();
      }

    }

    cafe.printAllBooks();



  }


}
