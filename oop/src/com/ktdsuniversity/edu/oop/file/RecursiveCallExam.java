package com.ktdsuniversity.edu.oop.file;

public class RecursiveCallExam {

  public static void explore(int number) {
    System.out.println("현재 번호는 " + number + "입니다.");
    if (number < 10) {
      explore(number + 1);
    }
    System.out.println("bye " + number);

  }

  public static void main(String[] args) {

    explore(0);
    /*
     * 현재 번호는 0입니다.
     * 현재 번호는 1입니다.
     * 현재 번호는 2입니다.
     * 현재 번호는 3입니다.
     * 현재 번호는 4입니다.
     * 현재 번호는 5입니다.
     * 현재 번호는 6입니다.
     * 현재 번호는 7입니다.
     * 현재 번호는 8입니다.
     * 현재 번호는 9입니다.
     * 현재 번호는 10입니다.
     * bye 10
     * bye 9
     * bye 8
     * bye 7
     * bye 6
     * bye 5
     * bye 4
     * bye 3
     * bye 2
     * bye 1
     * bye 0
     * 
     */
  }
}
