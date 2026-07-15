package workflow;

public class ReserveSeat {

  public static void main(String[] args) {

    int[] seats = new int[50];

    // 랜덤하게 좌석 배정
    // 0: 예약 가능한 좌석
    // 1: 이미 예약된 좌석 (예약 불가능)
    for (int i = 0; i < seats.length; i++) {
      seats[i] = (int) (Math.random() * 2); // 0, 1

    }

    // TODO 배열의 값을 출력한다.
    // 0 0 1 0 1 0 1 1 1 0 0 ...

    // TODO 예약 가능한 좌석의 수를 출력
    // n개의 좌석을 예약할 수 있습니다.

    // TODO 예약 불가능한 좌석의 수를 출력
    // k개의 좌석이 이미 예약되어 있습니다.


    int empty = 0;
    int reserved = 0;
    for (int i = 0; i < seats.length; i++) {

      System.out.print(seats[i] + " ");

      if (i % 10 == 9) {
        System.out.println();
      }

      if (seats[i] == 0) {
        empty++;
      } else {
        reserved++;
      }
    }

    System.out.println(empty + "개의 좌석을 예약할 수 있습니다.");
    System.out.println(reserved + "개의 좌석이 이미 예약되어 있습니다.");


  }
}
