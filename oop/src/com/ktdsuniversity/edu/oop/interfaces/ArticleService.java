package com.ktdsuniversity.edu.oop.interfaces;

/**
 * 어떤 시스템의 게시글 관리 기능.
 */
public interface ArticleService {

  // 인터페이스에서는 접근제한지시자가 없으면 default가 아니라 public이다!
  void write();

  void view();

  void delete();

}
