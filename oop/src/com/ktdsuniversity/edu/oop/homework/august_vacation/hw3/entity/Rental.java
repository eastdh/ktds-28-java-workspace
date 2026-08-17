package com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.entity;

import java.util.Objects;

public class Rental {

  private long userId;
  private long bookManagementNumber;

  public Rental(long userId, long bookManagementNumber) {
    this.userId = userId;
    this.bookManagementNumber = bookManagementNumber;
  }

  public Rental(String[] tokens) {
    this.userId = Long.parseLong(tokens[0]);
    this.bookManagementNumber = Long.parseLong(tokens[1]);
  }


  public long getUserId() {
    return this.userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public long getBookManagementNumber() {
    return this.bookManagementNumber;
  }

  public void setBookManagementNumber(long bookManagementNumber) {
    this.bookManagementNumber = bookManagementNumber;
  }

  @Override
  public String toString() {
    return "Rental [userId=" + this.userId + ", bookManagementNumber=" + this.bookManagementNumber
        + "]";
  }

  @Override
  public int hashCode() {
    return Objects.hash(Long.valueOf(this.bookManagementNumber), Long.valueOf(this.userId));
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Rental other = (Rental) obj;
    return this.bookManagementNumber == other.bookManagementNumber && this.userId == other.userId;
  }



}
