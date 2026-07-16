package workflow;

public class MethodHW0716 {
  // 1. 정수형 변수 2개를 파라미터로 받아, 값을 출력하는 메소드.
  public static void print2Param(int a, int b) {
    System.out.println(a + ", " + b);
  }

  // 2. 정수형 변수 2개를 파라미터로 받아, 합계를 출력하는 메소드.
  public static void sum2Param(int a, int b) {
    System.out.println(a + " + " + b + " = " + (a + b));
  }

  // 3. 정수형 변수 3개를 파라미터로 받아, 합계를 반환하는 메소드.
  public static int sum3Param(int a, int b, int c) {
    return a + b + c;
  }

  // 4. 정수형 변수 2개를 파라미터로 받아, 나누기의 결과(실수)를 출력하는 메소드.
  public static void div2ParamPrint(int a, int b) {
    System.out.println(a + " / " + b + " = " + ((float) a / b));
  }

  // 5. 정수형 변수 2개를 파라미터로 받아, 나누기의 결과(실수)를 반환하는 메소드.
  public static float div2ParamReturn(int a, int b) {
    return (float) a / b;
  }

  // 6. 실수형 변수 1개와 정수형 파라미터 1개를 받아 소수점 이하 자리수를 변경하여 반환하는 메소드.
  // -> 예> 소수점 변경(10.33333333, 2) ==> 10.33
  // -> 예> 소수점 변경(10.33333333, 3) ==> 10.333
  // -> 예> 소수점 변경(10.33333333, 1) ==> 10.3
  // -> 예> 소수점 변경(10.33333333, 0) ==> 10.0
  public static double changeDecimalPlaces(Double a, int b) {
    int place = 1;
    for (int i = 0; i < b; i++) {
      place *= 10;
    }
    a -= a % ((double) 1 / place);
    return a;
  }

  // 7. 실수형 변수 2개를 파라미터로 받아, 가장 큰 수만 반환하는 메소드.
  public static double max2DoubleReturn(double a, double b) {
    if (a > b) {
      return a;
    } else {
      return b;
    }
  }

  // 8. 실수형 변수 4개를 파라미터로 받아, 가장 작은 수만 반환하는 메소드.
  public static double min4DoubleReturn(double a, double b, double c, double d) {
    double minDouble = Double.MAX_VALUE;
    if (a < minDouble) {
      minDouble = a;
    }
    if (b < minDouble) {
      minDouble = b;
    }
    if (c < minDouble) {
      minDouble = c;
    }
    if (d < minDouble) {
      minDouble = d;
    }

    return minDouble;
  }

  // 9. 정수 배열을 파라미터로 받아, 2,5,8 배수인 숫자만 출력하는 메소드.
  public static void print258InArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0 || arr[i] % 5 == 0) {
        System.out.print(arr[i] + ", ");
      }
    }
    System.out.println();
  }

  // 10. 문자열 1개와 정수형 변수 1개를 파라미터로 받아, 문자열을 정수형 변수만큼 반복 출력하는 메소드.
  public static void printStringN(String str, int n) {
    for (int i = 0; i < n; i++) {
      System.out.println(str);
    }
  }

  // 11. 정수형 변수 1개를 파라미터로 받아, 해당 정수의 구구단을 출력하는 메소드.
  public static void printNDan(int n) {
    for (int i = 1; i <= 9; i++) {
      System.out.println(n + " * " + i + " = " + n * i);
    }
  }

  // 12. 정수형 변수 1개를 파라미터로 받아, 4부터 정수형 변수까지의 범위 중 소수(Prime Number)만 출력하는 메소드.
  public static void print4toNPrimeOnly(int n) {


  }

  // 13. 정수형 배열 변수 1개와 정수형 변수 1개를 파라미터로 받아, 해당 배열의 정수형변수 인덱스에 의 값을 반환하는 메소드.
  //
  // -> 예> 값(길이가 5인 배열, 2) ==> 배열의 2번 인덱스의 값
  //
  // -> 예> 값(길이가 5인 배열, 4) ==> 배열의 4번 인덱스의 값
  //
  // -> 예> 값(길이가 5인 배열, 5) ==> 0
  //
  // -> 예> 값(길이가 5인 배열, -1) ==> 0
  //
  // -> 예> 값(길이가 5인 배열, 1) ==> 배열의 1번 인덱스의 값
  //
  // -> 예> 값(길이가 5인 배열, 0) ==> 배열의 0번 인덱스의 값
  //
  // -> 예> 값(길이가 5인 배열, 3) ==> 배열의 3번 인덱스의 값
  //
  // -> 예> 값(길이가 5인 배열, 7) ==> 0
  //
  // 14. 정수형 배열 변수 1개를 파라미터로 받아, 가장 처음 나오는 3의 배수만 반환하는 메소드
  //
  // - 정수형 배열 변수내부에 3의 배수가 없을 경우 -1 을 반환.
  //
  // 15. 정수형 배열 변수 2개를 파라미터로 받아, 각 배열에 중복값만 출력하는 메소드.
  //
  // -> 예> 중복([1,2,3,4,5], [9,7,454,1,2,3]) ==> 1 2 3
  //
  // -> 예> 중복([1,2,3,4,5], [1,2,3,4,5]) ==> ""
  //
  // 16. 정수형 배열 변수 2개를 파라미터로 받아, 각 배열에 중복되지 않는 값만 출력하는 메소드.
  //
  // -> 예> 고유([1,2,3,4,5], [9,7,454,1,2,3]) ==> 4, 5, 9. 7, 454
  //
  // -> 예> 고유([1,2,3,4,5], [1,2,3,4,5]) ==> ""
  //
  // 17. 정수형 배열 변수 1개를 파라미터로 받아, 모든 값들을 배수로 만드는(반환X) 메소드.
  //
  // -> 호출 이후에 main 메소드 내부에서 배열 내부의 값들을 모두 출력
  public static void main(String[] args) {
    System.out.println(changeDecimalPlaces(10.33333333, 3));

    printStringN("aaaa", 5);

  }
}
