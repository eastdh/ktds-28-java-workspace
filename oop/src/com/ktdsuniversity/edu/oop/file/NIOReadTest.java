package com.ktdsuniversity.edu.oop.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class NIOReadTest {

  public static void main(String[] args) {
    File file = new File("C:/Java Exam", "Java Exam.txt");


    if (file.exists() && file.isFile()) {
      // file을 읽어서 List에 저장.
      List<String> lines = null;
      try {
        lines = Files.readAllLines(file.toPath());
      } catch (IOException ioe) {
        ioe.printStackTrace();
      }

      if (lines != null) {
        for (int i = 0; i < lines.size(); i++) {
          System.out.println(lines.get(i));

        }
      }
    }
  }
}
