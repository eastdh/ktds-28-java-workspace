package com.ktdsuniversity.edu.oop.homework.community.service;

public interface ArticleService {

  void createArticle();

  void printArticleTitles();

  void printArticleByIndex(int articleIndex);

  void updateArticle(int articleIndex);

  void deleteArticle(int articleIndex);

  void printNumOfArticle();

  void searchArticleByKeyword(String keyword);

  void deleteAllArticle();

}
