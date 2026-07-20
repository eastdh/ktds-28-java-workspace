package workflow;

public class MethodHW0716 {
  // 1. 정수형 변수 2개를 파라미터로 받아, 값을 출력하는 메소드.
  public static void print2Param(int a, int b) {
    System.out.println(a + " " + b);
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
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] % 2 == 0 || arr[i] % 5 == 0) {
        System.out.print(arr[i] + " ");
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
    // 각 인덱스 값으로 배열 초기화
    int[] primes = new int[n + 1];
    for (int i = 2; i < primes.length; i++) {
      primes[i] = i;
    }

    // 소수의 배수들을 전부 0으로 바꿈
    for (int i = 2; i < primes.length; i++) {
      if (primes[i] == 0) {
        continue;
      }
      for (int j = 2; i * j <= n; j++) {
        primes[i * j] = 0;
      }
    }

    // 출력
    for (int i = 4; i < primes.length; i++) {
      if (primes[i] != 0) {
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }

  // 13. 정수형 배열 변수 1개와 정수형 변수 1개를 파라미터로 받아, 해당 배열의 정수형변수 인덱스에 의 값을 반환하는 메소드.
  // -> 예> 값(길이가 5인 배열, 2) ==> 배열의 2번 인덱스의 값
  // -> 예> 값(길이가 5인 배열, 4) ==> 배열의 4번 인덱스의 값
  // -> 예> 값(길이가 5인 배열, 5) ==> 0
  // -> 예> 값(길이가 5인 배열, -1) ==> 0
  // -> 예> 값(길이가 5인 배열, 1) ==> 배열의 1번 인덱스의 값
  // -> 예> 값(길이가 5인 배열, 0) ==> 배열의 0번 인덱스의 값
  // -> 예> 값(길이가 5인 배열, 3) ==> 배열의 3번 인덱스의 값
  // -> 예> 값(길이가 5인 배열, 7) ==> 0
  public static int arrayNthValueReturn(int[] arr, int n) {
    if (n >= 0 && n < arr.length) {
      return arr[n];
    } else {
      return 0;
    }
  }

  // 14. 정수형 배열 변수 1개를 파라미터로 받아, 가장 처음 나오는 3의 배수만 반환하는 메소드
  // - 정수형 배열 변수내부에 3의 배수가 없을 경우 -1 을 반환.
  public static int first3NReturn(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > 0 && arr[i] % 3 == 0) {
        return arr[i];
      }
    }
    return -1;
  }

  // 15. 정수형 배열 변수 2개를 파라미터로 받아, 각 배열에 중복값만 출력하는 메소드.
  // -> 예> 중복([1,2,3,4,5], [9,7,454,1,2,3]) ==> 1 2 3
  // -> 예> 중복([1,2,3,4,5], [1,2,3,4,5]) ==> 1 2 3 4 5
  public static void printDuplicate(int[] a, int[] b) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < b.length; j++) {
        if (a[i] == b[j]) {
          System.out.print(a[i] + " ");
          break;
        }
      }
    }
    System.out.println();
  }

  // 16. 정수형 배열 변수 2개를 파라미터로 받아, 각 배열에 중복되지 않는 값만 출력하는 메소드.
  // -> 예> 고유([1,2,3,4,5], [9,7,454,1,2,3]) ==> 4, 5, 9. 7, 454
  // -> 예> 고유([1,2,3,4,5], [1,2,3,4,5]) ==> ""
  public static void printUnique(int[] a, int[] b) {
    for (int i = 0; i < a.length; i++) {
      boolean isUnique = true;
      for (int j = 0; j < b.length; j++) {
        if (a[i] == b[j]) {
          isUnique = false;
          break;
        }
      }
      if (isUnique) {
        System.out.print(a[i] + " ");
      }
    }
  }

  public static void printAllUnique(int[] a, int[] b) {
    printUnique(a, b);
    printUnique(b, a);
    System.out.println();
  }

  // 17. 정수형 배열 변수 1개를 파라미터로 받아, 모든 값들을 배수로 만드는(반환X) 메소드.
  // -> 호출 이후에 main 메소드 내부에서 배열 내부의 값들을 모두 출력
  public static void doubleAll(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] *= 2;
    }
  }

  public static void main(String[] args) {
    System.out.println("1 -----------------"); // 1.
    print2Param(3, 7);

    System.out.println("2 -----------------"); // 2.
    sum2Param(7, 11);

    System.out.println("3 -----------------"); // 3.
    System.out.println("3 + 5 + 7 = " + sum3Param(3, 5, 7));

    System.out.println("4 -----------------"); // 4.
    div2ParamPrint(10, 3);

    System.out.println("5 -----------------"); // 5.
    System.out.println("10 / 3 = " + div2ParamReturn(10, 3));

    System.out.println("6 -----------------"); // 6.
    System.out.println(changeDecimalPlaces(10.33333333, 0));
    System.out.println(changeDecimalPlaces(10.33333333, 1));
    System.out.println(changeDecimalPlaces(10.33333333, 3));

    System.out.println("7 -----------------"); // 7.
    double max2Double = max2DoubleReturn(10.9, 10.13);
    System.out.println("max(10.9, 10.13): " + max2Double);

    System.out.println("8 -----------------"); // 8.
    double min4Double = min4DoubleReturn(10.1, 10.11, 10.9, 10.05);
    System.out.println("min(10.1, 10.11, 10.9, 10.05): " + min4Double);

    System.out.println("9 -----------------"); // 9.
    int[] arr50 = new int[50];
    for (int i = 0; i < arr50.length; i++) {
      arr50[i] = i;
    }
    print258InArray(arr50);

    System.out.println("10 -----------------"); // 10.
    printStringN("aaaa", 5);

    System.out.println("11 -----------------"); // 11.
    printNDan(7);

    System.out.println("12 -----------------"); // 12.
    System.out.print("primes -> ");
    print4toNPrimeOnly(101);

    System.out.println("13 -----------------"); // 13.
    System.out.println(arrayNthValueReturn(arr50, 2));
    System.out.println(arrayNthValueReturn(arr50, 35));
    System.out.println(arrayNthValueReturn(arr50, 100));

    System.out.println("14 -----------------"); // 14.
    System.out.println(first3NReturn(arr50));

    System.out.println("15 -----------------"); // 15.
    int[] arrA = {1, 2, 3, 4, 5};
    int[] arrB = {9, 7, 454, 1, 2, 3};
    int[] arrC = {1, 2, 3, 4, 5};
    printDuplicate(arrA, arrB);
    printDuplicate(arrC, arrC);

    System.out.println("16 -----------------"); // 16.
    printAllUnique(arrA, arrB);
    printAllUnique(arrC, arrC);

    System.out.println("17 -----------------"); // 17.
    int[] arr2X = {1, 2, 3, 4, 5};
    doubleAll(arr2X);
    for (int i = 0; i < arr2X.length; i++) {
      System.out.print(arr2X[i] + " ");
    }

  }
}
