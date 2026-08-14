package com.ktdsuniversity.edu.oop.homework.august_vacation.hw2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static LocalTime getTime() {
    Scanner sc = new Scanner(System.in);

    System.out.print("시간 입력 (미입력시 현재 시각) (hh:mm): ");
    String time = sc.nextLine();
    sc.close();
    if (time == null || time.isBlank() || !isTimeFormat(time)) {
      return LocalTime.now();
    } else {
      return LocalTime.parse(time);
    }
  }

  public static boolean isTimeFormat(String time) {
    try {
      LocalTime.parse(time);
      return true;
    } catch (DateTimeParseException dtpe) {
      return false;
    }
  }

  public static List<Station> makeStationList() {
    List<Station> stations = new ArrayList<>();

    List<Broadcast> sbsBroadcasts =
        List.of(new Broadcast("좋은 아침", "09:00", "11:00"), new Broadcast("좋은 점심", "11:01", "15:00"),
            new Broadcast("좋은 저녁", "18:00", "21:00"), new Broadcast("좋은 밤", "23:00", "23:59"));
    stations.add(new Station("SBS", sbsBroadcasts));

    List<Broadcast> kbs1Broadcasts =
        List.of(new Broadcast("아침마당", "09:00", "10:30"), new Broadcast("점심마당", "12:00", "13:00"),
            new Broadcast("저녁마당", "17:30", "18:30"), new Broadcast("밤마당", "22:00", "23:00"));
    stations.add(new Station("KBS1", kbs1Broadcasts));

    List<Broadcast> kbs2Broadcasts =
        List.of(new Broadcast("생생정보", "06:00", "07:30"), new Broadcast("생생우동", "12:00", "15:45"),
            new Broadcast("역전우동", "18:00", "18:30"), new Broadcast("역전할맥", "19:30", "23:00"));
    stations.add(new Station("KBS2", kbs2Broadcasts));

    return stations;
  }

  public static void printAllNowOnAir(LocalTime time, List<Station> stations) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
    System.out.println("\n현재 시각: " + time.format(formatter));
    stations.stream() // Stream<Station>
        .forEach(s -> s.printNowOnAir(time));
  }

  public static void main(String[] args) {

    LocalTime time = getTime();
    List<Station> stations = makeStationList();

    printAllNowOnAir(time, stations);

  }

}
