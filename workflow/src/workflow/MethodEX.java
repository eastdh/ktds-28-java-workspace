package workflow;

public class MethodEX {


  public static void helloWorld() {
    System.out.println("Hello, World!");
  }

  public static void hello(String name) {
    System.out.println("Hello, " + name);
  }

  public static void powerAndPrint(int num) {
    int powerResult = num * num;
    System.out.println(powerResult);
  }

  public static void introduce(String name, int age) {
    System.out.println("Hi, my name is " + name + " and I'm " + age);
  }

  public static int birthYear(int age) {
    return 2026 - age + 1;
  }

  public static double divideTwoNumbers(int a, int b) {
    if (b != 0) {
      double divResult = (double) a / b;
      return divResult;

    } else {
      return -1;
    }

  }

  public static void main(String[] args) {

    // 단순하게 출력하는 메소드(함수)를 생성하고 호출한다.
    helloWorld();
    helloWorld();
    helloWorld();

    // 파라미터(인자)가 있는 메소드(함수)를 생성하고 호출한다.
    hello("유동혁");
    powerAndPrint(2);
    powerAndPrint(3);
    powerAndPrint(5);

    // 파라미터(인자)가 여러 개 있는 메소드(함수)를 생성하고 호출한다.
    introduce("유동혁1", 291);
    introduce("유동혁2", 292);
    introduce("유동혁3", 293);

    // 반환값(결과)있는 메소드(함수)를 생성하고 호출한 뒤 결과를 출력한다.
    System.out.println(birthYear(29));
    double div1 = divideTwoNumbers(10, 3);
    System.out.println(div1);
    double div2 = divideTwoNumbers(20, 7);
    System.out.println(div2);
  }
}
