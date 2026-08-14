package com.ktdsuniversity.edu.oop.homework.august_vacation.hw2;

import java.time.LocalTime;

public class Broadcast {

  private String name;
  private LocalTime start;
  private LocalTime end;

  public Broadcast(String name, String start, String end) {
    this(name, LocalTime.parse(start), LocalTime.parse(end));
  }

  public Broadcast(String name, LocalTime start, LocalTime end) {
    this.name = name;
    this.start = start;
    this.end = end;
  }

  public String getName() {
    return this.name;
  }

  public boolean isOnAir(LocalTime time) {
    return time.equals(this.start) || time.equals(this.end)
        || time.isAfter(this.start) && time.isBefore(this.end);
  }

}
