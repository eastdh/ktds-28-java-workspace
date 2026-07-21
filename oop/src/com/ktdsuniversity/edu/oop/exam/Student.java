package com.ktdsuniversity.edu.oop.exam;

public class Student {

  // 각 과목 점수. 100점 만점
  int java;
  int python;
  int cpp;
  int csharp;

  /**
   * @param java
   * @param python
   * @param cpp
   * @param csharp
   */
  public Student(int java, int python, int cpp, int csharp) {
    this.java = java;
    this.python = python;
    this.cpp = cpp;
    this.csharp = csharp;
  }

  /**
   * 모든 과목 점수의 총합
   * 
   * @return 모든 과목 점수의 총합
   */
  public int getSumAllScores() {
    return java + python + cpp + csharp;
  }

  /**
   * 모든 과목 점수의 평균
   * 
   * @param sum
   * @return 모든 과목 점수의 평균 (소수점 둘 째 자리까지)
   */
  public double getAverage(int sum) {
    double average = (double) sum / 4;
    return average -= average % 0.01d;
  }

  /**
   * 학점 구하기
   * 
   * @param avg
   * @return 학점 (소수점 둘 째 자리까지)
   */
  public double getCourseCredit(double avg) {
    if (avg <= 55) {
      return 0.1;
    }
    double credit = (avg - 55) / 10;
    // double credit = avg / 100 * 4.5;
    return credit -= credit % 0.01d;
  }

  /**
   * 학점을 기준에 따라 알파벳으로 변환
   * 
   * @param credit
   * @return 등급
   */
  public String getABCDF(double credit) {
    if (credit >= 4.1) {
      return "A+";
    } else if (credit >= 3.6) {
      return "A0";
    } else if (credit >= 3.1) {
      return "B+";
    } else if (credit >= 2.6) {
      return "B0";
    } else if (credit >= 1.6) {
      return "C0";
    } else if (credit >= 0.6) {
      return "D0";
    } else {
      return "F";
    }
  }

  public static void main(String[] args) {
    Student student = new Student(78, 89, 97, 68);

    int sum = student.getSumAllScores();
    double avg = student.getAverage(sum);
    double credit = student.getCourseCredit(avg);
    String abcdf = student.getABCDF(credit);

    System.out.println("합계: " + sum);
    System.out.println("평균: " + avg);
    System.out.println("학점: " + credit);
    System.out.println("등급: " + abcdf);
  }
}
