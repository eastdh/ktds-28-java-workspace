package workflow;

public class Array {

  public static void main(String[] args) {

    // 여섯 개의 변수를 하나의 변수로 병합한다. ==> 배열
    // 배열을 만드는 방법:
    // 자료형[] 배열이름 = new 자료형 [값의 개수];
    int[] numArray = new int[6];

    // 배열의 인덱스에 값을 할당한다.
    numArray[0] = 5;
    numArray[1] = 6;
    numArray[2] = 9;
    numArray[3] = 11;
    numArray[4] = 12;
    numArray[5] = 13;

    System.out.println(numArray);

    // 배열 내부에 할당된 모든 숫자들을 출력한다.
    for (int i = 0; i < 6; i++) {
      // System.out.println(numArray[i]);
      boolean isRemainZero = false;
      for (int j = 2; j < numArray[i]; j++) {
        if (numArray[i] % j == 0) {
          System.out.println(numArray[i] + ": 소수가 아닙니다");
          isRemainZero = true;
          break;
        }
      }
      if (!isRemainZero) {
        System.out.println(numArray[i] + ": 소수입니다.");
      }
    }

    // 숫자 여러 개가 주어진다
    // 5, 6, 9, 11, 12, 13, ...
    // 주어진 숫자들이 소수인지 확인한다.

    int num1 = 5;
    int num2 = 6;
    int num3 = 9;
    int num4 = 11;
    int num5 = 12;
    int num6 = 13;


    // num1이 소수이면 "소수입니다" 출력, 아니면 "아닙니다" 출력
    boolean isRemainZero = false;
    for (int i = 2; i < num1; i++) {
      if (num1 % i == 0) {
        System.out.println(num1 + ": 소수가 아닙니다");
        isRemainZero = true;
        break;
      }
    }
    if (!isRemainZero) {
      System.out.println(num1 + ": 소수입니다.");
    }

  }
}
