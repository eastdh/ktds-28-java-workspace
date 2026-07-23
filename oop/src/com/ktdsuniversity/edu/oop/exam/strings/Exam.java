package com.ktdsuniversity.edu.oop.exam.strings;

public class Exam {

  public static void main(String[] args) {
    String address = "서울특별시 서초구 효령로 176";
    boolean isSeoul = address.contains("서울");
    System.out.println("서울 포함: " + isSeoul);

    boolean is176 = address.endsWith("176");
    System.out.println("176으로 끝나는가: " + is176);

    String name = "ktdsuniversity";
    boolean isEqual = name.equals("ktdsuniversity");
    System.out.println("ktdsuniversity 와 동일한가: " + isEqual);

    String nameWithCapital = "KTdsUniversity";
    boolean isEqualIgnoreCase = name.equalsIgnoreCase(nameWithCapital);
    System.out.println("대소문자 무시하고 동일한가: " + isEqualIgnoreCase);

    String alphabets = "abcdefg";
    int letterCIndex = alphabets.indexOf('c');
    System.out.println(alphabets + "에서 'c'의 위치: " + letterCIndex);

    int letterUpperCIndex = alphabets.indexOf('C');
    System.out.println(alphabets + "에서 'C'의 위치: " + letterUpperCIndex);

    int letterDEFIndex = alphabets.indexOf("def");
    System.out.println(alphabets + "에서 def의 위치: " + letterDEFIndex);

    String blank = "   ";
    boolean isBlank = blank.isBlank();
    boolean isEmpty = blank.isEmpty();
    System.out.println("'   '(띄어쓰기 3개) isBlank?: " + isBlank + " isEmpty? " + isEmpty);

    String greeting = "안녕하세요";
    String userName = "홍길동님";
    String greetUser = String.join(", ", greeting, userName);
    System.out.println("인사와 이름을 쉼표로 연결: " + greetUser);

    String message = "message";
    int letterELastIndex = message.lastIndexOf("e");
    System.out.println("message에서 마지막 e 위치: " + letterELastIndex);

    int letterJJLastIndex = message.lastIndexOf("jj");
    System.out.println("message에서 마지막 jj 위치: " + letterJJLastIndex);

    int messageLength = message.length();
    System.out.println("message의 길이: " + messageLength);

    System.out.println("regex");
    String phone = "01012341234";
    boolean isNumber = phone.matches("^[0-9]+$");
    System.out.println(phone + " -> 숫자로만 이루어져 있나? " + isNumber);

    String hiBye = "안녕하세요, 홍길동님, 안녕히 가세요, 홍길동님";
    hiBye = hiBye.replace("홍길동", "ktds");
    System.out.println(hiBye);

    phone = "010-1234-1234";
    phone = phone.replaceAll("[^0-9]", "");
    System.out.println("전화번호에서 숫자 아닌 것 제거: " + phone);

    phone = "010-1234-5678";
    String[] phoneArea = phone.split("-");
    System.out.println(phoneArea[0]);
    System.out.println(phoneArea[1]);
    System.out.println(phoneArea[2]);

    phone = "+82-010-1234-5678";
    boolean isKoreanNum = phone.startsWith("+82");
    System.out.println(phone + " -> 한국 번호인가? " + isKoreanNum);

    String datetime = "2026-07-23 14:30:17";
    String year = datetime.substring(0, 4);
    System.out.println("연도: " + year);

    String time = datetime.substring(11);
    System.out.println("시간: " + time);

    datetime = "    " + datetime + "    ";
    System.out.println(datetime.length());
    System.out.println(datetime);
    datetime = datetime.trim();
    System.out.println(datetime.length());
    System.out.println(datetime);

    String oneStr = String.valueOf(1);
    System.out.println(oneStr);

    int biggestInt = Integer.MAX_VALUE;
    System.out.println(biggestInt);

    String bigIntStr = "%,d".formatted(biggestInt);
    System.out.println(bigIntStr);

  }
}
