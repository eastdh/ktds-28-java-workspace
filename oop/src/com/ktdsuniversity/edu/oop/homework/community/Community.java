package com.ktdsuniversity.edu.oop.homework.community;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.ktdsuniversity.edu.oop.homework.community.data.Article;
import com.ktdsuniversity.edu.oop.homework.community.data.Reply;
import com.ktdsuniversity.edu.oop.homework.community.exceptions.ArticleException;
import com.ktdsuniversity.edu.oop.homework.community.exceptions.ArticleWriterException;
import com.ktdsuniversity.edu.oop.homework.community.service.ArticleService;
import com.ktdsuniversity.edu.oop.homework.community.service.ReplyService;

public class Community implements ArticleService, ReplyService {
  private List<Article> articleList;
  private Scanner sc;
  private int articleIndex;

  private final String INPUT_TITLE = "제목을 작성하세요 (30자 이하): ";
  private final String INPUT_WRITER = "작성자를 입력하세요: ";
  private final String INPUT_TEXT = "내용을 입력하세요: ";
  private final String WRONG_ARTICLE_INDEX = "잘못된 게시글 번호입니다.";
  private final String WRONG_REPLY_INDEX = "잘못된 댓글 번호입니다.";
  private final String NO_ARTICLE = "게시글이 없습니다.";
  private final String NO_REPLY = "등록된 댓글이 없습니다.";
  private final String REQUIRED_TITLE = "제목은 필수입니다 (30자 이하).";
  private final String REQUIRED_WRITER = "작성자 입력은 필수입니다.";


  public Community() {
    this.articleList = new ArrayList<>();
    this.sc = new Scanner(System.in);
    this.articleIndex = 0;
  }

  public List<Article> getArticleList() {
    return articleList;
  }

  @Override
  public void createArticle() {

    String title = "";
    String writer = "";
    String text = "";
    while (true) {
      System.out.print(INPUT_TITLE);
      try {
        title = sc.nextLine();
        if (title == null || title.isBlank() || title.length() > 30) {
          throw new ArticleException(REQUIRED_TITLE);
        }
        break;
      } catch (ArticleException ae) {
        System.out.println(ae.getMessage());
      }
    }

    while (true) {
      System.out.print(INPUT_WRITER);
      try {
        writer = sc.nextLine();
        if (writer == null || writer.isBlank()) {
          throw new ArticleWriterException(REQUIRED_WRITER);
        }
        break;
      } catch (ArticleWriterException awe) {
        System.out.println(awe.getMessage());
      }
    }

    System.out.println(INPUT_TEXT);
    text = sc.nextLine();

    this.articleList.add(new Article(this.articleIndex++, title, writer, text));

  }

  @Override
  public void printArticleTitles() {
    if (this.articleList.size() == 0) {
      System.out.println(NO_ARTICLE);
    } else {
      for (Article a : this.articleList) {
        System.out.printf("%d. %s (%d)\n", a.getIndex(), a.getTitle(), a.getReplyList().size());
      }
    }
  }

  /**
   * 게시글 인덱스로 게시글을 찾아서 반환.
   * 
   * @param articleIndex
   * @return Article
   */
  private Article findArticleByIndex(int articleIndex) {
    for (Article a : this.articleList) {
      if (a.getIndex() == articleIndex) {
        return a;
      }
    }

    return null;
  }

  @Override
  public void printArticleByIndex(int articleIndex) {

    Article article = findArticleByIndex(articleIndex);
    if (article == null) {
      System.out.println(WRONG_ARTICLE_INDEX);
      return;
    }

    // 조회수 증가
    article.view();
    // 제목 출력
    System.out.printf("%d. %s (%d)\n", article.getIndex(), article.getTitle(),
        article.getReplyList().size());
    // 등록일, 조회수 출력
    System.out.println("등록일: " + article.getDate() + " / 조회수: " + article.getViews());
    // 내용 출력
    System.out.println("_".repeat(30));
    System.out.println(article.getText());
    // 댓글 출력
    if (article.getReplyList().size() == 0) {
      System.out.println(NO_REPLY);
    } else {
      article.printAllReply();
    }



  }

