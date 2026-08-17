package com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.entity;

import java.util.Objects;


public class User {

  private long userId;
  private String name;
  private String phone;
  private int fee;
  private int lateCount;

  public User(long userId, String name, String phone) {
    this.userId = userId;
    this.name = name;
    this.phone = phone;
  }

  public User(String[] tokens) {
    this.userId = Long.parseLong(tokens[0]);
    this.name = tokens[1];
    this.phone = tokens[2];
    this.fee = Integer.parseInt(tokens[3]);
    this.lateCount = Integer.parseInt(tokens[4]);
  }



  public long getUserId() {
    return this.userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return this.phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public int getFee() {
    return this.fee;
  }

  public void setFee(int fee) {
    this.fee = fee;
  }

  public int getLateCount() {
    return this.lateCount;
  }

  public void setLateCount(int lateCount) {
    this.lateCount = lateCount;
  }

  public void addFee(int fee) {
    this.fee += fee;
  }

  public void addLateCount() {
    this.lateCount++;
  }


  @Override
  public String toString() {
    return "User [userId=" + userId + ", name=" + name + ", phone=" + phone + ", fee=" + fee
        + ", lateCount=" + lateCount + "]";
  }



  @Override
  public int hashCode() {
    return Objects.hash(Long.valueOf(this.userId));
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    User other = (User) obj;
    return this.userId == other.userId;
  }

}
