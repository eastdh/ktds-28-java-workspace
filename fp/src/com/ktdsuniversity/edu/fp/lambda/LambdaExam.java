package com.ktdsuniversity.edu.fp.lambda;

public class LambdaExam {

  public static void main(String[] args) {

    Computable addComputer = new Computable() {

      @Override
      public int compute(int a, int b) {
        return a + b;
      }
    };

    System.out.println(addComputer);
    // com.ktdsuniversity.edu.fp.lambda.LambdaExam$1@8bcc55f

    System.out.println(addComputer.compute(10, 40));

    // 추상 메소드가 1개만 있는 Computable 인터페이스를 이용해 함수를 만들기
    Computable mulComputer = (int a, int b) -> {
      return a * b;
    };

    System.out.println(mulComputer);
    // com.ktdsuniversity.edu.fp.lambda.LambdaExam$$Lambda/0x000000003b040648@14dad5dc

    System.out.println(mulComputer.compute(3, 8));

    // Computable 인터페이스를 이용해 두 개 숫자를 뺄셈한 결과를 반환시키는 함수
    Computable subComputer = (a, b) -> a - b;
    System.out.println(subComputer.compute(10, 3));

    // Computable 인터페이스를 이용해 두 개 숫자를 나눗셈한 결과를 반환시키는 함수
    Computable divComputer = (a, b) -> a / b;
    System.out.println(divComputer.compute(10, 3));

    // Computable 인터페이스를 이용해 두 개 숫자를 나눗셈한 나머지를 반환시키는 함수
    Computable modComputer = (a, b) -> a % b;
    System.out.println(modComputer.compute(10, 3));
  }
}
