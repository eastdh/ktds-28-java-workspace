package com.ktdsuniversity.edu.oop.collection.list;

import java.util.ArrayList;
import java.util.List;
import com.ktdsuniversity.edu.oop.exceptions.Goods;

public class ListExam {

  public static void main(String[] args) {

    // 정수를 관리하는 리스트 생성
    List<Integer> decimalList = new ArrayList<>();

    // 리스트에 몇 개의 정수가 있나?
    int size = decimalList.size();
    System.out.println(size); // 0

    // 리스트에 정수 하나를 추가
    decimalList.add(1200); // index 0
    decimalList.add(2400); // index 1

    // 리스트에 몇 개의 정수가 있나?
    size = decimalList.size();
    System.out.println(size); // 2

    // 리스트의 0번 인덱스의 값을 가져온다.
    int value0 = decimalList.get(0);
    System.out.println(value0);

    // 리스트의 1번 인덱스의 값을 가져온다.
    int value1 = decimalList.get(1);
    System.out.println(value1);

    // 리스트의 2번 인덱스의 값을 가져온다.
    if (decimalList.size() > 2) {
      int value2 = decimalList.get(2);
      System.out.println(value2);
    }

    // 리스트의 0번 인덱스를 삭제하고
    // 해당 인덱스에 있던 값을 반환시킨다.
    int removedValue = decimalList.remove(0);
    System.out.println(removedValue + " 삭제됨.");

    // 삭제한 이후의 리스트의 사이즈를 출력해본다.
    size = decimalList.size();
    System.out.println(size + "개 정수가 있음.");

    // 리스트의 1번 인덱스의 값을 가져온다.
    // value1 = decimalList.get(1); // IndexOutOfBoundsException!
    // remove는 인덱스 자체를 제거한다!
    // 삭제된 부분의 뒷 자리들이 빈 자리를 채운다.
    value1 = decimalList.get(0);
    System.out.println(value1);

    // 리스트에 10개의 랜덤 값을 추가한다.
    decimalList.add((int) (Math.random() * 1000));
    decimalList.add((int) (Math.random() * 1000));
    decimalList.add((int) (Math.random() * 1000));
    decimalList.add((int) (Math.random() * 1000));
    decimalList.add((int) (Math.random() * 1000));
    decimalList.add((int) (Math.random() * 1000));
    decimalList.add((int) (Math.random() * 1000));
    decimalList.add((int) (Math.random() * 1000));
    decimalList.add((int) (Math.random() * 1000));
    decimalList.add((int) (Math.random() * 1000));

    System.out.println(decimalList.size() + "개 정수가 있음.");

    decimalList.add(100);
    if (decimalList.contains(100)) {
      System.out.println("100 존재");
    }
    if (decimalList.contains(200)) {
      System.out.println("200 존재");
    }
    if (decimalList.contains(305)) {
      System.out.println("305 존재");
    }

    System.out.println(decimalList);

    for (int i = 0; i < decimalList.size(); i++) {
      System.out.println(i + " 번째 숫자: " + decimalList.get(i));
    }

    List<Goods> goodsList = new ArrayList<Goods>();

    // goodsList에 Goods 인스턴스를 추가한다.
    goodsList.add(new Goods("aaa", 1111));
    // goodsList에 Goods 인스턴스를 추가한다.
    goodsList.add(new Goods("bbb", 2222));
    // goodsList에 Goods 인스턴스를 추가한다.
    goodsList.add(new Goods("ccc", 3333));

    // goodsList의 0번째 인덱스에 있는 Goods 인스턴스를 가져와 출력한다.
    System.out.println(goodsList.get(0));
    // goodsList의 1번째 인덱스에 있는 Goods 인스턴스를 가져와 출력한다.
    System.out.println(goodsList.get(1));
    // goodsList의 2번째 인덱스에 있는 Goods 인스턴스를 가져와 출력한다.
    System.out.println(goodsList.get(2));

    // goodsList의 모든 Goods 인스턴스를 출력한다 (for)
    for (int i = 0; i < goodsList.size(); i++) {
      System.out.println(goodsList.get(i));

    }
  }
}
