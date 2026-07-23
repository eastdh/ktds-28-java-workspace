package com.ktdsuniversity.edu.oop.exam.strings;

import java.util.Scanner;

public class WordChain {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String lastWord = "자전거";
    String startLetter;
    String userInput;

    String wordList = "";
    wordList += lastWord;

    while (true) {
      System.out.println("마지막 단어: " + lastWord);
      startLetter = lastWord.split("")[lastWord.length() - 1];
      // startLetter = lastWord.charAt(lastWord.length() - 1) + "";
      // startLetter = lastWord.substring(lastWord.length() - 1);
      // startLetter = String.valueOf(lastWord.charAt(lastWord.length() - 1));
      System.out.println("시작 글자: " + startLetter);

      System.out.print("단어를 입력하세요: ");
      userInput = sc.nextLine().replaceAll(" ", "");

      if (!userInput.startsWith(startLetter) || userInput.length() < 3
          || wordList.contains(userInput)) {
        break;
      }

      wordList += " " + userInput;
      lastWord = userInput;
      System.out.println();
    }

    String[] words = wordList.split(" ");
    System.out.println("이어나간 단어의 수: " + (words.length - 1));
    sc.close();
  }
}
