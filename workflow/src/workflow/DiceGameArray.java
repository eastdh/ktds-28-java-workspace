package workflow;

public class DiceGameArray {

  static final int START = 0;
  static final int GOAL = 127;

  public static int rollDice() {
    final int DICE = 20;

    int dice1 = (int) (Math.random() * DICE) + 1;
    int dice2 = (int) (Math.random() * DICE) + 1;
    int diceSum = dice1 + dice2;
    System.out.println("\t주사위 A: " + dice1 + " / 주사위 B: " + dice2);

    if (diceSum == 3 || diceSum == 7) {
      System.out.println("+_+\t행운의 숫자 - 20 이동");
      diceSum = 20;
    } else if ((diceSum) % 3 == 0) {
      System.out.println("T_T\t3의 배수 - 뒤로 이동");
      diceSum *= -1;
    } else if (dice1 == dice2) {
      System.out.println("^_^\t더블 - 한 번 더 굴리기");
      diceSum += rollDice();
    }

    return diceSum;
  }

  public static boolean isArrived(int[] playerPosition) {
    boolean arrived = false;
    for (int i = 0; i < playerPosition.length; i++) {
      if (playerPosition[i] >= GOAL) {
        System.out.println("===== Player " + i + " 도착! =====");
        arrived = true;
      }
    }
    return arrived;
  }

  public static void main(String[] args) {

    int[] playerPosition = new int[4];

    boolean isPlaying = true;
    int turn = 0;
    while (isPlaying) {
      turn++;
      System.out.println("턴 " + turn);

      for (int i = 0; i < playerPosition.length; i++) {
        System.out.println("Player " + i + " 현재 위치: " + playerPosition[i]);

        int move = rollDice();
        System.out.println("\t이동: " + move);
        playerPosition[i] += move;
        if (playerPosition[i] < START) {
          playerPosition[i] = START;
        }

        System.out.println("\t" + playerPosition[i] + " 도착");
      }

      System.out.println();
      isPlaying = !isArrived(playerPosition);
    }

  }
}
