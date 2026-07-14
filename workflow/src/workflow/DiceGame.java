package workflow;

public class DiceGame {

  public static void main(String[] args) {
    // 주사위를 굴려 최종 목적지에 먼저 도착하는 플레이어가 승리

    // 4명의 플레이어가 0의 위치값부터 시작

    // 각 플레이어들은 주사위 두 개를 굴려 나온 수만큼 이동
    // 도착지의 위치 값은 127

    // ====== 주사위 규칙 ======
    // 1. 두 개의 주사위를 굴린 값이 3, 7이라면 위치 값은 10만큼 증가
    // 2. 두 주사위가 똑같은 숫자가 나온다면 주사위 합의 2배수 만큼 이동
    // => 4, 4, ==> 8*2 ==> +16
    // 3. 두 주사위 값의 합이 3의 배수일 경우 위치 값은 합의 수 만큼 감소
    // => 4, 5 ==> 9 ==> -9
    // 단, 2,3을 동시에 만족할 경우 (3, 3 / 6, 6) 규칙 3만 적용

    // 플레이어 위치 값은 0보다 작아질 수 없음

    // 플레이어가 주사위를 굴릴 때마다
    // 주사위의 값, 이동할 칸의 수, 현재 위치값 표시

    final int START = 0;
    final int GOAL = 127;

    int posA = START;
    int posB = START;
    int posC = START;
    int posD = START;

    int turn = 1;
    while (posA < GOAL && posB < GOAL && posC < GOAL && posD < GOAL) {
      System.out.println("턴 " + turn++);
      int dice1 = 0;
      int dice2 = 0;
      int diceSum = 0;

      // Player A
      System.out.println("Player A 현재 위치: " + posA);
      dice1 = (int) (Math.random() * 20) + 1;
      dice2 = (int) (Math.random() * 20) + 1;
      diceSum = dice1 + dice2;
      System.out.println("         주사위 1: " + dice1 + " / 주사위 2: " + dice2);
      if (diceSum == 3 || diceSum == 7) {
        System.out.println("*********행운의 숫자 - 10 이동");
        diceSum = 10;
      } else if ((diceSum) % 3 == 0) {
        System.out.println("*********3의 배수 - 뒤로 이동");
        diceSum *= -1;
      } else if (dice1 == dice2) {
        System.out.println("*********더블 - 두 배로 이동");
        diceSum *= 2;
      }
      System.out.println("         " + diceSum);
      posA += diceSum;
      if (posA < START) {
        posA = START;
      }
      System.out.println("         " + posA + "도착");

      // Player B
      System.out.println("Player B 현재 위치: " + posB);
      dice1 = (int) (Math.random() * 20) + 1;
      dice2 = (int) (Math.random() * 20) + 1;
      diceSum = dice1 + dice2;
      System.out.println("         주사위 1: " + dice1 + " / 주사위 2: " + dice2);
      if (diceSum == 3 || diceSum == 7) {
        System.out.println("*********행운의 숫자 - 10 이동");
        diceSum = 10;
      } else if ((diceSum) % 3 == 0) {
        System.out.println("*********3의 배수 - 뒤로 이동");
        diceSum *= -1;
      } else if (dice1 == dice2) {
        System.out.println("*********더블 - 두 배로 이동");
        diceSum *= 2;
      }
      System.out.println("         " + diceSum);
      posB += diceSum;
      if (posB < START) {
        posB = START;
      }
      System.out.println("         " + posB + "도착");

      // Player C
      System.out.println("Player C 현재 위치: " + posC);
      dice1 = (int) (Math.random() * 20) + 1;
      dice2 = (int) (Math.random() * 20) + 1;
      diceSum = dice1 + dice2;
      System.out.println("         주사위 1: " + dice1 + " / 주사위 2: " + dice2);
      if (diceSum == 3 || diceSum == 7) {
        System.out.println("*********행운의 숫자 - 10 이동");
        diceSum = 10;
      } else if ((diceSum) % 3 == 0) {
        System.out.println("*********3의 배수 - 뒤로 이동");
        diceSum *= -1;
      } else if (dice1 == dice2) {
        System.out.println("*********더블 - 두 배로 이동");
        diceSum *= 2;
      }
      System.out.println("         " + diceSum);
      posC += diceSum;
      if (posC < START) {
        posC = START;
      }
      System.out.println("         " + posC + "도착");

      // Player D
      System.out.println("Player D 현재 위치: " + posD);
      dice1 = (int) (Math.random() * 20) + 1;
      dice2 = (int) (Math.random() * 20) + 1;
      diceSum = dice1 + dice2;
      System.out.println("         주사위 1: " + dice1 + " / 주사위 2: " + dice2);
      if (diceSum == 3 || diceSum == 7) {
        System.out.println("*********행운의 숫자 - 10 이동");
        diceSum = 10;
      } else if ((diceSum) % 3 == 0) {
        System.out.println("*********3의 배수 - 뒤로 이동");
        diceSum *= -1;
      } else if (dice1 == dice2) {
        System.out.println("*********더블 - 두 배로 이동");
        diceSum *= 2;
      }
      System.out.println("         " + diceSum);
      posD += diceSum;
      if (posD < START) {
        posD = START;
      }
      System.out.println("         " + posD + "도착");
      System.out.println();
    }



  }
}
