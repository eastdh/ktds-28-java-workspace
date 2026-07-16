package workflow;

public class CU {

  public static int getAmount(int[] items, float[] dc) {
    int amount = 0;
    for (int i = 0; i < items.length; i++) {
      amount += (int) (items[i] * (1 - dc[i]));
    }
    return amount;
  }

  public static int buyPlasticBag(int[] items, int BAG_PRICE, int SPLIT_COUNT) {
    int bagCount = (int) Math.ceil(items.length / (double) SPLIT_COUNT);

    System.out.println("봉투 " + bagCount + "개 구매 - " + bagCount * BAG_PRICE + "원");

    return bagCount * BAG_PRICE;
  }

  public static int choosePaymentMethod() {
    return (int) (Math.random() * 5);
  }

  public static int calculateEarnPoints(int amount) {
    return (int) (amount * 0.1f);
  }

  public static int payCash(int cash, int amount) {

    if (cash >= amount) {
      cash -= amount;
      System.out.println("현금 결제 완료!");
      System.out.println("상품 총액: " + amount + " 현금 잔액: " + cash);
      amount = 0;
    } else {
      amount -= cash;
      cash = 0;
      System.out.println("현금 부분 결제 ");
      System.out.println("상품 총액: " + amount + " 현금 잔액: " + cash);
    }

    return amount;
  }

  public static int payCreditCard(int CARD_LIMIT, int cardPaidMoney, int amount) {

    if (CARD_LIMIT - cardPaidMoney >= amount) {
      cardPaidMoney += amount;
      if (amount >= 50_000) {
        // 할부 선택 (0 ==> 할부, 1 ==> 일시불)
        int installment = (int) (Math.random() * 2);
        if (installment == 0) {
          System.out.println("할부로 계산합니다");
        }
      }
      System.out.println("신용 카드 결제 완료!");
      System.out.println("상품 총액: " + amount + " 신용 카드 남은 한도: " + (CARD_LIMIT - cardPaidMoney));
      amount = 0;
    } else {
      amount -= CARD_LIMIT - cardPaidMoney;
      cardPaidMoney = CARD_LIMIT;
      System.out.println("신용 카드 부분 결제");
      System.out.println("상품 총액: " + amount + " 신용 카드 남은 한도: " + (CARD_LIMIT - cardPaidMoney));
    }

    return amount;
  }

  public static int payCheckCard(int remainAccount, int amount) {
    if (remainAccount >= amount) {
      remainAccount -= amount;
      System.out.println("체크 카드 결제 완료!");
      System.out.println("상품 총액: " + amount + " 체크 카드 잔액: " + remainAccount);
      amount = 0;
    } else {
      System.out.println("체크 카드 결제 실패");
    }
    return amount;
  }

  public static int payPoint(int point, int amount) {
    if (point > 0) {
      amount -= point;
      System.out.println("포인트 할인: " + point + " 결제 금액: " + amount);
      point = 0;
    }
    return amount;
  }

  public static void payment(int cash, int amount, int CARD_LIMIT, int cardPaidMoney,
      int remainAccount, int point) {
    // 결제 수단 선택 (0 ==> 현금, 1 ==> 신용카드, 2 ==> 체크카드, 3 ==> 포인트 선 결제 4 ==> 포기)
    // TODO 결제 수단 선택
    int paymentMethod = choosePaymentMethod();

    int remainingAmount = amount;
    while (remainingAmount > 0) {
      // TODO 현금으로 결제했을 때 보유한 현금을 최종 결제 금액만큼 차감
      if (paymentMethod == 0) {
        remainingAmount = payCash(cash, amount);
      }
      // 신용카드 + 결제금액 5만원 이상일 경우 할부/일시불 선택
      // TODO 신용카드로 결제했을 때 카드 결제 금액을 최종 결제 금액만큼 증가.
      else if (paymentMethod == 1) {
        remainingAmount = payCreditCard(CARD_LIMIT, cardPaidMoney, amount);
      }
      // TODO 체크 카드로 결제했을 때 체크 카드 잔액을 최종 결제 금액만큼 차감
      else if (paymentMethod == 2) {
        remainingAmount = payCheckCard(remainAccount, amount);
      }
      // TODO 포인트 선결제 했을 때 포인트를 최종 결제 금액만큼 차감
      else if (paymentMethod == 3) {
        remainingAmount = payPoint(point, amount);
      }
      // 결제 포기
      else {
        System.out.println("결제 포기");
        break;
      }

      if (remainingAmount <= 0) {
        // 포인트 적립 (0 ==> 적립 한다. 1 ==> 적립 안한다.)
        int addPoint = (int) (Math.random() * 2);
        // TODO 적립을 할 경우엔 총 결제 금액에서 10% 적립
        if (addPoint == 0) {
          int earnPoint = calculateEarnPoints(amount);
          point += earnPoint;
          System.out.println("포인트 적립: " + earnPoint + " 잔여 포인트: " + point);
        }
      } else {
        paymentMethod = choosePaymentMethod();
      }
    }
  }

  public static void main(String[] args) {
    // 편의점.drawio 파일을 토대로 작성한 코드

    // 시작
    // 손님이 바구니에 담아온 5개 상품의 가격 정보
    int[] items = new int[5];
    items[0] = 5000;
    items[1] = 1800;
    items[2] = 3200;
    items[3] = 30000;
    items[4] = 1300;

    // 손님이 바구니에 담아온 상품의 할인 정보
    float[] dc = new float[5];
    dc[0] = 0;
    dc[1] = 0.1f; // 1800원 상품을 10% 할인
    dc[2] = 0.2f; // 3200원 상품을 20% 할인
    dc[3] = 1; // 30000원 상품을 100% 할인
    dc[4] = 0;

    // 봉투 가격
    final int BAG_PRICE = 100;
    // 한 봉투에 넣을 수 있는 상품의 수
    final int SPLIT_COUNT = 2;

    // 고객의 자금 상황
    // 카드 한도
    final int CARD_LIMIT = 1_000_000;
    // 현재까지 사용한 카드 결제 금액
    int cardPaidMoney = 150_000;

    // 체크 카드 계좌 잔액
    int remainAccount = 4000;

    // 현금
    int cash = 30_000;

    // 보유 포인트
    int point = 1_750;

    // 최종 결제 금액
    // 손님이 가져온 상품 목록의 결제 금액 계산해서 amount에 할당
    // 할인률 계산 필요
    int amount = getAmount(items, dc);

    // 봉투 필요 여부 (0 ==> 필요, 1 ==> 불필요)
    int needBag = (int) (Math.random() * 2);
    if (needBag == 0) {
      amount += buyPlasticBag(items, BAG_PRICE, SPLIT_COUNT);
    }

    payment(cash, amount, CARD_LIMIT, cardPaidMoney, remainAccount, point);

  }

}
