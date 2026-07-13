package operations;

public class Operations {

  public static void main(String[] args) {

    // 정수 변수를 두 개 만들어서 다른 정수 변수에 결과를 저장한 후 출력한다.
    int firstNum = 10;
    int secondNum = 30;

    // firstNum + secondNum
    int addResult = firstNum + secondNum;
    System.out.println(addResult);

    // firstNum - secondNum
    int subResult = firstNum - secondNum;
    System.out.println(subResult);

    // firstNum * secondNum
    int mulResult = firstNum * secondNum;
    System.out.println(mulResult);

    // firstNum / secondNum
    int divResult = firstNum / secondNum;
    System.out.println(divResult);

    float firstFloatNum = 10.5f;
    float secondFloatNum = 3.55f;
    float divFloatNum = firstFloatNum / secondFloatNum;
    System.out.println(divFloatNum);

    // 정수 변수 3개를 만들어서 평균 계산 후 실수 변수에 저장한다면?
    int kor = 80;
    int math = 90;
    int sci = 93;

    float avg = (kor + math + sci) / 3; // expected result: 87.66667
    System.out.println(avg); // result: 87.0

    // 이런 문제를 해결하려면:
    float avg2 = (kor + math + sci) / 3f; // 묵시적 형변환 이용!
    System.out.println(avg2); // result: 87.666664

    final float SUBJECT_COUNT = 3f;
    // SUBJECT_COUNT = 4; // ==> error!

    float avg3 = (kor + math + sci) / SUBJECT_COUNT; // 묵시적 형변환 이용!
    System.out.println(avg3); // result: 87.666664


    int maxIntValue = Integer.MAX_VALUE;
    int minIntValue = Integer.MIN_VALUE;

    // maxIntValue = maxIntValue + 1;
    // minIntValue = minIntValue - 1;
    // maxIntValue += 1;
    // minIntValue -= 1;
    maxIntValue++;
    minIntValue--;

    System.out.println(maxIntValue);
    System.out.println(minIntValue);

    int bigNumber = 1_000_000_000;
    int powerResult = bigNumber * bigNumber;
    System.out.println(powerResult); // overflow

    // 나누기의 나머지를 구한다.
    int num1 = 10;
    int num2 = 3;

    int mod = num1 % num2;
    System.out.println(mod);


    // 증감 연산자 ++, --
    int num = 10;
    System.out.println(num++); // 출력 10, 출력 후 11
    System.out.println(++num); // 출력 12, 출력 후 12

    System.out.println(num--); // 출력 12, 출력 후 11
    System.out.println(--num); // 출력 10, 출력 후 10

    int num3 = 3;
    int num4 = 5;

    int operResult = num++ + num3 * num4; // result??
    System.out.println(operResult); // num = 11, result = 25

  }
}
