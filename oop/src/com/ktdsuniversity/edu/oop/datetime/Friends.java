package com.ktdsuniversity.edu.oop.datetime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Friends {

  private List<Friend> friendList;

  public Friends() {
    this.friendList = new ArrayList<>();
  }

  public void addFriend(Friend friend) {
    this.friendList.add(friend);
  }

  public Friend get(int index) {
    if (index >= this.friendList.size() && index < 0) {
      return null;
    }
    return this.friendList.get(index);
  }

  /**
   * 생일이 다가오거나, 생일이거나, 생일이 지난 친구 찾아 반환
   * 
   * @param days 범위
   * @return
   */
  public List<Friend> findFriendsBy(int days) {
    List<Friend> foundFriends = new ArrayList<>();

    LocalDate now = LocalDate.now();

    // 1: 날짜 차이
    // long dayBetween;
    // for (Friend friend : this.friendList) {
    // dayBetween = ChronoUnit.DAYS.between(now, friend.getBirthdate().withYear(now.getYear()));
    // if (dayBetween >= -days && dayBetween <= days) {
    // foundFriends.add(friend);
    // }
    // }

    // 2: 날짜 범위
    LocalDate startDate = now.minusDays(days);
    LocalDate endDate = now.plusDays(days);
    for (Friend friend : this.friendList) {
      LocalDate friendBDay = friend.getBirthdate().withYear(now.getYear());
      if (friendBDay.isAfter(startDate.minusDays(1))
          && friendBDay.isBefore(endDate.plusDays(1))) {
        foundFriends.add(friend);
      }
    }
    return foundFriends;
  }

  @Override
  public String toString() {
    return "Friends [friendList=" + friendList + "]";
  }

}
