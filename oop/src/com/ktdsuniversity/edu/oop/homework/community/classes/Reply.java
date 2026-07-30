package com.ktdsuniversity.edu.oop.homework.community.classes;

import java.util.Date;

public class Reply {

  private int index;
  private String text;
  private String writer;
  private String date;
  private int likes;

  /**
   * @param index
   * @param text
   * @param writer
   * @param date
   */
  public Reply(int index, String text, String writer) {
    this.index = index;
    this.text = text;
    this.writer = writer;
    this.date = new Date().toString();
    this.likes = 0;
  }

  public int getIndex() {
    return index;
  }

  public String getText() {
    return text;
  }

  public String getWriter() {
    return writer;
  }

  public String getDate() {
    return date;
  }

  public int getLikes() {
    return likes;
  }



}
