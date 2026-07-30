package com.ktdsuniversity.edu.oop.homework.arrays;

public class Main {
  public static void main(String[] args) {
    // 1. 정수형 배열 변수를 만들고 값을 할당해 보세요.
    int[] intArr = new int[10];
    for (int i = 0; i < intArr.length; i++) {
      intArr[i] = (int) (Math.random() * 20);
    }

    // 2. 정수형 배열 변수의 합을 계산해 출력해보세요.
    int intArrSum = 0;
    for (int i = 0; i < intArr.length; i++) {
      intArrSum += intArr[i];
    }
    System.out.println("정수형 배열 변수의 합: " + intArrSum);

    // 3. 실수형 배열 변수를 만들고 랜덤한 값을 할당해보세요.
    double[] doubleArr = new double[10];
    for (int i = 0; i < doubleArr.length; i++) {
      doubleArr[i] = Math.random() * 20;
    }

    // 4. 실수형 배열 변수의 합을 계산해 출력해보세요.
    double doubleArrSum = 0;
    for (int i = 0; i < doubleArr.length; i++) {
      doubleArrSum += doubleArr[i];
    }
    System.out.println("실수형 배열 변수의 합: " + doubleArrSum);

    // 5. 실수형 배열 변수 내의 가장 큰 값을 출력해보세요.
    double doubleArrMax = Double.MIN_VALUE;
    for (int i = 0; i < doubleArr.length; i++) {
      doubleArrMax = Math.max(doubleArrMax, doubleArr[i]);
    }
    System.out.println("실수형 배열 변수 내의 가장 큰 값: " + doubleArrMax);

    // 6. 실수형 배열 변수 내의 가장 작은 값을 출력해보세요.
    double doubleArrMin = Double.MAX_VALUE;
    for (int i = 0; i < doubleArr.length; i++) {
      doubleArrMin = Math.min(doubleArrMin, doubleArr[i]);
    }
    System.out.println("실수형 배열 변수 내의 가장 작은 값: " + doubleArrMin);

    // 7. 문자열형 배열 변수를 만들어 값을 할당해 보세요.
    String[] strArr = new String[10];
    for (int i = 0; i < strArr.length; i++) {
      int repeat = (int) (Math.random() * 10) + 1;
      strArr[i] = String.valueOf(i).repeat(repeat);
    }

    // 8. 문자열형 배열 변수 내의 값 중 길이가 가장 긴 문자열을 출력해보세요.
    String strArrLongest = "";
    for (int i = 0; i < strArr.length; i++) {
      if (strArr[i].length() > strArrLongest.length()) {
        strArrLongest = strArr[i];
      }
    }
    System.out.println("문자열형 배열 변수 내의 값 중 길이가 가장 긴 문자열: " + strArrLongest);

    // 9. 정수형 배열 변수를 만들고 랜덤한 값을 할당해보세요.
    // => 1.에서 만듦 (intArr)

    // 10. 정수형 배열 변수 내의 값 중 평균 이상의 값들만 출력해보세요.
    double intArrAvg = (double) intArrSum / intArr.length;
    System.out.print("정수형 배열 변수 내의 값 중 평균(" + intArrAvg + ") 이상의 값들: ");
    for (int i : intArr) {
      if (i >= intArrAvg) {
        System.out.print(i + " ");
      }
    }
    System.out.println();

    // 11. 상품을 표현하는 클래스를 만들어보세요.
    // => Item

    // 12. 상품을 표현하는 클래스의 배열 변수를 만들어보세요.
    Item[] items = new Item[10];
    for (int i = 0; i < items.length; i++) {
      int repeat = (int) (Math.random() * 10) + 1;
      int randomPrice = (int) (Math.random() * 20 + 1) * 100;
      String randomName = (char) (i + 97) + "";
      items[i] = new Item(randomName.repeat(repeat), randomPrice);
    }

    // 13. 상품을 표현하는 클래스의 배열 변수에서 가장 비싼 상품의 이름을 출력해보세요.
    Item itemsMaxPrice = new Item("", -1);
    for (int i = 0; i < items.length; i++) {
      if (items[i].getItemPrice() > itemsMaxPrice.getItemPrice()) {
        itemsMaxPrice = items[i];
      }
    }
    System.out.println("가장 비싼 상품의 이름: " + itemsMaxPrice.getItemName());

    // 14. 상품을 표현하는 클래스의 배열 변수내의 모든 상품의 이름을 출력해보세요.
    System.out.println("모든 상품의 이름을 출력: ");
    for (int i = 0; i < items.length; i++) {
      System.out.println("\t" + items[i].getItemName());
    }

    // 15. 숫자 형태의 문자열 배열 변수를 만들어보세요.
    // => 7.에서 만든 strArr

    // 16. 숫자 형태의 문자열 배열 변수의 값을 정수로 변환한 뒤 정수의 합과 평균을 출력해보세요.
    long[] longStrArr = new long[strArr.length];
    long longStrArrSum = 0;
    for (int i = 0; i < longStrArr.length; i++) {
      longStrArr[i] = Long.parseLong(strArr[i]);
      longStrArrSum += longStrArr[i];
    }
    System.out.println("숫자 형태의 문자열 배열 변수의 값을 정수로 변환한 뒤 정수의 합: " + longStrArrSum + ", 평균: "
        + (double) longStrArrSum / longStrArr.length);

    // 17. 불린 형태의 배열 변수를 만들고 값을 랜덤하게 할당해보세요.
    boolean[] boolArr = new boolean[20];
    for (int i = 0; i < boolArr.length; i++) {
      boolArr[i] = (int) (Math.random() * 2) == 0 ? false : true;
    }

    // 18. 불린 형태의 배열 변수 내에서 true의 개수는 몇 개인지 세어 출력해보세요.
    int trueCount = 0;
    for (int i = 0; i < boolArr.length; i++) {
      if (boolArr[i]) {
        trueCount++;
      }
    }
    System.out.println("불린 형태의 배열 변수 내에서 true의 개수: " + trueCount);

    // 19. 불린 형태의 배열 변수 내에서 false가 존재하는 비율은 몇 %인지 계산해 출력해보세요.
    System.out.println("불린 형태의 배열 변수 내에서 false가 존재하는 비율: "
        + (((float) boolArr.length - trueCount) / boolArr.length * 100) + "%");

    // 20. 문자열 형태의 배열 변수를 만들고 값을 랜덤하게 할당해보세요.
    String[] randomStrings = new String[20];
    System.out.println("랜덤 문자열 출력: ");
    for (int i = 0; i < randomStrings.length; i++) {
      randomStrings[i] = "";
      int randomLength = (int) (Math.random() * 10 + 1);
      for (int j = 0; j < randomLength; j++) {
        randomStrings[i] += (char) ((int) (Math.random() * 26) + 97);
      }
      System.out.println("\t" + randomStrings[i]);
    }
    // 21. 문자열 형태의 배열 변수 내의 모든 문자열의 길이를 합한 값을 계산해 출력해보세요.
    int lengthSum = 0;
    for (int i = 0; i < randomStrings.length; i++) {
      lengthSum += randomStrings[i].length();
    }
    System.out.println("문자열 형태의 배열 변수 내의 모든 문자열의 길이를 합한 값: " + lengthSum);

  }
}