  @Override
  public void updateArticle(int articleIndex) {
    Article article = findArticleByIndex(articleIndex);
    if (article == null) {
      System.out.println(WRONG_ARTICLE_INDEX);
      return;
    }

    System.out.print("새로운 제목을 입력하세요 (입력 없을시 건너뜀): ");
    String newTitle = this.sc.nextLine();
    if (!(newTitle == null || newTitle.isBlank())) {
      article.setTitle(newTitle);
    }
    System.out.print("새로운 내용을 입력하세요 (입력 없을시 건너뜀): ");
    String newText = this.sc.nextLine();
    if (!(newText == null || newText.isBlank())) {
      article.setText(newText);
    }

  }

  @Override
  public void deleteArticle(int articleIndex) {
    Article article = findArticleByIndex(articleIndex);
    if (article == null) {
      System.out.println(WRONG_ARTICLE_INDEX);
      return;
    }

    this.articleList.remove(article);

  }

  @Override
  public void printNumOfArticle() {
    if (this.articleList.size() == 0) {
      System.out.println(NO_ARTICLE);
    } else {
      System.out.println(this.articleList.size() + "개의 게시글이 등록되었습니다.");
    }
  }

  @Override
  public void searchArticleByKeyword(String keyword) {
    boolean isExist = false;
    for (Article a : this.articleList) {
      if (a.getTitle().contains(keyword)) {
        isExist = true;
        System.out.printf("%d. %s (%d)\n", a.getIndex(), a.getTitle(), a.getReplyList().size());
      }
    }
    if (!isExist) {
      System.out.println("검색된 " + NO_ARTICLE);
    }

  }

  @Override
  public void deleteAllArticle() {
    int numOfArticles = this.articleList.size();
    if (numOfArticles == 0) {
      System.out.println(NO_ARTICLE);
    } else {
      this.articleList.clear();
      System.out.println(numOfArticles + "개의 게시글을 삭제했습니다.");
    }

  }


  @Override
  public void createReply(int articleIndex) {
    Article a = findArticleByIndex(articleIndex);
    if (a == null) {
      System.out.println(WRONG_ARTICLE_INDEX);
      return;
    }
    if (a.getReplyList().size() >= 10) {
      System.out.println("댓글을 더 이상 등록할 수 없습니다.");
    } else {
      String writer = "";
      String text = "";

      while (true) {
        System.out.print(INPUT_WRITER);
        try {
          writer = sc.nextLine();
          if (writer == null || writer.isBlank()) {
            throw new ArticleWriterException(REQUIRED_WRITER);
          }
          break;
        } catch (ArticleWriterException awe) {
          System.out.println(awe.getMessage());
        }
      }

      System.out.println(INPUT_TEXT);
      text = sc.nextLine();

      a.addReply(new Reply(a.getReplyIndex(), text, writer));
    }
  }

  /**
   * 게시글과 댓글인덱스로 댓글을 찾아서 반환.
   * 
   * @param a
   * @param replyIndex
   * @return Reply
   */
  private Reply findReplyByIndex(Article a, int replyIndex) {
    for (Reply r : a.getReplyList()) {
      if (r.getIndex() == replyIndex) {
        return r;
      }
    }

    return null;
  }

  @Override
  public void deleteReply(int articleIndex, int replyIndex) {
    Article a = findArticleByIndex(articleIndex);
    if (a == null) {
      System.out.println(WRONG_ARTICLE_INDEX);
      return;
    }

    Reply r = findReplyByIndex(a, replyIndex);
    if (r == null) {
      System.out.println(WRONG_REPLY_INDEX);
      return;
    }

    a.deleteReply(r);
  }

  @Override
  public void likeReply(int articleIndex, int replyIndex) {
    Article a = findArticleByIndex(articleIndex);
    if (a == null) {
      System.out.println(WRONG_ARTICLE_INDEX);
      return;
    }

    Reply r = findReplyByIndex(a, replyIndex);
    if (r == null) {
      System.out.println(WRONG_REPLY_INDEX);
      return;
    }

    r.likeReply();
  }

  @Override
  public void deleteAllReply(int articleIndex) {
    Article a = findArticleByIndex(articleIndex);
    if (a == null) {
      System.out.println(WRONG_ARTICLE_INDEX);
      return;
    }

    int numOfReplies = a.getReplyList().size();
    if (numOfReplies == 0) {
      System.out.println(NO_REPLY);
    } else {
      a.clearReply();
      System.out.println(numOfReplies + "개의 댓글을 삭제했습니다.");
    }
  }

}
