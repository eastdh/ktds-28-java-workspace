package com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.entity.Book;
import com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.entity.Rental;
import com.ktdsuniversity.edu.oop.homework.august_vacation.hw3.entity.User;

public class FileUtils {

  private static final String BOOK_PATH = "data/books.csv";
  private static final String USER_PATH = "data/users.csv";
  private static final String RENTAL_PATH = "data/rental.csv";

  private FileUtils() {}

  public static <T> String getFilePath(Class<T> data) {

    if (data == Book.class) {
      return BOOK_PATH;
    } else if (data == User.class) {
      return USER_PATH;
    } else if (data == Rental.class) {
      return RENTAL_PATH;
    } else {
      return "";
    }

  }

  public static <T> void writeFile(List<T> dataList) {

    String filePath = getFilePath(dataList.getFirst().getClass());
    List<String> linesToWrite = new ArrayList<>();

    dataList.stream() // Stream<T>
        .map(CsvUtils::toCsvLine) // Stream<String>
        .forEach(s -> linesToWrite.add(s));

    try (BufferedWriter bw =
        new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath), "UTF-8"))) {
      for (int i = 0; i < linesToWrite.size(); i++) {
        bw.write(linesToWrite.get(i));
        if (i < linesToWrite.size() - 1) {
          bw.newLine();
        }
      }
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }

  }

  public static <T> List<T> parseCsv(Class<T> dataClass, Function<String[], T> mapper) {
    String filePath = getFilePath(dataClass);
    List<T> result = new ArrayList<>();
    String line;

    try (BufferedReader br =
        new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"))) {
      while ((line = br.readLine()) != null) {
        if (line.isBlank()) {
          continue;
        }

        String[] tokens = line.split(",");
        T item = mapper.apply(tokens);
        if (item != null) {
          result.add(item);
        }
      }

    } catch (IOException ioe) {
      ioe.printStackTrace();

    }

    return result;

  }

  public static <T> void createRow(List<T> dataList, T newData) {
    dataList.add(newData);
    FileUtils.writeFile(dataList);
  }

  public static void readRow() {

  }

  public static <T> void updateRow(List<T> dataList, T newData) {
    boolean isExist = false;
    for (int i = 0; i < dataList.size(); i++) {
      T t = dataList.get(i);
      if (t.equals(newData)) {
        isExist = true;
        dataList.set(i, newData);
        break;
      }
    }
    if (isExist) {
      FileUtils.writeFile(dataList);
      System.out.println("수정이 완료되었습니다.");
    } else {
      System.out.println("수정할 데이터가 없습니다.");
    }

  }

  public static <T> void deleteRow(List<T> dataList, int index) {
    dataList.remove(index);
    FileUtils.writeFile(dataList);

  }

  public static <T> void deleteRow(List<T> dataList, T data) {
    dataList.remove(data);
    FileUtils.writeFile(dataList);

  }


}
