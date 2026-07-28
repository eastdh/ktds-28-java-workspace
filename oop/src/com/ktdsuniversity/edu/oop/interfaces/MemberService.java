package com.ktdsuniversity.edu.oop.interfaces;

/**
 * 어떤 시스템의 회원 관리 기능.
 */
public interface MemberService {

  /**
   * 회원 가입
   */
  void join();

  /**
   * 회원 로그인
   */
  void login();

  /**
   * 회원 탈퇴
   */
  void deleteMe();

  /**
   * 회원 로그아웃
   */
  void logout();


}
