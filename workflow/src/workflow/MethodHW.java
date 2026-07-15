package workflow;

public class MethodHW {

  public static String operations(int a, int b) {
    int add = a + b;
    int sub = a - b;
    int mul = a * b;
    double div;
    if (b != 0) {
      div = (double) a / b;
    } else {
      div = 0;
    }

    return a + ", " + b + " add: " + add + " sub: " + sub + " mul: " + mul + " div: " + div;
  }

  public static boolean isEvenNumber(int num) {
    return num % 2 == 0;
  }

  public static int maxNum3(int a, int b, int c) {
    int max;

    if (a > b) {
      max = a;
    } else {
      max = b;
    }
    if (max < c) {
      max = c;
    }

    return max;
  }

  public static boolean isPrimeNum(int num) {
    if (num <= 1) {
      return false;
    }
    int sqrt_num = (int) Math.sqrt(num);
    for (int i = 2; i <= sqrt_num; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    // 1. 정수 두 개를 받아서 사칙연산의 결과를 출력하는 메소드를 만들고 호출해보세요.
    System.out.println(operations(10, 3));
    System.out.println(operations(20, 7));
    System.out.println(operations(10, 0));

    // 2. 정수 한 개를 받아서 짝수라면 true, 홀수라면 false를 반환하는 메소드를 만들고 호출해보세요.
    System.out.println("is 10 even number? " + isEvenNumber(10));
    System.out.println("is 5 even number? " + isEvenNumber(5));
    System.out.println("is 31 even number? " + isEvenNumber(31));

    // 3. 정수 세 개를 받아서 가장 큰 수를 출력하는 메소드를 만들고 호출해보세요.
    System.out.println("max in 1, 2, 3: " + maxNum3(1, 2, 3));
    System.out.println("max in 4, 5, 6: " + maxNum3(4, 5, 6));
    System.out.println("max in 9, 2, 5: " + maxNum3(9, 2, 5));

    // 4. 정수 한 개를 받아서 소수(Prime Number)라면 true, 아니라면 false를 반환하는 메소드를 만들고 호출해보세요.
    System.out.println("is 1 prime number? " + isPrimeNum(1));
    System.out.println("is 2 prime number? " + isPrimeNum(2));
    System.out.println("is 3 prime number? " + isPrimeNum(3));
    System.out.println("is 4 prime number? " + isPrimeNum(4));
    System.out.println("is 5 prime number? " + isPrimeNum(5));
    System.out.println("is 6 prime number? " + isPrimeNum(6));

  }
}
