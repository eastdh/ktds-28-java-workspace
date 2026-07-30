package com.ktdsuniversity.edu.oop.homework.community.service;

public interface ReplyService {

  void createReply(int articleIndex);

  void deleteReply(int articleIndex, int replyIndex);

  void likeReply(int articleIndex, int replyIndex);

  void deleteAllReply(int articleIndex);
}
