package com.ktdsuniversity.edu.oop.homework.community;

import java.util.Scanner;

public class CommunityMain {

  static final String INPUT_ARTICLE_INDEX = "게시물의 번호를 입력하세요: ";
  static final String INPUT_REPLY_INDEX = "댓글의 번호를 입력하세요: ";
  static Scanner sc;

  public static void printMainMenu() {
    System.out.println();
    System.out.println("_".repeat(9) + " 메인  메뉴 " + "_".repeat(9));
    System.out.println("  1. 게시물 작성");
    System.out.println("  2. 게시물 목록");
    System.out.println("  3. 게시물 열람");
    System.out.println("  4. 게시물 수정");
    System.out.println("  5. 게시물 삭제");
    System.out.println("  6. 게시물 개수");
    System.out.println("  7. 댓글 달기");
    System.out.println("  8. 댓글 삭제");
    System.out.println("  9. 댓글 추천");
    System.out.println(" 10. 게시물 검색");
    System.out.println(" 11. 게시물 전체 삭제");
    System.out.println(" 12. 게시물 댓글 전체 삭제");
    System.out.println(" 13. 종료");
    System.out.println("_".repeat(30));

  }

  public static int inputIndex(String message) {
    while (true) {
      System.out.print(message);
      try {
        return Integer.parseInt(sc.nextLine());
      } catch (NumberFormatException nfe) {
        System.out.println("잘못된 입력입니다.");
      }

    }
  }

  public static void main(String[] args) {

    Community community = new Community();
    sc = new Scanner(System.in);
    int articleIndex;
    int replyIndex;

    while (true) {
      printMainMenu();
      System.out.print("원하는 메뉴의 번호를 입력하세요: ");
      String select = sc.nextLine();
      System.out.println();

      if (select.equals("1")) {
        community.createArticle();
      } else if (select.equals("2")) {
        community.printArticleTitles();
      } else if (select.equals("3")) {
        articleIndex = inputIndex(INPUT_ARTICLE_INDEX);
        community.printArticleByIndex(articleIndex);
      } else if (select.equals("4")) {
        articleIndex = inputIndex(INPUT_ARTICLE_INDEX);
        community.updateArticle(articleIndex);
      } else if (select.equals("5")) {
        articleIndex = inputIndex(INPUT_ARTICLE_INDEX);
        community.deleteArticle(articleIndex);
      } else if (select.equals("6")) {
        community.printNumOfArticle();
      } else if (select.equals("7")) {
        articleIndex = inputIndex(INPUT_ARTICLE_INDEX);
        community.createReply(articleIndex);
      } else if (select.equals("8")) {
        articleIndex = inputIndex(INPUT_ARTICLE_INDEX);
        replyIndex = inputIndex(INPUT_REPLY_INDEX);
        community.deleteReply(articleIndex, replyIndex);
      } else if (select.equals("9")) {
        articleIndex = inputIndex(INPUT_ARTICLE_INDEX);
        replyIndex = inputIndex(INPUT_REPLY_INDEX);
        community.likeReply(articleIndex, replyIndex);
      } else if (select.equals("10")) {
        System.out.print("검색어를 입력하세요: ");
        String keyword = sc.nextLine();
        community.searchArticleByKeyword(keyword);
      } else if (select.equals("11")) {
        community.deleteAllArticle();
      } else if (select.equals("12")) {
        articleIndex = inputIndex(INPUT_ARTICLE_INDEX);
        community.deleteAllReply(articleIndex);
      } else if (select.equals("13")) {
        System.out.println("종료합니다");
        sc.close();
        return;
      } else {
        System.out.println("잘못된 입력입니다.");
      }
      System.out.println("(계속 진행하려면 Enter를 누르세요.)");
      sc.nextLine();

    }
  }
}
