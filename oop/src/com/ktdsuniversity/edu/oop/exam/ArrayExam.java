package com.ktdsuniversity.edu.oop.exam;

public class ArrayExam {

  public static void main(String[] args) {
    // 배열을 정의하고 생성하는 3가지 방법
    // 1. 자료형[] 배열 이름 = new 자료형[배열 길이]
    int nums[] = new int[3];
    nums[0] = 10;
    nums[1] = 20;
    nums[2] = 30;

    // 2. 자료형[] 배열 이름 = new 자료형[] ({각 인덱스에 들어갈 값 들}
    int[] num2 = new int[] {50, 30, 60, 10, 20, 66, 7, 8};
    System.out.println(num2.length);

    // 3. 자료형[] 배열 이름 = {각 인덱스에 들어갈 값들}
    int[] num3 = {100, 200, 300, 400, 500};
    System.out.println(num3.length);



  }
}

