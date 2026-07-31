package com.ktdsuniversity.edu.oop.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class NIOWriteTest {

  public static void main(String[] args) {
    File targetFile = new File("C:/Java Exam/outputs", "java_output.txt");

    // C:/Java Exam/outputs 폴더가 존재하는지 확인
    if (!targetFile.getParentFile().exists()) {
      // 없으면 생성
      targetFile.getParentFile().mkdirs();
    }

    // java_output.txt 파일이 존재하는지 확인
    // 있으면 (2).txt로 순번을 증가시키면서 계속 확인
    // int index = 1;
    // while (targetFile.exists()) {
    // targetFile = new File(targetFile.getParent(), "java_output (%d).txt".formatted(index++));
    // }

    // 파일 생성
    // try {
    // targetFile.createNewFile();
    // } catch (IOException e) {
    // e.printStackTrace();
    // }

    // 파일을 생성하고 내용을 작성한다.
    // 작성할 내용을 만든다.
    List<String> data = new ArrayList<String>();
    data.add(String.valueOf((char) ((int) (Math.random() * 26) + 97))
        .repeat((int) (Math.random() * 10 + 1)));
    data.add(String.valueOf((char) ((int) (Math.random() * 26) + 97))
        .repeat((int) (Math.random() * 10 + 1)));
    data.add(String.valueOf((char) ((int) (Math.random() * 26) + 97))
        .repeat((int) (Math.random() * 10 + 1)));
    data.add(String.valueOf((char) ((int) (Math.random() * 26) + 97))
        .repeat((int) (Math.random() * 10 + 1)));
    data.add(String.valueOf((char) ((int) (Math.random() * 26) + 97))
        .repeat((int) (Math.random() * 10 + 1)));
    data.add(String.valueOf((char) ((int) (Math.random() * 26) + 97))
        .repeat((int) (Math.random() * 10 + 1)));
    data.add(String.valueOf((char) ((int) (Math.random() * 26) + 97))
        .repeat((int) (Math.random() * 10 + 1)));
    data.add(String.valueOf((char) ((int) (Math.random() * 26) + 97))
        .repeat((int) (Math.random() * 10 + 1)));
    data.add(String.valueOf((char) ((int) (Math.random() * 26) + 97))
        .repeat((int) (Math.random() * 10 + 1)));
    data.add(String.valueOf((char) ((int) (Math.random() * 26) + 97))
        .repeat((int) (Math.random() * 10 + 1)));

    try {
      Files.write(targetFile.toPath(), data, StandardOpenOption.APPEND);
    } catch (IOException e) {
      e.printStackTrace();
    }


  }
}
