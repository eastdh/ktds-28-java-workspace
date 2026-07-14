package workflow;

public class AngleYang {

  public static void main(String[] args) {
    // Q: https://school.programmers.co.kr/learn/courses/30/lessons/120829
    // 각 angle이
    // 예각일 때 1,
    // 직각일 때 2,
    // 둔각일 때 3,
    // 평각일 때 4
    //
    // 예각 : 0 < angle < 90
    // 직각 : angle = 90
    // 둔각 : 90 < angle < 180
    // 평각 : angle = 180
    int angle = 60;

    int angleResult = 0;
    if (angle > 0 && angle < 90) {
      angleResult = 1;
    } else if (angle == 90) {
      angleResult = 2;
    } else if (angle < 180) {
      angleResult = 3;
    } else if (angle == 180) {
      angleResult = 4;
    } else {
      System.out.println("잘못된 입력");
      angleResult = -1;
    }
    System.out.println(angleResult);


    // Q: https://school.programmers.co.kr/learn/courses/30/lessons/120830
    // 양꼬치 10인분을 먹으면 음료수 하나를 서비스로 줍니다.
    // 양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다.
    // 정수 n과 k가 주어졌을 때, 양꼬치 n인분과 음료수 k개를 먹었다면
    // 총얼마를 지불해야 하는지

    int n = 10;
    int k = 3;

    int totalCost = 0;
    final int N_PRICE = 12000;
    final int K_PRICE = 2000;

    int service = n / 10;
    if (k >= service) {
      k -= service;
    }

    totalCost = (N_PRICE * n) + (K_PRICE * k);

    System.out.println(totalCost);


  }

}
