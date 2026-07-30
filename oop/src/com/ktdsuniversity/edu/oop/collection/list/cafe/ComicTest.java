package com.ktdsuniversity.edu.oop.collection.list.cafe;

import com.ktdsuniversity.edu.oop.cafe.ComicBook;

public class ComicTest {

  public static void main(String[] args) {
    ComicBookCafe cafe = new ComicBookCafe();
    cafe.addBook(new ComicBook("만화책 1권", 600));
    cafe.addBook(new ComicBook("만화책 2권", 600));
    cafe.addBook(new ComicBook("만화책 3권", 600));
    cafe.addBook(new ComicBook("만화책 4권", 600));
    cafe.addBook(new ComicBook("만화책 5권", 600));
    cafe.addBook(new ComicBook("만화책 6권", 600));
    cafe.addBook(new ComicBook("만화책 7권", 600));
    cafe.addBook(new ComicBook("만화책 8권", 600));
    cafe.addBook(new ComicBook("만화책 9권", 600));
  }

}
