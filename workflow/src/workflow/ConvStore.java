package workflow;

public class ConvStore {

  public static void main(String[] args) {

    // A 편의점은 한 종류의 음료수만 판매합니다.
    // 음료수의 하나의 가격은 3000원 입니다. <== 상수

    // 5000원을 가지고 있는 손님이 음료수를 3개 구매하려 합니다. <== 변수
    // 구매할 수 있다면 (음료수 가격) X (구매 개수)를 출력하고,
    // 구매할 수 없다면 "금액이 부족합니다."를 출력한다.

    final int PRICE_A = 3000;

    int wallet = 5000;
    int numOfBeverage = 3;

    if (PRICE_A * numOfBeverage <= wallet) {
      System.out.println(PRICE_A * numOfBeverage);
    } else {
      System.out.println("금액이 부족합니다.");
    }


    // ================================================================================

    // B 편의점은 한 종류의 음료수만 판매합니다.
    // 총 5개의 음료수가 있으며 음료수 하나의 가격은 4500원 입니다. <== 상수

    // 30,000원을 갖고 있는 손님이 음료수를 n개 구매하려 합니다.
    // 만약, 손님이 음료수를 5개 이하를 구매할 수 있으면(금액이 충분하면) 음료수 가격 X 구매 개수를 출력합니다.
    // 그러나, 5개 이하를 구매할 수 없으면(금액이 충분하지 않으면) "금액이 부족합니다."를 출력합니다.
    // 만약, 손님이 음료수를 6개 이상 구매하려 한다면 "재고수가 충분하지 않습니다" 를 출력합니다.

    final int PRICE_B = 4500;
    final int STOCK = 5;
    final int WALLET_B = 30_000;

    int n = 5;
    int amount = PRICE_B * n;

    if (n > STOCK) {
      System.out.println("재고가 충분하지 않습니다");

    } else {

      if (amount <= WALLET_B) {
        System.out.println(amount);

      } else {
        System.out.println("금액이 부족합니다.");

      }

    }

  }
}
