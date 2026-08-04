package com.ktdsuniversity.edu.oop.datetime;

import java.time.LocalDate;
import java.util.List;

public class Talk {

  public static void main(String[] args) {
    Friends talk = new Friends();
    talk.addFriend(new Friend("친구 1", LocalDate.parse("2000-01-01")));
    talk.addFriend(new Friend("친구 2", LocalDate.parse("2000-02-01")));
    talk.addFriend(new Friend("친구 3", LocalDate.parse("2000-03-01")));
    talk.addFriend(new Friend("친구 4", LocalDate.parse("2000-04-01")));
    talk.addFriend(new Friend("친구 5", LocalDate.parse("2000-05-01")));
    talk.addFriend(new Friend("친구 6", LocalDate.parse("2000-06-01")));
    talk.addFriend(new Friend("친구 7", LocalDate.parse("2000-07-01")));
    talk.addFriend(new Friend("친구 8", LocalDate.parse("2000-08-01")));
    talk.addFriend(new Friend("친구 9", LocalDate.parse("2000-08-02")));
    talk.addFriend(new Friend("친구 10", LocalDate.parse("2000-08-03")));
    talk.addFriend(new Friend("친구 11", LocalDate.parse("2000-08-04")));
    talk.addFriend(new Friend("친구 12", LocalDate.parse("2000-08-05")));
    talk.addFriend(new Friend("친구 13", LocalDate.parse("2000-08-06")));
    talk.addFriend(new Friend("친구 14", LocalDate.parse("2000-08-07")));
    talk.addFriend(new Friend("친구 15", LocalDate.parse("2000-08-08")));
    talk.addFriend(new Friend("친구 16", LocalDate.parse("2000-08-09")));
    talk.addFriend(new Friend("친구 17", LocalDate.parse("2000-08-10")));
    talk.addFriend(new Friend("친구 18", LocalDate.parse("2000-08-11")));
    talk.addFriend(new Friend("친구 19", LocalDate.parse("2000-08-12")));
    talk.addFriend(new Friend("친구 20", LocalDate.parse("2000-08-13")));

    // 오늘 기준 3일 전후로 생일을 맞이한 친구 목록
    List<Friend> specialFriends = talk.findFriendsBy(3);

    for (Friend friend : specialFriends) {
      System.out.println(friend);
    }
  }
}
