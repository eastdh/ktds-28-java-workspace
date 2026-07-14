package workflow;

public class ForEx {

  public static void main(String[] args) {

    // 구구단 2단 출력
    // for (int i = 1; i <= 9; i++) {
    // System.out.println("2 * " + i + " = " + (2 * i));
    //
    // }

    // 구구단 2 ~ 9단 출력
    for (int i = 1; i <= 9; i++) {
      for (int j = 2; j <= 9; j++) {
        System.out.print(j + " * " + i + " = " + (i * j) + "\t");
      }
      System.out.println();
    }

    int sum = 0;
    for (int i = 1; i <= 100; i++) {
      sum += i;
    }
    System.out.println(sum);

    int sum2 = 0;
    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 1) {
        sum2 += i;
      }
    }
    System.out.println(sum2);

    for (int i = 1; i <= 100; i++) {
      if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
        System.out.print(i + ", ");
      }
    }
    System.out.println();

    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }
}
