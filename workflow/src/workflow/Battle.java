package workflow;

public class Battle {

  public static void main(String[] args) {
    // Boss와 Player가 전투를 합니다.
    // Boss와 Player중 하나라도 체력이 0 이하가 된다면 게임은 종료.
    final int MAX_HP = 300;
    int bossHP = MAX_HP;
    int playerHP = MAX_HP;

    while (bossHP > 0 && playerHP > 0) {

      // Boss가 Player에게 공격 (데미지는 랜덤 정수)
      int bossATK = (int) (Math.random() * 100);
      System.out.println("Boss의 공격! 데미지: " + bossATK);
      playerHP -= bossATK;

      // Player가 Boss에게 공격 (데미지는 랜덤 정수)
      int playerATK = (int) (Math.random() * 100);
      System.out.println("Player의 공격! 데미지: " + playerATK);
      bossHP -= playerATK;

      // 각 공격이 끝난 후 서로의 체력을 출력
      System.out.println("남은 Boss의 체력: " + bossHP);
      System.out.println("남은 Player의 체력: " + playerHP);

      System.out.println();
    }

  }
}
