package com.ktdsuniversity.edu.oop.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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


    // Map을 쓰면 안 되는 이유?!
    List<Map<String, Object>> clothes = new ArrayList<>();

    Map<String, Object> tags1 = new HashMap<String, Object>();
    tags1.put("판매가격", 15000);
    tags1.put("소재", "나이론");
    tags1.put("사이즈", 30);
    clothes.add(tags1);

    Map<String, Object> tags2 = new HashMap<String, Object>();
    tags2.put("가격", 16000);
    tags2.put("소재", "폴리");
    tags2.put("size", 32);
    clothes.add(tags2);

    Map<String, Object> tags3 = new HashMap<String, Object>();
    tags3.put("가격", 5000);
    tags3.put("소재", "면");
    tags3.put("사이즈", 50);
    clothes.add(tags3);

    for (int i = 0; i < clothes.size(); i++) {
      printTags(clothes.get(i));

    }
  }

  public static void printTags(Map<String, Object> tags) {
    System.out.println("소재: " + tags.get("소재"));
    System.out.println("가격: " + tags.get("가격"));
    System.out.println("사이즈: " + tags.get("사이즈"));
  }

  /*
   * 소재: 나이론
   * 가격: null
   * 사이즈: 30
   * 소재: 폴리
   * 가격: 16000
   * 사이즈: null
   * 소재: 면
   * 가격: 5000
   * 사이즈: 50
   * 
   */
}
