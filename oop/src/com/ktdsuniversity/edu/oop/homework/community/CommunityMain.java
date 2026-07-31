package com.ktdsuniversity.edu.oop.homework.community;

import java.util.Scanner;
import com.ktdsuniversity.edu.oop.homework.community.data.Community;

public class CommunityMain {

  public static void printMainMenu() {
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

  public static void main(String[] args) {

    Community community = new Community();
    Scanner sc = new Scanner(System.in);
    int articleIndex;
    int replyIndex;

    while (true) {
      printMainMenu();
      System.out.print("원하는 메뉴의 번호를 입력하세요: ");
      int select = sc.nextInt();
      switch (select) {
        case 1:
          community.createArticle();
          break;
        case 2:
          community.printArticleTitles();
          break;
        case 3:
          System.out.print("게시물의 번호를 입력하세요: ");
          articleIndex = sc.nextInt();
          community.printArticleByIndex(articleIndex);
          break;
        case 4:
          System.out.print("게시물의 번호를 입력하세요: ");
          articleIndex = sc.nextInt();
          community.updateArticle(articleIndex);
          break;
        case 5:
          System.out.print("게시물의 번호를 입력하세요: ");
          articleIndex = sc.nextInt();
          community.deleteArticle(articleIndex);
          break;
        case 6:
          community.printNumOfArticle();
          break;
        case 7:
          System.out.print("게시물의 번호를 입력하세요: ");
          articleIndex = sc.nextInt();
          community.createReply(articleIndex);
          break;
        case 8:
          System.out.print("게시물의 번호를 입력하세요: ");
          articleIndex = sc.nextInt();
          System.out.print("댓글의 번호를 입력하세요: ");
          replyIndex = sc.nextInt();
          community.deleteReply(articleIndex, replyIndex);
          break;
        case 9:
          System.out.print("게시물의 번호를 입력하세요: ");
          articleIndex = sc.nextInt();
          System.out.print("댓글의 번호를 입력하세요: ");
          replyIndex = sc.nextInt();
          community.likeReply(articleIndex, replyIndex);
          break;
        case 10:
          System.out.print("검색어를 입력하세요: ");
          sc.nextLine(); // 개행문자 소비
          String keyword = sc.nextLine();
          community.searchArticleByKeyword(keyword);
          break;
        case 11:
          community.deleteAllArticle();
          break;
        case 12:
          System.out.print("게시물의 번호를 입력하세요: ");
          articleIndex = sc.nextInt();
          community.deleteAllReply(articleIndex);
          break;
        case 13:
          System.out.println("종료합니다");
          return;

        default:
          System.out.println("잘못된 입력입니다.");
          break;
      }
    }
  }
}
