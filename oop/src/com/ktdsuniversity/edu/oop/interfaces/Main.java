package com.ktdsuniversity.edu.oop.interfaces;

public class Main {

  public static void main(String[] args) {

    // ArticleSystem is a ArticleService
    ArticleService articleService = new ArticleSystem();
    articleService.write();
    articleService.delete();
    articleService.view();
    // articleService.addReply(); // ArticleService라서 못 씀!

    // ArticleSystem is a ReplyService
    ReplyService replyService = new ArticleSystem();
    replyService.addReply();
    replyService.deleteReply();
    replyService.recommendReply();

    // MemberService, VipMemberService의 인스턴스 생성
    // VipMemberService is a MemberService
    // MemberServiceImpl is a memberService
    MemberService memberServiceImpl = new MemberServiceImpl();
    memberServiceImpl.deleteMe();
    memberServiceImpl.join();
    memberServiceImpl.login();
    memberServiceImpl.logout();

    // VipMemberServiceImpl is a VipMemberService
    VipMemberService vipMemberServiceImpl = new VipMemberServiceImpl();
    vipMemberServiceImpl.deleteMe();
    vipMemberServiceImpl.join();
    vipMemberServiceImpl.login();
    vipMemberServiceImpl.logout();
    vipMemberServiceImpl.addPoint(3);

    // VipMemberServiceImpl is a MemberService
    MemberService vipMemberService2 = new VipMemberServiceImpl();
    vipMemberService2.deleteMe();
    vipMemberService2.join();
    vipMemberService2.login();
    vipMemberService2.logout();
    // vipMemberService2.addPoint(3); // MemberService라서 쓸 수 없음!
    if (vipMemberService2 instanceof VipMemberService vip) {
      vip.addPoint(56);
    }

    // SomeInterface의 인스턴스를 생성해보기
    // SomeInterface inf = new SomeInterface(); // error 발생!
    // Interface는 인스턴스로 생성할 수 없음!
    // ==> Java의 인스턴스는 모든 메소드가 구현되어있어야 한다.
    SomeInterface inf = new SomeClass2();
    inf.doSomething1();
    inf.doSomething2();
    inf.doSomething3();

    int value = inf.getSomething();
    System.out.println(value);

    String str = inf.getString();
    System.out.println(str);
  }
}
