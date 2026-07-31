package com.ktdsuniversity.edu.oop.collection.map;

import java.util.HashMap;
import java.util.Map;

public class Tag {
  public static void main(String[] args) {

    // 의류에 붙어있는 택 정보를 Map을 이용해 표현.
    Map<String, Object> tags = new HashMap<>();

    tags.put("사이즈", 30);
    tags.put("소재", "폴리에스테르");
    tags.put("가격", 59_000);

    System.out.println(tags);
    // {소재=폴리에스테르, 사이즈=30, 가격=59000}
    // 넣었던 순서와 다르게 출력됨
    // => Hash 알고리즘때문에 순서를 보장할 수 없음.
    System.out.println(tags.size()); // 3

    tags.put("가격", 69_000);

    System.out.println(tags);
    System.out.println(tags.size());

    String sojae = (String) tags.get("소재"); // is-a를 반대로 하는 것은 명시적 형변환
    System.out.println(sojae);

    String brand = (String) tags.get("브랜드");
    System.out.println(brand);

    int price = (int) tags.get("가격");
    System.out.println(price);

    if (tags.containsKey("할인가")) { // null 방지 1
      int discount = (int) tags.get("할인가"); // NullPointerException!
      System.out.println(discount);
    }

    int discount = (int) tags.getOrDefault("할인가", 0); // null 방지 2
    System.out.println(discount);

  }

}
