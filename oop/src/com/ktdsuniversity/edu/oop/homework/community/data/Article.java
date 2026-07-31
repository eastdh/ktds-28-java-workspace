package com.ktdsuniversity.edu.oop.homework.community.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Article {

  private int index;
  private String title;
  private String writer;
  private String date;
  private int views;
  private String text;
  private List<Reply> replyList;
  private int replyIndex;

  /**
   * @param index
   * @param title
   * @param writer
   * @param text
   */
  public Article(int index, String title, String writer, String text) {
    this.index = index;
    this.title = title;
    this.writer = writer;
    this.date = new Date().toString();
    this.text = text;
    this.views = 0;
    this.replyList = new ArrayList<>();
    this.replyIndex = 0;
  }

  public int getIndex() {
    return this.index;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getWriter() {
    return this.writer;
  }

  public String getDate() {
    return this.date;
  }

  public int getViews() {
    return this.views;
  }

  public String getText() {
    return this.text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public List<Reply> getReplyList() {
    return this.replyList;
  }

  public int getReplyIndex() {
    return this.replyIndex++;
  }

  public void addReply(Reply r) {
    this.replyList.add(r);
  }

  public void deleteReply(Reply r) {
    this.replyList.remove(r);
  }

  public void clearReply() {
    this.replyList.clear();
  }

  public void view() {
    this.views++;
  }

  public void printAllReply() {
    System.out.println("댓글 " + "_".repeat(25));
    for (Reply r : this.replyList) {
      System.out.println(String.format("%d. %s: %s\tLikes: %d %s", r.getIndex(), r.getWriter(),
          r.getText(), r.getLikes(), r.getDate()));
    }
  }


}
