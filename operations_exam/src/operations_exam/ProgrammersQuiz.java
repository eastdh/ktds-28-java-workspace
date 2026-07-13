package operations_exam;

public class ProgrammersQuiz {

  public static void main(String[] args) {

    int num1 = 10;
    int num2 = 3;

    // Q: https://school.programmers.co.kr/learn/courses/30/lessons/120804
    int mulResult = num1 * num2;
    System.out.println(mulResult);

    // Q: https://school.programmers.co.kr/learn/courses/30/lessons/120803
    int subResult = num1 - num2;
    System.out.println(subResult);

    // Q: https://school.programmers.co.kr/learn/courses/30/lessons/120810
    int modResult = num1 % num2;
    System.out.println(modResult);

    // Q: https://school.programmers.co.kr/learn/courses/30/lessons/120805
    int divResult = num1 / num2;
    System.out.println(divResult);

    // Q: https://school.programmers.co.kr/learn/courses/30/lessons/120820
    int age = 25;
    int birthYear = 2022 - age + 1;
    System.out.println(birthYear);
  }
}
